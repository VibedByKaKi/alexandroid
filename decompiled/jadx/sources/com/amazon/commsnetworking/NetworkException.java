package com.amazon.commsnetworking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.commsnetworking.api.INetworkRequest;
import com.amazon.commsnetworking.api.INetworkResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NetworkException extends Exception {

    @NonNull
    private INetworkRequest request;

    @Nullable
    private INetworkResponse response;

    public NetworkException(@NonNull INetworkRequest iNetworkRequest, @NonNull INetworkResponse iNetworkResponse) {
        super("Unexpected code " + iNetworkResponse.getStatusCode());
        this.request = iNetworkRequest;
        this.response = iNetworkResponse;
    }

    public INetworkRequest getRequest() {
        return this.request;
    }

    public INetworkResponse getResponse() {
        return this.response;
    }

    public Integer getStatusCode() {
        INetworkResponse iNetworkResponse = this.response;
        if (iNetworkResponse == null) {
            return null;
        }
        return Integer.valueOf(iNetworkResponse.getStatusCode());
    }

    public NetworkException(@NonNull INetworkRequest iNetworkRequest, @NonNull Exception exc) {
        super(exc);
        this.request = iNetworkRequest;
    }
}
