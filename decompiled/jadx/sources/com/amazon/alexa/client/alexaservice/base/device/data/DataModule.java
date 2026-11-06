package com.amazon.alexa.client.alexaservice.base.device.data;

import android.content.Context;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class DataModule {
    public static final String CACHE_DIRECTORY = "CACHE_DIRECTORY";
    public static final String ENCRYPTION_WITH_AES = "encryption_with_aes";

    @Provides
    @Singleton
    @Named("CACHE_DIRECTORY")
    public File providesCacheDirectoryFile(Context context) {
        return context.getCacheDir();
    }

    @Provides
    @Singleton
    @Named(ENCRYPTION_WITH_AES)
    public EncryptionAuthority providesEncryptionAuthorityForAES(Context context, CrashReporter crashReporter) {
        return new EncryptionAuthority(context, crashReporter);
    }
}
