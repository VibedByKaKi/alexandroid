package com.amazon.alexa.api;

import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_FragmentsListenerWrapper extends FragmentsListener implements AlexaFragmentsListener {
    private final AlexaFragmentsListener alexaFragmentsListener;

    public ApiType_FragmentsListenerWrapper(AlexaFragmentsListener alexaFragmentsListener) {
        this.alexaFragmentsListener = alexaFragmentsListener;
    }

    @Override // com.amazon.alexa.api.FragmentsListener, com.amazon.alexa.api.AlexaFragmentsListener
    public void onFragmentRenderingPaused(String str) throws RemoteException {
        this.alexaFragmentsListener.onFragmentRenderingPaused(str);
    }

    @Override // com.amazon.alexa.api.FragmentsListener, com.amazon.alexa.api.AlexaFragmentsListener
    public void onFragmentRenderingResumed(String str) throws RemoteException {
        this.alexaFragmentsListener.onFragmentRenderingResumed(str);
    }

    @Override // com.amazon.alexa.api.FragmentsListener, com.amazon.alexa.api.AlexaFragmentsListener
    public void onFragments(AlexaFragmentsMetadata alexaFragmentsMetadata, String str, AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata) throws RemoteException {
        this.alexaFragmentsListener.onFragments(alexaFragmentsMetadata, str, alexaFragmentsChunkMetadata);
    }
}
