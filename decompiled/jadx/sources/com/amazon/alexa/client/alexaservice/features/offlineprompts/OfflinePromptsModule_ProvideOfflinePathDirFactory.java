package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.io.File;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class OfflinePromptsModule_ProvideOfflinePathDirFactory implements Factory<File> {
    private final Provider<Context> contextProvider;
    private final OfflinePromptsModule module;

    public OfflinePromptsModule_ProvideOfflinePathDirFactory(OfflinePromptsModule offlinePromptsModule, Provider<Context> provider) {
        this.module = offlinePromptsModule;
        this.contextProvider = provider;
    }

    public static OfflinePromptsModule_ProvideOfflinePathDirFactory create(OfflinePromptsModule offlinePromptsModule, Provider<Context> provider) {
        return new OfflinePromptsModule_ProvideOfflinePathDirFactory(offlinePromptsModule, provider);
    }

    public static File provideOfflinePathDir(OfflinePromptsModule offlinePromptsModule, Context context) {
        return (File) Preconditions.checkNotNullFromProvides(offlinePromptsModule.provideOfflinePathDir(context));
    }

    @Override // javax.inject.Provider
    public File get() {
        return provideOfflinePathDir(this.module, this.contextProvider.get());
    }
}
