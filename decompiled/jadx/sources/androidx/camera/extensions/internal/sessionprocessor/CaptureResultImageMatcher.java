package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class CaptureResultImageMatcher {
    private static final int INVALID_TIMESTAMP = -1;

    @GuardedBy("mLock")
    ImageReferenceListener mImageReferenceListener;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private final LongSparseArray<List<TotalCaptureResult>> mPendingCaptureResults = new LongSparseArray<>();

    @GuardedBy("mLock")
    Map<TotalCaptureResult, Integer> mCaptureStageIdMap = new HashMap();

    @GuardedBy("mLock")
    private final LongSparseArray<List<ImageReference>> mPendingImages = new LongSparseArray<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ImageReferenceListener {
        void onImageReferenceIncoming(@NonNull ImageReference imageReference, @NonNull TotalCaptureResult totalCaptureResult, int i);
    }

    private <T> void addToList(LongSparseArray<List<T>> longSparseArray, long j, T t) {
        List<T> list = longSparseArray.get(j);
        if (list == null) {
            list = new ArrayList<>();
            longSparseArray.put(j, list);
        }
        list.add(t);
    }

    private long getTimeStampFromCaptureResult(TotalCaptureResult totalCaptureResult) {
        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    private void matchImages() {
        TotalCaptureResult totalCaptureResult;
        ImageReference imageReference;
        synchronized (this.mLock) {
            try {
                int size = this.mPendingCaptureResults.size() - 1;
                while (true) {
                    if (size < 0) {
                        totalCaptureResult = null;
                        imageReference = null;
                        break;
                    }
                    List<TotalCaptureResult> valueAt = this.mPendingCaptureResults.valueAt(size);
                    if (!valueAt.isEmpty()) {
                        totalCaptureResult = valueAt.get(0);
                        long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
                        Preconditions.checkState(timeStampFromCaptureResult == this.mPendingCaptureResults.keyAt(size));
                        List<ImageReference> list = this.mPendingImages.get(timeStampFromCaptureResult);
                        if (list != null && !list.isEmpty()) {
                            imageReference = list.get(0);
                            removeFromList(this.mPendingImages, timeStampFromCaptureResult, imageReference);
                            valueAt.remove(totalCaptureResult);
                            if (valueAt.isEmpty()) {
                                this.mPendingCaptureResults.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                removeStaleData();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (imageReference == null || totalCaptureResult == null) {
            return;
        }
        notifyImage(imageReference, totalCaptureResult);
    }

    private void notifyImage(ImageReference imageReference, TotalCaptureResult totalCaptureResult) {
        ImageReferenceListener imageReferenceListener;
        Integer num;
        synchronized (this.mLock) {
            try {
                imageReferenceListener = this.mImageReferenceListener;
                if (imageReferenceListener != null) {
                    num = this.mCaptureStageIdMap.get(totalCaptureResult);
                } else {
                    imageReference.decrement();
                    imageReferenceListener = null;
                    num = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (imageReferenceListener != null) {
            imageReferenceListener.onImageReferenceIncoming(imageReference, totalCaptureResult, num.intValue());
        }
    }

    private <T> void removeFromList(LongSparseArray<List<T>> longSparseArray, long j, T t) {
        List<T> list = longSparseArray.get(j);
        if (list != null) {
            list.remove(t);
            if (list.isEmpty()) {
                longSparseArray.remove(j);
            }
        }
    }

    private void removeStaleData() {
        synchronized (this.mLock) {
            try {
                if (this.mPendingImages.size() != 0 && this.mPendingCaptureResults.size() != 0) {
                    long keyAt = this.mPendingImages.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.mPendingCaptureResults.keyAt(0);
                    Preconditions.checkArgument(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                            if (this.mPendingImages.keyAt(size) < keyAt2) {
                                Iterator<ImageReference> it2 = this.mPendingImages.valueAt(size).iterator();
                                while (it2.hasNext()) {
                                    it2.next().decrement();
                                }
                                this.mPendingImages.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.mPendingCaptureResults.size() - 1; size2 >= 0; size2--) {
                            if (this.mPendingCaptureResults.keyAt(size2) < keyAt) {
                                this.mPendingCaptureResults.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void captureResultIncoming(@NonNull TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
                if (timeStampFromCaptureResult == -1) {
                    return;
                }
                addToList(this.mPendingCaptureResults, timeStampFromCaptureResult, totalCaptureResult);
                this.mCaptureStageIdMap.put(totalCaptureResult, Integer.valueOf(i));
                matchImages();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clear() {
        synchronized (this.mLock) {
            try {
                this.mPendingCaptureResults.clear();
                int i = 0;
                while (true) {
                    int size = this.mPendingImages.size();
                    LongSparseArray<List<ImageReference>> longSparseArray = this.mPendingImages;
                    if (i < size) {
                        Iterator<ImageReference> it2 = this.mPendingImages.get(longSparseArray.keyAt(i)).iterator();
                        while (it2.hasNext()) {
                            it2.next().decrement();
                        }
                        i++;
                    } else {
                        longSparseArray.clear();
                        this.mCaptureStageIdMap.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearImageReferenceListener() {
        synchronized (this.mLock) {
            this.mImageReferenceListener = null;
        }
    }

    public void imageIncoming(@NonNull ImageReference imageReference) {
        synchronized (this.mLock) {
            addToList(this.mPendingImages, imageReference.get().getTimestamp(), imageReference);
        }
        matchImages();
    }

    public void setImageReferenceListener(@NonNull ImageReferenceListener imageReferenceListener) {
        synchronized (this.mLock) {
            this.mImageReferenceListener = imageReferenceListener;
        }
    }

    public void captureResultIncoming(@NonNull TotalCaptureResult totalCaptureResult) {
        captureResultIncoming(totalCaptureResult, 0);
    }
}
