package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class OfflinePromptsModule_ProvideOfflinePromptsArtifactManagerFactory implements Factory<OfflinePromptsArtifactManager> {
    private final OfflinePromptsModule module;

    public OfflinePromptsModule_ProvideOfflinePromptsArtifactManagerFactory(OfflinePromptsModule offlinePromptsModule) {
        this.module = offlinePromptsModule;
    }

    public static OfflinePromptsModule_ProvideOfflinePromptsArtifactManagerFactory create(OfflinePromptsModule offlinePromptsModule) {
        return new OfflinePromptsModule_ProvideOfflinePromptsArtifactManagerFactory(offlinePromptsModule);
    }

    public static OfflinePromptsArtifactManager provideOfflinePromptsArtifactManager(OfflinePromptsModule offlinePromptsModule) {
        return (OfflinePromptsArtifactManager) Preconditions.checkNotNullFromProvides(offlinePromptsModule.provideOfflinePromptsArtifactManager());
    }

    @Override // javax.inject.Provider
    public OfflinePromptsArtifactManager get() {
        return provideOfflinePromptsArtifactManager(this.module);
    }
}
