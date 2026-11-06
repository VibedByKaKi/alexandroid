package com.amazon.alexa.handsfree.settings.voxsettings;

import android.content.Intent;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface VoxSettingsRequestHandler {
    public static final String SHARED_PREFS_FILENAME = "com.amazon.alexa.handsfree.voxconfig";
    public static final String SHOW_ON_LOCKSCREEN_PREF_KEY = "showOnLockscreen";
    public static final String SHOW_ON_LOCKSCREEN_PREF_VALUE_BLOCK_ALL = "BLOCK_ALL";
    public static final String SHOW_ON_LOCKSCREEN_PREF_VALUE_BLOCK_PERSONAL = "BLOCK_PERSONAL";
    public static final String SHOW_ON_LOCKSCREEN_PREF_VALUE_KEY = "showOnLockscreenValue";

    boolean initialize(@NonNull Intent intent);

    boolean onConnectedToService();

    void onRequestFailed();

    void onRequestSucceeded(boolean z);
}
