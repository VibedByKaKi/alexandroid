package com.amazon.deecomms.ndt.model;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum SupportedFeature {
    InboundDropIn("inbound_drop_in"),
    Unknown("unknown");

    private static final Map<String, SupportedFeature> lookupMap = new HashMap();
    private final String featureLabel;

    static {
        for (SupportedFeature supportedFeature : values()) {
            lookupMap.put(supportedFeature.getFeatureLabel(), supportedFeature);
        }
    }

    SupportedFeature(String str) {
        this.featureLabel = str;
    }

    public static SupportedFeature lookup(String str) {
        SupportedFeature supportedFeature = Unknown;
        if (str != null) {
            Map<String, SupportedFeature> map = lookupMap;
            if (map.containsKey(str.toLowerCase())) {
                return map.get(str);
            }
        }
        return supportedFeature;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }
}
