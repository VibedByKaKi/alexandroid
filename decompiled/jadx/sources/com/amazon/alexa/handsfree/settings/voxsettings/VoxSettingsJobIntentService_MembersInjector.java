package com.amazon.alexa.handsfree.settings.voxsettings;

import com.amazon.alexa.handsfree.protocols.Initializer;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VoxSettingsJobIntentService_MembersInjector implements MembersInjector<VoxSettingsJobIntentService> {
    private final Provider<Initializer> mInitializerProvider;

    public VoxSettingsJobIntentService_MembersInjector(Provider<Initializer> provider) {
        this.mInitializerProvider = provider;
    }

    public static MembersInjector<VoxSettingsJobIntentService> create(Provider<Initializer> provider) {
        return new VoxSettingsJobIntentService_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsJobIntentService.mInitializer")
    public static void injectMInitializer(VoxSettingsJobIntentService voxSettingsJobIntentService, Initializer initializer) {
        voxSettingsJobIntentService.mInitializer = initializer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VoxSettingsJobIntentService voxSettingsJobIntentService) {
        injectMInitializer(voxSettingsJobIntentService, this.mInitializerProvider.get());
    }
}
