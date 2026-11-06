package com.amazon.alexa.accessory.repositories.cbl;

import com.amazon.alexa.accessory.protocol.Cbl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface CblProvider {
    void provideCblLoginState(Cbl.CblLoginState cblLoginState);

    void provideCblLoginStateError(Throwable th);
}
