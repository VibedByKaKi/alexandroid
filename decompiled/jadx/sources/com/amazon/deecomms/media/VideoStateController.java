package com.amazon.deecomms.media;

import androidx.annotation.NonNull;
import com.amazon.comms.calling.service.Call;
import com.amazon.deecomms.common.sip.SipClientState;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class VideoStateController {
    private final SipClientState sipClientState;

    @Inject
    public VideoStateController(@NonNull @Named("CurrentCall") SipClientState sipClientState) {
        this.sipClientState = sipClientState;
    }

    public boolean isVideoOn() {
        Call currentActiveCall = this.sipClientState.getCurrentActiveCall();
        if (currentActiveCall == null || currentActiveCall.getMediaStatus() == null) {
            return false;
        }
        return currentActiveCall.getMediaStatus().isLocalVideoEnabled();
    }

    public void toggle() {
        Call currentActiveCall = this.sipClientState.getCurrentActiveCall();
        if (currentActiveCall == null || currentActiveCall.getMediaStatus() == null) {
            return;
        }
        boolean z = !currentActiveCall.getMediaStatus().isLocalVideoEnabled();
        currentActiveCall.setLocalVideoState(z);
        this.sipClientState.setUserTurnedVideoOff(z);
    }
}
