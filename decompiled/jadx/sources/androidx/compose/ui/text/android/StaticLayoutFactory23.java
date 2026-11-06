package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.RequiresApi;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(23)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "<init>", "()V", "create", "Landroid/text/StaticLayout;", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "Landroidx/compose/ui/text/android/StaticLayoutParams;", "isFallbackLineSpacingEnabled", "", "layout", "useFallbackLineSpacing", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @NotNull
    public StaticLayout create(@NotNull StaticLayoutParams params) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        obtain.setTextDirection(params.getTextDir());
        obtain.setAlignment(params.getAlignment());
        obtain.setMaxLines(params.getMaxLines());
        obtain.setEllipsize(params.getEllipsize());
        obtain.setEllipsizedWidth(params.getEllipsizedWidth());
        obtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        obtain.setIncludePad(params.getIncludePadding());
        obtain.setBreakStrategy(params.getBreakStrategy());
        obtain.setHyphenationFrequency(params.getHyphenationFrequency());
        obtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        StaticLayoutFactory26.setJustificationMode(obtain, params.getJustificationMode());
        StaticLayoutFactory28.setUseLineSpacingFromFallbacks(obtain, params.getUseFallbackLineSpacing());
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            StaticLayoutFactory33.setLineBreakConfig(obtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        if (i >= 35) {
            StaticLayoutFactory35.disableUseBoundsForWidth(obtain);
        }
        return obtain.build();
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(@NotNull StaticLayout layout, boolean useFallbackLineSpacing) {
        return Build.VERSION.SDK_INT >= 33 ? StaticLayoutFactory33.isFallbackLineSpacingEnabled(layout) : useFallbackLineSpacing;
    }
}
