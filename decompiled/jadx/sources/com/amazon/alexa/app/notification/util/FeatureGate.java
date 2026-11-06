package com.amazon.alexa.app.notification.util;

import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum FeatureGate {
    REDUCE_FIREBASE_RETRIES;


    @NonNull
    private final String namespace;

    FeatureGate(@NonNull String str) {
        if (str != null) {
            this.namespace = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("namespace is marked non-null but is null");
            throw null;
        }
    }

    @NonNull
    public String getNamespace() {
        return this.namespace;
    }

    FeatureGate() {
        this.namespace = "ALEXA_MOBILE_NOTIFICATION_NATIVE";
    }
}
