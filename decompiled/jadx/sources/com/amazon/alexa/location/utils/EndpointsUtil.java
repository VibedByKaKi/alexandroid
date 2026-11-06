package com.amazon.alexa.location.utils;

import androidx.annotation.NonNull;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class EndpointsUtil {
    public static final String ENDPOINT_EU_BETA = "https://api-amazonalexa-eu.integ.amazon.com";
    public static final String ENDPOINT_EU_GAMMA = "https://api-amazonalexa-gamma-eu-dub.dub.proxy.amazon.com";
    public static final String ENDPOINT_EU_PROD = "https://api.eu.amazonalexa.com";
    public static final String ENDPOINT_FE_BETA = "https://api-amazonalexa-fe.integ.amazon.com";
    public static final String ENDPOINT_FE_GAMMA = "https://api-amazonalexa-gamma-fe-pdx.pdx.proxy.amazon.com";
    public static final String ENDPOINT_FE_PROD = "https://api.fe.amazonalexa.com";
    public static final String ENDPOINT_NA_BETA = "https://api-amazonalexa.integ.amazon.com";
    public static final String ENDPOINT_NA_GAMMA = "https://api-amazonalexa-gamma.amazon.com";
    public static final String ENDPOINT_NA_PROD = "https://api.amazonalexa.com";
    private static Map<String, Map<String, String>> endpointMap;

    private EndpointsUtil() {
    }

    public static String getEndpoint(@NonNull String str, @NonNull String str2) {
        str.getClass();
        switch (str) {
            case "preprod":
            case "prod":
            case "local":
                return getEndpointMap().get("prod").get(str2);
            case "beta":
            case "alpha":
                return getEndpointMap().get("beta").get(str2);
            case "gamma":
                return getEndpointMap().get("gamma").get(str2);
            default:
                return getEndpointMap().get("prod").get(str2);
        }
    }

    public static Map<String, Map<String, String>> getEndpointMap() {
        if (endpointMap == null) {
            endpointMap = new HashMap();
        }
        if (endpointMap.isEmpty()) {
            HashMap m = Automotive$$ExternalSyntheticOutline0.m("US", ENDPOINT_NA_BETA, "CA", ENDPOINT_NA_BETA);
            m.put("MX", ENDPOINT_NA_BETA);
            m.put("BR", ENDPOINT_NA_BETA);
            m.put("DE", ENDPOINT_EU_BETA);
            m.put("IT", ENDPOINT_EU_BETA);
            m.put("GB", ENDPOINT_EU_BETA);
            m.put("FR", ENDPOINT_EU_BETA);
            m.put("ES", ENDPOINT_EU_BETA);
            m.put("IN", ENDPOINT_EU_BETA);
            m.put("JP", ENDPOINT_FE_BETA);
            m.put("AU", ENDPOINT_FE_BETA);
            m.put("NL", ENDPOINT_FE_BETA);
            endpointMap.put("beta", m);
            HashMap hashMap = new HashMap();
            hashMap.put("US", ENDPOINT_NA_GAMMA);
            hashMap.put("CA", ENDPOINT_NA_GAMMA);
            hashMap.put("MX", ENDPOINT_NA_GAMMA);
            hashMap.put("BR", ENDPOINT_NA_GAMMA);
            hashMap.put("DE", ENDPOINT_EU_GAMMA);
            hashMap.put("IT", ENDPOINT_EU_GAMMA);
            hashMap.put("GB", ENDPOINT_EU_GAMMA);
            hashMap.put("FR", ENDPOINT_EU_GAMMA);
            hashMap.put("ES", ENDPOINT_EU_GAMMA);
            hashMap.put("IN", ENDPOINT_EU_GAMMA);
            hashMap.put("JP", ENDPOINT_FE_GAMMA);
            hashMap.put("AU", ENDPOINT_FE_GAMMA);
            hashMap.put("NL", ENDPOINT_FE_GAMMA);
            endpointMap.put("gamma", hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("US", ENDPOINT_NA_PROD);
            hashMap2.put("CA", ENDPOINT_NA_PROD);
            hashMap2.put("MX", ENDPOINT_NA_PROD);
            hashMap2.put("BR", ENDPOINT_NA_PROD);
            hashMap2.put("DE", ENDPOINT_EU_PROD);
            hashMap2.put("IT", ENDPOINT_EU_PROD);
            hashMap2.put("GB", ENDPOINT_EU_PROD);
            hashMap2.put("FR", ENDPOINT_EU_PROD);
            hashMap2.put("ES", ENDPOINT_EU_PROD);
            hashMap2.put("IN", ENDPOINT_EU_PROD);
            hashMap2.put("JP", ENDPOINT_FE_PROD);
            hashMap2.put("AU", ENDPOINT_FE_PROD);
            hashMap2.put("NL", ENDPOINT_FE_PROD);
            endpointMap.put("prod", hashMap2);
        }
        return endpointMap;
    }
}
