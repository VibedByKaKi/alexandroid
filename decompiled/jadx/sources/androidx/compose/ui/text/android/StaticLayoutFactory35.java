package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(35)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory35;", "", "<init>", "()V", "disableUseBoundsForWidth", "", "builder", "Landroid/text/StaticLayout$Builder;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class StaticLayoutFactory35 {

    @NotNull
    public static final StaticLayoutFactory35 INSTANCE = new StaticLayoutFactory35();

    private StaticLayoutFactory35() {
    }

    @JvmStatic
    public static final void disableUseBoundsForWidth(@NotNull StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }
}
