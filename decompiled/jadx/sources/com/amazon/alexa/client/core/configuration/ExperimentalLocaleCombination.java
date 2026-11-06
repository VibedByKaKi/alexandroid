package com.amazon.alexa.client.core.configuration;

import com.amazon.alexa.api.Feature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExperimentalLocaleCombination {
    private final Feature feature;
    private final Locale primaryLocale;
    private final Locale secondaryLocale;

    public ExperimentalLocaleCombination(Locale locale, Locale locale2, Feature feature) {
        this.primaryLocale = locale;
        this.secondaryLocale = locale2;
        this.feature = feature;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ExperimentalLocaleCombination experimentalLocaleCombination = (ExperimentalLocaleCombination) obj;
            if (Objects.equals(this.primaryLocale, experimentalLocaleCombination.primaryLocale) && Objects.equals(this.secondaryLocale, experimentalLocaleCombination.secondaryLocale) && this.feature == experimentalLocaleCombination.feature) {
                return true;
            }
        }
        return false;
    }

    public Feature getFeature() {
        return this.feature;
    }

    public List<Locale> getLocaleCombination() {
        return new ArrayList(Arrays.asList(this.primaryLocale, this.secondaryLocale));
    }

    public int hashCode() {
        return Objects.hash(this.primaryLocale, this.secondaryLocale, this.feature);
    }
}
