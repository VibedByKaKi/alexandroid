package com.amazon.alexa.device.setup.echo.bouncycastle.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class IPAddress {
    private static boolean isMaskValue(String str, int i) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        return parseInt >= 0 && parseInt <= i;
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String concat = str.concat(".");
        int i = 0;
        int i2 = 0;
        while (i < concat.length() && (indexOf = concat.indexOf(46, i)) > i) {
            if (i2 == 4) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(concat.substring(i, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i = indexOf + 1;
                    i2++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return i2 == 4;
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        return indexOf > 0 && isValidIPv4(str.substring(0, indexOf)) && (isValidIPv4(substring) || isMaskValue(substring, 32));
    }

    public static boolean isValidIPv6(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String concat = str.concat(":");
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < concat.length() && (indexOf = concat.indexOf(58, i)) >= i) {
            if (i2 == 8) {
                return false;
            }
            if (i != indexOf) {
                String substring = concat.substring(i, indexOf);
                if (indexOf != concat.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = Integer.parseInt(concat.substring(i, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                }
                if (!isValidIPv4(substring)) {
                    return false;
                }
                i2++;
            } else {
                if (indexOf != 1 && indexOf != concat.length() - 1 && z) {
                    return false;
                }
                z = true;
            }
            i = indexOf + 1;
            i2++;
        }
        return i2 == 8 || z;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        return indexOf > 0 && isValidIPv6(str.substring(0, indexOf)) && (isValidIPv6(substring) || isMaskValue(substring, 128));
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
