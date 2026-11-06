package com.amazon.alexa.voice.model;

import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver;
import com.amazon.alexa.voice.model.VoiceService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class AppLifecycleHandlerForVoiceService implements ApplicationLifecycleObserver {
    private final VoiceService voiceService;

    public AppLifecycleHandlerForVoiceService(VoiceService voiceService) {
        this.voiceService = voiceService;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
    public void onStart() {
        this.voiceService.onForeground(VoiceService.RecordPermission.NOT_REQUIRED);
    }

    @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
    public void onStop() {
        this.voiceService.onBackground();
    }
}
