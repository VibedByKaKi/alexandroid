package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.MAPFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class hm implements km {
    @Override // com.amazon.identity.auth.device.km
    public final MAPFuture a(dg dgVar) {
        throw new UnsupportedOperationException("getPrivacyRegulations is not supported on FireOS");
    }

    @Override // com.amazon.identity.auth.device.km
    public final Bundle a() {
        throw new UnsupportedOperationException("getPrivacyRegulationsFromCacheOnly is not supported on FireOS");
    }
}
