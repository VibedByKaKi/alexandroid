package com.facebook.common.webp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileDescriptor;
import java.io.InputStream;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public interface WebpBitmapFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WebpErrorLogger {
        void onWebpErrorLog(String str, @Nullable String str2);
    }

    @Nullable
    Bitmap decodeByteArray(byte[] bArr, int i, int i2, @Nullable BitmapFactory.Options options);

    @Nullable
    Bitmap decodeFile(String str, @Nullable BitmapFactory.Options options);

    @Nullable
    Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, @Nullable Rect rect, @Nullable BitmapFactory.Options options);

    @Nullable
    Bitmap decodeStream(InputStream inputStream, @Nullable Rect rect, @Nullable BitmapFactory.Options options);

    void setBitmapCreator(BitmapCreator bitmapCreator);

    void setWebpErrorLogger(WebpErrorLogger webpErrorLogger);
}
