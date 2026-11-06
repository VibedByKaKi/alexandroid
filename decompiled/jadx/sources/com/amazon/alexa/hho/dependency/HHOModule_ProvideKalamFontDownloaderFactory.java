package com.amazon.alexa.hho.dependency;

import com.amazon.alexa.hho.stickynotes.KalamFontDownloader;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class HHOModule_ProvideKalamFontDownloaderFactory implements Factory<KalamFontDownloader> {
    private final HHOModule module;

    public HHOModule_ProvideKalamFontDownloaderFactory(HHOModule hHOModule) {
        this.module = hHOModule;
    }

    public static HHOModule_ProvideKalamFontDownloaderFactory create(HHOModule hHOModule) {
        return new HHOModule_ProvideKalamFontDownloaderFactory(hHOModule);
    }

    public static KalamFontDownloader provideKalamFontDownloader(HHOModule hHOModule) {
        return (KalamFontDownloader) Preconditions.checkNotNullFromProvides(hHOModule.provideKalamFontDownloader());
    }

    @Override // javax.inject.Provider
    public KalamFontDownloader get() {
        return provideKalamFontDownloader(this.module);
    }
}
