package com.amazon.alexa.client.alexaservice.base.metrics;

import androidx.annotation.Nullable;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.VoiceChatModeState;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.VoiceChatModeStateChangedEvent;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MetricsSubComponentNameProvider {
    private static final String TAG = "MetricsSubComponentNameProvider";
    public static final String VOICE_CHAT_MODE = "voice_chat_mode";
    private volatile VoiceChatModeState cachedState = VoiceChatModeState.INACTIVE;
    private final AlexaClientEventBus eventBus;

    @Inject
    public MetricsSubComponentNameProvider(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    @Nullable
    public String getSubComponentName() {
        VoiceChatModeState voiceChatModeState = this.cachedState;
        if (voiceChatModeState == VoiceChatModeState.ACTIVE || voiceChatModeState == VoiceChatModeState.MUTED) {
            return "voice_chat_mode";
        }
        return null;
    }

    @Subscribe
    public void on(VoiceChatModeStateChangedEvent voiceChatModeStateChangedEvent) {
        this.cachedState = voiceChatModeStateChangedEvent.getState();
        String subComponentName = getSubComponentName();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Voice Chat Mode state -> ");
        sb.append(this.cachedState);
        sb.append("; metrics subComponent now ");
        if (subComponentName == null) {
            subComponentName = "default (shim)";
        }
        ParcelCompat$$ExternalSyntheticOutline0.m(subComponentName, str, sb);
    }

    public void teardown() {
        this.eventBus.unregister(this);
    }
}
