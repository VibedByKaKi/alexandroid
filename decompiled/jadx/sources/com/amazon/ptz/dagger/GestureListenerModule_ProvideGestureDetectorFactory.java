package com.amazon.ptz.dagger;

import android.content.Context;
import android.view.GestureDetector;
import com.amazon.ptz.gestures.listeners.SimplePtzGestureListener;
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
public final class GestureListenerModule_ProvideGestureDetectorFactory implements Factory<GestureDetector> {
    private final Provider<Context> contextProvider;
    private final GestureListenerModule module;
    private final Provider<SimplePtzGestureListener> simplePtzGestureListenerProvider;

    public GestureListenerModule_ProvideGestureDetectorFactory(GestureListenerModule gestureListenerModule, Provider<Context> provider, Provider<SimplePtzGestureListener> provider2) {
        this.module = gestureListenerModule;
        this.contextProvider = provider;
        this.simplePtzGestureListenerProvider = provider2;
    }

    public static GestureListenerModule_ProvideGestureDetectorFactory create(GestureListenerModule gestureListenerModule, Provider<Context> provider, Provider<SimplePtzGestureListener> provider2) {
        return new GestureListenerModule_ProvideGestureDetectorFactory(gestureListenerModule, provider, provider2);
    }

    public static GestureDetector provideGestureDetector(GestureListenerModule gestureListenerModule, Context context, SimplePtzGestureListener simplePtzGestureListener) {
        return (GestureDetector) Preconditions.checkNotNullFromProvides(gestureListenerModule.provideGestureDetector(context, simplePtzGestureListener));
    }

    @Override // javax.inject.Provider
    public GestureDetector get() {
        return provideGestureDetector(this.module, this.contextProvider.get(), this.simplePtzGestureListenerProvider.get());
    }
}
