package com.amazon.alexa.routing.api;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class BundleUtils {
    private BundleUtils() {
    }

    public static boolean equals(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!equals((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            } else if (obj2 != null && bundle2.containsKey(str)) {
                return false;
            }
        }
        return true;
    }
}
