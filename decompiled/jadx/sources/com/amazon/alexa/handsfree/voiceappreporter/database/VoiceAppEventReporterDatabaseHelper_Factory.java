package com.amazon.alexa.handsfree.voiceappreporter.database;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VoiceAppEventReporterDatabaseHelper_Factory implements Factory<VoiceAppEventReporterDatabaseHelper> {
    private final Provider<Context> contextProvider;

    public VoiceAppEventReporterDatabaseHelper_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<VoiceAppEventReporterDatabaseHelper> create(Provider<Context> provider) {
        return new VoiceAppEventReporterDatabaseHelper_Factory(provider);
    }

    @Override // javax.inject.Provider
    public VoiceAppEventReporterDatabaseHelper get() {
        return new VoiceAppEventReporterDatabaseHelper(this.contextProvider.get());
    }
}
