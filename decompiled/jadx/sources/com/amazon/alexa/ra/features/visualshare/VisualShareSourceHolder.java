package com.amazon.alexa.ra.features.visualshare;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/features/visualshare/VisualShareSourceHolder;", "", "<init>", "()V", "screenConsentLauncher", "Lkotlin/Function0;", "", "getScreenConsentLauncher", "()Lkotlin/jvm/functions/Function0;", "setScreenConsentLauncher", "(Lkotlin/jvm/functions/Function0;)V", "openCameraShareIsFront", "", "getOpenCameraShareIsFront", "()Ljava/lang/Boolean;", "setOpenCameraShareIsFront", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VisualShareSourceHolder {

    @Nullable
    private static volatile Boolean openCameraShareIsFront;

    @Nullable
    private static volatile Function0<Unit> screenConsentLauncher;

    @NotNull
    public static final VisualShareSourceHolder INSTANCE = new VisualShareSourceHolder();
    public static final int $stable = 8;

    private VisualShareSourceHolder() {
    }

    @Nullable
    public final Boolean getOpenCameraShareIsFront() {
        return openCameraShareIsFront;
    }

    @Nullable
    public final Function0<Unit> getScreenConsentLauncher() {
        return screenConsentLauncher;
    }

    public final void setOpenCameraShareIsFront(@Nullable Boolean bool) {
        openCameraShareIsFront = bool;
    }

    public final void setScreenConsentLauncher(@Nullable Function0<Unit> function0) {
        screenConsentLauncher = function0;
    }
}
