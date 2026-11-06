package com.amazon.comms.calling.dependency;

import android.content.Context;
import android.os.Vibrator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AndroidModule_ProvidesVibratorFactory implements Factory<Vibrator> {
    private final Provider<Context> contextProvider;
    private final AndroidModule module;

    public AndroidModule_ProvidesVibratorFactory(AndroidModule androidModule, Provider<Context> provider) {
        this.module = androidModule;
        this.contextProvider = provider;
    }

    public static AndroidModule_ProvidesVibratorFactory create(AndroidModule androidModule, Provider<Context> provider) {
        return new AndroidModule_ProvidesVibratorFactory(androidModule, provider);
    }

    public static Vibrator providesVibrator(AndroidModule androidModule, Context context) {
        return (Vibrator) Preconditions.checkNotNullFromProvides(androidModule.providesVibrator(context));
    }

    @Override // javax.inject.Provider
    public Vibrator get() {
        return providesVibrator(this.module, this.contextProvider.get());
    }
}
