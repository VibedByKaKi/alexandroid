package com.amazon.alexa.mobilytics.event.serializer.protobufhandlers;

import com.amazon.alexa.mobilytics.configuration.ApplicationConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class ApplicationProtobufHandler_Factory implements Factory<ApplicationProtobufHandler> {
    private final Provider<ApplicationConfiguration> appConfigProvider;

    public ApplicationProtobufHandler_Factory(Provider<ApplicationConfiguration> provider) {
        this.appConfigProvider = provider;
    }

    public static ApplicationProtobufHandler_Factory create(Provider<ApplicationConfiguration> provider) {
        return new ApplicationProtobufHandler_Factory(provider);
    }

    public static ApplicationProtobufHandler newInstance(ApplicationConfiguration applicationConfiguration) {
        return new ApplicationProtobufHandler(applicationConfiguration);
    }

    @Override // javax.inject.Provider
    public ApplicationProtobufHandler get() {
        return newInstance(this.appConfigProvider.get());
    }
}
