package com.amazon.alexa.api;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class ImmutableClient extends ExtendedClient {
    private ImmutableClient(ClientRole clientRole, String str, String str2, AlexaApiVersion alexaApiVersion, @Nullable ArrayList<ExtendedClient> arrayList, @Nullable String str3, @Nullable String str4) {
        super(clientRole, str, str2, alexaApiVersion, copyArrayList(arrayList), str3, str4);
    }

    private static ArrayList<ExtendedClient> copyArrayList(@Nullable ArrayList<ExtendedClient> arrayList) {
        return arrayList != null ? new ArrayList<>(arrayList) : new ArrayList<>();
    }

    public static ExtendedClient from(ExtendedClient extendedClient) {
        return new ImmutableClient(extendedClient.clientRole, extendedClient.id, extendedClient.packageName, extendedClient.version, extendedClient.subclients, extendedClient.activeSubClientId, extendedClient.debugTag);
    }

    @Override // com.amazon.alexa.api.ExtendedClient
    public void addSubClient(ExtendedClient extendedClient) {
        throw new UnsupportedOperationException("Cannot add a sub client to an immutable client");
    }

    @Override // com.amazon.alexa.api.ExtendedClient
    public void clearSubClients() {
        throw new UnsupportedOperationException("Cannot clear the sub client list on an immutable client");
    }

    @Override // com.amazon.alexa.api.ExtendedClient
    public void removeSubClient(ExtendedClient extendedClient) {
        throw new UnsupportedOperationException("Cannot remove a sub client from an immutable client");
    }

    @Override // com.amazon.alexa.api.ExtendedClient
    public void setActiveSubClient(ExtendedClient extendedClient) {
        throw new UnsupportedOperationException("Cannot set the active sub client on an immutable client");
    }
}
