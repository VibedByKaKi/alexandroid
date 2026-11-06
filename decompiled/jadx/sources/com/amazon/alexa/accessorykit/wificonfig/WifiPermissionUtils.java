package com.amazon.alexa.accessorykit.wificonfig;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class WifiPermissionUtils {
    private WifiPermissionUtils() {
    }

    public static List<String> getMissingP2pPermissions(Context context) {
        Preconditions.notNull(context, "context");
        ArrayList arrayList = new ArrayList();
        for (String str : getRequiredP2pPermissions()) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static List<String> getRequiredP2pPermissions() {
        ArrayList m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT >= 33) {
            m.add("android.permission.NEARBY_WIFI_DEVICES");
        }
        return m;
    }

    public static boolean hasP2pPermissions(Context context) {
        return getMissingP2pPermissions(context).isEmpty();
    }
}
