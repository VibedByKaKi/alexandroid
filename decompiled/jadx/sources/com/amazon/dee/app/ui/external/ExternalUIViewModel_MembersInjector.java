package com.amazon.dee.app.ui.external;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.dee.app.services.useragent.UserAgentService;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ExternalUIViewModel_MembersInjector implements MembersInjector<ExternalUIViewModel> {
    private final Provider<EnvironmentService> environmentServiceProvider;
    private final Provider<Mobilytics> mobilyticsProvider;
    private final Provider<UserAgentService> userAgentServiceProvider;

    public ExternalUIViewModel_MembersInjector(Provider<EnvironmentService> provider, Provider<UserAgentService> provider2, Provider<Mobilytics> provider3) {
        this.environmentServiceProvider = provider;
        this.userAgentServiceProvider = provider2;
        this.mobilyticsProvider = provider3;
    }

    public static MembersInjector<ExternalUIViewModel> create(Provider<EnvironmentService> provider, Provider<UserAgentService> provider2, Provider<Mobilytics> provider3) {
        return new ExternalUIViewModel_MembersInjector(provider, provider2, provider3);
    }

    @InjectedFieldSignature("com.amazon.dee.app.ui.external.ExternalUIViewModel.environmentService")
    public static void injectEnvironmentService(ExternalUIViewModel externalUIViewModel, EnvironmentService environmentService) {
        externalUIViewModel.environmentService = environmentService;
    }

    @InjectedFieldSignature("com.amazon.dee.app.ui.external.ExternalUIViewModel.mobilytics")
    public static void injectMobilytics(ExternalUIViewModel externalUIViewModel, Mobilytics mobilytics) {
        externalUIViewModel.mobilytics = mobilytics;
    }

    @InjectedFieldSignature("com.amazon.dee.app.ui.external.ExternalUIViewModel.userAgentService")
    public static void injectUserAgentService(ExternalUIViewModel externalUIViewModel, UserAgentService userAgentService) {
        externalUIViewModel.userAgentService = userAgentService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ExternalUIViewModel externalUIViewModel) {
        injectEnvironmentService(externalUIViewModel, this.environmentServiceProvider.get());
        injectUserAgentService(externalUIViewModel, this.userAgentServiceProvider.get());
        injectMobilytics(externalUIViewModel, this.mobilyticsProvider.get());
    }
}
