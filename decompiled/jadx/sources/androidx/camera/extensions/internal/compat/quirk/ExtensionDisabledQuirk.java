package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import com.amazon.alexa.ra.core.data.model.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ExtensionDisabledQuirk implements Quirk {
    private static boolean isAdvancedExtenderSupported() {
        return ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_2) && ExtensionVersion.isAdvancedExtenderSupported();
    }

    private static boolean isMoto() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean isPixel5() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isRealme() {
        return "realme".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean isSamsungA52s5g() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "a52sxq".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean load() {
        return isPixel5() || isMoto() || isRealme() || isSamsungA52s5g();
    }

    private static boolean shouldDisableForSamsungA52s5g(@NonNull String str) {
        return str.equals(Constants.FEEDBACK_TYPE_DISLIKE);
    }

    public boolean shouldDisableExtension(@NonNull String str) {
        if (isPixel5() && !isAdvancedExtenderSupported()) {
            return true;
        }
        if (isMoto() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return true;
        }
        if (isRealme() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return true;
        }
        if (isSamsungA52s5g()) {
            return shouldDisableForSamsungA52s5g(str);
        }
        return false;
    }
}
