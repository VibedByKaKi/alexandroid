package com.amazon.deecomms.calling.core;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.deecomms.calling.enums.AssistCspId;
import com.amazon.deecomms.common.sip.SipClientState;
import com.google.common.base.Optional;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class CallInitiationAuthority {
    private final SipClientState sipClientState;
    private boolean wasPreviousCallAssistOrGroupCall;

    @Inject
    public CallInitiationAuthority(@NonNull @Named("CurrentCall") SipClientState sipClientState) {
        this.sipClientState = sipClientState;
    }

    @VisibleForTesting
    public boolean getPreviousCallState() {
        return this.wasPreviousCallAssistOrGroupCall;
    }

    public boolean isNewCallInitiationUIFlowEnabled(@NonNull Optional<String> optional, @NonNull Optional<String> optional2) {
        return (this.wasPreviousCallAssistOrGroupCall || this.sipClientState.isGroupCall() || (optional.isPresent() && optional.get().equalsIgnoreCase("Bacon")) || (optional2.isPresent() && AssistCspId.isValidCsp(optional2.get()))) ? false : true;
    }

    public void resetPreviousCallState() {
        this.wasPreviousCallAssistOrGroupCall = false;
    }

    public void setPreviousCallState(boolean z) {
        this.wasPreviousCallAssistOrGroupCall = z;
    }
}
