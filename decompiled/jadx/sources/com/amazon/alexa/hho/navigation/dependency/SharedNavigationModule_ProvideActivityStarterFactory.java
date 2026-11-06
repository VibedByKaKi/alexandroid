package com.amazon.alexa.hho.navigation.dependency;

import android.content.Context;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui.ActivityStarter;
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
/* loaded from: classes13.dex */
public final class SharedNavigationModule_ProvideActivityStarterFactory implements Factory<ActivityStarter> {
    private final Provider<Context> contextProvider;
    private final SharedNavigationModule module;

    public SharedNavigationModule_ProvideActivityStarterFactory(SharedNavigationModule sharedNavigationModule, Provider<Context> provider) {
        this.module = sharedNavigationModule;
        this.contextProvider = provider;
    }

    public static SharedNavigationModule_ProvideActivityStarterFactory create(SharedNavigationModule sharedNavigationModule, Provider<Context> provider) {
        return new SharedNavigationModule_ProvideActivityStarterFactory(sharedNavigationModule, provider);
    }

    public static ActivityStarter provideActivityStarter(SharedNavigationModule sharedNavigationModule, Context context) {
        return (ActivityStarter) Preconditions.checkNotNullFromProvides(sharedNavigationModule.provideActivityStarter(context));
    }

    @Override // javax.inject.Provider
    public ActivityStarter get() {
        return provideActivityStarter(this.module, this.contextProvider.get());
    }
}
