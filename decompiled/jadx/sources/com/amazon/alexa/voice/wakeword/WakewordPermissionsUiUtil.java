package com.amazon.alexa.voice.wakeword;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.amazon.alexa.voice.permissions.VoicePermissionsAuthority;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class WakewordPermissionsUiUtil {
    private WakewordPermissionsUiUtil() {
    }

    @SuppressLint({"NewApi"})
    public static void requestPermissionIfNeededOrFinish(Activity activity, int i) {
        activity.requestPermissions(VoicePermissionsAuthority.getMinimumPermissions(), i);
    }
}
