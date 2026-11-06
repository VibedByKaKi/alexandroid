package androidx.compose.ui.window;

import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(30)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/window/Api30Impl;", "", "<init>", "()V", "setFitInsetsSides", "", "attrs", "Landroid/view/WindowManager$LayoutParams;", "sides", "", "setFitInsetsTypes", "types", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Api30Impl {

    @NotNull
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    @DoNotInline
    public final void setFitInsetsSides(@NotNull WindowManager.LayoutParams attrs, int sides) {
        attrs.setFitInsetsSides(sides);
    }

    @DoNotInline
    public final void setFitInsetsTypes(@NotNull WindowManager.LayoutParams attrs, int types) {
        attrs.setFitInsetsTypes(types);
    }
}
