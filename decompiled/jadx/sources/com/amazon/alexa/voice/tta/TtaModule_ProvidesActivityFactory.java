package com.amazon.alexa.voice.tta;

import android.app.Activity;
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
public final class TtaModule_ProvidesActivityFactory implements Factory<Activity> {
    private final TtaModule module;

    public TtaModule_ProvidesActivityFactory(TtaModule ttaModule) {
        this.module = ttaModule;
    }

    public static TtaModule_ProvidesActivityFactory create(TtaModule ttaModule) {
        return new TtaModule_ProvidesActivityFactory(ttaModule);
    }

    public static Activity providesActivity(TtaModule ttaModule) {
        return (Activity) Preconditions.checkNotNullFromProvides(ttaModule.providesActivity());
    }

    @Override // javax.inject.Provider
    public Activity get() {
        return providesActivity(this.module);
    }
}
