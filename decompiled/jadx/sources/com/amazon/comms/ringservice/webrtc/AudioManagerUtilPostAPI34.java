package com.amazon.comms.ringservice.webrtc;

import android.content.Context;
import android.media.AudioManager;
import com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface;
import com.amazon.comms.calling.service.PlatformVoIPSelection;
import com.amazon.comms.log.CommsLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AudioManagerUtilPostAPI34 implements AmazonAudioManagerUtilInterface {
    private static final int ASP_CMD_SET_VOIP_CONFIG = 74;
    private static final String VOIP_ASP_OFF = "asp_voip_mode=0";
    private static final String VOIP_ASP_ON = "asp_voip_mode=1";
    private static final CommsLogger log = CommsLogger.getLogger(AudioManagerUtilPostAPI34.class);
    private AudioManager audioManager;

    @Override // com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface
    public void clearPlatformVoIPSelection(PlatformVoIPSelection platformVoIPSelection) {
        if (platformVoIPSelection == null || this.audioManager == null) {
            return;
        }
        log.i("clearPlatformVoIPSelection is not migrated to use AudioManager on API version 34 yet, no-op");
    }

    @Override // com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface
    public void configurePlatformVoIPSelection(Context context, PlatformVoIPSelection platformVoIPSelection) {
        if (platformVoIPSelection == null) {
            log.i("No PlatformVoIPSelection configured ...");
        } else if (context == null) {
            log.i("Null application context. Returning.");
        } else {
            log.i("configurePlatformVoIPSelection is not migrated to use AudioManager on API version 34 yet, no-op");
        }
    }

    @Override // com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface
    public int setASPVoIPConfigCommand(byte[] bArr) {
        log.i("setASPVoIPConfigCommandn is not migrated on API version 34 yet, no-op");
        return -1;
    }
}
