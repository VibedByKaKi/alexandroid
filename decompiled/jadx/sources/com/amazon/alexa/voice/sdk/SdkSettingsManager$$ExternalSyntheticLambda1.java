package com.amazon.alexa.voice.sdk;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class SdkSettingsManager$$ExternalSyntheticLambda1 implements MessageFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SdkSettingsManager$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public final boolean isMatch(Message message) {
        boolean lambda$subscribeToProfileChangeEvent$3;
        boolean lambda$subscribeToEntitlementUpdates$5;
        boolean lambda$subscribeToIdentityChangeEvent$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$subscribeToProfileChangeEvent$3 = SdkSettingsManager.lambda$subscribeToProfileChangeEvent$3(message);
                return lambda$subscribeToProfileChangeEvent$3;
            case 1:
                lambda$subscribeToEntitlementUpdates$5 = SdkSelectionOrchestrator.lambda$subscribeToEntitlementUpdates$5(message);
                return lambda$subscribeToEntitlementUpdates$5;
            default:
                lambda$subscribeToIdentityChangeEvent$1 = SdkSettingsManager.lambda$subscribeToIdentityChangeEvent$1(message);
                return lambda$subscribeToIdentityChangeEvent$1;
        }
    }
}
