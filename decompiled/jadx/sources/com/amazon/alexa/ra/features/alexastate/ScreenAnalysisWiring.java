package com.amazon.alexa.ra.features.alexastate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/features/alexastate/ScreenAnalysisWiring;", "", "<init>", "()V", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "source", "Lcom/amazon/alexa/ra/features/alexastate/MutableAlexaStateSource;", "unregister", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ScreenAnalysisWiring {
    public static final int $stable = 0;

    @NotNull
    public static final ScreenAnalysisWiring INSTANCE = new ScreenAnalysisWiring();

    private ScreenAnalysisWiring() {
    }

    public final void register(@NotNull MutableAlexaStateSource source) {
        source.getClass();
    }

    public final void unregister() {
    }
}
