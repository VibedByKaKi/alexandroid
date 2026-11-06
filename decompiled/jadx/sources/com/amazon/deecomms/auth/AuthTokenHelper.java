package com.amazon.deecomms.auth;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.metrics.CounterMetric;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.network.ServiceException;
import com.amazon.deecomms.common.network.acmsrecipes.FetchAuthToken;
import com.amazon.deecomms.common.sip.SipAuthTokenResponse;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class AuthTokenHelper {
    private static final boolean DEBUG_FORCE_SHORT_EXPIRATION = false;
    private static final int DEBUG_SHORT_EXPIRATION_VALUE = 360000;
    private static final boolean DEBUG_USE_READABLE_TOKENS = false;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, AuthTokenHelper.class);
    private static final Map<Integer, String> sDebugReadableTokens = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AuthToken {
        private final String authToken;
        private final long expiry;

        public AuthToken(@NonNull String str, long j) {
            this.authToken = str;
            this.expiry = j;
        }

        public long getExpiry() {
            return this.expiry;
        }

        public int getExpiryInSecs() {
            return (int) (getExpiry() / 1000);
        }

        @NonNull
        public String getValue() {
            return this.authToken;
        }

        public String toString() {
            return "AuthToken: value=" + AuthTokenHelper.sensitive(getValue()) + ", expiry=" + getExpiry();
        }
    }

    private AuthTokenHelper() {
    }

    public static String computeSHA256Hash(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return Base64.encodeToString(messageDigest.digest(), 0).trim();
        } catch (NoSuchAlgorithmException e) {
            LOG.e("SHA 256 algorithm is not found for computing hash", e);
            return null;
        }
    }

    public static synchronized AuthToken fetchAuthToken(@NonNull String str, @NonNull TokenType tokenType, long j, boolean z) {
        AuthToken savedAuthToken;
        synchronized (AuthTokenHelper.class) {
            Context context = CommsDaggerWrapper.getComponent().getContext();
            if (!z && (savedAuthToken = getSavedAuthToken(context, tokenType, j)) != null && !TextUtils.isEmpty(savedAuthToken.getValue())) {
                return savedAuthToken;
            }
            TokenInfo fetchToken = fetchToken(str, tokenType);
            SipAuthTokenResponse.AuthToken authToken = fetchToken.authToken;
            if (authToken != null && !TextUtils.isEmpty(authToken.getTokenValue())) {
                storeAuthTokenInSharedPreference(context, fetchToken.authToken, tokenType);
                AuthToken authToken2 = new AuthToken(fetchToken.authToken.getTokenValue(), fetchToken.authToken.getExpiresIn());
                LOG.i("Successfully fetched token: " + authToken2 + ". TokenType=" + tokenType);
                return authToken2;
            }
            if (fetchToken.authToken != null) {
                recordFailAuthTokenMetric(MetricKeys.FAIL_EMPTY_TOKEN);
                recordDebugMetric(fetchToken.requestId, "Got token with empty or null token value. TokenType=" + tokenType, null);
                LOG.e("Unable to retrieve SIP Auth Token. TokenType=" + tokenType);
            } else {
                recordFailAuthTokenMetric(MetricKeys.FAIL_NULL_TOKEN);
                recordDebugMetric(fetchToken.requestId, "Unable to retrieve SIP Auth Token. TokenType=" + tokenType, null);
                LOG.e("Unable to retrieve SIP Auth Token. TokenType=" + tokenType);
            }
            return null;
        }
    }

    @NonNull
    private static TokenInfo fetchToken(@NonNull String str, @NonNull TokenType tokenType) {
        TokenInfo tokenInfo = new TokenInfo(0);
        try {
            FetchAuthToken fetchAuthToken = new FetchAuthToken(tokenType.getAcmsType());
            SipAuthTokenResponse execute = fetchAuthToken.execute(str);
            tokenInfo.requestId = fetchAuthToken.getRequestId();
            if (execute != null) {
                tokenInfo.authToken = execute.getAuthToken();
                LOG.d("fetched token: " + execute.getAuthToken() + ". TokenType=" + tokenType);
            } else {
                LOG.e("Invalid response from FetchAuthToken. TokenType=" + tokenType);
                recordFailAuthTokenMetric(MetricKeys.FAIL_NULL_RESPONSE);
                recordDebugMetric(fetchAuthToken.getRequestId(), "Null response from API", null);
            }
        } catch (ServiceException e) {
            LOG.e("Error while FetchAuthToken. TokenType=" + tokenType, e);
        }
        SipAuthTokenResponse.AuthToken authToken = tokenInfo.authToken;
        if (authToken != null) {
            String tokenValue = authToken.getTokenValue();
            long epochTokenCreatedTimeInMillis = tokenInfo.authToken.getEpochTokenCreatedTimeInMillis();
            long epochTokenExpirationTimeInMillis = tokenInfo.authToken.getEpochTokenExpirationTimeInMillis();
            if (TextUtils.isEmpty(tokenValue)) {
                LOG.e("Fetched token has invalid value: %s" + sensitive(tokenValue) + ". TokenType=" + tokenType);
                tokenInfo.authToken = null;
                recordFailAuthTokenMetric(MetricKeys.FAIL_EMPTY_TOKEN);
                recordDebugMetric(tokenInfo.requestId, "Fetched token has invalid value. TokenType=" + tokenType, null);
            } else if (epochTokenExpirationTimeInMillis == 0) {
                LOG.e("Fetched token has invalid expiration" + sensitive(tokenValue) + ". TokenType=" + tokenType);
                tokenInfo.authToken = null;
                recordFailAuthTokenMetric(MetricKeys.FAIL_INVALID_EXPIRATION);
                recordDebugMetric(tokenInfo.requestId, "Fetched token has invalid expiration. TokenType=" + tokenType, null);
            } else if (epochTokenExpirationTimeInMillis <= epochTokenCreatedTimeInMillis) {
                LOG.e("Fetched token is expired. TokenType=" + tokenType);
                tokenInfo.authToken = null;
                recordFailAuthTokenMetric(MetricKeys.FAIL_TOKEN_ALREADY_EXPIRED);
                recordDebugMetric(tokenInfo.requestId, "Fetched token is expired. TokenType=" + tokenType, null);
            }
        }
        return tokenInfo;
    }

    public static AuthToken getSavedAuthToken(@NonNull Context context, @NonNull TokenType tokenType, long j) {
        String string = new SecuredSharedPreference(context).getString(tokenType.getTokenPreferenceKey(), null);
        long longPreferenceFromSharedPrefs = Utils.getLongPreferenceFromSharedPrefs(context, tokenType.getExpiryPreferenceKey(), -1L);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = longPreferenceFromSharedPrefs - currentTimeMillis;
        CommsLogger commsLogger = LOG;
        commsLogger.d(String.format("Cached token: %s, expiration=%d, type=%s", commsLogger.sensitive(string), Long.valueOf(longPreferenceFromSharedPrefs), tokenType));
        if (TextUtils.isEmpty(string)) {
            commsLogger.i("No cached token, fetching new token. TokenType=" + tokenType);
        } else if (longPreferenceFromSharedPrefs < currentTimeMillis) {
            commsLogger.w("Cached token has expired, fetching new token. TokenType=" + tokenType);
        } else if (!validAuthTokenIntegrity(string, tokenType)) {
            commsLogger.w("Cached token Integrity is not valid, fetching new token. TokenType=" + tokenType);
        } else {
            if (j2 > j) {
                AuthToken authToken = new AuthToken(string, j2);
                commsLogger.i(String.format("Cached token is valid, using it without fetching: %s. TokenType=%s", authToken, tokenType));
                return authToken;
            }
            commsLogger.w(String.format("Cached token expiring soon: %d ms (min=%d ms). TokenType=%s", Long.valueOf(j2), Long.valueOf(j), tokenType));
        }
        return null;
    }

    private static void recordDebugMetric(@Nullable String str, @NonNull String str2, @Nullable Integer num) {
        CounterMetric generateOperational = CounterMetric.generateOperational("comms.api.auth.token.create.debug");
        Map<String, Object> metadata = generateOperational.getMetadata();
        if (str != null) {
            metadata.put("requestId", str);
        }
        metadata.put("source", str2);
        if (num != null) {
            metadata.put("statusCode", num);
        }
        MetricsHelper.recordSingleOccurrence(generateOperational);
    }

    private static void recordFailAuthTokenMetric(String str) {
        MetricsHelper.recordSingleOccurrence(CounterMetric.generateOperational("comms.api.auth.token.create.debug" + str));
    }

    public static String sensitive(@Nullable String str) {
        return LOG.sensitive(str);
    }

    private static void storeAuthTokenInSharedPreference(@NonNull Context context, @NonNull SipAuthTokenResponse.AuthToken authToken, @NonNull TokenType tokenType) {
        String tokenValue = authToken.getTokenValue();
        long expiresIn = authToken.getExpiresIn() + System.currentTimeMillis();
        new SecuredSharedPreference(context).putString(tokenType.getTokenPreferenceKey(), tokenValue);
        context.getSharedPreferences("SHARED_PREFS", 0).edit().putLong(tokenType.getExpiryPreferenceKey(), expiresIn).apply();
        context.getSharedPreferences("SHARED_PREFS", 0).edit().putString(tokenType.getHashPreferenceKey(), computeSHA256Hash(tokenValue)).apply();
    }

    public static boolean validAuthTokenIntegrity(@NonNull String str, @NonNull TokenType tokenType) {
        String string = CommsDaggerWrapper.getComponent().getContext().getSharedPreferences("SHARED_PREFS", 0).getString(tokenType.getHashPreferenceKey(), null);
        String computeSHA256Hash = computeSHA256Hash(str);
        if (string == null || computeSHA256Hash == null || !computeSHA256Hash.equals(string)) {
            LOG.e("Auth Token Hash is not same before encrypting and after decrypting. TokenType=" + tokenType);
            return false;
        }
        LOG.d("Auth Token Hash is same before encrypting and after decrypting. TokenType=" + tokenType);
        return true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TokenInfo {
        SipAuthTokenResponse.AuthToken authToken;
        String requestId;

        public /* synthetic */ TokenInfo(int i) {
            this();
        }

        public String toString() {
            return "TokenInfo: token=" + this.authToken + ", requestId=" + this.requestId;
        }

        private TokenInfo() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class TokenType {
        public static final TokenType SIP = new AnonymousClass1();
        public static final TokenType MEDIA_SERVICE = new AnonymousClass2();
        private static final /* synthetic */ TokenType[] $VALUES = $values();

        private static /* synthetic */ TokenType[] $values() {
            return new TokenType[]{SIP, MEDIA_SERVICE};
        }

        public /* synthetic */ TokenType(String str, int i, int i2) {
            this(str, i);
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) $VALUES.clone();
        }

        @NonNull
        public abstract String getAcmsType();

        @NonNull
        public abstract String getExpiryPreferenceKey();

        @NonNull
        public abstract String getHashPreferenceKey();

        @NonNull
        public abstract String getTokenPreferenceKey();

        private TokenType(String str, int i) {
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        /* renamed from: com.amazon.deecomms.auth.AuthTokenHelper$TokenType$1, reason: invalid class name */
        public enum AnonymousClass1 extends TokenType {
            public /* synthetic */ AnonymousClass1() {
                this(Constants.ACMS_SIP_AUTH_TOKEN_TYPE, 0);
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getAcmsType() {
                return Constants.ACMS_SIP_AUTH_TOKEN_TYPE;
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getExpiryPreferenceKey() {
                return Constants.SHARED_PREF_SIP_AUTH_TOKEN_EXPIRY;
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getHashPreferenceKey() {
                return Constants.SHARED_PREF_SIP_AUTH_TOKEN_HASH;
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getTokenPreferenceKey() {
                return Constants.SHARED_PREF_SIP_AUTH_TOKEN;
            }

            private AnonymousClass1(String str, int i) {
                super(str, i, 0);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        /* renamed from: com.amazon.deecomms.auth.AuthTokenHelper$TokenType$2, reason: invalid class name */
        public enum AnonymousClass2 extends TokenType {
            public /* synthetic */ AnonymousClass2() {
                this("MEDIA_SERVICE", 1);
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getAcmsType() {
                return Constants.ACMS_MEDIA_AUTH_TOKEN_TYPE;
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getExpiryPreferenceKey() {
                return Constants.SHARED_PREF_MEDIA_AUTH_TOKEN_EXPIRY;
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getHashPreferenceKey() {
                return Constants.SHARED_PREF_MEDIA_AUTH_TOKEN_HASH;
            }

            @Override // com.amazon.deecomms.auth.AuthTokenHelper.TokenType
            @NonNull
            public String getTokenPreferenceKey() {
                return Constants.SHARED_PREF_MEDIA_AUTH_TOKEN;
            }

            private AnonymousClass2(String str, int i) {
                super(str, i, 0);
            }
        }
    }

    public static synchronized AuthToken fetchAuthToken(@NonNull String str, @NonNull TokenType tokenType, boolean z) {
        AuthToken fetchAuthToken;
        synchronized (AuthTokenHelper.class) {
            fetchAuthToken = fetchAuthToken(str, tokenType, 300000L, z);
        }
        return fetchAuthToken;
    }
}
