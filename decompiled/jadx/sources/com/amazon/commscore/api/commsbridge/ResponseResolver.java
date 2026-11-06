package com.amazon.commscore.api.commsbridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ResponseResolver {
    String getRequestId();

    void reject(@NonNull Throwable th);

    void resolve(@Nullable Object obj);
}
