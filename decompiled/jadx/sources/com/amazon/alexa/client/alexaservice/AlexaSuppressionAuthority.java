package com.amazon.alexa.client.alexaservice;

import com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelType;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientsConnectivityEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.FinishInteractionEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ScheduleInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaSuppressionAuthority {
    private final AlexaClientEventBus alexaClientEventBus;
    private InteractionIdentifier suppressionInteractionIdentifier;

    @Inject
    public AlexaSuppressionAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.alexaClientEventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    @Subscribe
    public synchronized void on(ClientsConnectivityEvent clientsConnectivityEvent) {
        InteractionIdentifier interactionIdentifier;
        if (!clientsConnectivityEvent.isConnected() && (interactionIdentifier = this.suppressionInteractionIdentifier) != null) {
            this.alexaClientEventBus.post(FinishInteractionEvent.create(interactionIdentifier));
            this.suppressionInteractionIdentifier = null;
        }
    }

    public synchronized void temporarilySuppressAllAudio() {
        if (this.suppressionInteractionIdentifier == null) {
            SuppressionInteraction suppressionInteraction = new SuppressionInteraction(this, 0);
            this.suppressionInteractionIdentifier = suppressionInteraction.getInteractionIdentifier();
            this.alexaClientEventBus.post(ScheduleInteractionEvent.create(ChannelType.DIALOG, suppressionInteraction, AudioMetadata.create(AudioMetadata.AudioFocusStream.MUSIC, AudioMetadata.AudioFocusDuration.TRANSIENT_EXCLUSIVE, AudioMetadata.AudioUsage.MEDIA, AudioMetadata.AudioContentType.MUSIC), DialogRequestIdentifier.NONE));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class SuppressionInteraction extends AudioInteraction {
        private SuppressionInteraction() {
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.Interaction
        public InteractionInterfaceName getInterfaceName() {
            return AvsApiConstants.SpeechSynthesizer.INTERFACE_NAME;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.Interaction
        public void onStop() {
            synchronized (AlexaSuppressionAuthority.this) {
                AlexaSuppressionAuthority.this.suppressionInteractionIdentifier = null;
            }
        }

        public /* synthetic */ SuppressionInteraction(AlexaSuppressionAuthority alexaSuppressionAuthority, int i) {
            this();
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction
        public void onBackground() {
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction
        public void onForeground() {
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction
        public void onPause() {
        }
    }
}
