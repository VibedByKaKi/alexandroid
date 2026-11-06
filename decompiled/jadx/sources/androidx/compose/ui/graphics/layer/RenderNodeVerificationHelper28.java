package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(28)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/layer/RenderNodeVerificationHelper28;", "", "<init>", "()V", "getAmbientShadowColor", "", "renderNode", "Landroid/view/RenderNode;", "setAmbientShadowColor", "", "target", "getSpotShadowColor", "setSpotShadowColor", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RenderNodeVerificationHelper28 {

    @NotNull
    public static final RenderNodeVerificationHelper28 INSTANCE = new RenderNodeVerificationHelper28();

    private RenderNodeVerificationHelper28() {
    }

    public final int getAmbientShadowColor(@NotNull RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int getSpotShadowColor(@NotNull RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void setAmbientShadowColor(@NotNull RenderNode renderNode, int target) {
        renderNode.setAmbientShadowColor(target);
    }

    public final void setSpotShadowColor(@NotNull RenderNode renderNode, int target) {
        renderNode.setSpotShadowColor(target);
    }
}
