package androidx.compose.ui.layout;

import androidx.compose.ui.layout.RectRulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0002\u0010\b\u001a#\u0010\t\u001a\u00020\u0001*\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"RectRulers", "Landroidx/compose/ui/layout/RectRulers;", "name", "", "innermostOf", "Landroidx/compose/ui/layout/RectRulers$Companion;", "rulers", "", "(Landroidx/compose/ui/layout/RectRulers$Companion;[Landroidx/compose/ui/layout/RectRulers;)Landroidx/compose/ui/layout/RectRulers;", "outermostOf", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RectRulersKt {
    @NotNull
    public static final RectRulers RectRulers() {
        return new RectRulersImpl(null);
    }

    @NotNull
    public static final RectRulers innermostOf(@NotNull RectRulers.Companion companion, @NotNull RectRulers... rectRulersArr) {
        return new InnerRectRulers(rectRulersArr);
    }

    @NotNull
    public static final RectRulers outermostOf(@NotNull RectRulers.Companion companion, @NotNull RectRulers... rectRulersArr) {
        return new OuterRectRulers(rectRulersArr);
    }

    @NotNull
    public static final RectRulers RectRulers(@NotNull String str) {
        return new RectRulersImpl(str);
    }
}
