package com.amazon.alexa.client.alexaservice.base.device.data;

import android.content.Context;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class DataModule_ProvidesEncryptionAuthorityForAESFactory implements Factory<EncryptionAuthority> {
    private final Provider<Context> contextProvider;
    private final Provider<CrashReporter> crashReporterProvider;
    private final DataModule module;

    public DataModule_ProvidesEncryptionAuthorityForAESFactory(DataModule dataModule, Provider<Context> provider, Provider<CrashReporter> provider2) {
        this.module = dataModule;
        this.contextProvider = provider;
        this.crashReporterProvider = provider2;
    }

    public static DataModule_ProvidesEncryptionAuthorityForAESFactory create(DataModule dataModule, Provider<Context> provider, Provider<CrashReporter> provider2) {
        return new DataModule_ProvidesEncryptionAuthorityForAESFactory(dataModule, provider, provider2);
    }

    public static EncryptionAuthority providesEncryptionAuthorityForAES(DataModule dataModule, Context context, CrashReporter crashReporter) {
        return (EncryptionAuthority) Preconditions.checkNotNullFromProvides(dataModule.providesEncryptionAuthorityForAES(context, crashReporter));
    }

    @Override // javax.inject.Provider
    public EncryptionAuthority get() {
        return providesEncryptionAuthorityForAES(this.module, this.contextProvider.get(), this.crashReporterProvider.get());
    }
}
