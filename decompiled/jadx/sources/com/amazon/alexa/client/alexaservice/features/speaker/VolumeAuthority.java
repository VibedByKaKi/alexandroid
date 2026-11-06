package com.amazon.alexa.client.alexaservice.features.speaker;

import android.media.AudioManager;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent;
import com.amazon.alexa.client.alexaservice.features.speaker.payload.VolumeEventPayload;
import com.amazon.alexa.client.core.messages.Header;
import com.amazon.alexa.client.core.messages.Message;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VolumeAuthority {
    private static final int ANDROID_MIN_VOLUME = 0;

    @VisibleForTesting
    static final int BLUETOOTH_CALL_AUDIO_MODE = 6;
    private static final String TAG = "VolumeAuthority";
    private final AlexaClientEventBus alexaClientEventBus;
    private final AudioManager audioManager;
    private final MuteStateChangedEventSender muteStateChangedEventSender;
    private boolean requestMadeWhileInSco;
    private boolean isSystemMuted = getSystemMute();
    private int systemVolume = getSystemVolume();

    @Inject
    public VolumeAuthority(AlexaClientEventBus alexaClientEventBus, AudioManager audioManager, MuteStateChangedEventSender muteStateChangedEventSender) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.audioManager = audioManager;
        this.muteStateChangedEventSender = muteStateChangedEventSender;
    }

    private int convertFromAlexaToSystemVolume(long j) {
        return (int) ((j * this.audioManager.getStreamMaxVolume(getCurrentStream())) / 100.0d);
    }

    private int convertFromSystemToAlexaVolume(long j) {
        return (int) Math.round((j * 100.0d) / this.audioManager.getStreamMaxVolume(getCurrentStream()));
    }

    private int getCurrentStream() {
        if (this.requestMadeWhileInSco) {
            return 6;
        }
        int mode = this.audioManager.getMode();
        if (mode == 2 || mode == 3) {
            return this.audioManager.isBluetoothScoOn() ? 6 : 0;
        }
        return 3;
    }

    private boolean getSystemMute() {
        return this.audioManager.isStreamMute(getCurrentStream());
    }

    private int getSystemVolume() {
        return this.audioManager.getStreamVolume(getCurrentStream());
    }

    private void sendMuteChangedEvent(int i, boolean z) {
        this.alexaClientEventBus.post(SendMessageEvent.builder().setMessage(Message.create(Header.builder().setNamespace(AvsApiConstants.Speaker.NAMESPACE).setName(AvsApiConstants.Speaker.Events.MuteChanged.NAME).build(), VolumeEventPayload.builder().setMuted(z).setVolume(i).build())).build());
    }

    private void sendVolumeChangedEvent(int i, boolean z) {
        this.alexaClientEventBus.post(SendMessageEvent.builder().setMessage(Message.create(Header.builder().setNamespace(AvsApiConstants.Speaker.NAMESPACE).setName(AvsApiConstants.Speaker.Events.VolumeChanged.NAME).build(), VolumeEventPayload.builder().setMuted(z).setVolume(i).build())).build());
    }

    private void updateSystemMute(boolean z) {
        String.format("updateSystemMute: %d %s %s", Integer.valueOf(getSystemVolume()), Boolean.valueOf(this.isSystemMuted), this);
        this.isSystemMuted = z;
        this.audioManager.adjustSuggestedStreamVolume(z ? -100 : 100, getCurrentStream(), 1);
        this.muteStateChangedEventSender.send(z);
        sendMuteChangedEvent(convertFromSystemToAlexaVolume(getSystemVolume()), this.isSystemMuted);
        String.format("updateSystemMute after: %d %s %s", Integer.valueOf(getSystemVolume()), Boolean.valueOf(this.isSystemMuted), this);
    }

    private void updateSystemVolume(int i) {
        String.format("updateSystemVolume: %d %s %s", Integer.valueOf(getSystemVolume()), Boolean.valueOf(this.isSystemMuted), this);
        this.audioManager.setStreamVolume(getCurrentStream(), i, 1);
        sendVolumeChangedEvent(convertFromSystemToAlexaVolume(getSystemVolume()), getSystemMute());
        String.format("updateSystemVolume after: %d %s %s", Integer.valueOf(getSystemVolume()), Boolean.valueOf(this.isSystemMuted), this);
    }

    public void adjustAlexaVolume(long j) {
        updateSystemVolume(Math.max(Math.min(convertFromAlexaToSystemVolume(j) + getSystemVolume(), this.audioManager.getStreamMaxVolume(getCurrentStream())), 0));
    }

    public int getAlexaVolume() {
        return convertFromSystemToAlexaVolume(getSystemVolume());
    }

    public boolean isMuted() {
        return this.isSystemMuted;
    }

    public void setAlexaVolume(long j) {
        updateSystemVolume(convertFromAlexaToSystemVolume(j));
    }

    public void setMute(boolean z) {
        String.format("setMute: %d %s", Integer.valueOf(getSystemVolume()), Boolean.valueOf(z));
        updateSystemMute(z);
    }

    public void setRequestMadeWhileInSco(boolean z) {
        this.requestMadeWhileInSco = z;
    }

    public void updateFromSystem() {
        int systemVolume = getSystemVolume();
        boolean systemMute = getSystemMute();
        boolean z = this.systemVolume != systemVolume;
        boolean z2 = this.isSystemMuted != systemMute;
        if (z) {
            sendVolumeChangedEvent(convertFromSystemToAlexaVolume(systemVolume), systemMute);
        }
        if (z2) {
            sendMuteChangedEvent(convertFromSystemToAlexaVolume(systemVolume), systemMute);
        }
        this.systemVolume = systemVolume;
        this.isSystemMuted = systemMute;
    }
}
