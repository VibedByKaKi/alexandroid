package com.amazon.deecomms.common.service;

import com.amazon.deecomms.api.CommsIdentityManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ProvisioningManager_MembersInjector implements MembersInjector<ProvisioningManager> {
    private final Provider<CommsIdentityManager> mCommsIdentityManagerProvider;

    public ProvisioningManager_MembersInjector(Provider<CommsIdentityManager> provider) {
        this.mCommsIdentityManagerProvider = provider;
    }

    public static MembersInjector<ProvisioningManager> create(Provider<CommsIdentityManager> provider) {
        return new ProvisioningManager_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.common.service.ProvisioningManager.mCommsIdentityManager")
    public static void injectMCommsIdentityManager(ProvisioningManager provisioningManager, CommsIdentityManager commsIdentityManager) {
        provisioningManager.mCommsIdentityManager = commsIdentityManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ProvisioningManager provisioningManager) {
        injectMCommsIdentityManager(provisioningManager, this.mCommsIdentityManagerProvider.get());
    }
}
