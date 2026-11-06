package com.amazon.alexa.matter.client.apostilleservice;

import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.dee.app.http.CoralService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ApostilleServiceCoralClient_Factory implements Factory<ApostilleServiceCoralClient> {
    private final Provider<CoralService> coralServiceProvider;
    private final Provider<MatterLogger> matterLoggerProvider;

    public ApostilleServiceCoralClient_Factory(Provider<CoralService> provider, Provider<MatterLogger> provider2) {
        this.coralServiceProvider = provider;
        this.matterLoggerProvider = provider2;
    }

    public static ApostilleServiceCoralClient_Factory create(Provider<CoralService> provider, Provider<MatterLogger> provider2) {
        return new ApostilleServiceCoralClient_Factory(provider, provider2);
    }

    public static ApostilleServiceCoralClient newInstance(CoralService coralService, MatterLogger matterLogger) {
        return new ApostilleServiceCoralClient(coralService, matterLogger);
    }

    @Override // javax.inject.Provider
    public ApostilleServiceCoralClient get() {
        return newInstance(this.coralServiceProvider.get(), this.matterLoggerProvider.get());
    }
}
