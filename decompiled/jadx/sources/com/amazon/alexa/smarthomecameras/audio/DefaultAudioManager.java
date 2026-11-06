package com.amazon.alexa.smarthomecameras.audio;

import android.content.Context;
import com.amazon.alexa.smarthomecameras.rtcsc.CamerasAppClient;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultAudioManager implements AudioManager {
    private static final String TAG = "DefaultAudioManager";
    private final CamerasAppClient appClient;
    private final android.media.AudioManager audioManager;

    public DefaultAudioManager(Context context, CamerasAppClient camerasAppClient) {
        Preconditions.checkNotNull(context, "Context cannot be null");
        Preconditions.checkNotNull(camerasAppClient, "App Client cannot be null");
        this.appClient = camerasAppClient;
        this.audioManager = (android.media.AudioManager) context.getSystemService("audio");
    }

    @Override // com.amazon.alexa.smarthomecameras.audio.AudioManager
    public void setMicrophoneMute(boolean z, String str) {
        this.appClient.setLocalAudioState(str, !z);
    }

    @Override // com.amazon.alexa.smarthomecameras.audio.AudioManager
    public void setSpeakerOn(boolean z, String str) {
        this.appClient.setRemoteAudioState(str, z);
        this.audioManager.setSpeakerphoneOn(z);
    }

    @Override // com.amazon.alexa.smarthomecameras.audio.AudioManager
    public void teardown() {
        this.audioManager.setSpeakerphoneOn(false);
    }
}
