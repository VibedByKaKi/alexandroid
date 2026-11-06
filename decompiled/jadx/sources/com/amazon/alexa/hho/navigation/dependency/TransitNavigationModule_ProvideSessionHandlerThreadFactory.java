package com.amazon.alexa.hho.navigation.dependency;

import android.os.HandlerThread;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.alexa.hho.navigation.dependency.TransitScope")
@DaggerGenerated
@QualifierMetadata({"com.amazon.alexa.hho.navigation.dependency.SessionHandlerThread"})
/* loaded from: classes13.dex */
public final class TransitNavigationModule_ProvideSessionHandlerThreadFactory implements Factory<HandlerThread> {
    private final TransitNavigationModule module;

    public TransitNavigationModule_ProvideSessionHandlerThreadFactory(TransitNavigationModule transitNavigationModule) {
        this.module = transitNavigationModule;
    }

    public static TransitNavigationModule_ProvideSessionHandlerThreadFactory create(TransitNavigationModule transitNavigationModule) {
        return new TransitNavigationModule_ProvideSessionHandlerThreadFactory(transitNavigationModule);
    }

    public static HandlerThread provideSessionHandlerThread(TransitNavigationModule transitNavigationModule) {
        return (HandlerThread) Preconditions.checkNotNullFromProvides(transitNavigationModule.provideSessionHandlerThread());
    }

    @Override // javax.inject.Provider
    public HandlerThread get() {
        return provideSessionHandlerThread(this.module);
    }
}
