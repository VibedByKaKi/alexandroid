package com.amazon.deecomms.oobe.fragments;

import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.oobe.util.ThemingUpdateUtil;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class MainOOBEFragment_MembersInjector implements MembersInjector<MainOOBEFragment> {
    private final Provider<CapabilitiesManager> capabilitiesManagerProvider;
    private final Provider<ThemingUpdateUtil> themingUpdateUtilProvider;

    public MainOOBEFragment_MembersInjector(Provider<CapabilitiesManager> provider, Provider<ThemingUpdateUtil> provider2) {
        this.capabilitiesManagerProvider = provider;
        this.themingUpdateUtilProvider = provider2;
    }

    public static MembersInjector<MainOOBEFragment> create(Provider<CapabilitiesManager> provider, Provider<ThemingUpdateUtil> provider2) {
        return new MainOOBEFragment_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.deecomms.oobe.fragments.MainOOBEFragment.capabilitiesManager")
    public static void injectCapabilitiesManager(MainOOBEFragment mainOOBEFragment, CapabilitiesManager capabilitiesManager) {
        mainOOBEFragment.capabilitiesManager = capabilitiesManager;
    }

    @InjectedFieldSignature("com.amazon.deecomms.oobe.fragments.MainOOBEFragment.themingUpdateUtil")
    public static void injectThemingUpdateUtil(MainOOBEFragment mainOOBEFragment, ThemingUpdateUtil themingUpdateUtil) {
        mainOOBEFragment.themingUpdateUtil = themingUpdateUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainOOBEFragment mainOOBEFragment) {
        injectCapabilitiesManager(mainOOBEFragment, this.capabilitiesManagerProvider.get());
        injectThemingUpdateUtil(mainOOBEFragment, this.themingUpdateUtilProvider.get());
    }
}
