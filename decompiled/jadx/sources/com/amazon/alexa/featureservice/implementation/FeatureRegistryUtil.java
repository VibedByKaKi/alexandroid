package com.amazon.alexa.featureservice.implementation;

import com.amazon.alexa.featureservice.data.registry.FeatureListProvider;
import com.amazon.alexa.featureservice.repo.model.Feature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureRegistryUtil {
    private List<String> additionalFeatures = new ArrayList();

    @Inject
    public FeatureRegistryUtil() {
    }

    public List<Feature> getDeprecatedElementsFeatures() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Boolean> entry : FeatureListProvider.getDeprecatedElementsFeatureMap().entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            Feature feature = new Feature();
            feature.setFeatureName(key);
            feature.setTreatment(value.booleanValue() ? "T1" : "C");
            feature.setTriggerOnUse(false);
            arrayList.add(feature);
        }
        return arrayList;
    }

    public List<String> getInstantlyPropagatedFeatureList() {
        return Arrays.asList(FeatureListProvider.getInstantlyPropagatedFeatureList());
    }

    public List<String> getRegisteredFeatures() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.additionalFeatures);
        linkedHashSet.addAll(Arrays.asList(FeatureListProvider.getFeatureList()));
        return new ArrayList(linkedHashSet);
    }

    public void setAdditionalFeatures(List<String> list) {
        this.additionalFeatures = list;
    }
}
