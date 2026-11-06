package com.amazon.alexa.matter.client.gordonservice;

import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.dee.app.http.CoralService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class GordonServiceCoralClient_Factory implements Factory<GordonServiceCoralClient> {
    private final Provider<CoralService> coralServiceProvider;
    private final Provider<MatterLogger> matterLoggerProvider;

    public GordonServiceCoralClient_Factory(Provider<CoralService> provider, Provider<MatterLogger> provider2) {
        this.coralServiceProvider = provider;
        this.matterLoggerProvider = provider2;
    }

    public static GordonServiceCoralClient_Factory create(Provider<CoralService> provider, Provider<MatterLogger> provider2) {
        return new GordonServiceCoralClient_Factory(provider, provider2);
    }

    public static GordonServiceCoralClient newInstance(CoralService coralService, MatterLogger matterLogger) {
        return new GordonServiceCoralClient(coralService, matterLogger);
    }

    @Override // javax.inject.Provider
    public GordonServiceCoralClient get() {
        return newInstance(this.coralServiceProvider.get(), this.matterLoggerProvider.get());
    }
}
