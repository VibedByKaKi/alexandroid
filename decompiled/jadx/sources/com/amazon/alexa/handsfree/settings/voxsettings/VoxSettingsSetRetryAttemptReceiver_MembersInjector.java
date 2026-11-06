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
public final class VoxSettingsSetRetryAttemptReceiver_MembersInjector implements MembersInjector<VoxSettingsSetRetryAttemptReceiver> {
    private final Provider<VoxSettingsEnqueuer> mEnqueuerProvider;
    private final Provider<Initializer> mInitializerProvider;

    public VoxSettingsSetRetryAttemptReceiver_MembersInjector(Provider<VoxSettingsEnqueuer> provider, Provider<Initializer> provider2) {
        this.mEnqueuerProvider = provider;
        this.mInitializerProvider = provider2;
    }

    public static MembersInjector<VoxSettingsSetRetryAttemptReceiver> create(Provider<VoxSettingsEnqueuer> provider, Provider<Initializer> provider2) {
        return new VoxSettingsSetRetryAttemptReceiver_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsSetRetryAttemptReceiver.mEnqueuer")
    public static void injectMEnqueuer(VoxSettingsSetRetryAttemptReceiver voxSettingsSetRetryAttemptReceiver, VoxSettingsEnqueuer voxSettingsEnqueuer) {
        voxSettingsSetRetryAttemptReceiver.mEnqueuer = voxSettingsEnqueuer;
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsSetRetryAttemptReceiver.mInitializer")
    public static void injectMInitializer(VoxSettingsSetRetryAttemptReceiver voxSettingsSetRetryAttemptReceiver, Initializer initializer) {
        voxSettingsSetRetryAttemptReceiver.mInitializer = initializer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VoxSettingsSetRetryAttemptReceiver voxSettingsSetRetryAttemptReceiver) {
        injectMEnqueuer(voxSettingsSetRetryAttemptReceiver, this.mEnqueuerProvider.get());
        injectMInitializer(voxSettingsSetRetryAttemptReceiver, this.mInitializerProvider.get());
    }
}
