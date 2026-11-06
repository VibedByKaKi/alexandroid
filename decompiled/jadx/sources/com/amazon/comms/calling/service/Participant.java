package com.amazon.comms.calling.service;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface Participant {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onUpdated(Participant participant);
    }

    String getEndpointDescription();

    String getName();

    String getProviderSpecifiedId();

    String getProviderSpecifiedName();

    String getUri();

    boolean hasDropInPermission();

    void registerListener(Listener listener);

    void unregisterListener(Listener listener);
}
