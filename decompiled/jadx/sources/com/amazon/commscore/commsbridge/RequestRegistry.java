package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.commscore.api.commsbridge.RequestHandler;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
interface RequestRegistry {
    @Nullable
    RequestHandler<String> getRequestHandlerById(@NonNull UUID uuid);

    @Nullable
    RequestHandler<String> getRequestHandlerByName(@NonNull String str);

    boolean isRegistered(@NonNull String str);

    boolean registerRequestHandler(@NonNull String str, @NonNull RequestHandler<String> requestHandler, @NonNull UUID uuid);

    void unregisterRequestHandler(@NonNull UUID uuid);
}
