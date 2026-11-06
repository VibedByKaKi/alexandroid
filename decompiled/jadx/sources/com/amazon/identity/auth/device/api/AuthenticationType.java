package com.amazon.identity.auth.device.api;

import com.amazon.fireos.sdk.annotations.FireOsSdk;
import io.ktor.http.auth.AuthScheme;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum AuthenticationType {
    None("None", false),
    DeviceAuthenticator("DeviceAuthenticator", false),
    ADPAuthenticator("ADPAuthenticator", false),
    OAuth(AuthScheme.OAuth, true);

    private final boolean mRequireHttps;
    private final String mValue;

    AuthenticationType(String str, boolean z) {
        this.mValue = str;
        this.mRequireHttps = z;
    }

    @FireOsSdk
    public static AuthenticationType parse(String str) {
        if (str == null) {
            return null;
        }
        for (AuthenticationType authenticationType : values()) {
            if (str.equals(authenticationType.getValue())) {
                return authenticationType;
            }
        }
        return null;
    }

    @FireOsSdk
    public String getValue() {
        return this.mValue;
    }

    @Deprecated
    public boolean requireHttps() {
        return this.mRequireHttps;
    }
}
