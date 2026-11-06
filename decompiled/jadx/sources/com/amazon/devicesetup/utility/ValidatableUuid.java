package com.amazon.devicesetup.utility;

import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ValidatableUuid {
    private final UUID mValue;

    public ValidatableUuid(UUID uuid) {
        if (uuid != null) {
            this.mValue = uuid;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            throw null;
        }
    }

    public UUID getValue() {
        return this.mValue;
    }

    public String toString() {
        return this.mValue.toString();
    }
}
