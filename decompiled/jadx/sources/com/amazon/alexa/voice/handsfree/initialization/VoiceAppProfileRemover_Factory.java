package com.amazon.alexa.voice.handsfree.initialization;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class VoiceAppProfileRemover_Factory implements Factory<VoiceAppProfileRemover> {
    private final Provider<Context> contextProvider;

    public VoiceAppProfileRemover_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static VoiceAppProfileRemover_Factory create(Provider<Context> provider) {
        return new VoiceAppProfileRemover_Factory(provider);
    }

    public static VoiceAppProfileRemover newInstance(Context context) {
        return new VoiceAppProfileRemover(context);
    }

    @Override // javax.inject.Provider
    public VoiceAppProfileRemover get() {
        return new VoiceAppProfileRemover(this.contextProvider.get());
    }
}
