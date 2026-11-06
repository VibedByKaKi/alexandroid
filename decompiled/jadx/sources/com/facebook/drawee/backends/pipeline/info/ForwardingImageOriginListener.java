package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class ForwardingImageOriginListener implements ImageOriginListener {
    private static final String TAG = "ForwardingImageOriginListener";
    private final List<ImageOriginListener> mImageOriginListeners;

    public ForwardingImageOriginListener(ImageOriginListener... imageOriginListenerArr) {
        ArrayList arrayList = new ArrayList(imageOriginListenerArr.length);
        this.mImageOriginListeners = arrayList;
        Collections.addAll(arrayList, imageOriginListenerArr);
    }

    public synchronized void addImageOriginListener(ImageOriginListener imageOriginListener) {
        this.mImageOriginListeners.add(imageOriginListener);
    }

    @Override // com.facebook.drawee.backends.pipeline.info.ImageOriginListener
    public synchronized void onImageLoaded(String str, int i, boolean z, @Nullable String str2) {
        int size = this.mImageOriginListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageOriginListener imageOriginListener = this.mImageOriginListeners.get(i2);
            if (imageOriginListener != null) {
                try {
                    imageOriginListener.onImageLoaded(str, i, z, str2);
                } catch (Exception e) {
                    FLog.e(TAG, "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }

    public synchronized void removeImageOriginListener(ImageOriginListener imageOriginListener) {
        this.mImageOriginListeners.remove(imageOriginListener);
    }

    public ForwardingImageOriginListener(Set<ImageOriginListener> set) {
        this.mImageOriginListeners = new ArrayList(set);
    }
}
