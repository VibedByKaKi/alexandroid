package com.amazon.alexa.matter.client.coral.auth;

import androidx.annotation.NonNull;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.dee.app.http.CoralService;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class BearerTokenAuthConfiguration implements CoralServiceAuthConfiguration {
    private static final String BEARER_PREFIX = "Bearer ";
    private static final String TAG = "BearerTokenAuthConfiguration";

    @NonNull
    private final String mAuthHeaderKey;

    @NonNull
    private final IdentityService mIdentityService;
    private final boolean mSuppressBearerPrefix;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class BearerTokenAuthConfigurationBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String mAuthHeaderKey;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private IdentityService mIdentityService;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean mSuppressBearerPrefix;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public BearerTokenAuthConfigurationBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public BearerTokenAuthConfiguration build() {
            return new BearerTokenAuthConfiguration(this.mSuppressBearerPrefix, this.mAuthHeaderKey, this.mIdentityService);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public BearerTokenAuthConfigurationBuilder mAuthHeaderKey(@NonNull String str) {
            if (str != null) {
                this.mAuthHeaderKey = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("mAuthHeaderKey is marked non-null but is null");
            return null;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public BearerTokenAuthConfigurationBuilder mIdentityService(@NonNull IdentityService identityService) {
            if (identityService != null) {
                this.mIdentityService = identityService;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("mIdentityService is marked non-null but is null");
            return null;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public BearerTokenAuthConfigurationBuilder mSuppressBearerPrefix(boolean z) {
            this.mSuppressBearerPrefix = z;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "BearerTokenAuthConfiguration.BearerTokenAuthConfigurationBuilder(mSuppressBearerPrefix=" + this.mSuppressBearerPrefix + ", mAuthHeaderKey=" + this.mAuthHeaderKey + ", mIdentityService=" + this.mIdentityService + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public BearerTokenAuthConfiguration(boolean z, @NonNull String str, @NonNull IdentityService identityService) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("mAuthHeaderKey is marked non-null but is null");
            throw null;
        }
        if (identityService == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("mIdentityService is marked non-null but is null");
            throw null;
        }
        this.mSuppressBearerPrefix = z;
        this.mAuthHeaderKey = str;
        this.mIdentityService = identityService;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static BearerTokenAuthConfigurationBuilder builder() {
        return new BearerTokenAuthConfigurationBuilder();
    }

    @Override // com.amazon.alexa.matter.client.coral.auth.CoralServiceAuthConfiguration
    @NonNull
    public CoralService.Request apply(@NonNull CoralService.Request request) {
        String accessToken;
        IdentityService identityService = this.mIdentityService;
        String str = TAG;
        if (!identityService.isRegistered(str) || (accessToken = this.mIdentityService.getAccessToken(str)) == null || accessToken.isEmpty()) {
            return request;
        }
        boolean z = this.mSuppressBearerPrefix;
        String str2 = this.mAuthHeaderKey;
        return z ? request.withHeader(str2, accessToken) : request.withHeader(str2, "Bearer ".concat(accessToken));
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private BearerTokenAuthConfiguration() {
        this.mSuppressBearerPrefix = false;
        this.mAuthHeaderKey = null;
        this.mIdentityService = null;
    }
}
