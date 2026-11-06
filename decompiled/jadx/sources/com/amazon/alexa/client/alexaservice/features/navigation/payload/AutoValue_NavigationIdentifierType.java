package com.amazon.alexa.client.alexaservice.features.navigation.payload;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_NavigationIdentifierType extends NavigationIdentifierType {
    private final String value;

    public AutoValue_NavigationIdentifierType(String str) {
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
        if (obj instanceof NavigationIdentifierType) {
            return this.value.equals(((NavigationIdentifierType) obj).getValue());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("NavigationIdentifierType{value="), this.value, StringSubstitutor.DEFAULT_VAR_END);
    }
}
