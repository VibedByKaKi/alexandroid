package com.amazon.alexa.alertsca.dependencies;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public class DataModule {
    public static final String CACHE_DIRECTORY = "CACHE_DIRECTORY";

    @Provides
    @Singleton
    @Named("CACHE_DIRECTORY")
    public File providesCacheDirectoryFile(Context context) {
        return context.getCacheDir();
    }
}
