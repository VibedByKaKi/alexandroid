package androidx.compose.ui.autofill;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@RequiresApi(27)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi27Helper;", "", "<init>", "()V", "notifyViewVisibilityChanged", "", "view", "Landroid/view/View;", "autofillManager", "Landroid/view/autofill/AutofillManager;", "semanticsId", "", "isVisible", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutofillApi27Helper {
    public static final int $stable = 0;

    @NotNull
    public static final AutofillApi27Helper INSTANCE = new AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    @RequiresApi(27)
    public final void notifyViewVisibilityChanged(@NotNull View view, @NotNull android.view.autofill.AutofillManager autofillManager, int semanticsId, boolean isVisible) {
        autofillManager.notifyViewVisibilityChanged(view, semanticsId, isVisible);
    }
}
