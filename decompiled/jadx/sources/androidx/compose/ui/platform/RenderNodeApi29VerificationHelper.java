package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29VerificationHelper;", "", "<init>", "()V", "setRenderEffect", "", "renderNode", "Landroid/graphics/RenderNode;", "target", "Landroidx/compose/ui/graphics/RenderEffect;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RenderNodeApi29VerificationHelper {

    @NotNull
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    public final void setRenderEffect(@NotNull RenderNode renderNode, @Nullable RenderEffect target) {
        renderNode.setRenderEffect(target != null ? target.asAndroidRenderEffect() : null);
    }
}
