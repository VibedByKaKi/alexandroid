package com.amazon.alexa.android.ui;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ActivityStarterModule_ProvideActivityStarterFactory implements Factory<ActivityStarter> {
    private final Provider<Context> contextProvider;

    public ActivityStarterModule_ProvideActivityStarterFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ActivityStarterModule_ProvideActivityStarterFactory create(Provider<Context> provider) {
        return new ActivityStarterModule_ProvideActivityStarterFactory(provider);
    }

    public static ActivityStarter provideActivityStarter(Context context) {
        return (ActivityStarter) Preconditions.checkNotNullFromProvides(ActivityStarterModule.provideActivityStarter(context));
    }

    @Override // javax.inject.Provider
    public ActivityStarter get() {
        return provideActivityStarter(this.contextProvider.get());
    }
}
