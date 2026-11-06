package com.amazon.alexa.voice.tta.search;

import com.amazon.alexa.voice.ui.tta.search.TtaResultHandler;
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
/* loaded from: classes19.dex */
public final class SearchModule_ProvidesTtaResultHandlerFactory implements Factory<TtaResultHandler> {
    private final SearchModule module;
    private final Provider<DefaultTtaResultHandler> ttaResultHandlerProvider;

    public SearchModule_ProvidesTtaResultHandlerFactory(SearchModule searchModule, Provider<DefaultTtaResultHandler> provider) {
        this.module = searchModule;
        this.ttaResultHandlerProvider = provider;
    }

    public static SearchModule_ProvidesTtaResultHandlerFactory create(SearchModule searchModule, Provider<DefaultTtaResultHandler> provider) {
        return new SearchModule_ProvidesTtaResultHandlerFactory(searchModule, provider);
    }

    public static TtaResultHandler providesTtaResultHandler(SearchModule searchModule, DefaultTtaResultHandler defaultTtaResultHandler) {
        return (TtaResultHandler) Preconditions.checkNotNullFromProvides(searchModule.providesTtaResultHandler(defaultTtaResultHandler));
    }

    @Override // javax.inject.Provider
    public TtaResultHandler get() {
        return providesTtaResultHandler(this.module, this.ttaResultHandlerProvider.get());
    }
}
