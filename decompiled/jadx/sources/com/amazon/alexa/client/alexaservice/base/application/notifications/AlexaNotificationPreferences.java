package com.amazon.alexa.client.alexaservice.base.application.notifications;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.device.PersistentStorage;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaNotificationPreferences {

    @VisibleForTesting
    static final String KEY_PLAYED_MEDIA = "played_media";
    private final Lazy<PersistentStorage> persistentStorage;

    @Inject
    public AlexaNotificationPreferences(@Named("AlexaNotificationPreferences") Lazy<PersistentStorage> lazy) {
        this.persistentStorage = lazy;
    }

    public boolean getPlayedMedia(boolean z) {
        return this.persistentStorage.get().getBoolean(KEY_PLAYED_MEDIA, z);
    }

    public void setPlayedMedia(boolean z) {
        this.persistentStorage.get().edit().set(KEY_PLAYED_MEDIA, z).commitSynchronously();
    }
}
