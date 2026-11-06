package com.amazon.apl.android.image.filters;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.ScriptIntrinsic;
import android.renderscript.ScriptIntrinsicBlend;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicColorMatrix;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RenderScriptWrapper {
    private final RenderScriptProvider mRenderScriptProvider;

    public RenderScriptWrapper(RenderScriptProvider renderScriptProvider) {
        this.mRenderScriptProvider = renderScriptProvider;
    }

    public Allocation createFromBitmap(Bitmap bitmap, Allocation.MipmapControl mipmapControl, int i) {
        return Allocation.createFromBitmap(this.mRenderScriptProvider.get(), bitmap, mipmapControl, i);
    }

    @Nullable
    public <T extends ScriptIntrinsic> T createScript(Element element, Class<T> cls) {
        return cls.cast(cls == ScriptIntrinsicBlur.class ? ScriptIntrinsicBlur.create(this.mRenderScriptProvider.get(), element) : cls == ScriptIntrinsicBlend.class ? ScriptIntrinsicBlend.create(this.mRenderScriptProvider.get(), element) : cls == ScriptIntrinsicColorMatrix.class ? ScriptIntrinsicColorMatrix.create(this.mRenderScriptProvider.get()) : null);
    }

    public void destroy() {
        this.mRenderScriptProvider.destroy();
    }
}
