package com.amazon.alexa.voice.ui.marketplace;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MarketplaceAuthority {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Marketplace {
        public static final String AU = "AU";
        public static final String BR = "BR";
        public static final String CA = "CA";
        public static final String DE = "DE";
        public static final String ES = "ES";
        public static final String FR = "FR";
        public static final String GB = "GB";
        public static final String IN = "IN";
        public static final String IT = "IT";
        public static final String JP = "JP";
        public static final String MX = "MX";
        public static final String NL = "NL";
        public static final String US = "US";
    }

    String getMarketplace();
}
