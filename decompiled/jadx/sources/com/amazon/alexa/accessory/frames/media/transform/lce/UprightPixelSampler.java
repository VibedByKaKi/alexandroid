package com.amazon.alexa.accessory.frames.media.transform.lce;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.media.transform.LceFaceDetector;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class UprightPixelSampler {
    private final Bitmap bitmap;
    final int height;
    private final int orientation;
    private final int rawHeight;
    private final int rawWidth;
    final int width;

    public UprightPixelSampler(@NonNull Bitmap bitmap, int i) {
        this.bitmap = bitmap;
        i = (i < 1 || i > 8) ? 1 : i;
        this.orientation = i;
        int width = bitmap.getWidth();
        this.rawWidth = width;
        int height = bitmap.getHeight();
        this.rawHeight = height;
        boolean swapsAxes = swapsAxes(i);
        this.width = swapsAxes ? height : width;
        this.height = swapsAxes ? width : height;
    }

    public static boolean inAny(@NonNull List<int[]> list, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = list.get(i4);
            if (i2 >= iArr[0] && i2 < iArr[2] && i3 >= iArr[1] && i3 < iArr[3]) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static List<int[]> pixelRects(@NonNull List<LceFaceDetector.FaceBox> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LceFaceDetector.FaceBox faceBox : list) {
            int max = Math.max(0, (int) faceBox.left);
            int max2 = Math.max(0, (int) faceBox.top);
            int min = Math.min(i, ((int) faceBox.width) + max);
            int min2 = Math.min(i2, ((int) faceBox.height) + max2);
            if (min > max && min2 > max2) {
                arrayList.add(new int[]{max, max2, min, min2});
            }
        }
        return arrayList;
    }

    @NonNull
    public static int[] rawCoordinate(int i, int i2, int i3, int i4, int i5) {
        switch (i) {
            case 2:
                return new int[]{(i2 - 1) - i4, i5};
            case 3:
                return new int[]{(i2 - 1) - i4, (i3 - 1) - i5};
            case 4:
                return new int[]{i4, (i3 - 1) - i5};
            case 5:
                return new int[]{i5, i4};
            case 6:
                return new int[]{i5, (i3 - 1) - i4};
            case 7:
                return new int[]{(i2 - 1) - i5, (i3 - 1) - i4};
            case 8:
                return new int[]{(i2 - 1) - i5, i4};
            default:
                return new int[]{i4, i5};
        }
    }

    public static boolean swapsAxes(int i) {
        return i >= 5 && i <= 8;
    }

    public int argb(int i, int i2) {
        int[] rawCoordinate = rawCoordinate(this.orientation, this.rawWidth, this.rawHeight, i, i2);
        return this.bitmap.getPixel(rawCoordinate[0], rawCoordinate[1]);
    }

    @Nullable
    public Float meanBrightness(@NonNull List<LceFaceDetector.FaceBox> list) {
        List<int[]> pixelRects = pixelRects(list);
        double d = 0.0d;
        char c = 0;
        int i = 0;
        long j = 0;
        while (i < pixelRects.size()) {
            int[] iArr = pixelRects.get(i);
            int[] rawCoordinate = rawCoordinate(this.orientation, this.rawWidth, this.rawHeight, iArr[c], iArr[1]);
            char c2 = c;
            int[] rawCoordinate2 = rawCoordinate(this.orientation, this.rawWidth, this.rawHeight, iArr[2] - 1, iArr[3] - 1);
            int min = Math.min(rawCoordinate[c2], rawCoordinate2[c2]);
            int min2 = Math.min(rawCoordinate[1], rawCoordinate2[1]);
            int abs = Math.abs(rawCoordinate2[c2] - rawCoordinate[c2]) + 1;
            int abs2 = Math.abs(rawCoordinate2[1] - rawCoordinate[1]) + 1;
            int[] iArr2 = new int[abs * abs2];
            this.bitmap.getPixels(iArr2, 0, abs, min, min2, abs, abs2);
            for (int i2 = iArr[1]; i2 < iArr[3]; i2++) {
                for (int i3 = iArr[c2]; i3 < iArr[2]; i3++) {
                    if (!inAny(pixelRects, i, i3, i2)) {
                        int[] rawCoordinate3 = rawCoordinate(this.orientation, this.rawWidth, this.rawHeight, i3, i2);
                        int i4 = iArr2[(rawCoordinate3[c2] - min) + ((rawCoordinate3[1] - min2) * abs)];
                        d += ((i4 >> 16) & 255) + ((i4 >> 8) & 255) + (i4 & 255);
                        j++;
                    }
                }
            }
            i++;
            c = c2;
        }
        if (j > 0) {
            return Float.valueOf((float) ((d / (j * 3)) / 255.0d));
        }
        return null;
    }

    @NonNull
    public List<int[]> pixelRects(@NonNull List<LceFaceDetector.FaceBox> list) {
        return pixelRects(list, this.width, this.height);
    }
}
