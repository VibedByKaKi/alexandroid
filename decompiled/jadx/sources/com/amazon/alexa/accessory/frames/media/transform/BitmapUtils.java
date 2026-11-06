package com.amazon.alexa.accessory.frames.media.transform;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.metrics.media.SmartCropError;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BitmapUtils {
    private static final String TAG = "BitmapUtils";

    private BitmapUtils() {
    }

    @NonNull
    public static Bitmap applyExifOrientation(@NonNull Bitmap bitmap, @NonNull ExifInterface exifInterface) {
        Bitmap bitmap2;
        int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 1 || attributeInt == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (attributeInt) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(270.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(270.0f);
                break;
            default:
                return bitmap;
        }
        try {
            bitmap2 = bitmap;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                Log.i(TAG, String.format("Applied EXIF orientation correction: orientation=%d, %dx%d → %dx%d", Integer.valueOf(attributeInt), Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()), Integer.valueOf(createBitmap.getWidth()), Integer.valueOf(createBitmap.getHeight())));
                return createBitmap;
            } catch (Throwable th) {
                th = th;
                Log.w(TAG, "EXIF orientation correction failed, proceeding with un-rotated bitmap", th);
                MetricsRecorder.getInstance().recordCounter(SmartCropError.ORIENTATION_CORRECTION_FAILED.getErrorMetric());
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap2 = bitmap;
        }
    }
}
