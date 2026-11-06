package com.amazon.alexa.protocols.marketplace;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum CountryCode {
    AU("AU"),
    BR("BR"),
    CA("CA"),
    CN("CN"),
    DE("DE"),
    ES("ES"),
    FR("FR"),
    GB("GB"),
    IN("IN"),
    IT("IT"),
    JP("JP"),
    MX("MX"),
    NL("NL"),
    US("US");

    private final String countryCode;

    CountryCode(@NonNull String str) {
        this.countryCode = str;
    }

    @Nullable
    public static CountryCode fromString(@Nullable String str) {
        for (CountryCode countryCode : values()) {
            if (countryCode.toString().equals(str)) {
                return countryCode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.countryCode;
    }
}
