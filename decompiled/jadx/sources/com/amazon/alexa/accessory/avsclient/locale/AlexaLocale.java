package com.amazon.alexa.accessory.avsclient.locale;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AlexaLocale {
    private final String name;

    public AlexaLocale(String str) {
        Preconditions.notEmpty(str, "name");
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AlexaLocale.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.name, ((AlexaLocale) obj).name);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("AlexaLocale{name='"), this.name, "'}");
    }
}
