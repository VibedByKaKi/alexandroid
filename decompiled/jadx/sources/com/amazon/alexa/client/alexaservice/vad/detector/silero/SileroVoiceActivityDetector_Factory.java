package com.amazon.alexa.client.alexaservice.vad.detector.silero;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SileroVoiceActivityDetector_Factory implements Factory<SileroVoiceActivityDetector> {
    private final Provider<Context> contextProvider;
    private final Provider<SileroVADModel> modelProvider;

    public SileroVoiceActivityDetector_Factory(Provider<Context> provider, Provider<SileroVADModel> provider2) {
        this.contextProvider = provider;
        this.modelProvider = provider2;
    }

    public static SileroVoiceActivityDetector_Factory create(Provider<Context> provider, Provider<SileroVADModel> provider2) {
        return new SileroVoiceActivityDetector_Factory(provider, provider2);
    }

    public static SileroVoiceActivityDetector newInstance(Context context, SileroVADModel sileroVADModel) {
        return new SileroVoiceActivityDetector(context, sileroVADModel);
    }

    @Override // javax.inject.Provider
    public SileroVoiceActivityDetector get() {
        return newInstance(this.contextProvider.get(), this.modelProvider.get());
    }
}
