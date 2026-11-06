package com.amazon.ptz.dagger;

import android.content.Context;
import android.view.GestureDetector;
import com.amazon.ptz.gestures.handlers.GestureHandler;
import com.amazon.ptz.gestures.listeners.OldScaleGestureDetector;
import com.amazon.ptz.gestures.listeners.PtzListener;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"com.amazon.ptz.gestures.handlers.GestureHandler.Router"})
/* loaded from: classes5.dex */
public final class GestureListenerModule_ProvidePtzListenerFactory implements Factory<PtzListener> {
    private final Provider<Context> contextProvider;
    private final Provider<GestureDetector> gestureDetectorProvider;
    private final Provider<GestureHandler> gestureHandlerProvider;
    private final GestureListenerModule module;
    private final Provider<OldScaleGestureDetector> scaleGestureDetectorProvider;

    public GestureListenerModule_ProvidePtzListenerFactory(GestureListenerModule gestureListenerModule, Provider<GestureHandler> provider, Provider<GestureDetector> provider2, Provider<OldScaleGestureDetector> provider3, Provider<Context> provider4) {
        this.module = gestureListenerModule;
        this.gestureHandlerProvider = provider;
        this.gestureDetectorProvider = provider2;
        this.scaleGestureDetectorProvider = provider3;
        this.contextProvider = provider4;
    }

    public static GestureListenerModule_ProvidePtzListenerFactory create(GestureListenerModule gestureListenerModule, Provider<GestureHandler> provider, Provider<GestureDetector> provider2, Provider<OldScaleGestureDetector> provider3, Provider<Context> provider4) {
        return new GestureListenerModule_ProvidePtzListenerFactory(gestureListenerModule, provider, provider2, provider3, provider4);
    }

    public static PtzListener providePtzListener(GestureListenerModule gestureListenerModule, GestureHandler gestureHandler, GestureDetector gestureDetector, OldScaleGestureDetector oldScaleGestureDetector, Context context) {
        return (PtzListener) Preconditions.checkNotNullFromProvides(gestureListenerModule.providePtzListener(gestureHandler, gestureDetector, oldScaleGestureDetector, context));
    }

    @Override // javax.inject.Provider
    public PtzListener get() {
        return providePtzListener(this.module, this.gestureHandlerProvider.get(), this.gestureDetectorProvider.get(), this.scaleGestureDetectorProvider.get(), this.contextProvider.get());
    }
}
