package com.facebook.imagepipeline.image;

import com.facebook.common.references.HasBitmap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public interface CloseableImage extends Closeable, ImageInfo, HasBitmap, HasExtraData {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    ImageInfo getImageInfo();

    QualityInfo getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
