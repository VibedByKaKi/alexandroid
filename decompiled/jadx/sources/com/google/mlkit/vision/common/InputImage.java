package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes8.dex */
public class InputImage implements MLTaskInput {

    @KeepForSdk
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;

    @Nullable
    private volatile Bitmap zza;

    @Nullable
    private volatile ByteBuffer zzb;

    @Nullable
    private volatile zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;

    @ImageFormat
    private final int zzg;

    @Nullable
    private final Matrix zzh;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private InputImage(@androidx.annotation.NonNull java.nio.ByteBuffer r5, int r6, int r7, int r8, @com.google.mlkit.vision.common.InputImage.ImageFormat int r9) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            r1 = 0
            r2 = 1
            if (r9 == r0) goto Lf
            r0 = 17
            if (r9 != r0) goto L11
            r9 = r0
        Lf:
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.zzb = r0
            int r0 = r5.limit()
            int r3 = r6 * r7
            if (r0 <= r3) goto L26
            r1 = r2
        L26:
            java.lang.String r0 = "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            r5.rewind()
            r4.zzd = r6
            r4.zze = r7
            zza(r8)
            r4.zzf = r8
            r4.zzg = r9
            r5 = 0
            r4.zzh = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.common.InputImage.<init>(java.nio.ByteBuffer, int, int, int, int):void");
    }

    @NonNull
    public static InputImage fromBitmap(@NonNull Bitmap bitmap, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i);
        zzc(-1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteArray(@NonNull byte[] bArr, int i, int i2, int i3, @ImageFormat int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), i, i2, i3, i4);
        zzc(i4, 2, elapsedRealtime, i2, i, bArr.length, i3);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, int i, int i2, int i3, @ImageFormat int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i, i2, i3, i4);
        zzc(i4, 3, elapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return inputImage;
    }

    @NonNull
    public static InputImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap zza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        InputImage inputImage = new InputImage(zza, 0);
        zzc(-1, 4, elapsedRealtime, zza.getHeight(), zza.getWidth(), zza.getAllocationByteCount(), 0);
        return inputImage;
    }

    @NonNull
    @KeepForSdk
    public static InputImage fromMediaImage(@NonNull Image image, int i, @NonNull Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return zzb(image, i, matrix);
    }

    private static int zza(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180) {
            if (i == 270) {
                i = 270;
            } else {
                z = false;
            }
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i;
    }

    private static InputImage zzb(@NonNull Image image, int i, @Nullable Matrix matrix) {
        Image image2;
        int i2;
        int limit;
        InputImage inputImage;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        zza(i);
        boolean z = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z = false;
        }
        Preconditions.checkArgument(z, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i2 = i;
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i2 = i;
            InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i2, matrix);
            limit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            inputImage = inputImage2;
        }
        zzc(image2.getFormat(), 5, elapsedRealtime, image2.getHeight(), image2.getWidth(), limit, i2);
        return inputImage;
    }

    private static void zzc(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzmu.zza(zzms.zzb("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    @Nullable
    @KeepForSdk
    public Bitmap getBitmapInternal() {
        return this.zza;
    }

    @Nullable
    @KeepForSdk
    public ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    @Nullable
    @KeepForSdk
    public Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    @KeepForSdk
    @ImageFormat
    public int getFormat() {
        return this.zzg;
    }

    @KeepForSdk
    public int getHeight() {
        return this.zze;
    }

    @Nullable
    @KeepForSdk
    public Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    @Nullable
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    @KeepForSdk
    public int getRotationDegrees() {
        return this.zzf;
    }

    @KeepForSdk
    public int getWidth() {
        return this.zzd;
    }

    @NonNull
    public static InputImage fromMediaImage(@NonNull Image image, int i) {
        return zzb(image, i, null);
    }

    private InputImage(@NonNull Image image, int i, int i2, int i3, @Nullable Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.zzc = new zzb(image);
        this.zzd = i;
        this.zze = i2;
        zza(i3);
        this.zzf = i3;
        this.zzg = 35;
        this.zzh = matrix;
    }

    private InputImage(@NonNull Bitmap bitmap, int i) {
        this.zza = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i);
        this.zzf = i;
        this.zzg = -1;
        this.zzh = null;
    }
}
