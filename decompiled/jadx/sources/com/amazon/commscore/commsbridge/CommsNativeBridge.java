package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.commscore.api.commsbridge.EventListener;
import com.amazon.commscore.api.commsbridge.RequestHandler;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface CommsNativeBridge {
    UUID addEventListener(@NonNull String str, @NonNull EventListener<String> eventListener);

    void emitEventToReact(@NonNull String str, @Nullable Object obj);

    @Nullable
    EventListener<String> getEventListener(@NonNull UUID uuid);

    boolean isRequestHandlerRegistered(@NonNull String str);

    UUID registerRequestHandler(@NonNull String str, @NonNull RequestHandler<String> requestHandler);

    @Nullable
    EventListener<String> removeEventListener(@NonNull UUID uuid);

    void unregisterRequestHandler(@NonNull UUID uuid);
}
