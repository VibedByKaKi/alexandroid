package com.amazon.apl.android.image.filters;

import android.content.Context;
import android.renderscript.RenderScript;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RenderScriptProvider {
    private final Context mContext;
    private final RenderScriptFactory mFactory;
    private RenderScript mRenderScript;

    public RenderScriptProvider(RenderScriptFactory renderScriptFactory, Context context) {
        this.mFactory = renderScriptFactory;
        this.mContext = context;
    }

    public void destroy() {
        RenderScript renderScript = this.mRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
        }
    }

    public RenderScript get() {
        if (this.mRenderScript == null) {
            this.mRenderScript = this.mFactory.create(this.mContext);
        }
        return this.mRenderScript;
    }
}
