package com.amazon.alexa.mosaic.services.feature;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum Feature {
    APL_FRAGMENTS_CACHING("MOSAIC", "APL_FRAGMENTS_CACHING"),
    APL_ANDROID_LIGHTBOX("MOSAIC", "APL_ANDROID_LIGHTBOX");

    private final String name;
    private final String namespace;

    Feature(String str, String str2) {
        this.namespace = str;
        this.name = str2;
    }

    @Nullable
    public static Feature fromNamespaceAndName(String str, String str2) {
        for (Feature feature : values()) {
            if (feature.name.equals(str2) && feature.namespace.equals(str)) {
                return feature;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return this.namespace;
    }
}
