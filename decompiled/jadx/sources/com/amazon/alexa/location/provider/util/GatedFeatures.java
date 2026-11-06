package com.amazon.alexa.location.provider.util;

import androidx.annotation.NonNull;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class GatedFeatures {
    private GatedFeatures() {
    }

    public static boolean hasFeature(@NonNull String str) {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(FeatureServiceV2.class).get();
        return ((FeatureServiceV2) obj).hasAccess(str, false);
    }
}
