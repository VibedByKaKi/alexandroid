package com.facebook.imagepipeline.filter;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.RequiresApi;
import com.facebook.common.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/imagepipeline/filter/RenderScriptBlurFilter;", "", "<init>", "()V", "BLUR_MAX_RADIUS", "", "blurBitmap", "", "dest", "Landroid/graphics/Bitmap;", "src", "context", "Landroid/content/Context;", "radius", "canUseRenderScript", "", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RenderScriptBlurFilter {
    public static final int BLUR_MAX_RADIUS = 25;

    @NotNull
    public static final RenderScriptBlurFilter INSTANCE = new RenderScriptBlurFilter();

    private RenderScriptBlurFilter() {
    }

    @JvmStatic
    @RequiresApi(17)
    public static final void blurBitmap(@NotNull Bitmap dest, @NotNull Bitmap src, @NotNull Context context, int radius) {
        dest.getClass();
        src.getClass();
        context.getClass();
        Preconditions.checkArgument(Boolean.valueOf(radius > 0 && radius <= 25));
        RenderScript renderScript = null;
        try {
            RenderScript create = RenderScript.create(context);
            if (create == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                Allocation createFromBitmap = Allocation.createFromBitmap(create, src);
                if (createFromBitmap == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, dest);
                if (createFromBitmap2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                create2.setRadius(radius);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(dest);
                create2.destroy();
                createFromBitmap.destroy();
                createFromBitmap2.destroy();
                create.destroy();
            } catch (Throwable th) {
                th = th;
                renderScript = create;
                if (renderScript != null) {
                    renderScript.destroy();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @JvmStatic
    public static final boolean canUseRenderScript() {
        return true;
    }
}
