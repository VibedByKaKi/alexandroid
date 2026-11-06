package com.amazonaws.regions;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Region {
    private static final String DEFAULT_DOMAIN = "amazonaws.com";
    private final String domain;
    private final String name;
    private final Map<String, String> serviceEndpoints = new HashMap();
    private final Map<String, Boolean> httpSupport = new HashMap();
    private final Map<String, Boolean> httpsSupport = new HashMap();

    public Region(String str, String str2) {
        this.name = str;
        if (str2 == null || str2.isEmpty()) {
            this.domain = DEFAULT_DOMAIN;
        } else {
            this.domain = str2;
        }
    }

    public static Region getRegion(Regions regions) {
        return RegionUtils.getRegion(regions.getName());
    }

    public <T extends AmazonWebServiceClient> T createClient(Class<T> cls, AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        try {
            T newInstance = (aWSCredentialsProvider == null && clientConfiguration == null) ? cls.getConstructor(null).newInstance(null) : aWSCredentialsProvider == null ? cls.getConstructor(ClientConfiguration.class).newInstance(clientConfiguration) : clientConfiguration == null ? cls.getConstructor(AWSCredentialsProvider.class).newInstance(aWSCredentialsProvider) : cls.getConstructor(AWSCredentialsProvider.class, ClientConfiguration.class).newInstance(aWSCredentialsProvider, clientConfiguration);
            newInstance.setRegion(this);
            return newInstance;
        } catch (Exception e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Couldn't instantiate instance of ", cls), e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Region) {
            return getName().equals(((Region) obj).getName());
        }
        return false;
    }

    public String getDomain() {
        return this.domain;
    }

    public Map<String, Boolean> getHttpSupport() {
        return this.httpSupport;
    }

    public Map<String, Boolean> getHttpsSupport() {
        return this.httpsSupport;
    }

    public String getName() {
        return this.name;
    }

    public String getServiceEndpoint(String str) {
        return this.serviceEndpoints.get(str);
    }

    public Map<String, String> getServiceEndpoints() {
        return this.serviceEndpoints;
    }

    public boolean hasHttpEndpoint(String str) {
        return this.httpSupport.containsKey(str) && this.httpSupport.get(str).booleanValue();
    }

    public boolean hasHttpsEndpoint(String str) {
        return this.httpsSupport.containsKey(str) && this.httpsSupport.get(str).booleanValue();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isServiceSupported(String str) {
        return this.serviceEndpoints.containsKey(str);
    }

    public String toString() {
        return getName();
    }

    public static Region getRegion(String str) {
        return RegionUtils.getRegion(str);
    }
}
