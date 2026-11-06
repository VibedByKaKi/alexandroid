package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaAudioChannel;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaAudioPlaybackStatusListenerAdapter;", "Lcom/amazon/alexa/api/AlexaAudioPlaybackStatusListener;", "compatListener", "Lcom/amazon/alexa/api/compat/AlexaAudioPlaybackStatusListener;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaAudioPlaybackStatusListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/AlexaAudioPlaybackStatusListener;", "onAudioPlaybackStatusChanged", "", "audioPlaybackStatus", "", "Lcom/amazon/alexa/api/AlexaAudioChannel;", "", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaAudioPlaybackStatusListenerAdapter implements com.amazon.alexa.api.AlexaAudioPlaybackStatusListener {

    @NotNull
    private final AlexaAudioPlaybackStatusListener compatListener;

    public AlexaAudioPlaybackStatusListenerAdapter(@NotNull AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener) {
        alexaAudioPlaybackStatusListener.getClass();
        this.compatListener = alexaAudioPlaybackStatusListener;
    }

    @NotNull
    public final AlexaAudioPlaybackStatusListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlexaAudioPlaybackStatusListener
    public void onAudioPlaybackStatusChanged(@NotNull Map<AlexaAudioChannel, Boolean> audioPlaybackStatus) {
        audioPlaybackStatus.getClass();
        this.compatListener.onAudioPlaybackStatusChanged(audioPlaybackStatus);
    }
}
