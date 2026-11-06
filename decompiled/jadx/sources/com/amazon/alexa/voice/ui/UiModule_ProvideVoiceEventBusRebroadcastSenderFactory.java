package com.amazon.alexa.voice.ui;

import android.content.Context;
import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class UiModule_ProvideVoiceEventBusRebroadcastSenderFactory implements Factory<VoiceEventBusRebroadcastSender> {
    private final Provider<Context> contextProvider;
    private final Provider<EventBus> eventBusProvider;

    public UiModule_ProvideVoiceEventBusRebroadcastSenderFactory(Provider<Context> provider, Provider<EventBus> provider2) {
        this.contextProvider = provider;
        this.eventBusProvider = provider2;
    }

    public static UiModule_ProvideVoiceEventBusRebroadcastSenderFactory create(Provider<Context> provider, Provider<EventBus> provider2) {
        return new UiModule_ProvideVoiceEventBusRebroadcastSenderFactory(provider, provider2);
    }

    public static VoiceEventBusRebroadcastSender provideVoiceEventBusRebroadcastSender(Context context, EventBus eventBus) {
        return (VoiceEventBusRebroadcastSender) Preconditions.checkNotNullFromProvides(UiModule.provideVoiceEventBusRebroadcastSender(context, eventBus));
    }

    @Override // javax.inject.Provider
    public VoiceEventBusRebroadcastSender get() {
        return provideVoiceEventBusRebroadcastSender(this.contextProvider.get(), this.eventBusProvider.get());
    }
}
