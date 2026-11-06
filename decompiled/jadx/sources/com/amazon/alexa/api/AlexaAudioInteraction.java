package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes16.dex */
public interface AlexaAudioInteraction {
    AlexaAudioChannel getAlexaAudioChannel();

    default AlexaAudioTaskBehavior getAlexaAudioTaskBehavior() {
        return AlexaAudioTaskBehavior.DEFAULT;
    }

    String getInteractionComponentName();

    void onBackground();

    void onForeground();

    void onPause();

    void onResume();

    void onStop();
}
