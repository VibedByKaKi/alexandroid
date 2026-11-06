package com.amazon.deecomms.calling.telecom.audiomanagement;

import android.content.Context;
import android.media.AudioManager;
import com.amazon.deecomms.calling.telecom.TelecomBridge;
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
public final class TelecomCallAudioManager_Factory implements Factory<TelecomCallAudioManager> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<TelecomBridge> telecomBridgeProvider;

    public TelecomCallAudioManager_Factory(Provider<TelecomBridge> provider, Provider<AudioManager> provider2, Provider<Context> provider3) {
        this.telecomBridgeProvider = provider;
        this.audioManagerProvider = provider2;
        this.contextProvider = provider3;
    }

    public static TelecomCallAudioManager_Factory create(Provider<TelecomBridge> provider, Provider<AudioManager> provider2, Provider<Context> provider3) {
        return new TelecomCallAudioManager_Factory(provider, provider2, provider3);
    }

    public static TelecomCallAudioManager newInstance(TelecomBridge telecomBridge, AudioManager audioManager, Context context) {
        return new TelecomCallAudioManager(telecomBridge, audioManager, context);
    }

    @Override // javax.inject.Provider
    public TelecomCallAudioManager get() {
        return newInstance(this.telecomBridgeProvider.get(), this.audioManagerProvider.get(), this.contextProvider.get());
    }
}
