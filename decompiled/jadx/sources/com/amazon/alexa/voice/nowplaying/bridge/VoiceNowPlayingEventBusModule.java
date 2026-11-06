package com.amazon.alexa.voice.nowplaying.bridge;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.voice.dagger.VoiceDependencies;
import com.amazon.alexa.voice.events.AVSEventBusBridge$$ExternalSyntheticLambda1;
import com.amazon.alexa.voice.nowplaying.AudioPlaybackController;
import java.util.UUID;
import javax.inject.Inject;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoiceNowPlayingEventBusModule {
    private final AudioPlaybackController audioPlaybackController;

    @Inject
    EventBus eventBus;
    private MultiFilterSubscriber multiFilterSubscriber;
    private UUID subscribedID = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EcToVoxMessageFilter implements MessageFilter {
        private boolean isMessageFromEntertainmentChannel(@NonNull Message message) {
            return message.getEventType() != null && MessageEventType.NP_MESSAGE_EC_TO_VOX.equals(message.getEventType());
        }

        @Override // com.amazon.alexa.eventbus.api.MessageFilter
        public boolean isMatch(@NonNull Message message) {
            return isMessageFromEntertainmentChannel(message);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MessageEventType {
        public static final String NP_MESSAGE_EC_TO_VOX = "vox::npMessageFromEC";
        public static final String NP_MESSAGE_VOX_TO_EC = "vox::npMessageToEC";

        private MessageEventType() {
        }
    }

    public VoiceNowPlayingEventBusModule(AudioPlaybackController audioPlaybackController) {
        this.audioPlaybackController = audioPlaybackController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleEntertainmentToVoiceMessage(@NonNull Message message) {
        VoiceBridgePayloadUtil.translatePayloadToPlayerAction(message.getPayloadAsString(), this.audioPlaybackController);
    }

    private UUID subscribeToEcMessages() {
        MultiFilterSubscriber subscriber = this.eventBus.getSubscriber();
        this.multiFilterSubscriber = subscriber;
        return subscriber.subscribe(new EcToVoxMessageFilter(), new AVSEventBusBridge$$ExternalSyntheticLambda1(this, 6));
    }

    public void broadcastVoxPlaybackInfo(JSONObject jSONObject) {
        this.eventBus.lambda$getPublisher$0(new Message.Builder().setDate(System.currentTimeMillis()).setEventType(MessageEventType.NP_MESSAGE_VOX_TO_EC).setPayload(jSONObject.toString()).setDate(System.currentTimeMillis()).setSource(Message.Source.Local).build());
    }

    public void initialize() {
        injectDependencies();
        this.subscribedID = subscribeToEcMessages();
    }

    @VisibleForTesting
    public void injectDependencies() {
        VoiceDependencies.inject(this);
    }

    public void release() {
        UUID uuid = this.subscribedID;
        if (uuid != null) {
            this.multiFilterSubscriber.unsubscribe(uuid);
        }
    }
}
