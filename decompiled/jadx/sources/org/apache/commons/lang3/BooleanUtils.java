package org.apache.commons.lang3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.lang3.math.NumberUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BooleanUtils {
    private static final List<Boolean> BOOLEAN_LIST = Collections.unmodifiableList(Arrays.asList(Boolean.FALSE, Boolean.TRUE));
    public static final String FALSE = "false";
    public static final String NO = "no";
    public static final String OFF = "off";
    public static final String ON = "on";
    public static final String TRUE = "true";
    public static final String YES = "yes";

    @Deprecated
    public BooleanUtils() {
    }

    public static Boolean and(Boolean... boolArr) {
        ObjectUtils.requireNonEmpty(boolArr, "array");
        return and(ArrayUtils.toPrimitive(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Boolean[] booleanValues() {
        return new Boolean[]{Boolean.FALSE, Boolean.TRUE};
    }

    public static int compare(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static void forEach(Consumer<Boolean> consumer) {
        values().forEach(consumer);
    }

    public static boolean isFalse(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

    public static boolean isNotFalse(Boolean bool) {
        return !isFalse(bool);
    }

    public static boolean isNotTrue(Boolean bool) {
        return !isTrue(bool);
    }

    public static boolean isTrue(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static Boolean negate(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    public static boolean oneHot(boolean... zArr) {
        ObjectUtils.requireNonEmpty(zArr, "array");
        boolean z = false;
        for (boolean z2 : zArr) {
            if (z2) {
                if (z) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    public static Boolean or(Boolean... boolArr) {
        ObjectUtils.requireNonEmpty(boolArr, "array");
        return or(ArrayUtils.toPrimitive(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean[] primitiveValues() {
        return new boolean[]{false, true};
    }

    public static boolean toBoolean(Integer num, Integer num2, Integer num3) {
        if (num == null) {
            if (num2 == null) {
                return true;
            }
            if (num3 == null) {
                return false;
            }
        } else {
            if (num.equals(num2)) {
                return true;
            }
            if (num.equals(num3)) {
                return false;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The Integer did not match either specified value");
        return false;
    }

    public static boolean toBooleanDefaultIfNull(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    public static Boolean toBooleanObject(String str) {
        Boolean bool;
        if (str == "true") {
            return Boolean.TRUE;
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 1) {
            bool = null;
            char charAt = str.charAt(0);
            if (charAt == 'y' || charAt == 'Y' || charAt == 't' || charAt == 'T' || charAt == '1') {
                return Boolean.TRUE;
            }
            if (charAt == 'n' || charAt == 'N' || charAt == 'f' || charAt == 'F' || charAt == '0') {
                return Boolean.FALSE;
            }
        } else if (length != 2) {
            bool = null;
            if (length == 3) {
                char charAt2 = str.charAt(0);
                char charAt3 = str.charAt(1);
                char charAt4 = str.charAt(2);
                if ((charAt2 == 'y' || charAt2 == 'Y') && ((charAt3 == 'e' || charAt3 == 'E') && (charAt4 == 's' || charAt4 == 'S'))) {
                    return Boolean.TRUE;
                }
                if ((charAt2 == 'o' || charAt2 == 'O') && ((charAt3 == 'f' || charAt3 == 'F') && (charAt4 == 'f' || charAt4 == 'F'))) {
                    return Boolean.FALSE;
                }
            } else if (length == 4) {
                char charAt5 = str.charAt(0);
                char charAt6 = str.charAt(1);
                char charAt7 = str.charAt(2);
                char charAt8 = str.charAt(3);
                if ((charAt5 == 't' || charAt5 == 'T') && ((charAt6 == 'r' || charAt6 == 'R') && ((charAt7 == 'u' || charAt7 == 'U') && (charAt8 == 'e' || charAt8 == 'E')))) {
                    return Boolean.TRUE;
                }
            } else if (length == 5) {
                char charAt9 = str.charAt(0);
                char charAt10 = str.charAt(1);
                char charAt11 = str.charAt(2);
                char charAt12 = str.charAt(3);
                char charAt13 = str.charAt(4);
                if ((charAt9 == 'f' || charAt9 == 'F') && ((charAt10 == 'a' || charAt10 == 'A') && ((charAt11 == 'l' || charAt11 == 'L') && ((charAt12 == 's' || charAt12 == 'S') && (charAt13 == 'e' || charAt13 == 'E'))))) {
                    return Boolean.FALSE;
                }
            }
        } else {
            bool = null;
            char charAt14 = str.charAt(0);
            char charAt15 = str.charAt(1);
            if ((charAt14 == 'o' || charAt14 == 'O') && (charAt15 == 'n' || charAt15 == 'N')) {
                return Boolean.TRUE;
            }
            if ((charAt14 == 'n' || charAt14 == 'N') && (charAt15 == 'o' || charAt15 == 'O')) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static int toInteger(Boolean bool, int i, int i2, int i3) {
        return bool == null ? i3 : bool.booleanValue() ? i : i2;
    }

    public static Integer toIntegerObject(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
    }

    public static String toString(Boolean bool, String str, String str2, String str3) {
        return bool == null ? str3 : bool.booleanValue() ? str : str2;
    }

    public static String toStringOnOff(Boolean bool) {
        return toString(bool, "on", "off", null);
    }

    public static String toStringTrueFalse(Boolean bool) {
        return toString(bool, "true", "false", null);
    }

    public static String toStringYesNo(Boolean bool) {
        return toString(bool, "yes", "no", null);
    }

    public static List<Boolean> values() {
        return BOOLEAN_LIST;
    }

    public static Boolean xor(Boolean... boolArr) {
        ObjectUtils.requireNonEmpty(boolArr, "array");
        return xor(ArrayUtils.toPrimitive(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static String toStringOnOff(boolean z) {
        return toString(z, "on", "off");
    }

    public static String toStringTrueFalse(boolean z) {
        return toString(z, "true", "false");
    }

    public static String toStringYesNo(boolean z) {
        return toString(z, "yes", "no");
    }

    public static int toInteger(boolean z, int i, int i2) {
        return z ? i : i2;
    }

    public static String toString(boolean z, String str, String str2) {
        return z ? str : str2;
    }

    public static int toInteger(boolean z) {
        return z ? 1 : 0;
    }

    public static Integer toIntegerObject(boolean z) {
        return z ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
    }

    public static Integer toIntegerObject(boolean z, Integer num, Integer num2) {
        return z ? num : num2;
    }

    public static Integer toIntegerObject(Boolean bool, Integer num, Integer num2, Integer num3) {
        return bool == null ? num3 : bool.booleanValue() ? num : num2;
    }

    public static boolean and(boolean... zArr) {
        ObjectUtils.requireNonEmpty(zArr, "array");
        for (boolean z : zArr) {
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static boolean or(boolean... zArr) {
        ObjectUtils.requireNonEmpty(zArr, "array");
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean xor(boolean... zArr) {
        ObjectUtils.requireNonEmpty(zArr, "array");
        boolean z = false;
        for (boolean z2 : zArr) {
            z ^= z2;
        }
        return z;
    }

    public static Boolean oneHot(Boolean... boolArr) {
        return Boolean.valueOf(oneHot(ArrayUtils.toPrimitive(boolArr)));
    }

    public static boolean toBoolean(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean toBoolean(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        if (i == i3) {
            return false;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The Integer did not match either specified value");
        return false;
    }

    public static boolean toBoolean(int i) {
        return i != 0;
    }

    public static boolean toBoolean(String str) {
        return toBooleanObject(str) == Boolean.TRUE;
    }

    public static boolean toBoolean(String str, String str2, String str3) {
        if (str == str2) {
            return true;
        }
        if (str == str3) {
            return false;
        }
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.equals(str3)) {
                return false;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The String did not match either specified value");
        return false;
    }

    public static Boolean toBooleanObject(int i, int i2, int i3, int i4) {
        if (i == i2) {
            return Boolean.TRUE;
        }
        if (i == i3) {
            return Boolean.FALSE;
        }
        if (i == i4) {
            return null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The Integer did not match any specified value");
        return null;
    }

    public static Boolean toBooleanObject(Integer num) {
        if (num == null) {
            return null;
        }
        return num.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean toBooleanObject(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            if (num2 == null) {
                return Boolean.TRUE;
            }
            if (num3 == null) {
                return Boolean.FALSE;
            }
            if (num4 == null) {
                return null;
            }
        } else {
            if (num.equals(num2)) {
                return Boolean.TRUE;
            }
            if (num.equals(num3)) {
                return Boolean.FALSE;
            }
            if (num.equals(num4)) {
                return null;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The Integer did not match any specified value");
        return null;
    }

    public static Boolean toBooleanObject(int i) {
        return i == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean toBooleanObject(String str, String str2, String str3, String str4) {
        if (str == null) {
            if (str2 == null) {
                return Boolean.TRUE;
            }
            if (str3 == null) {
                return Boolean.FALSE;
            }
            if (str4 == null) {
                return null;
            }
        } else {
            if (str.equals(str2)) {
                return Boolean.TRUE;
            }
            if (str.equals(str3)) {
                return Boolean.FALSE;
            }
            if (str.equals(str4)) {
                return null;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The String did not match any specified value");
        return null;
    }
}
