package com.amazon.deecomms.alexa;

import com.amazon.alexa.api.compat.model.AlexaAudioChannel;
import com.amazon.alexa.api.compat.model.AlexaAudioTask;
import com.amazon.alexa.api.compat.model.AlexaAudioTaskBehavior;
import com.amazon.alexa.api.compat.model.AlexaAudioTaskChannelPriority;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsAudioInteraction implements AlexaAudioTask {
    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    /* renamed from: getAlexaAudioChannel */
    public AlexaAudioChannel getChannel() {
        return AlexaAudioChannel.COMMUNICATIONS;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    /* renamed from: getAlexaAudioTaskBehavior */
    public AlexaAudioTaskBehavior getBehavior() {
        return AlexaAudioTaskBehavior.DEFAULT;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    /* renamed from: getAlexaAudioTaskChannelPriority */
    public AlexaAudioTaskChannelPriority getPriority() {
        return AlexaAudioTaskChannelPriority.HIGH;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    /* renamed from: getAudioTaskComponentName */
    public String getComponentName() {
        return "SipClient";
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onBackground() {
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onForeground() {
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onPause() {
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onResume() {
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onStop() {
    }
}
