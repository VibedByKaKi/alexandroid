package com.amazon.clouddrive.configuration;

import com.amazon.clouddrive.auth.AuthenticatedURLConnectionFactory;
import com.amazon.clouddrive.auth.RequestAuthenticator;
import com.amazon.clouddrive.utils.AssertUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AccountConfiguration {
    private final AuthenticatedURLConnectionFactory mAuthenticatedURLConnectionFactory;
    private final EndpointsCache mEndpointsCache;
    private final RequestAuthenticator mRequestAuthenticator;
    private final SourceInfoCache mSourceInfoCache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private AuthenticatedURLConnectionFactory mAuthenticatedURLConnectionFactory;
        private EndpointsCache mEndpointsCache;
        private RequestAuthenticator mRequestAuthenticator;
        private SourceInfoCache mSourceInfoCache;

        public AccountConfiguration build() {
            return new AccountConfiguration(this);
        }

        public Builder setAuthenticatedURLConnectionFactory(AuthenticatedURLConnectionFactory authenticatedURLConnectionFactory) {
            this.mAuthenticatedURLConnectionFactory = authenticatedURLConnectionFactory;
            return this;
        }

        public Builder setEndpointsCache(EndpointsCache endpointsCache) {
            this.mEndpointsCache = endpointsCache;
            return this;
        }

        public Builder setRequestAuthenticator(RequestAuthenticator requestAuthenticator) {
            this.mRequestAuthenticator = requestAuthenticator;
            return this;
        }

        public Builder setSourceInfoCache(SourceInfoCache sourceInfoCache) {
            this.mSourceInfoCache = sourceInfoCache;
            return this;
        }
    }

    public AccountConfiguration(Builder builder) {
        AssertUtils.assertNotNull(builder.mRequestAuthenticator, "RequestAuthenticator was null.");
        AssertUtils.assertNotNull(builder.mEndpointsCache, "EndpointsCache was null.");
        AssertUtils.assertNotNull(builder.mAuthenticatedURLConnectionFactory, "AuthenticatedURLConnectionFactory was null.");
        this.mRequestAuthenticator = builder.mRequestAuthenticator;
        this.mEndpointsCache = builder.mEndpointsCache;
        this.mSourceInfoCache = builder.mSourceInfoCache;
        this.mAuthenticatedURLConnectionFactory = builder.mAuthenticatedURLConnectionFactory;
    }

    @Deprecated
    public AuthenticatedURLConnectionFactory getAuthenticatedURLConnectionFactory() {
        return this.mAuthenticatedURLConnectionFactory;
    }

    public EndpointsCache getEndpointsCache() {
        return this.mEndpointsCache;
    }

    public RequestAuthenticator getRequestAuthenticator() {
        return this.mRequestAuthenticator;
    }

    public SourceInfoCache getSourceInfoCache() {
        return this.mSourceInfoCache;
    }
}
