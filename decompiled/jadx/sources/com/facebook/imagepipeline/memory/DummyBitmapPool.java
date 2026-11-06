package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.common.memory.MemoryTrimType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/facebook/imagepipeline/memory/DummyBitmapPool;", "Lcom/facebook/imagepipeline/memory/BitmapPool;", "<init>", "()V", "trim", "", "trimType", "Lcom/facebook/common/memory/MemoryTrimType;", MetricsConstants.Method.CACHE_GET, "Landroid/graphics/Bitmap;", "size", "", "release", "value", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DummyBitmapPool implements BitmapPool {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.common.memory.Pool
    @NotNull
    public Bitmap get(int size) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(size / 2.0d), Bitmap.Config.RGB_565);
        createBitmap.getClass();
        return createBitmap;
    }

    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public void release(@NotNull Bitmap value) {
        value.getClass();
        value.recycle();
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(@NotNull MemoryTrimType trimType) {
        trimType.getClass();
    }
}
