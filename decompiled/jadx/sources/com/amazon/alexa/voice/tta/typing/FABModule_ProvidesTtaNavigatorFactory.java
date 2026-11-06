package com.amazon.alexa.voice.tta.typing;

import com.amazon.alexa.voice.ui.tta.TtaNavigator;
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
public final class FABModule_ProvidesTtaNavigatorFactory implements Factory<TtaNavigator> {
    private final FABModule module;

    public FABModule_ProvidesTtaNavigatorFactory(FABModule fABModule) {
        this.module = fABModule;
    }

    public static FABModule_ProvidesTtaNavigatorFactory create(FABModule fABModule) {
        return new FABModule_ProvidesTtaNavigatorFactory(fABModule);
    }

    public static TtaNavigator providesTtaNavigator(FABModule fABModule) {
        return (TtaNavigator) Preconditions.checkNotNullFromProvides(fABModule.providesTtaNavigator());
    }

    @Override // javax.inject.Provider
    public TtaNavigator get() {
        return providesTtaNavigator(this.module);
    }
}
