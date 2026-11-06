package com.amazon.identity.auth.device.api;

import org.immutables.value.Value;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Value.Immutable
/* loaded from: classes5.dex */
public abstract class FetchP2ATransitionMetadataInput {
    @Value.Default
    public MetadataScope getScope() {
        return MetadataScope.LOCAL;
    }

    public boolean isGlobalMetadataScope() {
        return getScope() == MetadataScope.GLOBAL;
    }
}
