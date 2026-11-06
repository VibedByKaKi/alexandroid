package com.amazon.identity.auth.device.api;

import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.lo;
import com.amazon.identity.auth.device.utils.AccountConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class TokenKeys {

    @FireOsSdk
    public static final String KEY_ACCESS_TOKEN = "com.amazon.dcp.sso.token.oauth.amazon.access_token";

    @FireOsSdk
    public static final String KEY_ACTOR_ACCESS_TOKEN = "com.amazon.dcp.sso.token.oauth.amazon.actor.access_token";

    @FireOsSdk
    public static final String KEY_ATZ_ACCESS_TOKEN = "com.amazon.dcp.sso.token.oauth.atz.access_token";

    @FireOsSdk
    public static final String KEY_LWA_APPLICATION_ID = "application-id";

    @FireOsSdk
    public static final String KEY_LWA_CLIENT_ID = "client-id";

    @FireOsSdk
    public static final String KEY_LWA_REQUESTED_SCOPES = "lwa-scopes";

    @FireOsSdk
    @Deprecated
    public static final String KEY_XFSN = "com.amazon.identity.cookies.xfsn";

    @FireOsSdk
    public static final String MOBILE_AUTH_ENCRYPTION_KEY_TOKEN = "com.amazon.mobile.auth.encryption_key";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Options {
        public static final String KEY_APP_TYPE_ID = "app_type_id";

        @FireOsSdk
        public static final String KEY_CHALLENGE_URL_ASSOC_HANDLE = "com.amazon.identity.auth.device.api.TokenKeys.Options.ChallengeURLAssocHandle";

        @FireOsSdk
        public static final String KEY_CHALLENGE_URL_FULL_DOMAIN = "com.amazon.identity.auth.device.api.TokenKeys.Options.ChallengeURLDomain";

        @FireOsSdk
        public static final String KEY_CHALLENGE_URL_PAGE_ID = "com.amazon.identity.auth.device.api.TokenKeys.Options.ChallengeURLPageId";

        @FireOsSdk
        @Deprecated
        public static final String KEY_FORCE_REFRESH_DMS_TO_OAUTH = "com.amazon.identity.auth.device.api.TokenKeys.Options.ForceRefreshDMSTokenForOAuthToken";

        @FireOsSdk
        public static final String KEY_FORCE_REFRESH_OAUTH = "com.amazon.identity.auth.device.api.TokenKeys.Options.ForceRefreshOAuthToken";
        public static final String KEY_MOBILE_AUTH_ENCRYPTION_KEY_GET_REQUEST = "com.amazon.identity.auth.device.api.TokenKeys.Options.MobileAuthEncryptionKeyGetRequest";
        public static final String KEY_MOBILE_AUTH_ENCRYPTION_KEY_ID = "com.amazon.identity.auth.device.api.TokenKeys.Options.MobileAuthEncryptionKeyId";
        public static final String KEY_MOBILE_AUTH_ENCRYPTION_KEY_UPSERT = "com.amazon.identity.auth.device.api.TokenKeys.Options.MobileAuthEncryptionKeyUpsert";

        @FireOsSdk
        public static final String KEY_OAUTH_TTL_MS_LONG = "com.amazon.identity.auth.device.api.TokenKeys.Options.OAuthAccessTokenTTLInMilliSec";

        @FireOsSdk
        public static final String KEY_OVERRIDE_CHALLENGE_URL_RETURNTO_FULL_DOMAIN = "com.amazon.identity.auth.device.api.TokenKeys.Options.ChallengeURLReturnToDomain";
        public static final String PREFIX = "com.amazon.identity.auth.device.api.TokenKeys.Options.";
    }

    @FireOsSdk
    public static String getAccessTokenKeyForPackage(String str) {
        return lo.a(str, "com.amazon.dcp.sso.token.oauth.amazon.access_token");
    }

    @FireOsSdk
    public static String getActorAccessTokenKeyForPackage(String str) {
        return lo.a(str, "com.amazon.dcp.sso.token.oauth.amazon.actor.access_token");
    }

    @FireOsSdk
    public static String getAdpTokenKeyForPackage(String str) {
        return lo.a(str, AccountConstants.TOKEN_TYPE_DEVICE_ADP_TOKEN);
    }

    @FireOsSdk
    public static String getAtzTokenKeyForPackage(String str) {
        return lo.a(str, "com.amazon.dcp.sso.token.oauth.atz.access_token");
    }

    public static String getMobileAuthEncryptionKeyForPackage(String str) {
        return lo.a(str, "com.amazon.mobile.auth.encryption_key");
    }

    @FireOsSdk
    public static String getPrivateKeyKeyForPackage(String str) {
        return lo.a(str, AccountConstants.TOKEN_TYPE_DEVICE_PRIVATE_KEY);
    }
}
