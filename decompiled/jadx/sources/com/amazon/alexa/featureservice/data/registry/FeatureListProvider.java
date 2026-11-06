package com.amazon.alexa.featureservice.data.registry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FeatureListProvider {
    private FeatureListProvider() {
    }

    public static Map<String, Boolean> getDeprecatedElementsFeatureMap() {
        return DeprecatedElementsFeature.DEPRECATED_ELEMENTS_FEATURES;
    }

    public static String[] getFeatureList() {
        HashSet hashSet = new HashSet(Arrays.asList(NativeFeatureRegistry.NATIVE_FEATURES));
        hashSet.addAll(Arrays.asList(ElementsFeatureRegistry.ELEMENTS_FEATURES));
        return (String[]) hashSet.toArray(new String[0]);
    }

    public static String[] getInstantlyPropagatedFeatureList() {
        return (String[]) new HashSet(Arrays.asList(NativeFeatureRegistry.INSTANTLY_PROPAGATE_FEATURES)).toArray(new String[0]);
    }
}
