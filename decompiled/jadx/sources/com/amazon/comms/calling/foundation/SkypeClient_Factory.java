package com.amazon.comms.calling.foundation;

import android.content.pm.PackageManager;
import com.amazon.comms.calling.foundation.metrics.MetricsManager;
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
public final class SkypeClient_Factory implements Factory<SkypeClient> {
    private final Provider<CommsCallUri> commsCallUriProvider;
    private final Provider<MetricsManager> metricsManagerProvider;
    private final Provider<PackageManager> packageManagerProvider;

    public SkypeClient_Factory(Provider<MetricsManager> provider, Provider<PackageManager> provider2, Provider<CommsCallUri> provider3) {
        this.metricsManagerProvider = provider;
        this.packageManagerProvider = provider2;
        this.commsCallUriProvider = provider3;
    }

    public static SkypeClient_Factory create(Provider<MetricsManager> provider, Provider<PackageManager> provider2, Provider<CommsCallUri> provider3) {
        return new SkypeClient_Factory(provider, provider2, provider3);
    }

    public static SkypeClient newInstance(MetricsManager metricsManager, PackageManager packageManager, CommsCallUri commsCallUri) {
        return new SkypeClient(metricsManager, packageManager, commsCallUri);
    }

    @Override // javax.inject.Provider
    public SkypeClient get() {
        return newInstance(this.metricsManagerProvider.get(), this.packageManagerProvider.get(), this.commsCallUriProvider.get());
    }
}
