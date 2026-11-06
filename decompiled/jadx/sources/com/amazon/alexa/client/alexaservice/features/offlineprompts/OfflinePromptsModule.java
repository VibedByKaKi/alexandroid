package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.alexa.utils.Provider;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.wakeword.davs.ArtifactManager;
import com.amazon.alexa.wakeword.davs.DavsClient;
import com.amazon.alexa.wakeword.davs.NetworkManager;
import com.amazon.alexa.wakeword.pryon.LocaleProvider;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class OfflinePromptsModule {
    private static final String OFFLINE_PROMPTS_DATA = "offline_store";
    private static final String OFFLINE_PROMPTS_DEVICE_STORE = "alexa-voice-sdk";

    @Provides
    @Singleton
    @Named(OFFLINE_PROMPTS_DATA)
    public File provideOfflinePathDir(Context context) {
        return new File(context.getFilesDir(), "alexa-voice-sdk");
    }

    @Provides
    @Singleton
    public OfflinePromptsArtifactManager provideOfflinePromptsArtifactManager() {
        return new OfflinePromptsArtifactManager();
    }

    @Provides
    @Singleton
    public OfflinePromptsDownloadManager provideOfflinePromptsDownloadManager(ArtifactManager artifactManager, DavsClient davsClient, NetworkManager networkManager, TimeProvider timeProvider, LocaleProvider localeProvider, OfflinePromptsArtifactManager offlinePromptsArtifactManager, OfflinePromptsDownloadMetricsListener offlinePromptsDownloadMetricsListener, @Named("offline_store") final Lazy<SharedPreferences> lazy, @Named("offline_store") File file) {
        return new DavsOfflinePromptsDownloadManager(artifactManager, davsClient, networkManager, timeProvider, new Provider<SharedPreferences>() { // from class: com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsModule.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.utils.Provider
            public SharedPreferences get() {
                return (SharedPreferences) lazy.get();
            }
        }, localeProvider, offlinePromptsArtifactManager, file, offlinePromptsDownloadMetricsListener);
    }

    @Provides
    @Singleton
    @Named(OFFLINE_PROMPTS_DATA)
    public SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences(OFFLINE_PROMPTS_DATA, 0);
    }
}
