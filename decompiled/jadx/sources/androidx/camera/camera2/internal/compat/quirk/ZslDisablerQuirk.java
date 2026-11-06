package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ZslDisablerQuirk implements Quirk {
    private static final List<String> AFFECTED_SAMSUNG_MODEL = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");
    private static final List<String> AFFECTED_XIAOMI_MODEL = Arrays.asList("MI 8");

    private static boolean isAffectedModel(List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAffectedSamsungDevices() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_SAMSUNG_MODEL);
    }

    private static boolean isAffectedXiaoMiDevices() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_XIAOMI_MODEL);
    }

    public static boolean load() {
        return isAffectedSamsungDevices() || isAffectedXiaoMiDevices();
    }
}
