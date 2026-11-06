package com.amazon.alexa.voice.tta.search;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class SearchModule_ProvidesDefaultTtaResultHandlerFactory implements Factory<DefaultTtaResultHandler> {
    private final SearchModule module;

    public SearchModule_ProvidesDefaultTtaResultHandlerFactory(SearchModule searchModule) {
        this.module = searchModule;
    }

    public static SearchModule_ProvidesDefaultTtaResultHandlerFactory create(SearchModule searchModule) {
        return new SearchModule_ProvidesDefaultTtaResultHandlerFactory(searchModule);
    }

    public static DefaultTtaResultHandler providesDefaultTtaResultHandler(SearchModule searchModule) {
        return (DefaultTtaResultHandler) Preconditions.checkNotNullFromProvides(searchModule.providesDefaultTtaResultHandler());
    }

    @Override // javax.inject.Provider
    public DefaultTtaResultHandler get() {
        return providesDefaultTtaResultHandler(this.module);
    }
}
