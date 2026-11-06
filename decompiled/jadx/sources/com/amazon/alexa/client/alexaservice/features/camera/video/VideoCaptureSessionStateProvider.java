package com.amazon.alexa.client.alexaservice.features.camera.video;

import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.features.camera.video.payload.CaptureSessionStatePayload;
import com.amazon.alexa.client.alexaservice.features.camera.video.payload.CaptureStatus;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.componentstate.ComponentStateHeader;
import com.amazon.alexa.client.core.componentstate.ComponentStateProvider;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VideoCaptureSessionStateProvider implements ComponentStateProvider {
    private static final ComponentStateHeader COMPONENT_STATE_HEADER = ComponentStateHeader.create(AvsApiConstants.Alexa.Camera.VideoCaptureController.NAMESPACE, AvsApiConstants.Alexa.Camera.VideoCaptureController.ComponentStates.CaptureSessionState.NAME);
    private final VideoCaptureSessionAuthority authority;

    @Inject
    public VideoCaptureSessionStateProvider(VideoCaptureSessionAuthority videoCaptureSessionAuthority) {
        this.authority = videoCaptureSessionAuthority;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentStateHeader getComponentStateHeader() {
        return COMPONENT_STATE_HEADER;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentState getState() {
        VideoCaptureSession ongoingSession = this.authority.getOngoingSession();
        return ongoingSession == null ? ComponentState.create(COMPONENT_STATE_HEADER, CaptureSessionStatePayload.createIdle()) : ComponentState.create(COMPONENT_STATE_HEADER, CaptureSessionStatePayload.create(ongoingSession.getSessionId(), CaptureStatus.CAPTURING));
    }
}
