package com.amazon.ptz.dagger;

import android.os.Handler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.ptz.util.Qualifiers.UiThread"})
/* loaded from: classes5.dex */
public final class HandlerModule_ProvideMainHandlerFactory implements Factory<Handler> {
    private final HandlerModule module;

    public HandlerModule_ProvideMainHandlerFactory(HandlerModule handlerModule) {
        this.module = handlerModule;
    }

    public static HandlerModule_ProvideMainHandlerFactory create(HandlerModule handlerModule) {
        return new HandlerModule_ProvideMainHandlerFactory(handlerModule);
    }

    public static Handler provideMainHandler(HandlerModule handlerModule) {
        return (Handler) Preconditions.checkNotNullFromProvides(handlerModule.provideMainHandler());
    }

    @Override // javax.inject.Provider
    public Handler get() {
        return provideMainHandler(this.module);
    }
}
