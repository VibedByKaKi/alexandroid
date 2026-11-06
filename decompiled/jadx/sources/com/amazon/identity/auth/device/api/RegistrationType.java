package com.amazon.identity.auth.device.api;

import io.ktor.http.auth.AuthScheme;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RegistrationType {
    WITH_LOGIN_CREDENTIALS("LoginCredentials"),
    WITH_DEVICE_SECRET("DeviceSecret"),
    WITH_EXPLICIT_URL("ExplicitUrl"),
    FROM_ATMAIN("ATMain"),
    FROM_AUTH_TOKEN("AuthToken"),
    FROM_ACCESS_TOKEN("AccessToken"),
    FROM_ADP_TOKEN("AdpToken"),
    REGISTER_DELEGATED_ACCOUNT("RegisterDelegatedAccount"),
    WITH_DIRECTEDID_CREDENTIALS("DirectedIdCredentials"),
    WITH_PRIMARY_DIRECTEDID_CREDENTIALS("PrimaryDirectedIdCredentials"),
    WITH_LINK_CODE("LinkCode"),
    WITH_SSO_CODE("SSOCode"),
    ANONYMOUS("Anonymous"),
    FROM_AUTHORIZATION_CODE("AuthorizationCode"),
    FROM_IMPLIED_SCOPE_TOKEN("ImpliedScopeToken"),
    SHUMA_ADDITIONAL_ACCOUNT("SHuMASecondAccount"),
    WITH_OAUTH(AuthScheme.OAuth);

    private final String mName;

    RegistrationType(String str) {
        this.mName = str;
    }

    public static RegistrationType fromName(String str) {
        for (RegistrationType registrationType : values()) {
            if (registrationType.getName().equals(str)) {
                return registrationType;
            }
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }
}
