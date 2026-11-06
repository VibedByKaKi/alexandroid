package com.amazon.alexa.api;

import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class FragmentsListener {
    public abstract void onFragments(AlexaFragmentsMetadata alexaFragmentsMetadata, String str, AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata) throws RemoteException;

    public void onFragmentRenderingPaused(String str) throws RemoteException {
    }

    public void onFragmentRenderingResumed(String str) throws RemoteException {
    }
}
