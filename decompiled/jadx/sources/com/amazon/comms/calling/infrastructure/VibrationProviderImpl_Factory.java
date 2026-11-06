package com.amazon.comms.calling.infrastructure;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import com.amazon.comms.calling.data.util.Utils;
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
public final class VibrationProviderImpl_Factory implements Factory<VibrationProviderImpl> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Utils> utilsProvider;
    private final Provider<Vibrator> vibratorProvider;

    public VibrationProviderImpl_Factory(Provider<Context> provider, Provider<AudioManager> provider2, Provider<Vibrator> provider3, Provider<Utils> provider4) {
        this.contextProvider = provider;
        this.audioManagerProvider = provider2;
        this.vibratorProvider = provider3;
        this.utilsProvider = provider4;
    }

    public static VibrationProviderImpl_Factory create(Provider<Context> provider, Provider<AudioManager> provider2, Provider<Vibrator> provider3, Provider<Utils> provider4) {
        return new VibrationProviderImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static VibrationProviderImpl newInstance(Context context, AudioManager audioManager, Vibrator vibrator, Utils utils) {
        return new VibrationProviderImpl(context, audioManager, vibrator, utils);
    }

    @Override // javax.inject.Provider
    public VibrationProviderImpl get() {
        return newInstance(this.contextProvider.get(), this.audioManagerProvider.get(), this.vibratorProvider.get(), this.utilsProvider.get());
    }
}
