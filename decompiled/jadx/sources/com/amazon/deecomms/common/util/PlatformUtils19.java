package com.amazon.deecomms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(19)
/* loaded from: classes5.dex */
class PlatformUtils19 extends PlatformUtils {
    @Override // com.amazon.deecomms.common.util.PlatformUtils
    public void performRingerVibration(Context context) {
        if (((AudioManager) context.getSystemService("audio")).getRingerMode() == 1) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(Constants.CALL_VIBRATION_PATTERN, 0);
        }
    }

    @Override // com.amazon.deecomms.common.util.PlatformUtils
    public void stopRingerVibration(Context context) {
        ((Vibrator) context.getSystemService("vibrator")).cancel();
    }
}
