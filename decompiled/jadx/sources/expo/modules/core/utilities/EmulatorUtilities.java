package expo.modules.core.utilities;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/core/utilities/EmulatorUtilities;", "", "<init>", "()V", "isRunningOnEmulator", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EmulatorUtilities {

    @NotNull
    public static final EmulatorUtilities INSTANCE = new EmulatorUtilities();

    private EmulatorUtilities() {
    }

    public final boolean isRunningOnEmulator() {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean contains$default5;
        boolean contains$default6;
        boolean contains$default7;
        boolean contains$default8;
        boolean contains$default9;
        boolean contains$default10;
        boolean contains$default11;
        boolean contains$default12;
        boolean contains$default13;
        boolean contains$default14;
        boolean contains$default15;
        boolean contains$default16;
        boolean contains$default17;
        boolean contains$default18;
        boolean contains$default19;
        boolean startsWith$default3;
        boolean startsWith$default4;
        String str = Build.FINGERPRINT;
        str.getClass();
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "generic", false, 2, null);
        if (startsWith$default) {
            return true;
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "unknown", false, 2, null);
        if (startsWith$default2) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        contains$default = StringsKt__StringsKt.contains$default(str2, "google_sdk", false, 2, (Object) null);
        if (contains$default) {
            return true;
        }
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        contains$default2 = StringsKt__StringsKt.contains$default(lowerCase, "droid4x", false, 2, (Object) null);
        if (contains$default2) {
            return true;
        }
        contains$default3 = StringsKt__StringsKt.contains$default(str2, "Emulator", false, 2, (Object) null);
        if (contains$default3) {
            return true;
        }
        contains$default4 = StringsKt__StringsKt.contains$default(str2, "Android SDK built for x86", false, 2, (Object) null);
        if (contains$default4) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        contains$default5 = StringsKt__StringsKt.contains$default(str3, "Genymotion", false, 2, (Object) null);
        if (contains$default5) {
            return true;
        }
        String str4 = Build.HARDWARE;
        str4.getClass();
        contains$default6 = StringsKt__StringsKt.contains$default(str4, "goldfish", false, 2, (Object) null);
        if (contains$default6) {
            return true;
        }
        contains$default7 = StringsKt__StringsKt.contains$default(str4, "ranchu", false, 2, (Object) null);
        if (contains$default7) {
            return true;
        }
        contains$default8 = StringsKt__StringsKt.contains$default(str4, "vbox86", false, 2, (Object) null);
        if (contains$default8) {
            return true;
        }
        String str5 = Build.PRODUCT;
        str5.getClass();
        contains$default9 = StringsKt__StringsKt.contains$default(str5, "sdk", false, 2, (Object) null);
        if (contains$default9) {
            return true;
        }
        contains$default10 = StringsKt__StringsKt.contains$default(str5, "google_sdk", false, 2, (Object) null);
        if (contains$default10) {
            return true;
        }
        contains$default11 = StringsKt__StringsKt.contains$default(str5, "sdk_google", false, 2, (Object) null);
        if (contains$default11) {
            return true;
        }
        contains$default12 = StringsKt__StringsKt.contains$default(str5, "sdk_x86", false, 2, (Object) null);
        if (contains$default12) {
            return true;
        }
        contains$default13 = StringsKt__StringsKt.contains$default(str5, "vbox86p", false, 2, (Object) null);
        if (contains$default13) {
            return true;
        }
        contains$default14 = StringsKt__StringsKt.contains$default(str5, "emulator", false, 2, (Object) null);
        if (contains$default14) {
            return true;
        }
        contains$default15 = StringsKt__StringsKt.contains$default(str5, "simulator", false, 2, (Object) null);
        if (contains$default15) {
            return true;
        }
        String str6 = Build.BOARD;
        str6.getClass();
        String lowerCase2 = str6.toLowerCase(locale);
        lowerCase2.getClass();
        contains$default16 = StringsKt__StringsKt.contains$default(lowerCase2, "nox", false, 2, (Object) null);
        if (contains$default16) {
            return true;
        }
        String str7 = Build.BOOTLOADER;
        str7.getClass();
        String lowerCase3 = str7.toLowerCase(locale);
        lowerCase3.getClass();
        contains$default17 = StringsKt__StringsKt.contains$default(lowerCase3, "nox", false, 2, (Object) null);
        if (contains$default17) {
            return true;
        }
        String lowerCase4 = str4.toLowerCase(locale);
        lowerCase4.getClass();
        contains$default18 = StringsKt__StringsKt.contains$default(lowerCase4, "nox", false, 2, (Object) null);
        if (contains$default18) {
            return true;
        }
        String lowerCase5 = str5.toLowerCase(locale);
        lowerCase5.getClass();
        contains$default19 = StringsKt__StringsKt.contains$default(lowerCase5, "nox", false, 2, (Object) null);
        if (contains$default19) {
            return true;
        }
        String str8 = Build.BRAND;
        str8.getClass();
        startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str8, "generic", false, 2, null);
        if (!startsWith$default3) {
            return false;
        }
        String str9 = Build.DEVICE;
        str9.getClass();
        startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(str9, "generic", false, 2, null);
        return startsWith$default4;
    }
}
