package org.joda.time.format;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(Appendable appendable, int i, int i2) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i >= 100) {
            int log = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / LOG_10)) + 1;
            while (i2 > log) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
            return;
        }
        while (i2 > 2) {
            appendable.append('0');
            i2--;
        }
        int i3 = ((i + 1) * 13421772) >> 27;
        appendable.append((char) (i3 + 48));
        appendable.append((char) (((i - (i3 << 3)) - (i3 << 1)) + 48));
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else {
            if (i >= 100) {
                appendable.append(Integer.toString(i));
                return;
            }
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        }
    }

    public static int calculateDigitCount(long j) {
        int log;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                return 20;
            }
            log = calculateDigitCount(-j);
        } else {
            if (j < 10) {
                return 1;
            }
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
            if (j < 10000) {
                return 4;
            }
            log = (int) (Math.log(j) / LOG_10);
        }
        return log + 1;
    }

    public static String createErrorMessage(String str, int i) {
        String concat = str.length() <= i + 35 ? str : str.substring(0, i + 32).concat("...");
        if (i <= 0) {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m('\"', "Invalid format: \"", concat);
        }
        if (i >= str.length()) {
            return a$$ExternalSyntheticOutline0.m("Invalid format: \"", concat, "\" is too short");
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Invalid format: \"", concat, "\" is malformed at \"");
        m2m.append(concat.substring(i));
        m2m.append('\"');
        return m2m.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - '0';
        return (charSequence.charAt(i + 1) + ((charAt << 3) + (charAt << 1))) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i, int i2) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    writer.write(48);
                    i2--;
                }
                writer.write("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                writer.write(48);
                i2--;
            }
            writer.write(i + 48);
            return;
        }
        if (i >= 100) {
            int log = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / LOG_10)) + 1;
            while (i2 > log) {
                writer.write(48);
                i2--;
            }
            writer.write(Integer.toString(i));
            return;
        }
        while (i2 > 2) {
            writer.write(48);
            i2--;
        }
        int i3 = ((i + 1) * 13421772) >> 27;
        writer.write(i3 + 48);
        writer.write(((i - (i3 << 3)) - (i3 << 1)) + 48);
    }

    public static void writeUnpaddedInteger(Writer writer, int i) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            writer.write(i + 48);
        } else {
            if (i >= 100) {
                writer.write(Integer.toString(i));
                return;
            }
            int i2 = ((i + 1) * 13421772) >> 27;
            writer.write(i2 + 48);
            writer.write(((i - (i2 << 3)) - (i2 << 1)) + 48);
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j) throws IOException {
        int i = (int) j;
        if (i == j) {
            writeUnpaddedInteger(writer, i);
        } else {
            writer.write(Long.toString(j));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j) throws IOException {
        int i = (int) j;
        if (i == j) {
            appendUnpaddedInteger(appendable, i);
        } else {
            appendable.append(Long.toString(j));
        }
    }

    public static void writePaddedInteger(Writer writer, long j, int i) throws IOException {
        int i2 = (int) j;
        if (i2 == j) {
            writePaddedInteger(writer, i2, i);
            return;
        }
        if (i <= 19) {
            writer.write(Long.toString(j));
            return;
        }
        if (j < 0) {
            writer.write(45);
            if (j == Long.MIN_VALUE) {
                while (i > 19) {
                    writer.write(48);
                    i--;
                }
                writer.write("9223372036854775808");
                return;
            }
            j = -j;
        }
        int log = ((int) (Math.log(j) / LOG_10)) + 1;
        while (i > log) {
            writer.write(48);
            i--;
        }
        writer.write(Long.toString(j));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i, int i2) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j, int i) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j, i);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(Appendable appendable, long j, int i) throws IOException {
        int i2 = (int) j;
        if (i2 == j) {
            appendPaddedInteger(appendable, i2, i);
            return;
        }
        if (i <= 19) {
            appendable.append(Long.toString(j));
            return;
        }
        if (j < 0) {
            appendable.append('-');
            if (j == Long.MIN_VALUE) {
                while (i > 19) {
                    appendable.append('0');
                    i--;
                }
                appendable.append("9223372036854775808");
                return;
            }
            j = -j;
        }
        int log = ((int) (Math.log(j) / LOG_10)) + 1;
        while (i > log) {
            appendable.append('0');
            i--;
        }
        appendable.append(Long.toString(j));
    }
}
