package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.ra.core.data.model.LivemodeOnboardingState;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"isOobe", "", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState;", "isDeniedPermission", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ConversationUiStateKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDeniedPermission(LivemodeOnboardingState livemodeOnboardingState) {
        if (!(livemodeOnboardingState instanceof LivemodeOnboardingState.NeedsMicPermission) || ((LivemodeOnboardingState.NeedsMicPermission) livemodeOnboardingState).getUseOsDialog()) {
            return (livemodeOnboardingState instanceof LivemodeOnboardingState.NeedsOobeWithMicPermission) && !((LivemodeOnboardingState.NeedsOobeWithMicPermission) livemodeOnboardingState).getUseOsDialog();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isOobe(LivemodeOnboardingState livemodeOnboardingState) {
        return (livemodeOnboardingState instanceof LivemodeOnboardingState.NeedsOobe) || (livemodeOnboardingState instanceof LivemodeOnboardingState.NeedsOobeWithMicPermission);
    }
}
