package com.amazonaws.auth.policy;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Principal {
    private final String id;
    private final String provider;
    public static final Principal AllUsers = new Principal("AWS", "*");
    public static final Principal AllServices = new Principal("Service", "*");
    public static final Principal AllWebProviders = new Principal("Federated", "*");
    public static final Principal All = new Principal("*", "*");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Services {
        AWSDataPipeline("datapipeline.amazonaws.com"),
        AmazonElasticTranscoder("elastictranscoder.amazonaws.com"),
        AmazonEC2("ec2.amazonaws.com"),
        AWSOpsWorks("opsworks.amazonaws.com"),
        AWSCloudHSM("cloudhsm.amazonaws.com"),
        AllServices("*");

        private String serviceId;

        Services(String str) {
            this.serviceId = str;
        }

        public static Services fromString(String str) {
            if (str == null) {
                return null;
            }
            for (Services services : values()) {
                if (services.getServiceId().equalsIgnoreCase(str)) {
                    return services;
                }
            }
            return null;
        }

        public String getServiceId() {
            return this.serviceId;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WebIdentityProviders {
        Facebook("graph.facebook.com"),
        Google("accounts.google.com"),
        Amazon("www.amazon.com"),
        AllProviders("*");

        private String webIdentityProvider;

        WebIdentityProviders(String str) {
            this.webIdentityProvider = str;
        }

        public static WebIdentityProviders fromString(String str) {
            if (str == null) {
                return null;
            }
            for (WebIdentityProviders webIdentityProviders : values()) {
                if (webIdentityProviders.getWebIdentityProvider().equalsIgnoreCase(str)) {
                    return webIdentityProviders;
                }
            }
            return null;
        }

        public String getWebIdentityProvider() {
            return this.webIdentityProvider;
        }
    }

    public Principal(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Null AWS account ID specified");
            throw null;
        }
        this.id = str.replaceAll("-", "");
        this.provider = "AWS";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Principal)) {
            return false;
        }
        Principal principal = (Principal) obj;
        return getProvider().equals(principal.getProvider()) && getId().equals(principal.getId());
    }

    public String getId() {
        return this.id;
    }

    public String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return this.id.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(31, 31, this.provider);
    }

    public Principal(String str, String str2) {
        this.provider = str;
        this.id = "AWS".equals(str) ? str2.replaceAll("-", "") : str2;
    }

    public Principal(Services services) {
        if (services != null) {
            this.id = services.getServiceId();
            this.provider = "Service";
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Null AWS service name specified");
            throw null;
        }
    }

    public Principal(WebIdentityProviders webIdentityProviders) {
        if (webIdentityProviders != null) {
            this.id = webIdentityProviders.getWebIdentityProvider();
            this.provider = "Federated";
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Null web identity provider specified");
            throw null;
        }
    }
}
