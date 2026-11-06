package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0018\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0018\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0018\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0003R\u0018\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0003R\u0018\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0003R\u0018\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0003R\u0018\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0003¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/ComposeUiFlags;", "", "<init>", "()V", "isRectTrackingEnabled", "", "isRectTrackingEnabled$annotations", "isSemanticAutofillEnabled", "isSemanticAutofillEnabled$annotations", "isViewFocusFixEnabled", "isViewFocusFixEnabled$annotations", "isRemoveFocusedViewFixEnabled", "isRemoveFocusedViewFixEnabled$annotations", "areWindowInsetsRulersEnabled", "getAreWindowInsetsRulersEnabled$annotations", "isFocusActionExitsTouchModeEnabled", "isFocusActionExitsTouchModeEnabled$annotations", "isNoPinningInFocusRestorationEnabled", "isNoPinningInFocusRestorationEnabled$annotations", "isOutOfFrameDeactivationEnabled", "isOutOfFrameDeactivationEnabled$annotations", "isClearFocusOnResetEnabled", "isClearFocusOnResetEnabled$annotations", "isAdaptiveRefreshRateEnabled", "isAdaptiveRefreshRateEnabled$annotations", "isPointerInteropFilterDispatchingFixEnabled", "isPointerInteropFilterDispatchingFixEnabled$annotations", "isNestedScrollInteropPostFlingFixEnabled", "isNestedScrollInteropPostFlingFixEnabled$annotations", "isNestedScrollDispatcherNodeFixEnabled", "isNestedScrollDispatcherNodeFixEnabled$annotations", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposeUiFlags {

    @JvmField
    public static boolean isRemoveFocusedViewFixEnabled;

    @JvmField
    public static boolean isViewFocusFixEnabled;

    @NotNull
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();

    @JvmField
    public static boolean isRectTrackingEnabled = true;

    @JvmField
    public static boolean isSemanticAutofillEnabled = true;

    @JvmField
    public static boolean areWindowInsetsRulersEnabled = true;

    @JvmField
    public static boolean isFocusActionExitsTouchModeEnabled = true;

    @JvmField
    public static boolean isNoPinningInFocusRestorationEnabled = true;

    @JvmField
    public static boolean isOutOfFrameDeactivationEnabled = true;

    @JvmField
    public static boolean isClearFocusOnResetEnabled = true;

    @JvmField
    public static boolean isAdaptiveRefreshRateEnabled = true;

    @JvmField
    public static boolean isPointerInteropFilterDispatchingFixEnabled = true;

    @JvmField
    public static boolean isNestedScrollInteropPostFlingFixEnabled = true;

    @JvmField
    public static boolean isNestedScrollDispatcherNodeFixEnabled = true;
    public static final int $stable = 8;

    private ComposeUiFlags() {
    }

    public static /* synthetic */ void getAreWindowInsetsRulersEnabled$annotations() {
    }

    public static /* synthetic */ void isAdaptiveRefreshRateEnabled$annotations() {
    }

    public static /* synthetic */ void isClearFocusOnResetEnabled$annotations() {
    }

    public static /* synthetic */ void isFocusActionExitsTouchModeEnabled$annotations() {
    }

    public static /* synthetic */ void isNestedScrollDispatcherNodeFixEnabled$annotations() {
    }

    public static /* synthetic */ void isNestedScrollInteropPostFlingFixEnabled$annotations() {
    }

    public static /* synthetic */ void isNoPinningInFocusRestorationEnabled$annotations() {
    }

    public static /* synthetic */ void isOutOfFrameDeactivationEnabled$annotations() {
    }

    public static /* synthetic */ void isPointerInteropFilterDispatchingFixEnabled$annotations() {
    }

    public static /* synthetic */ void isRectTrackingEnabled$annotations() {
    }

    @Deprecated(message = "This flag is no longer needed.")
    public static /* synthetic */ void isRemoveFocusedViewFixEnabled$annotations() {
    }

    public static /* synthetic */ void isSemanticAutofillEnabled$annotations() {
    }

    public static /* synthetic */ void isViewFocusFixEnabled$annotations() {
    }
}
