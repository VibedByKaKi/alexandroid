package com.amazon.ptz.dagger;

import android.content.Context;
import com.amazon.ptz.gestures.listeners.OldScaleGestureDetector;
import com.amazon.ptz.gestures.listeners.ScalePtzGestureListener;
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
public final class GestureListenerModule_ProvideScaleGestureDetectorFactory implements Factory<OldScaleGestureDetector> {
    private final Provider<Context> contextProvider;
    private final GestureListenerModule module;
    private final Provider<ScalePtzGestureListener> scalePtzGestureListenerProvider;

    public GestureListenerModule_ProvideScaleGestureDetectorFactory(GestureListenerModule gestureListenerModule, Provider<Context> provider, Provider<ScalePtzGestureListener> provider2) {
        this.module = gestureListenerModule;
        this.contextProvider = provider;
        this.scalePtzGestureListenerProvider = provider2;
    }

    public static GestureListenerModule_ProvideScaleGestureDetectorFactory create(GestureListenerModule gestureListenerModule, Provider<Context> provider, Provider<ScalePtzGestureListener> provider2) {
        return new GestureListenerModule_ProvideScaleGestureDetectorFactory(gestureListenerModule, provider, provider2);
    }

    public static OldScaleGestureDetector provideScaleGestureDetector(GestureListenerModule gestureListenerModule, Context context, ScalePtzGestureListener scalePtzGestureListener) {
        return (OldScaleGestureDetector) Preconditions.checkNotNullFromProvides(gestureListenerModule.provideScaleGestureDetector(context, scalePtzGestureListener));
    }

    @Override // javax.inject.Provider
    public OldScaleGestureDetector get() {
        return provideScaleGestureDetector(this.module, this.contextProvider.get(), this.scalePtzGestureListenerProvider.get());
    }
}
