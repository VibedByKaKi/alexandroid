package com.amazon.deecomms.calling.util;

import com.amazon.deecomms.calling.util.CoboUtils;
import com.amazon.deecomms.core.CapabilitiesManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class CoboUtils_Dependencies_MembersInjector implements MembersInjector<CoboUtils.Dependencies> {
    private final Provider<CapabilitiesManager> capabilitiesManagerProvider;

    public CoboUtils_Dependencies_MembersInjector(Provider<CapabilitiesManager> provider) {
        this.capabilitiesManagerProvider = provider;
    }

    public static MembersInjector<CoboUtils.Dependencies> create(Provider<CapabilitiesManager> provider) {
        return new CoboUtils_Dependencies_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.util.CoboUtils.Dependencies.capabilitiesManager")
    public static void injectCapabilitiesManager(CoboUtils.Dependencies dependencies, CapabilitiesManager capabilitiesManager) {
        dependencies.capabilitiesManager = capabilitiesManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CoboUtils.Dependencies dependencies) {
        injectCapabilitiesManager(dependencies, this.capabilitiesManagerProvider.get());
    }
}
