package com.amazon.alexa.protocols.network;

import androidx.annotation.NonNull;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface NetworkService {
    public static final String NETWORK_NOT_CONNECTED = "NOT_CONNECTED";

    @NonNull
    String getNetworkType();

    boolean isConnected();

    Observable<Boolean> onConnectivityChanged();
}
