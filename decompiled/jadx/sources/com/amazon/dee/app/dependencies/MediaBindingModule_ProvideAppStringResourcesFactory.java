package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.dee.app.resources.AppStringResources;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MediaBindingModule_ProvideAppStringResourcesFactory implements Factory<AppStringResources> {
    private final Provider<Context> contextProvider;
    private final MediaBindingModule module;

    public MediaBindingModule_ProvideAppStringResourcesFactory(MediaBindingModule mediaBindingModule, Provider<Context> provider) {
        this.module = mediaBindingModule;
        this.contextProvider = provider;
    }

    public static MediaBindingModule_ProvideAppStringResourcesFactory create(MediaBindingModule mediaBindingModule, Provider<Context> provider) {
        return new MediaBindingModule_ProvideAppStringResourcesFactory(mediaBindingModule, provider);
    }

    public static AppStringResources provideAppStringResources(MediaBindingModule mediaBindingModule, Context context) {
        return (AppStringResources) Preconditions.checkNotNullFromProvides(mediaBindingModule.provideAppStringResources(context));
    }

    @Override // javax.inject.Provider
    public AppStringResources get() {
        return provideAppStringResources(this.module, this.contextProvider.get());
    }
}
