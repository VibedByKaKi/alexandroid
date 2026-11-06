package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AhfModule_ProvideApplicationContextFactory implements Factory<Context> {
    private final AhfModule module;

    public AhfModule_ProvideApplicationContextFactory(AhfModule ahfModule) {
        this.module = ahfModule;
    }

    public static AhfModule_ProvideApplicationContextFactory create(AhfModule ahfModule) {
        return new AhfModule_ProvideApplicationContextFactory(ahfModule);
    }

    public static Context provideApplicationContext(AhfModule ahfModule) {
        return (Context) Preconditions.checkNotNull(ahfModule.provideApplicationContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideApplicationContext(this.module);
    }
}
