package com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer;

import com.amazon.alexa.client.alexaservice.audio.core.SpeechPlayer;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SpeechPlayerInitializer_Factory implements Factory<SpeechPlayerInitializer> {
    private final Provider<SpeechPlayer> speechPlayerProvider;

    public SpeechPlayerInitializer_Factory(Provider<SpeechPlayer> provider) {
        this.speechPlayerProvider = provider;
    }

    public static SpeechPlayerInitializer_Factory create(Provider<SpeechPlayer> provider) {
        return new SpeechPlayerInitializer_Factory(provider);
    }

    public static SpeechPlayerInitializer newInstance(Lazy<SpeechPlayer> lazy) {
        return new SpeechPlayerInitializer(lazy);
    }

    @Override // javax.inject.Provider
    public SpeechPlayerInitializer get() {
        return newInstance(DoubleCheck.lazy(this.speechPlayerProvider));
    }
}
