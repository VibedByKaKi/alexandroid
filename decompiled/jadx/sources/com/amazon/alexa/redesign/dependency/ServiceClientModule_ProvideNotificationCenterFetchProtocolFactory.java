package com.amazon.alexa.redesign.dependency;

import com.amazon.alexa.notification.api.NotificationCenterFetchProtocol;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class ServiceClientModule_ProvideNotificationCenterFetchProtocolFactory implements Factory<NotificationCenterFetchProtocol> {
    private final ServiceClientModule module;

    public ServiceClientModule_ProvideNotificationCenterFetchProtocolFactory(ServiceClientModule serviceClientModule) {
        this.module = serviceClientModule;
    }

    public static ServiceClientModule_ProvideNotificationCenterFetchProtocolFactory create(ServiceClientModule serviceClientModule) {
        return new ServiceClientModule_ProvideNotificationCenterFetchProtocolFactory(serviceClientModule);
    }

    public static NotificationCenterFetchProtocol provideNotificationCenterFetchProtocol(ServiceClientModule serviceClientModule) {
        return (NotificationCenterFetchProtocol) Preconditions.checkNotNullFromProvides(serviceClientModule.provideNotificationCenterFetchProtocol());
    }

    @Override // javax.inject.Provider
    public NotificationCenterFetchProtocol get() {
        return provideNotificationCenterFetchProtocol(this.module);
    }
}
