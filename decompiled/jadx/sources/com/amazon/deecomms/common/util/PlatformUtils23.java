package com.amazon.deecomms.common.util;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import android.provider.Settings;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(23)
/* loaded from: classes5.dex */
class PlatformUtils23 extends PlatformUtils21 {
    private static final int VIBRATE_WHEN_RINGING = 1;

    @Override // com.amazon.deecomms.common.util.PlatformUtils
    public boolean isDoNotDisturbActive(Context context) {
        int currentInterruptionFilter = ((NotificationManager) context.getSystemService("notification")).getCurrentInterruptionFilter();
        return (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) ? false : true;
    }

    @Override // com.amazon.deecomms.common.util.PlatformUtils21, com.amazon.deecomms.common.util.PlatformUtils19, com.amazon.deecomms.common.util.PlatformUtils
    public void performRingerVibration(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int i = Settings.System.getInt(context.getContentResolver(), "vibrate_when_ringing", 0);
        if (audioManager.getRingerMode() == 1 || (i == 1 && !isDoNotDisturbActive(context))) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(Constants.CALL_VIBRATION_PATTERN, 0);
        }
    }
}
