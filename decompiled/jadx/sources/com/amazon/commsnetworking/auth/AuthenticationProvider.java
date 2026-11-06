package com.amazon.commsnetworking.auth;

import androidx.annotation.NonNull;
import com.amazon.commsnetworking.api.INetworkRequest;
import okhttp3.Request;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AuthenticationProvider {
    void authenticateRequest(@NonNull INetworkRequest iNetworkRequest);

    void authenticateRequest(@NonNull Request.Builder builder);
}
