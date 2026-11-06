package org.apache.commons.lang3;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Random;
import java.util.function.Supplier;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.text.RandomStringGenerator;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RandomStringUtils {
    private static final char[] ALPHANUMERICAL_CHARS;
    private static final int ASCII_0 = 48;
    private static final int ASCII_9 = 57;
    private static final int ASCII_A = 65;
    private static final int ASCII_z = 122;
    private static final int BASE_CACHE_SIZE_PADDING = 10;
    private static final int BITS_TO_BYTES_DIVISOR = 5;
    private static final int CACHE_PADDING_BITS = 3;
    private static RandomStringUtils INSECURE;
    private static RandomStringUtils SECURE;
    private static RandomStringUtils SECURE_STRONG;
    private static final Supplier<RandomUtils> SECURE_SUPPLIER;
    private final Supplier<RandomUtils> random;

    static {
        RandomUtils$$ExternalSyntheticLambda0 randomUtils$$ExternalSyntheticLambda0 = new RandomUtils$$ExternalSyntheticLambda0(1);
        SECURE_SUPPLIER = randomUtils$$ExternalSyntheticLambda0;
        INSECURE = new RandomStringUtils(new RandomUtils$$ExternalSyntheticLambda0(2));
        SECURE = new RandomStringUtils(randomUtils$$ExternalSyntheticLambda0);
        SECURE_STRONG = new RandomStringUtils(new RandomUtils$$ExternalSyntheticLambda0(3));
        ALPHANUMERICAL_CHARS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

    @Deprecated
    public RandomStringUtils() {
        this(SECURE_SUPPLIER);
    }

    public static RandomStringUtils insecure() {
        return INSECURE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String random(int i, int i2, int i3, boolean z, boolean z2, char[] cArr, Random random) {
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Requested random string length ", " is less than 0."));
            return null;
        }
        if (cArr != 0 && cArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("The chars array must not be empty");
            return null;
        }
        int i4 = RandomStringGenerator.Builder.DEFAULT_MAXIMUM_CODE_POINT;
        if (i2 == 0 && i3 == 0) {
            if (cArr != 0) {
                i3 = cArr.length;
            } else if (z || z2) {
                i2 = 32;
                i3 = 123;
            } else {
                i3 = 1114111;
            }
        } else {
            if (i3 <= i2) {
                Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(i3, i2, "Parameter end (", ") must be greater than start (", MarkdownConstants.RIGHT_PARENTHESIS));
                return null;
            }
            if (i2 < 0 || i3 < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("Character positions MUST be >= 0");
                return null;
            }
        }
        if (i3 <= 1114111) {
            i4 = i3;
        }
        if (cArr == 0 && i4 <= 127) {
            if (z && z2 && i2 <= 48 && i4 >= 123) {
                return random(i, 0, 0, false, false, ALPHANUMERICAL_CHARS, random);
            }
            if ((z2 && i4 <= 48) || (z && i4 <= 65)) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i4, "Parameter end (", ") must be greater then (48) for generating digits or greater then (65) for generating letters."));
                return null;
            }
            if (z && z2) {
                i2 = Math.max(48, i2);
                i4 = Math.min(123, i4);
            } else if (z2) {
                i2 = Math.max(48, i2);
                i4 = Math.min(58, i4);
            } else if (z) {
                i2 = Math.max(65, i2);
                i4 = Math.min(123, i4);
            }
        }
        StringBuilder sb = new StringBuilder(i);
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i4 - i2);
        CachedRandomBits cachedRandomBits = new CachedRandomBits((int) Math.min((((i * numberOfLeadingZeros) + 3) / 5) + 10, 429496739L), random);
        while (true) {
            int i5 = i - 1;
            if (i == 0) {
                return sb.toString();
            }
            char nextBits = cachedRandomBits.nextBits(numberOfLeadingZeros) + i2;
            if (nextBits < i4) {
                if (cArr == 0) {
                    int type = Character.getType(nextBits);
                    if (type != 0 && type != 18 && type != 19) {
                    }
                } else {
                    nextBits = cArr[nextBits];
                }
                int charCount = Character.charCount(nextBits);
                if (i5 != 0 || charCount <= 1) {
                    if ((z && Character.isLetter(nextBits)) || ((z2 && Character.isDigit(nextBits)) || (!z && !z2))) {
                        sb.appendCodePoint(nextBits);
                        i = charCount == 2 ? i - 2 : i5;
                    }
                }
            }
        }
    }

    @Deprecated
    public static String randomAlphabetic(int i) {
        return secure().nextAlphabetic(i);
    }

    @Deprecated
    public static String randomAlphanumeric(int i) {
        return secure().nextAlphanumeric(i);
    }

    @Deprecated
    public static String randomAscii(int i) {
        return secure().nextAscii(i);
    }

    @Deprecated
    public static String randomGraph(int i) {
        return secure().nextGraph(i);
    }

    @Deprecated
    public static String randomNumeric(int i) {
        return secure().nextNumeric(i);
    }

    @Deprecated
    public static String randomPrint(int i) {
        return secure().nextPrint(i);
    }

    private RandomUtils randomUtils() {
        return this.random.get();
    }

    public static RandomStringUtils secure() {
        return SECURE;
    }

    public static RandomStringUtils secureStrong() {
        return SECURE_STRONG;
    }

    public String next(int i, char... cArr) {
        return cArr == null ? random(i, 0, 0, false, false, null, random()) : random(i, 0, cArr.length, false, false, cArr, random());
    }

    public String nextAlphabetic(int i, int i2) {
        return nextAlphabetic(randomUtils().randomInt(i, i2));
    }

    public String nextAlphanumeric(int i, int i2) {
        return nextAlphanumeric(randomUtils().randomInt(i, i2));
    }

    public String nextAscii(int i) {
        return next(i, 32, 127, false, false);
    }

    public String nextGraph(int i) {
        return next(i, 33, 126, false, false);
    }

    public String nextNumeric(int i, int i2) {
        return nextNumeric(randomUtils().randomInt(i, i2));
    }

    public String nextPrint(int i) {
        return next(i, 32, 126, false, false);
    }

    public String toString() {
        return "RandomStringUtils [random=" + random() + MarkdownConstants.RIGHT_BRACKET;
    }

    private RandomStringUtils(Supplier<RandomUtils> supplier) {
        this.random = supplier;
    }

    @Deprecated
    public static String randomAlphabetic(int i, int i2) {
        return secure().nextAlphabetic(i, i2);
    }

    @Deprecated
    public static String randomAlphanumeric(int i, int i2) {
        return secure().nextAlphanumeric(i, i2);
    }

    @Deprecated
    public static String randomAscii(int i, int i2) {
        return secure().nextAscii(i, i2);
    }

    @Deprecated
    public static String randomGraph(int i, int i2) {
        return secure().nextGraph(i, i2);
    }

    @Deprecated
    public static String randomNumeric(int i, int i2) {
        return secure().nextNumeric(i, i2);
    }

    @Deprecated
    public static String randomPrint(int i, int i2) {
        return secure().nextPrint(i, i2);
    }

    public String nextAlphabetic(int i) {
        return next(i, true, false);
    }

    public String nextAlphanumeric(int i) {
        return next(i, true, true);
    }

    public String nextAscii(int i, int i2) {
        return nextAscii(randomUtils().randomInt(i, i2));
    }

    public String nextGraph(int i, int i2) {
        return nextGraph(randomUtils().randomInt(i, i2));
    }

    public String nextNumeric(int i) {
        return next(i, false, true);
    }

    public String nextPrint(int i, int i2) {
        return nextPrint(randomUtils().randomInt(i, i2));
    }

    public String next(int i, boolean z, boolean z2) {
        return next(i, 0, 0, z, z2);
    }

    public String next(int i) {
        return next(i, false, false);
    }

    public String next(int i, int i2, int i3, boolean z, boolean z2) {
        return random(i, i2, i3, z, z2, null, random());
    }

    public String next(int i, int i2, int i3, boolean z, boolean z2, char... cArr) {
        return random(i, i2, i3, z, z2, cArr, random());
    }

    public String next(int i, String str) {
        if (str == null) {
            return random(i, 0, 0, false, false, null, random());
        }
        return next(i, str.toCharArray());
    }

    @Deprecated
    public static String random(int i, boolean z, boolean z2) {
        return secure().next(i, z, z2);
    }

    @Deprecated
    public static String random(int i, char... cArr) {
        return secure().next(i, cArr);
    }

    @Deprecated
    public static String random(int i, int i2, int i3, boolean z, boolean z2) {
        return secure().next(i, i2, i3, z, z2);
    }

    @Deprecated
    public static String random(int i, int i2, int i3, boolean z, boolean z2, char... cArr) {
        return secure().next(i, i2, i3, z, z2, cArr);
    }

    @Deprecated
    public static String random(int i) {
        return secure().next(i);
    }

    @Deprecated
    public static String random(int i, String str) {
        return secure().next(i, str);
    }

    private Random random() {
        return randomUtils().random();
    }
}
