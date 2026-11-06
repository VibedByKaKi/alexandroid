package com.amazon.alexa.client.alexaservice.base.system;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlexaLocale extends AlexaLocale {
    private final boolean deviceDefault;
    private final List<Locale> locales;

    public AutoValue_AlexaLocale(List<Locale> list, boolean z) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null locales");
            throw null;
        }
        this.locales = list;
        this.deviceDefault = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaLocale) {
            AlexaLocale alexaLocale = (AlexaLocale) obj;
            if (this.locales.equals(alexaLocale.getLocales()) && this.deviceDefault == alexaLocale.isDeviceDefault()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.AlexaLocale
    public List<Locale> getLocales() {
        return this.locales;
    }

    public int hashCode() {
        return (this.deviceDefault ? 1231 : 1237) ^ ((this.locales.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.AlexaLocale
    public boolean isDeviceDefault() {
        return this.deviceDefault;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlexaLocale{locales=");
        sb.append(this.locales);
        sb.append(", deviceDefault=");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceDefault, StringSubstitutor.DEFAULT_VAR_END);
    }
}
