package com.amazon.dee.app.dependencies;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ExternalUIScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ExternalUIModule_ProvideActivityFactory implements Factory<Activity> {
    private final ExternalUIModule module;

    public ExternalUIModule_ProvideActivityFactory(ExternalUIModule externalUIModule) {
        this.module = externalUIModule;
    }

    public static ExternalUIModule_ProvideActivityFactory create(ExternalUIModule externalUIModule) {
        return new ExternalUIModule_ProvideActivityFactory(externalUIModule);
    }

    public static Activity provideActivity(ExternalUIModule externalUIModule) {
        return (Activity) Preconditions.checkNotNullFromProvides(externalUIModule.provideActivity());
    }

    @Override // javax.inject.Provider
    public Activity get() {
        return provideActivity(this.module);
    }
}
