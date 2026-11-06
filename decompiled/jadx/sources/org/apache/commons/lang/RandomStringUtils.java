package org.apache.commons.lang;

import java.util.Random;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RandomStringUtils {
    private static final Random RANDOM = new Random();

    public static String random(int i, int i2, int i3, boolean z, boolean z2, char[] cArr, Random random) {
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer("Requested random string length ");
            stringBuffer.append(i);
            stringBuffer.append(" is less than 0.");
            XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
            return null;
        }
        if (i2 == 0 && i3 == 0) {
            if (z || z2) {
                i3 = 123;
                i2 = 32;
            } else {
                i2 = 0;
                i3 = Integer.MAX_VALUE;
            }
        }
        char[] cArr2 = new char[i];
        int i4 = i3 - i2;
        while (true) {
            int i5 = i - 1;
            if (i == 0) {
                return new String(cArr2);
            }
            char nextInt = cArr == null ? (char) (random.nextInt(i4) + i2) : cArr[random.nextInt(i4) + i2];
            if ((z && Character.isLetter(nextInt)) || ((z2 && Character.isDigit(nextInt)) || (!z && !z2))) {
                if (nextInt < 56320 || nextInt > 57343) {
                    if (nextInt < 55296 || nextInt > 56191) {
                        if (nextInt < 56192 || nextInt > 56319) {
                            cArr2[i5] = nextInt;
                            i = i5;
                        }
                    } else if (i5 != 0) {
                        cArr2[i5] = (char) (random.nextInt(128) + 56320);
                        i -= 2;
                        cArr2[i] = nextInt;
                    }
                } else if (i5 != 0) {
                    cArr2[i5] = nextInt;
                    i -= 2;
                    cArr2[i] = (char) (random.nextInt(128) + 55296);
                }
            }
        }
    }

    public static String randomAlphabetic(int i) {
        return random(i, true, false);
    }

    public static String randomAlphanumeric(int i) {
        return random(i, true, true);
    }

    public static String randomAscii(int i) {
        return random(i, 32, 127, false, false);
    }

    public static String randomNumeric(int i) {
        return random(i, false, true);
    }

    public static String random(int i, boolean z, boolean z2) {
        return random(i, 0, 0, z, z2);
    }

    public static String random(int i, int i2, int i3, boolean z, boolean z2) {
        return random(i, i2, i3, z, z2, null, RANDOM);
    }

    public static String random(int i, int i2, int i3, boolean z, boolean z2, char[] cArr) {
        return random(i, i2, i3, z, z2, cArr, RANDOM);
    }

    public static String random(int i) {
        return random(i, false, false);
    }

    public static String random(int i, String str) {
        if (str == null) {
            return random(i, 0, 0, false, false, null, RANDOM);
        }
        return random(i, str.toCharArray());
    }

    public static String random(int i, char[] cArr) {
        if (cArr == null) {
            return random(i, 0, 0, false, false, null, RANDOM);
        }
        return random(i, 0, cArr.length, false, false, cArr, RANDOM);
    }
}
