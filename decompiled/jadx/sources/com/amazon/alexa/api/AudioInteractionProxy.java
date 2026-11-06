package com.amazon.alexa.api;

import android.os.RemoteException;
import com.amazon.alexa.api.AlexaAudioInteractionProxy;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class AudioInteractionProxy extends AlexaAudioInteractionProxy.Stub {
    private AlexaAudioInteraction alexaAudioInteraction;
    private final String identifier = UUID.randomUUID().toString();

    public AudioInteractionProxy(AlexaAudioInteraction alexaAudioInteraction) {
        this.alexaAudioInteraction = alexaAudioInteraction;
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public AlexaAudioChannel getAlexaAudioChannel() throws RemoteException {
        return this.alexaAudioInteraction.getAlexaAudioChannel();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public AlexaAudioTaskBehavior getAlexaAudioTaskBehavior() throws RemoteException {
        return this.alexaAudioInteraction.getAlexaAudioTaskBehavior();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public String getIdentifier() throws RemoteException {
        return this.identifier;
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public String getInteractionComponentName() {
        return this.alexaAudioInteraction.getInteractionComponentName();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public void onBackground() throws RemoteException {
        this.alexaAudioInteraction.onBackground();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public void onForeground() throws RemoteException {
        this.alexaAudioInteraction.onForeground();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public void onPause() throws RemoteException {
        this.alexaAudioInteraction.onPause();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public void onResume() throws RemoteException {
        this.alexaAudioInteraction.onResume();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteractionProxy
    public void onStop() throws RemoteException {
        this.alexaAudioInteraction.onStop();
    }
}
