package com.amazon.alexa.client.alexaservice.base.attentionsystem;

import com.amazon.alexa.api.AlexaAttentionSystemSettingsListener;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ClientListenerContainer;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AttentionSystemAuthority {
    private final AttentionSystemSettingsStore attentionSystemSettingsStore;
    private Boolean isEndpointSoundEnabled;
    private Boolean isWakeSoundEnabled;
    private final Object stateLock = new Object();
    private final ClientListenerContainer<AlexaAttentionSystemSettingsListener> attentionSystemSettingsListeners = new ClientListenerContainer<>();

    @Inject
    public AttentionSystemAuthority(AttentionSystemSettingsStore attentionSystemSettingsStore) {
        this.attentionSystemSettingsStore = attentionSystemSettingsStore;
    }

    private void loadEndpointSoundEnabledFromStore() {
        if (this.isEndpointSoundEnabled == null) {
            this.isEndpointSoundEnabled = Boolean.valueOf(this.attentionSystemSettingsStore.getEndpointSoundEnabled());
        }
    }

    private void loadWakeSoundEnabledFromStore() {
        if (this.isWakeSoundEnabled == null) {
            this.isWakeSoundEnabled = Boolean.valueOf(this.attentionSystemSettingsStore.getWakeSoundEnabled());
        }
    }

    private void updateListenerOnEndpointSoundEnabledChanged(boolean z) {
        synchronized (this.attentionSystemSettingsListeners) {
            try {
                Iterator<AlexaAttentionSystemSettingsListener> it2 = this.attentionSystemSettingsListeners.getAllListeners().iterator();
                while (it2.hasNext()) {
                    it2.next().onEndpointSoundEnabledChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void updateListenerOnWakeSoundEnabledChanged(boolean z) {
        synchronized (this.attentionSystemSettingsListeners) {
            try {
                Iterator<AlexaAttentionSystemSettingsListener> it2 = this.attentionSystemSettingsListeners.getAllListeners().iterator();
                while (it2.hasNext()) {
                    it2.next().onWakeSoundEnabledChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void deregister(AlexaAttentionSystemSettingsListener alexaAttentionSystemSettingsListener) {
        synchronized (this.attentionSystemSettingsListeners) {
            this.attentionSystemSettingsListeners.remove(alexaAttentionSystemSettingsListener);
        }
    }

    public boolean isEndpointSoundEnabled() {
        boolean booleanValue;
        synchronized (this.stateLock) {
            loadEndpointSoundEnabledFromStore();
            booleanValue = this.isEndpointSoundEnabled.booleanValue();
        }
        return booleanValue;
    }

    public boolean isWakeSoundEnabled() {
        boolean booleanValue;
        synchronized (this.stateLock) {
            loadWakeSoundEnabledFromStore();
            booleanValue = this.isWakeSoundEnabled.booleanValue();
        }
        return booleanValue;
    }

    public void onLogout() {
        this.isWakeSoundEnabled = null;
        this.isEndpointSoundEnabled = null;
        this.attentionSystemSettingsStore.removeWakeSoundEnabled();
        this.attentionSystemSettingsStore.removeEndpointSoundEnabled();
    }

    public void register(ExtendedClient extendedClient, AlexaAttentionSystemSettingsListener alexaAttentionSystemSettingsListener) {
        synchronized (this.attentionSystemSettingsListeners) {
            this.attentionSystemSettingsListeners.addListenerForClient(extendedClient, alexaAttentionSystemSettingsListener);
        }
        alexaAttentionSystemSettingsListener.onWakeSoundEnabledChanged(isWakeSoundEnabled());
        alexaAttentionSystemSettingsListener.onEndpointSoundEnabledChanged(isEndpointSoundEnabled());
    }

    public void setEndpointSoundEnabled(boolean z) {
        synchronized (this.stateLock) {
            try {
                loadEndpointSoundEnabledFromStore();
                if (this.isEndpointSoundEnabled.booleanValue() != z) {
                    this.isEndpointSoundEnabled = Boolean.valueOf(z);
                    this.attentionSystemSettingsStore.setEndpointSoundEnabled(z);
                    updateListenerOnEndpointSoundEnabledChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setWakeSoundEnabled(boolean z) {
        synchronized (this.stateLock) {
            try {
                loadWakeSoundEnabledFromStore();
                if (this.isWakeSoundEnabled.booleanValue() != z) {
                    this.isWakeSoundEnabled = Boolean.valueOf(z);
                    this.attentionSystemSettingsStore.setWakeSoundEnabled(z);
                    updateListenerOnWakeSoundEnabledChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
