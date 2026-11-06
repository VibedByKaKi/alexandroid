package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaCardExtras {
    private final java.util.Locale locale;
    private final String marketplace;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CardExtrasKeys implements Bundles.Key {
        MARKETPLACE,
        LOCALE
    }

    public AlexaCardExtras(@Nullable Bundle bundle) {
        this.marketplace = Bundles.getOptionalString(bundle, CardExtrasKeys.MARKETPLACE);
        String optionalString = Bundles.getOptionalString(bundle, CardExtrasKeys.LOCALE);
        if (optionalString != null) {
            this.locale = java.util.Locale.forLanguageTag(optionalString);
        } else {
            this.locale = null;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(CardExtrasKeys.MARKETPLACE.name(), this.marketplace);
        if (this.locale != null) {
            bundle.putString(CardExtrasKeys.LOCALE.name(), this.locale.toLanguageTag());
        }
        return bundle;
    }

    @Nullable
    public java.util.Locale getLocale() {
        return this.locale;
    }

    @Nullable
    public String getMarketplace() {
        return this.marketplace;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private java.util.Locale locale;
        private String marketplace;

        public AlexaCardExtras build() {
            return new AlexaCardExtras(this);
        }

        public Builder setLocale(java.util.Locale locale) {
            this.locale = locale;
            return this;
        }

        public Builder setMarketplace(String str) {
            this.marketplace = str;
            return this;
        }

        private Builder() {
        }
    }

    private AlexaCardExtras(Builder builder) {
        this.marketplace = builder.marketplace;
        this.locale = builder.locale;
    }
}
