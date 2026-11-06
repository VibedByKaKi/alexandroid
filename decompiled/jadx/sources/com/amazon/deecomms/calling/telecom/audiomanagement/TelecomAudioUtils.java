package com.amazon.deecomms.calling.telecom.audiomanagement;

import android.media.AudioManager;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class TelecomAudioUtils {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, TelecomAudioUtils.class);

    private TelecomAudioUtils() {
    }

    public static void verifyRouteSelected(@NonNull AudioManager audioManager, @NonNull String str) {
        if (str.equalsIgnoreCase("earpiece")) {
            CommsLogger commsLogger = LOG;
            StringBuilder sb = new StringBuilder("Earpiece requested. Audio has been routed via earpiece is ");
            sb.append(!audioManager.isSpeakerphoneOn());
            commsLogger.i(sb.toString());
            if (audioManager.isSpeakerphoneOn()) {
                commsLogger.i("Telecom audio routing to earpiece failed. Retrying using traditional approach");
                audioManager.setSpeakerphoneOn(false);
                CredentialConfig$$ExternalSyntheticOutline0.m(new StringBuilder("Earpiece requested. Audio has been routed via earpiece is "), !audioManager.isSpeakerphoneOn(), commsLogger);
                return;
            }
            return;
        }
        if (str.equalsIgnoreCase("speaker")) {
            CommsLogger commsLogger2 = LOG;
            commsLogger2.i("Speaker requested. Audio has been routed via speaker is " + audioManager.isSpeakerphoneOn());
            if (audioManager.isSpeakerphoneOn()) {
                return;
            }
            commsLogger2.i("Telecom audio routing to speaker failed. Retrying using traditional approach");
            audioManager.setSpeakerphoneOn(true);
            commsLogger2.i("Speaker requested. Audio has been routed via speaker is " + audioManager.isSpeakerphoneOn());
        }
    }
}
