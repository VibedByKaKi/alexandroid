package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {
    private static final String TAG = "BitmapEncoder";

    @Nullable
    private final ArrayPool arrayPool;
    public static final Option<Integer> COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final Option<Bitmap.CompressFormat> COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    @Deprecated
    public BitmapEncoder() {
        this.arrayPool = null;
    }

    private Bitmap.CompressFormat getFormat(Bitmap bitmap, Options options) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.get(COMPRESSION_FORMAT);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #6 {all -> 0x0087, blocks: (B:3:0x0021, B:15:0x0050, B:18:0x0062, B:20:0x0068, B:43:0x0083, B:41:0x0086, B:34:0x005d), top: B:2:0x0021 }] */
    @Override // com.bumptech.glide.load.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean encode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r8, @androidx.annotation.NonNull java.io.File r9, @androidx.annotation.NonNull com.bumptech.glide.load.Options r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.getFormat(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.util.pool.GlideTrace.beginSectionFormat(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.util.LogTime.getLogTime()     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.Option<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_QUALITY     // Catch: java.lang.Throwable -> L87
            java.lang.Object r4 = r10.get(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L87
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L87
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r9 = r7.arrayPool     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            if (r9 == 0) goto L49
            com.bumptech.glide.load.data.BufferedOutputStream r9 = new com.bumptech.glide.load.data.BufferedOutputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r7 = r7.arrayPool     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r9.<init>(r6, r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r5 = r9
            goto L4a
        L44:
            r7 = move-exception
            r5 = r6
            goto L81
        L47:
            r5 = r6
            goto L57
        L49:
            r5 = r6
        L4a:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.close()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L87
        L53:
            r7 = 1
            goto L61
        L55:
            r7 = move-exception
            goto L81
        L57:
            r7 = 3
            android.util.Log.isLoggable(r0, r7)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L60
            r5.close()     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L87
        L60:
            r7 = 0
        L61:
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L7d
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.util.Util.getBitmapByteSize(r8)     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r9 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_FORMAT     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r10.get(r9)     // Catch: java.lang.Throwable -> L87
            java.util.Objects.toString(r9)     // Catch: java.lang.Throwable -> L87
            r8.hasAlpha()     // Catch: java.lang.Throwable -> L87
        L7d:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r7
        L81:
            if (r5 == 0) goto L86
            r5.close()     // Catch: java.io.IOException -> L86 java.lang.Throwable -> L87
        L86:
            throw r7     // Catch: java.lang.Throwable -> L87
        L87:
            r7 = move-exception
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.BitmapEncoder.encode(com.bumptech.glide.load.engine.Resource, java.io.File, com.bumptech.glide.load.Options):boolean");
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    public EncodeStrategy getEncodeStrategy(@NonNull Options options) {
        return EncodeStrategy.TRANSFORMED;
    }

    public BitmapEncoder(@NonNull ArrayPool arrayPool) {
        this.arrayPool = arrayPool;
    }
}
