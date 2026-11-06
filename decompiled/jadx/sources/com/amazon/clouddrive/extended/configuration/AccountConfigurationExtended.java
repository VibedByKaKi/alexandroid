package com.amazon.clouddrive.extended.configuration;

import com.amazon.clouddrive.auth.AuthenticatedURLConnectionFactory;
import com.amazon.clouddrive.auth.RequestAuthenticator;
import com.amazon.clouddrive.configuration.AccountConfiguration;
import com.amazon.clouddrive.configuration.EndpointsCache;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AccountConfigurationExtended extends AccountConfiguration {
    private final SourceInfoExtendedCache mSourceInfoCache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private SourceInfoExtendedCache mSourceInfoCache;
        final AccountConfiguration.Builder mSuperBuilder = new AccountConfiguration.Builder();

        public AccountConfigurationExtended build() {
            return new AccountConfigurationExtended(this);
        }

        public Builder setAuthenticatedURLConnectionFactory(AuthenticatedURLConnectionFactory authenticatedURLConnectionFactory) {
            this.mSuperBuilder.setAuthenticatedURLConnectionFactory(authenticatedURLConnectionFactory);
            return this;
        }

        public Builder setEndpointsCache(EndpointsCache endpointsCache) {
            this.mSuperBuilder.setEndpointsCache(endpointsCache);
            return this;
        }

        public Builder setRequestAuthenticator(RequestAuthenticator requestAuthenticator) {
            this.mSuperBuilder.setRequestAuthenticator(requestAuthenticator);
            return this;
        }

        public Builder setSourceInfoCache(SourceInfoExtendedCache sourceInfoExtendedCache) {
            this.mSuperBuilder.setSourceInfoCache(sourceInfoExtendedCache);
            this.mSourceInfoCache = sourceInfoExtendedCache;
            return this;
        }
    }

    public AccountConfigurationExtended(Builder builder) {
        super(builder.mSuperBuilder);
        this.mSourceInfoCache = builder.mSourceInfoCache;
    }

    @Override // com.amazon.clouddrive.configuration.AccountConfiguration
    public SourceInfoExtendedCache getSourceInfoCache() {
        return this.mSourceInfoCache;
    }
}
