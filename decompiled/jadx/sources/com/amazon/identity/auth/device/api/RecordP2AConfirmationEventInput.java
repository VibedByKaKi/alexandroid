package com.amazon.identity.auth.device.api;

import org.immutables.value.Value;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Value.Immutable
/* loaded from: classes5.dex */
public abstract class RecordP2AConfirmationEventInput {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Action {
        CONFIRMED,
        SWITCHED,
        DISMISSED
    }

    public abstract Action getAction();

    @Value.Default
    public MetadataScope getScope() {
        return MetadataScope.LOCAL;
    }

    public abstract String getTransitionId();

    public boolean isGlobalMetadataScope() {
        return getScope() == MetadataScope.GLOBAL;
    }
}
