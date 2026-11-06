package com.amazon.alexa.alertsca.dependencies;

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
/* loaded from: classes16.dex */
public final class DataModule_ProvidesCacheDirectoryFileFactory implements Factory<File> {
    private final Provider<Context> contextProvider;
    private final DataModule module;

    public DataModule_ProvidesCacheDirectoryFileFactory(DataModule dataModule, Provider<Context> provider) {
        this.module = dataModule;
        this.contextProvider = provider;
    }

    public static DataModule_ProvidesCacheDirectoryFileFactory create(DataModule dataModule, Provider<Context> provider) {
        return new DataModule_ProvidesCacheDirectoryFileFactory(dataModule, provider);
    }

    public static File providesCacheDirectoryFile(DataModule dataModule, Context context) {
        return (File) Preconditions.checkNotNullFromProvides(dataModule.providesCacheDirectoryFile(context));
    }

    @Override // javax.inject.Provider
    public File get() {
        return providesCacheDirectoryFile(this.module, this.contextProvider.get());
    }
}
