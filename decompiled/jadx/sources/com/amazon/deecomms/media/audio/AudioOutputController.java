package com.amazon.deecomms.media.audio;

import android.media.AudioManager;
import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.enums.AudioRoutes;
import com.amazon.deecomms.common.sip.SipClientState;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AudioOutputController {
    private final AudioManager audioManager;
    private final AudioStateObservable audioStateObservable;
    private final SipClientState sipClientState;

    public AudioOutputController(@NonNull AudioStateObservable audioStateObservable, @NonNull AudioManager audioManager, @NonNull SipClientState sipClientState) {
        this.audioStateObservable = audioStateObservable;
        this.audioManager = audioManager;
        this.sipClientState = sipClientState;
    }

    private AudioRoutes determineNextAudioRoute(@NonNull AudioRoutes audioRoutes) {
        return audioRoutes == AudioRoutes.WIREDHEADSET ? determineRouteAfterWiredHeadsetIsUnplugged() : audioRoutes == AudioRoutes.SPEAKER ? determineRouteAfterSpeakerIsTurnedOff() : AudioRoutes.EARPIECE;
    }

    private AudioRoutes determineRouteAfterSpeakerIsTurnedOff() {
        return this.audioManager.isWiredHeadsetOn() ? AudioRoutes.WIREDHEADSET : AudioRoutes.EARPIECE;
    }

    private AudioRoutes determineRouteAfterWiredHeadsetIsUnplugged() {
        return (this.sipClientState.getCurrentActiveCall() == null || !this.sipClientState.getCurrentActiveCall().isVideoRequested()) ? AudioRoutes.EARPIECE : AudioRoutes.SPEAKER;
    }

    private void updateUI(@NonNull AudioRoutes audioRoutes) {
        this.audioStateObservable.onCallAudioRouteChanged(audioRoutes);
    }

    public void changeAudioRoute(@NonNull AudioRoutes audioRoutes) {
        if (audioRoutes == AudioRoutes.SPEAKER) {
            this.audioManager.setSpeakerphoneOn(true);
        } else if (audioRoutes == AudioRoutes.EARPIECE) {
            this.audioManager.setSpeakerphoneOn(false);
        } else if (audioRoutes == AudioRoutes.WIREDHEADSET) {
            this.audioManager.setSpeakerphoneOn(false);
        }
    }

    public void setCurrentAudioState() {
        updateUI(this.audioManager.isSpeakerphoneOn() ? AudioRoutes.SPEAKER : AudioRoutes.EARPIECE);
    }

    public void toggleSpeaker() {
        AudioRoutes determineRouteAfterSpeakerIsTurnedOff = this.audioManager.isSpeakerphoneOn() ? determineRouteAfterSpeakerIsTurnedOff() : AudioRoutes.SPEAKER;
        changeAudioRoute(determineRouteAfterSpeakerIsTurnedOff);
        updateUI(determineRouteAfterSpeakerIsTurnedOff);
    }

    public void wiredHeadsetStateChanged(boolean z) {
        AudioRoutes determineNextAudioRoute = z ? AudioRoutes.WIREDHEADSET : determineNextAudioRoute(AudioRoutes.WIREDHEADSET);
        changeAudioRoute(determineNextAudioRoute);
        updateUI(determineNextAudioRoute);
    }
}
