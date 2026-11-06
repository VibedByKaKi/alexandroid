package com.amazon.deecomms.common.util;

import android.content.Context;
import android.provider.Settings;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class PlatformUtils {
    public static PlatformUtils getInstance() {
        return Utils.isNougatAndAbove() ? new PlatformUtils24() : Utils.isLollipopAndAbove() ? new PlatformUtils21() : new PlatformUtils19();
    }

    public boolean isDoNotDisturbActive(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), Constants.DND_MODE, 0) != 0;
    }

    public abstract void performRingerVibration(Context context);

    public abstract void stopRingerVibration(Context context);
}
