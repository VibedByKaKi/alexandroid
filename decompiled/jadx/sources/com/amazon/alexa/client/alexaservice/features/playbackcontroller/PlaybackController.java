package com.amazon.alexa.client.alexaservice.features.playbackcontroller;

import com.amazon.alexa.client.alexaservice.base.componentstate.ComponentStateAuthority;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.LocalStopEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent;
import com.amazon.alexa.client.core.messages.Header;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.Name;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PlaybackController {
    private final ComponentStateAuthority componentStateAuthority;
    private final AlexaClientEventBus eventBus;

    @Inject
    public PlaybackController(AlexaClientEventBus alexaClientEventBus, ComponentStateAuthority componentStateAuthority) {
        this.componentStateAuthority = componentStateAuthority;
        this.eventBus = alexaClientEventBus;
    }

    private void sendMessage(Name name) {
        this.eventBus.post(SendMessageEvent.builder().setContext(this.componentStateAuthority.getComponentStatesAndNothingElse(false)).setMessage(Message.create(Header.builder().setName(name).setNamespace(AvsApiConstants.PlaybackController.NAMESPACE).build())).build());
    }

    public void nextCommandIssued() {
        sendMessage(AvsApiConstants.PlaybackController.Events.NextCommandIssued.NAME);
    }

    public void pauseCommandIssued() {
        this.eventBus.post(LocalStopEvent.createPauseControl());
    }

    public void playCommandIssued() {
        sendMessage(AvsApiConstants.PlaybackController.Events.PlayCommandIssued.NAME);
    }

    public void previousCommandIssued() {
        sendMessage(AvsApiConstants.PlaybackController.Events.PreviousCommandIssued.NAME);
    }
}
