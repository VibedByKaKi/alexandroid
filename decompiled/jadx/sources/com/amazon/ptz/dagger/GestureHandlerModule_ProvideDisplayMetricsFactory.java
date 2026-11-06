package com.amazon.ptz.dagger;

import android.content.Context;
import android.util.DisplayMetrics;
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
/* loaded from: classes5.dex */
public final class GestureHandlerModule_ProvideDisplayMetricsFactory implements Factory<DisplayMetrics> {
    private final Provider<Context> contextProvider;
    private final GestureHandlerModule module;

    public GestureHandlerModule_ProvideDisplayMetricsFactory(GestureHandlerModule gestureHandlerModule, Provider<Context> provider) {
        this.module = gestureHandlerModule;
        this.contextProvider = provider;
    }

    public static GestureHandlerModule_ProvideDisplayMetricsFactory create(GestureHandlerModule gestureHandlerModule, Provider<Context> provider) {
        return new GestureHandlerModule_ProvideDisplayMetricsFactory(gestureHandlerModule, provider);
    }

    public static DisplayMetrics provideDisplayMetrics(GestureHandlerModule gestureHandlerModule, Context context) {
        return (DisplayMetrics) Preconditions.checkNotNullFromProvides(gestureHandlerModule.provideDisplayMetrics(context));
    }

    @Override // javax.inject.Provider
    public DisplayMetrics get() {
        return provideDisplayMetrics(this.module, this.contextProvider.get());
    }
}
