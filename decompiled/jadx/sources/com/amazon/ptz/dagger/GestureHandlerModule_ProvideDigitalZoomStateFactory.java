package com.amazon.ptz.dagger;

import android.view.View;
import com.amazon.ptz.digital.DigitalZoomState;
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
public final class GestureHandlerModule_ProvideDigitalZoomStateFactory implements Factory<DigitalZoomState> {
    private final GestureHandlerModule module;
    private final Provider<View> viewProvider;

    public GestureHandlerModule_ProvideDigitalZoomStateFactory(GestureHandlerModule gestureHandlerModule, Provider<View> provider) {
        this.module = gestureHandlerModule;
        this.viewProvider = provider;
    }

    public static GestureHandlerModule_ProvideDigitalZoomStateFactory create(GestureHandlerModule gestureHandlerModule, Provider<View> provider) {
        return new GestureHandlerModule_ProvideDigitalZoomStateFactory(gestureHandlerModule, provider);
    }

    public static DigitalZoomState provideDigitalZoomState(GestureHandlerModule gestureHandlerModule, View view) {
        return (DigitalZoomState) Preconditions.checkNotNullFromProvides(gestureHandlerModule.provideDigitalZoomState(view));
    }

    @Override // javax.inject.Provider
    public DigitalZoomState get() {
        return provideDigitalZoomState(this.module, this.viewProvider.get());
    }
}
