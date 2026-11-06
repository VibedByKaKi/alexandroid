package com.amazon.alexa.client.alexaservice.base.interactions;

import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannels;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VisualActivityTrackerProvider_Factory implements Factory<VisualActivityTrackerProvider> {
    private final Provider<VisualChannels> channelsProvider;

    public VisualActivityTrackerProvider_Factory(Provider<VisualChannels> provider) {
        this.channelsProvider = provider;
    }

    public static VisualActivityTrackerProvider_Factory create(Provider<VisualChannels> provider) {
        return new VisualActivityTrackerProvider_Factory(provider);
    }

    public static VisualActivityTrackerProvider newInstance(VisualChannels visualChannels) {
        return new VisualActivityTrackerProvider(visualChannels);
    }

    @Override // javax.inject.Provider
    public VisualActivityTrackerProvider get() {
        return newInstance(this.channelsProvider.get());
    }
}
