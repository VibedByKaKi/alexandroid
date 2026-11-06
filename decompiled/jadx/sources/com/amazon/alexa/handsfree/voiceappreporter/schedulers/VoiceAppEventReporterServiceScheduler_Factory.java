package com.amazon.alexa.handsfree.voiceappreporter.schedulers;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VoiceAppEventReporterServiceScheduler_Factory implements Factory<VoiceAppEventReporterServiceScheduler> {
    private final Provider<Context> contextProvider;

    public VoiceAppEventReporterServiceScheduler_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<VoiceAppEventReporterServiceScheduler> create(Provider<Context> provider) {
        return new VoiceAppEventReporterServiceScheduler_Factory(provider);
    }

    @Override // javax.inject.Provider
    public VoiceAppEventReporterServiceScheduler get() {
        return new VoiceAppEventReporterServiceScheduler(this.contextProvider.get());
    }
}
