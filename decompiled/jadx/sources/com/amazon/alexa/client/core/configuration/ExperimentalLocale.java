package com.amazon.alexa.client.core.configuration;

import com.amazon.alexa.api.Feature;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExperimentalLocale {
    private final Feature feature;
    private final Locale locale;

    public ExperimentalLocale(Locale locale, Feature feature) {
        this.locale = locale;
        this.feature = feature;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ExperimentalLocale experimentalLocale = (ExperimentalLocale) obj;
            if (Objects.equals(this.locale, experimentalLocale.locale) && this.feature == experimentalLocale.feature) {
                return true;
            }
        }
        return false;
    }

    public Feature getFeature() {
        return this.feature;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return Objects.hash(this.locale, this.feature);
    }
}
