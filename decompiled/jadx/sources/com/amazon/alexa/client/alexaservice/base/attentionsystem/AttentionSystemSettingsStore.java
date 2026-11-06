package com.amazon.alexa.client.alexaservice.base.attentionsystem;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.device.PersistentStorage;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AttentionSystemSettingsStore {
    private final Lazy<PersistentStorage> persistentStorage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum AttentionSystemSettingsStoreKey {
        WAKE_SOUND_ENABLED("wakeSoundEnabled"),
        ENDPOINT_SOUND_ENABLED("endpointSoundEnabled");

        private final String key;

        AttentionSystemSettingsStoreKey(String str) {
            this.key = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    @Inject
    public AttentionSystemSettingsStore(@Named("AlexaDevicePreferences") Lazy<PersistentStorage> lazy) {
        this.persistentStorage = lazy;
    }

    private boolean contains(AttentionSystemSettingsStoreKey attentionSystemSettingsStoreKey) {
        return this.persistentStorage.get().contains(attentionSystemSettingsStoreKey.toString());
    }

    private boolean getBoolean(AttentionSystemSettingsStoreKey attentionSystemSettingsStoreKey, boolean z) {
        return this.persistentStorage.get().getBoolean(attentionSystemSettingsStoreKey.toString(), z);
    }

    private void remove(AttentionSystemSettingsStoreKey attentionSystemSettingsStoreKey) {
        this.persistentStorage.get().edit().remove(attentionSystemSettingsStoreKey.toString()).commitAsynchronously();
    }

    private void setBoolean(AttentionSystemSettingsStoreKey attentionSystemSettingsStoreKey, boolean z) {
        this.persistentStorage.get().edit().set(attentionSystemSettingsStoreKey.toString(), z).commitAsynchronously();
    }

    public synchronized boolean getEndpointSoundEnabled() {
        return getBoolean(AttentionSystemSettingsStoreKey.ENDPOINT_SOUND_ENABLED, false);
    }

    public synchronized boolean getWakeSoundEnabled() {
        return getBoolean(AttentionSystemSettingsStoreKey.WAKE_SOUND_ENABLED, false);
    }

    public synchronized boolean hasEndpointSoundEnabled() {
        return contains(AttentionSystemSettingsStoreKey.ENDPOINT_SOUND_ENABLED);
    }

    public synchronized boolean hasWakeSoundEnabled() {
        return contains(AttentionSystemSettingsStoreKey.WAKE_SOUND_ENABLED);
    }

    public synchronized void removeEndpointSoundEnabled() {
        remove(AttentionSystemSettingsStoreKey.ENDPOINT_SOUND_ENABLED);
    }

    public synchronized void removeWakeSoundEnabled() {
        remove(AttentionSystemSettingsStoreKey.WAKE_SOUND_ENABLED);
    }

    public synchronized void setEndpointSoundEnabled(boolean z) {
        setBoolean(AttentionSystemSettingsStoreKey.ENDPOINT_SOUND_ENABLED, z);
    }

    public synchronized void setWakeSoundEnabled(boolean z) {
        setBoolean(AttentionSystemSettingsStoreKey.WAKE_SOUND_ENABLED, z);
    }
}
