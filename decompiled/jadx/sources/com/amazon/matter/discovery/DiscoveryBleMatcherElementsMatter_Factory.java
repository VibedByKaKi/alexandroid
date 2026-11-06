package com.amazon.matter.discovery;

import com.amazon.alexa.matter.utils.logging.MatterLogger;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class DiscoveryBleMatcherElementsMatter_Factory implements Factory<DiscoveryBleMatcherElementsMatter> {
    private final Provider<MatterLogger> matterLoggerProvider;

    public DiscoveryBleMatcherElementsMatter_Factory(Provider<MatterLogger> provider) {
        this.matterLoggerProvider = provider;
    }

    public static DiscoveryBleMatcherElementsMatter_Factory create(Provider<MatterLogger> provider) {
        return new DiscoveryBleMatcherElementsMatter_Factory(provider);
    }

    public static DiscoveryBleMatcherElementsMatter newInstance(MatterLogger matterLogger) {
        return new DiscoveryBleMatcherElementsMatter(matterLogger);
    }

    @Override // javax.inject.Provider
    public DiscoveryBleMatcherElementsMatter get() {
        return newInstance(this.matterLoggerProvider.get());
    }
}
