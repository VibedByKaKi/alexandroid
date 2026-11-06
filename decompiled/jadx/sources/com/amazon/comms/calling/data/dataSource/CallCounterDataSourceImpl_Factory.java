package com.amazon.comms.calling.data.dataSource;

import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CallCounterDataSourceImpl_Factory implements Factory<CallCounterDataSourceImpl> {
    private final Provider<AlexaCommsCoreRemoteConfigurationService> arcusConfigProvider;

    public CallCounterDataSourceImpl_Factory(Provider<AlexaCommsCoreRemoteConfigurationService> provider) {
        this.arcusConfigProvider = provider;
    }

    public static CallCounterDataSourceImpl_Factory create(Provider<AlexaCommsCoreRemoteConfigurationService> provider) {
        return new CallCounterDataSourceImpl_Factory(provider);
    }

    public static CallCounterDataSourceImpl newInstance(AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService) {
        return new CallCounterDataSourceImpl(alexaCommsCoreRemoteConfigurationService);
    }

    @Override // javax.inject.Provider
    public CallCounterDataSourceImpl get() {
        return newInstance(this.arcusConfigProvider.get());
    }
}
