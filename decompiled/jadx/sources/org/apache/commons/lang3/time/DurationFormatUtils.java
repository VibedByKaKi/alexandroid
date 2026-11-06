package org.apache.commons.lang3.time;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.TimeZone;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.time.DurationFormatUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DurationFormatUtils {
    static final String H = "H";
    private static final int HOURS_PER_DAY = 24;
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
    static final String M = "M";
    private static final int MINUTES_PER_HOUR = 60;
    static final String S = "S";
    private static final int SECONDS_PER_MINUTES = 60;
    static final String d = "d";
    static final String m = "m";
    static final String s = "s";
    static final String y = "y";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Token {
        private static final Token[] EMPTY_ARRAY = new Token[0];
        private int count;
        private int optionalIndex;
        private final CharSequence value;

        public Token(CharSequence charSequence, boolean z, int i) {
            this.optionalIndex = -1;
            Objects.requireNonNull(charSequence, "value");
            this.value = charSequence;
            this.count = 1;
            if (z) {
                this.optionalIndex = i;
            }
        }

        public static boolean containsTokenWithValue(Token[] tokenArr, final Object obj) {
            return Stream.of((Object[]) tokenArr).anyMatch(new Predicate() { // from class: org.apache.commons.lang3.time.DurationFormatUtils$Token$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    boolean lambda$containsTokenWithValue$0;
                    lambda$containsTokenWithValue$0 = DurationFormatUtils.Token.lambda$containsTokenWithValue$0(obj, (DurationFormatUtils.Token) obj2);
                    return lambda$containsTokenWithValue$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$containsTokenWithValue$0(Object obj, Token token) {
            return token.getValue() == obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Token) {
                Token token = (Token) obj;
                if (this.value.getClass() != token.value.getClass() || this.count != token.count) {
                    return false;
                }
                CharSequence charSequence = this.value;
                if (charSequence instanceof StringBuilder) {
                    return charSequence.toString().equals(token.value.toString());
                }
                boolean z = charSequence instanceof Number;
                CharSequence charSequence2 = token.value;
                if (z) {
                    return charSequence.equals(charSequence2);
                }
                if (charSequence == charSequence2) {
                    return true;
                }
            }
            return false;
        }

        public int getCount() {
            return this.count;
        }

        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public void increment() {
            this.count++;
        }

        public String toString() {
            return StringUtils.repeat(this.value.toString(), this.count);
        }
    }

    @Deprecated
    public DurationFormatUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017c A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String format(org.apache.commons.lang3.time.DurationFormatUtils.Token[] r28, long r29, long r31, long r33, long r35, long r37, long r39, long r41, boolean r43) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.DurationFormatUtils.format(org.apache.commons.lang3.time.DurationFormatUtils$Token[], long, long, long, long, long, long, long, boolean):java.lang.String");
    }

    public static String formatDuration(long j, String str, boolean z) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Validate.inclusiveBetween(0L, Long.MAX_VALUE, j, "durationMillis must not be negative");
        Token[] lexx = lexx(str);
        if (Token.containsTokenWithValue(lexx, "d")) {
            j3 = j / 86400000;
            j2 = j - (86400000 * j3);
        } else {
            j2 = j;
            j3 = 0;
        }
        if (Token.containsTokenWithValue(lexx, H)) {
            long j7 = j2 / 3600000;
            j2 -= 3600000 * j7;
            j4 = j7;
        } else {
            j4 = 0;
        }
        if (Token.containsTokenWithValue(lexx, m)) {
            long j8 = j2 / 60000;
            j2 -= 60000 * j8;
            j5 = j8;
        } else {
            j5 = 0;
        }
        if (Token.containsTokenWithValue(lexx, "s")) {
            j6 = j2 / 1000;
            j2 -= 1000 * j6;
        } else {
            j6 = 0;
        }
        return format(lexx, 0L, 0L, j3, j4, j5, j6, j2, z);
    }

    public static String formatDurationHMS(long j) {
        return formatDuration(j, "HH:mm:ss.SSS");
    }

    public static String formatDurationISO(long j) {
        return formatDuration(j, ISO_EXTENDED_FORMAT_PATTERN, false);
    }

    public static String formatDurationWords(long j, boolean z, boolean z2) {
        String formatDuration = formatDuration(j, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z) {
            formatDuration = a$$ExternalSyntheticOutline0.m(" ", formatDuration);
            Strings strings = Strings.CS;
            String replaceOnce = strings.replaceOnce(formatDuration, " 0 days", "");
            if (replaceOnce.length() != formatDuration.length()) {
                String replaceOnce2 = strings.replaceOnce(replaceOnce, " 0 hours", "");
                formatDuration = replaceOnce2.length() != replaceOnce.length() ? strings.replaceOnce(replaceOnce2, " 0 minutes", "") : replaceOnce;
            }
            if (!formatDuration.isEmpty()) {
                formatDuration = formatDuration.substring(1);
            }
        }
        if (z2) {
            Strings strings2 = Strings.CS;
            String replaceOnce3 = strings2.replaceOnce(formatDuration, " 0 seconds", "");
            if (replaceOnce3.length() != formatDuration.length()) {
                formatDuration = strings2.replaceOnce(replaceOnce3, " 0 minutes", "");
                if (formatDuration.length() != replaceOnce3.length()) {
                    String replaceOnce4 = strings2.replaceOnce(formatDuration, " 0 hours", "");
                    if (replaceOnce4.length() != formatDuration.length()) {
                        formatDuration = strings2.replaceOnce(replaceOnce4, " 0 days", "");
                    }
                } else {
                    formatDuration = replaceOnce3;
                }
            }
        }
        String m2 = a$$ExternalSyntheticOutline0.m(" ", formatDuration);
        Strings strings3 = Strings.CS;
        return strings3.replaceOnce(strings3.replaceOnce(strings3.replaceOnce(strings3.replaceOnce(m2, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String formatPeriod(long j, long j2, String str, boolean z, TimeZone timeZone) {
        int i;
        Validate.isTrue(j <= j2, "startMillis must not be greater than endMillis", new Object[0]);
        Token[] lexx = lexx(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j2));
        long j3 = calendar2.get(14) - calendar.get(14);
        int i2 = calendar2.get(13) - calendar.get(13);
        int i3 = calendar2.get(12) - calendar.get(12);
        int i4 = calendar2.get(11) - calendar.get(11);
        int i5 = calendar2.get(5) - calendar.get(5);
        int i6 = calendar2.get(2) - calendar.get(2);
        int i7 = calendar2.get(1) - calendar.get(1);
        while (j3 < 0) {
            j3 += 1000;
            i2--;
        }
        while (i2 < 0) {
            i2 += 60;
            i3--;
        }
        while (i3 < 0) {
            i3 += 60;
            i4--;
        }
        while (i4 < 0) {
            i4 += 24;
            i5--;
        }
        if (Token.containsTokenWithValue(lexx, "M")) {
            while (i5 < 0) {
                i5 += calendar.getActualMaximum(5);
                i6--;
                calendar.add(2, 1);
            }
            while (i6 < 0) {
                i6 += 12;
                i7--;
            }
            if (!Token.containsTokenWithValue(lexx, "y") && i7 != 0) {
                while (i7 != 0) {
                    i6 += i7 * 12;
                    i7 = 0;
                }
            }
        } else {
            if (!Token.containsTokenWithValue(lexx, "y")) {
                int i8 = calendar2.get(1);
                if (i6 < 0) {
                    i8--;
                }
                while (calendar.get(1) != i8) {
                    int actualMaximum = (calendar.getActualMaximum(6) - calendar.get(6)) + i5;
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum++;
                    }
                    calendar.add(1, 1);
                    i5 = calendar.get(6) + actualMaximum;
                }
                i7 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                i5 += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i6 = 0;
            while (i5 < 0) {
                i5 += calendar.getActualMaximum(5);
                i6--;
                calendar.add(2, 1);
            }
        }
        if (!Token.containsTokenWithValue(lexx, "d")) {
            i4 += i5 * 24;
            i5 = 0;
        }
        if (!Token.containsTokenWithValue(lexx, H)) {
            i3 += i4 * 60;
            i4 = 0;
        }
        if (!Token.containsTokenWithValue(lexx, m)) {
            i2 += i3 * 60;
            i3 = 0;
        }
        if (Token.containsTokenWithValue(lexx, "s")) {
            i = i2;
        } else {
            j3 += i2 * 1000;
            i = 0;
        }
        return format(lexx, i7, i6, i5, i4, i3, i, j3, z);
    }

    public static String formatPeriodISO(long j, long j2) {
        return formatPeriod(j, j2, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }

    public static Token[] lexx(String str) {
        String str2;
        ArrayList arrayList = new ArrayList(str.length());
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        StringBuilder sb = null;
        Token token = null;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!z || charAt == '\'') {
                if (charAt != '\'') {
                    if (charAt == 'H') {
                        str2 = H;
                    } else if (charAt == 'M') {
                        str2 = "M";
                    } else if (charAt == 'S') {
                        str2 = "S";
                    } else if (charAt != '[') {
                        if (charAt == ']') {
                            if (!z2) {
                                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Attempting to close unopened optional block at index: "));
                                return null;
                            }
                            z2 = false;
                        } else if (charAt == 'd') {
                            str2 = "d";
                        } else if (charAt == 'm') {
                            str2 = m;
                        } else if (charAt == 's') {
                            str2 = "s";
                        } else if (charAt != 'y') {
                            if (sb == null) {
                                sb = new StringBuilder();
                                arrayList.add(new Token(sb, z2, i));
                            }
                            sb.append(charAt);
                        } else {
                            str2 = "y";
                        }
                        str2 = null;
                    } else {
                        if (z2) {
                            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Nested optional block at index: "));
                            return null;
                        }
                        i++;
                        str2 = null;
                        z2 = true;
                    }
                } else if (z) {
                    z = false;
                    sb = null;
                    str2 = null;
                } else {
                    sb = new StringBuilder();
                    arrayList.add(new Token(sb, z2, i));
                    str2 = null;
                    z = true;
                }
                if (str2 != null) {
                    if (token == null || !token.getValue().equals(str2)) {
                        token = new Token(str2, z2, i);
                        arrayList.add(token);
                    } else {
                        token.increment();
                    }
                    sb = null;
                }
            } else {
                sb.append(charAt);
            }
        }
        if (z) {
            Single$$ExternalSyntheticBUOutline0.m$3("Unmatched quote in format: ".concat(str));
            return null;
        }
        if (!z2) {
            return (Token[]) arrayList.toArray(Token.EMPTY_ARRAY);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unmatched optional in format: ".concat(str));
        return null;
    }

    private static String paddedValue(long j, boolean z, int i) {
        String l = Long.toString(j);
        return z ? StringUtils.leftPad(l, i, '0') : l;
    }

    public static String formatDuration(long j, String str) {
        return formatDuration(j, str, true);
    }

    public static String formatPeriod(long j, long j2, String str) {
        return formatPeriod(j, j2, str, true, TimeZone.getDefault());
    }
}
