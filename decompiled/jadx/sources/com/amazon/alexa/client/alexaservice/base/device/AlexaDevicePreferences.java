package com.amazon.alexa.client.alexaservice.base.device;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaPreferences;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaDevicePreferences {

    @VisibleForTesting
    static final String KEY_PREFER_DISPLAY_OVER_LOCKSCREEN = "displayOverLockscreenWithVerifiedVoice";
    private static final String TAG = "AlexaDevicePreferences";
    private final Lazy<PersistentStorage> persistentStorage;

    @Inject
    public AlexaDevicePreferences(@Named("AlexaDevicePreferences") Lazy<PersistentStorage> lazy) {
        this.persistentStorage = lazy;
    }

    public synchronized AlexaPreferences getPreferences() {
        boolean z;
        z = this.persistentStorage.get().getBoolean(KEY_PREFER_DISPLAY_OVER_LOCKSCREEN, false);
        Log.d(TAG, "getPreferences setting: " + z);
        return AlexaPreferences.builder().setPreferDisplayOverLockscreenWithVerifiedVoice(z).build();
    }

    public synchronized void updatePreferences(AlexaPreferences alexaPreferences) {
        this.persistentStorage.get().edit().set(KEY_PREFER_DISPLAY_OVER_LOCKSCREEN, alexaPreferences.preferDisplayOverLockscreenWithVerifiedVoice()).commitSynchronously();
    }
}
