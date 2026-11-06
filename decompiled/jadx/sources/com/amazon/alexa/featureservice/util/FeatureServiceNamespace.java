package com.amazon.alexa.featureservice.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dagger.internal.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FeatureServiceNamespace {
    private FeatureServiceNamespace() {
    }

    public static String concatFeatureIdentifiers(@Nullable String str, @NonNull String str2) {
        return (str == null || str.isEmpty()) ? str2 : a$$ExternalSyntheticOutline0.m$1(str, "#", str2);
    }

    public static String[] splitFeatureIdentifier(String str) {
        Preconditions.checkNotNull(str);
        return str.split("#");
    }
}
