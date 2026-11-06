package com.amazon.comms.ringservice.webrtc;

import amazon.media.AmazonAudioManager;
import android.content.Context;
import com.amazon.asp.AudioSignalProcessor;
import com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface;
import com.amazon.comms.calling.service.PlatformVoIPSelection;
import com.amazon.comms.log.CommsLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AmazonAudioManagerUtil implements AmazonAudioManagerUtilInterface {
    private static final int ASP_CMD_SET_VOIP_CONFIG = 74;
    private static final String VOIP_ASP_OFF = "asp_voip_mode=0";
    private static final String VOIP_ASP_ON = "asp_voip_mode=1";
    private static final CommsLogger log = CommsLogger.getLogger(AmazonAudioManagerUtil.class);
    private AudioSignalProcessor asp;
    private AmazonAudioManager audioManager;

    @Override // com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface
    public void clearPlatformVoIPSelection(PlatformVoIPSelection platformVoIPSelection) {
        AmazonAudioManager amazonAudioManager;
        if (platformVoIPSelection == null || (amazonAudioManager = this.audioManager) == null) {
            return;
        }
        try {
            boolean dolbyDapEnabled = amazonAudioManager.setDolbyDapEnabled(true);
            log.i("Restore DolbyDap status: " + dolbyDapEnabled);
            this.audioManager.setParameters(VOIP_ASP_OFF);
        } catch (Exception e) {
            log.e("Exception on AmazonAudioManager.setDolbyDapEnabled operation: ", e);
        }
    }

    @Override // com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface
    public void configurePlatformVoIPSelection(Context context, PlatformVoIPSelection platformVoIPSelection) {
        if (platformVoIPSelection == null) {
            log.i("No PlatformVoIPSelection configured ...");
            return;
        }
        if (context == null) {
            log.i("Null application context. Returning.");
            return;
        }
        try {
            boolean isEnableLibasp = platformVoIPSelection.isEnableLibasp();
            boolean isEnableDolbyDap = platformVoIPSelection.isEnableDolbyDap();
            CommsLogger commsLogger = log;
            commsLogger.i("Configure PlatformVoIPSelection in progress, enableLibasp = " + isEnableLibasp + " , enableDolbyDap = " + isEnableDolbyDap);
            if (this.audioManager == null) {
                AmazonAudioManager amazonAudioManager = (AmazonAudioManager) context.getSystemService("audio");
                this.audioManager = amazonAudioManager;
                if (amazonAudioManager == null) {
                    commsLogger.e("Null audioManager, can't move forward with PlatformVoIPSelection");
                    return;
                }
            }
            AmazonAudioManager amazonAudioManager2 = this.audioManager;
            if (isEnableLibasp) {
                amazonAudioManager2.setParameters(VOIP_ASP_ON);
            } else {
                amazonAudioManager2.setParameters(VOIP_ASP_OFF);
            }
            commsLogger.i("setDolbyDapEnabled status: " + this.audioManager.setDolbyDapEnabled(isEnableDolbyDap));
        } catch (Exception e) {
            log.e("Exception on AmazonAudioManager operation: ", e);
        }
    }

    @Override // com.amazon.comms.calling.service.AmazonAudioManagerUtilInterface
    public int setASPVoIPConfigCommand(byte[] bArr) {
        try {
            if (this.asp == null) {
                this.asp = AudioSignalProcessor.getInstance();
            }
            return this.asp.command(74, bArr, new byte[0]);
        } catch (Exception e) {
            log.e("Exception on ASP comamnd: " + e.getMessage());
            return -1;
        }
    }
}
