package com.dee.app.contacts.common.dagger.modules;

import androidx.annotation.Nullable;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import com.amazon.commsnetworking.CommsNetworkingClient;
import com.amazon.commsnetworking.api.INetworkingClient;
import com.amazon.commsnetworking.auth.AuthenticationProvider;
import com.amazon.commsnetworking.auth.MAPAuthenticationProvider;
import com.dee.app.contacts.common.constants.coremodules.Constants;
import com.dee.app.contacts.common.utils.ContactsLogger;
import com.dee.app.contacts.interfaces.IContactsLogger;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes6.dex */
public class CommsCoreModule {
    private AuthenticationProvider clientAuthenticationProvider;
    private AlexaCommsCoreIdentityService clientIdentityService;
    private AlexaCommsCoreMetricsService clientMetricsService;
    private INetworkingClient clientNetworkingClient;
    private AlexaCommsCoreRemoteConfigurationService clientRemoteConfigService;
    private Lazy<AlexaCommsCoreIdentityService> identityLazy;
    private Lazy<AlexaCommsCoreMetricsService> metricsLazy;
    private Lazy<AlexaCommsCoreRemoteConfigurationService> remoteConfigLazy;

    public CommsCoreModule(INetworkingClient iNetworkingClient, AuthenticationProvider authenticationProvider, AlexaCommsCoreIdentityService alexaCommsCoreIdentityService, AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService, AlexaCommsCoreMetricsService alexaCommsCoreMetricsService) {
        this.clientNetworkingClient = iNetworkingClient;
        this.clientIdentityService = alexaCommsCoreIdentityService;
        this.clientMetricsService = alexaCommsCoreMetricsService;
        this.clientRemoteConfigService = alexaCommsCoreRemoteConfigurationService;
        this.clientAuthenticationProvider = authenticationProvider;
    }

    @Nullable
    @Provides
    @Singleton
    public AlexaCommsCoreIdentityService provideAlexaCommsCoreIdentityService() {
        AlexaCommsCoreIdentityService alexaCommsCoreIdentityService = this.clientIdentityService;
        if (alexaCommsCoreIdentityService != null) {
            return alexaCommsCoreIdentityService;
        }
        Lazy<AlexaCommsCoreIdentityService> lazy = this.identityLazy;
        if (lazy != null) {
            return lazy.get();
        }
        return null;
    }

    @Nullable
    @Provides
    @Singleton
    public AlexaCommsCoreRemoteConfigurationService provideAlexaCommsCoreRemoteConfigurationService() {
        AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService = this.clientRemoteConfigService;
        if (alexaCommsCoreRemoteConfigurationService != null) {
            return alexaCommsCoreRemoteConfigurationService;
        }
        Lazy<AlexaCommsCoreRemoteConfigurationService> lazy = this.remoteConfigLazy;
        if (lazy != null) {
            return lazy.get();
        }
        return null;
    }

    @Provides
    @Singleton
    public AuthenticationProvider provideAuthenticationProvider(@Nullable AlexaCommsCoreIdentityService alexaCommsCoreIdentityService, @Nullable AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService, AlexaCommsCoreMetricsService alexaCommsCoreMetricsService) {
        AuthenticationProvider authenticationProvider = this.clientAuthenticationProvider;
        return authenticationProvider != null ? authenticationProvider : new MAPAuthenticationProvider(Constants.CONTACTS_NETWORK_SOURCE_IDENTIFIER, alexaCommsCoreIdentityService, alexaCommsCoreRemoteConfigurationService, alexaCommsCoreMetricsService);
    }

    @Provides
    @Singleton
    public INetworkingClient provideCommsNetworkingClient(AuthenticationProvider authenticationProvider, @Named("ACMSHost") String str) {
        INetworkingClient iNetworkingClient = this.clientNetworkingClient;
        return iNetworkingClient != null ? iNetworkingClient : new CommsNetworkingClient.Builder().withSource(Constants.CONTACTS_NETWORK_SOURCE_IDENTIFIER).withReadTimeout(Constants.READ_TIMEOUT.intValue()).withWriteTimeout(Constants.WRITE_TIMEOUT.intValue()).withAuthProvider(authenticationProvider).withHost(str).build();
    }

    @Provides
    @Singleton
    public IContactsLogger provideLoggerModule() {
        return new ContactsLogger();
    }

    @Provides
    @Singleton
    public AlexaCommsCoreMetricsService provideMetricsModule() {
        AlexaCommsCoreMetricsService alexaCommsCoreMetricsService = this.clientMetricsService;
        if (alexaCommsCoreMetricsService != null) {
            return alexaCommsCoreMetricsService;
        }
        Lazy<AlexaCommsCoreMetricsService> lazy = this.metricsLazy;
        if (lazy != null) {
            return lazy.get();
        }
        return null;
    }

    public CommsCoreModule(Lazy<AlexaCommsCoreMetricsService> lazy, Lazy<AlexaCommsCoreRemoteConfigurationService> lazy2, Lazy<AlexaCommsCoreIdentityService> lazy3) {
        this.metricsLazy = lazy;
        this.remoteConfigLazy = lazy2;
        this.identityLazy = lazy3;
    }

    public CommsCoreModule() {
    }
}
