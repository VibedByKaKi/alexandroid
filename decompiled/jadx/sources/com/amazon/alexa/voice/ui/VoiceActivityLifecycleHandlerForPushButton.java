package com.amazon.alexa.voice.ui;

import com.amazon.alexa.voice.model.VoiceService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VoiceActivityLifecycleHandlerForPushButton implements VoiceActivityLifecycleHandler {
    private final VoiceService voiceService;

    public VoiceActivityLifecycleHandlerForPushButton(VoiceService voiceService) {
        this.voiceService = voiceService;
    }

    @Override // com.amazon.alexa.voice.ui.VoiceActivityLifecycleHandler
    public void afterSuperOnDestroy() {
        this.voiceService.doNotBackground(false);
        this.voiceService.onBackground();
    }

    @Override // com.amazon.alexa.voice.ui.VoiceActivityLifecycleHandler
    public void beforeSuperOnStop() {
        this.voiceService.doNotBackground(true);
    }
}
