package com.amazon.identity.auth.device.token;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum OAuthTokenManager$AuthTokenExchangeType {
    DMSTokenToOauthTokenExchange("exchangeDMSCredentialsForOAuthTokenFailure"),
    OauthRefreshToAccessExchange("refreshNormalOAuthTokenFailure"),
    OauthRefreshToCookieExchange("fetchCookiesFromServerFailure"),
    OauthRefreshToDelegationAccessExchange("refreshDelegatedOAuthTokenFailure"),
    AuthorizationCodeToOAuthAccessTokenExchange("authorizationCodeToAccessTokenFailure");

    final String mFailureMetric;

    OAuthTokenManager$AuthTokenExchangeType(String str) {
        this.mFailureMetric = str;
    }
}
