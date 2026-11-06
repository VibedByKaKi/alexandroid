package com.amazon.deecomms.calling.util;

import com.amazon.deecomms.util.IBuildVersionProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DisplayCutoutCalculator_Factory implements Factory<DisplayCutoutCalculator> {
    private final Provider<IBuildVersionProvider> buildVersionProvider;

    public DisplayCutoutCalculator_Factory(Provider<IBuildVersionProvider> provider) {
        this.buildVersionProvider = provider;
    }

    public static DisplayCutoutCalculator_Factory create(Provider<IBuildVersionProvider> provider) {
        return new DisplayCutoutCalculator_Factory(provider);
    }

    public static DisplayCutoutCalculator newInstance(IBuildVersionProvider iBuildVersionProvider) {
        return new DisplayCutoutCalculator(iBuildVersionProvider);
    }

    @Override // javax.inject.Provider
    public DisplayCutoutCalculator get() {
        return newInstance(this.buildVersionProvider.get());
    }
}
