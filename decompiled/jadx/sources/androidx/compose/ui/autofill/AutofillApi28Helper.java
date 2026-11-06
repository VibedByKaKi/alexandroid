package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@RequiresApi(28)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi28Helper;", "", "<init>", "()V", "setMaxTextLength", "", "structure", "Landroid/view/ViewStructure;", "length", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutofillApi28Helper {
    public static final int $stable = 0;

    @NotNull
    public static final AutofillApi28Helper INSTANCE = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    @RequiresApi(28)
    public final void setMaxTextLength(@NotNull ViewStructure structure, int length) {
        structure.setMaxTextLength(length);
    }
}
