package com.amazon.alexa.client.alexaservice.base.metrics.client;

import android.content.Context;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ClientMetricsModule_ProvidesClientMetricDatabaseFactory implements Factory<ClientMetricDatabase> {
    private final Provider<Context> contextProvider;
    private final Provider<CrashReporter> crashReporterProvider;
    private final ClientMetricsModule module;

    public ClientMetricsModule_ProvidesClientMetricDatabaseFactory(ClientMetricsModule clientMetricsModule, Provider<Context> provider, Provider<CrashReporter> provider2) {
        this.module = clientMetricsModule;
        this.contextProvider = provider;
        this.crashReporterProvider = provider2;
    }

    public static ClientMetricsModule_ProvidesClientMetricDatabaseFactory create(ClientMetricsModule clientMetricsModule, Provider<Context> provider, Provider<CrashReporter> provider2) {
        return new ClientMetricsModule_ProvidesClientMetricDatabaseFactory(clientMetricsModule, provider, provider2);
    }

    public static ClientMetricDatabase providesClientMetricDatabase(ClientMetricsModule clientMetricsModule, Context context, CrashReporter crashReporter) {
        return (ClientMetricDatabase) Preconditions.checkNotNullFromProvides(clientMetricsModule.providesClientMetricDatabase(context, crashReporter));
    }

    @Override // javax.inject.Provider
    public ClientMetricDatabase get() {
        return providesClientMetricDatabase(this.module, this.contextProvider.get(), this.crashReporterProvider.get());
    }
}
