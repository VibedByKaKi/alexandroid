package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "performHapticFeedback", "", "hapticFeedbackType", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "performHapticFeedback-CdsT49E", "(I)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlatformHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;

    @NotNull
    private final View view;

    public PlatformHapticFeedback(@NotNull View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo5426performHapticFeedbackCdsT49E(int hapticFeedbackType) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.INSTANCE;
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5434getConfirm5zf0vsI())) {
            this.view.performHapticFeedback(16);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5435getContextClick5zf0vsI())) {
            this.view.performHapticFeedback(6);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5436getGestureEnd5zf0vsI())) {
            this.view.performHapticFeedback(13);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5437getGestureThresholdActivate5zf0vsI())) {
            this.view.performHapticFeedback(23);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5438getKeyboardTap5zf0vsI())) {
            this.view.performHapticFeedback(3);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5439getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5440getReject5zf0vsI())) {
            this.view.performHapticFeedback(17);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5441getSegmentFrequentTick5zf0vsI())) {
            this.view.performHapticFeedback(27);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5442getSegmentTick5zf0vsI())) {
            this.view.performHapticFeedback(26);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5443getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
            return;
        }
        if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5444getToggleOff5zf0vsI())) {
            this.view.performHapticFeedback(22);
        } else if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5445getToggleOn5zf0vsI())) {
            this.view.performHapticFeedback(21);
        } else if (HapticFeedbackType.m5430equalsimpl0(hapticFeedbackType, companion.m5446getVirtualKey5zf0vsI())) {
            this.view.performHapticFeedback(1);
        }
    }
}
