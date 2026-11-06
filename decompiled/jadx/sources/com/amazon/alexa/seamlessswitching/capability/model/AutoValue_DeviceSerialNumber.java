package com.amazon.alexa.seamlessswitching.capability.model;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AutoValue_DeviceSerialNumber extends DeviceSerialNumber {
    private final String value;

    public AutoValue_DeviceSerialNumber(String str) {
        if (str != null) {
            this.value = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null value");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeviceSerialNumber) {
            return this.value.equals(((DeviceSerialNumber) obj).getValue());
        }
        return false;
    }

    @Override // com.amazon.alexa.seamlessswitching.capability.model.StronglyTypedString
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("DeviceSerialNumber{value="), this.value, StringSubstitutor.DEFAULT_VAR_END);
    }
}
