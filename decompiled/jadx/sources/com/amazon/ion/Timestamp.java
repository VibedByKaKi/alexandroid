package com.amazon.ion;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.clouddrive.cdasdk.cds.common.TimeGroupBy;
import com.amazon.credentiallocker.ThreadParty;
import com.amazon.deecomms.contacts.util.DeviceContactsFetcher;
import com.amazon.ion.impl._Private_Utils;
import com.amazon.ion.util.IonTextUtils;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.objectweb.asm.signature.SignatureVisitor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Timestamp implements Comparable<Timestamp>, Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean APPLY_OFFSET_NO = false;
    private static final boolean APPLY_OFFSET_YES = true;
    static final int END_OF_DAY = 10;
    static final int END_OF_MINUTES = 16;
    static final int END_OF_MONTH = 7;
    static final int END_OF_SECONDS = 19;
    static final int END_OF_YEAR = 4;
    private static final int FLAG_DAY = 4;
    private static final int FLAG_MINUTE = 8;
    private static final int FLAG_MONTH = 2;
    private static final int FLAG_SECOND = 16;
    private static final int FLAG_YEAR = 1;
    static final long MAXIMUM_TIMESTAMP_IN_EPOCH_SECONDS = 253402300800L;
    static final long MINIMUM_TIMESTAMP_IN_EPOCH_SECONDS = -62135769600L;
    private static final int NO_DAY = 0;
    private static final BigDecimal NO_FRACTIONAL_SECONDS = null;
    private static final int NO_HOURS = 0;
    private static final int NO_MINUTES = 0;
    private static final int NO_MONTH = 0;
    private static final int NO_SECONDS = 0;
    static final String NULL_TIMESTAMP_IMAGE = "null.timestamp";
    private byte _day;
    private BigDecimal _fraction;
    private byte _hour;
    private byte _minute;
    private byte _month;
    private Integer _offset;
    private Precision _precision;
    private byte _second;
    private short _year;
    static final long MINIMUM_TIMESTAMP_IN_MILLIS = -62135769600000L;
    static final BigDecimal MINIMUM_TIMESTAMP_IN_MILLIS_DECIMAL = new BigDecimal(MINIMUM_TIMESTAMP_IN_MILLIS);
    static final long MAXIMUM_TIMESTAMP_IN_MILLIS = 253402300800000L;
    static final BigDecimal MAXIMUM_ALLOWED_TIMESTAMP_IN_MILLIS_DECIMAL = new BigDecimal(MAXIMUM_TIMESTAMP_IN_MILLIS);
    public static final Integer UNKNOWN_OFFSET = null;
    public static final Integer UTC_OFFSET = 0;
    private static final int HASH_SIGNATURE = 1021414227;
    private static final int[] LEAP_DAYS_IN_MONTH = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] NORMAL_DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static final int LEN_OF_NULL_IMAGE = 14;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.ion.Timestamp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$ion$Timestamp$Precision;

        static {
            int[] iArr = new int[Precision.values().length];
            $SwitchMap$com$amazon$ion$Timestamp$Precision = iArr;
            try {
                iArr[Precision.FRACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$ion$Timestamp$Precision[Precision.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$ion$Timestamp$Precision[Precision.MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$ion$Timestamp$Precision[Precision.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$ion$Timestamp$Precision[Precision.MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$ion$Timestamp$Precision[Precision.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Precision {
        YEAR(1),
        MONTH(3),
        DAY(7),
        MINUTE(15),
        SECOND(31),
        FRACTION(31);

        private final int flags;

        Precision(int i) {
            this.flags = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean alwaysUnknownOffset() {
            return ordinal() <= DAY.ordinal();
        }

        public boolean includes(Precision precision) {
            switch (AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision[precision.ordinal()]) {
                case 1:
                case 2:
                    return (this.flags & 16) != 0;
                case 3:
                    return (this.flags & 8) != 0;
                case 4:
                    return (this.flags & 4) != 0;
                case 5:
                    return (this.flags & 2) != 0;
                case 6:
                    return (this.flags & 1) != 0;
                default:
                    OnnxMap$$ExternalSyntheticBUOutline0.m(precision, "unrecognized precision");
                    return false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Timestamp(com.amazon.ion.Timestamp.Precision r4, int r5, int r6, int r7, int r8, int r9, int r10, java.math.BigDecimal r11, java.lang.Integer r12, boolean r13) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 1
            r3._month = r0
            r3._day = r0
            int[] r1 = com.amazon.ion.Timestamp.AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 0
            switch(r1) {
                case 1: goto L1e;
                case 2: goto L1e;
                case 3: goto L39;
                case 4: goto L47;
                case 5: goto L1c;
                case 6: goto L4e;
                default: goto L14;
            }
        L14:
            java.lang.String r3 = "invalid Precision passed to constructor"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r3)
            r3 = 0
            throw r3
        L1c:
            r0 = r2
            goto L47
        L1e:
            if (r11 == 0) goto L30
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L29
            goto L30
        L29:
            java.math.BigDecimal r11 = r11.abs()
            r3._fraction = r11
            goto L33
        L30:
            r11 = 0
            r3._fraction = r11
        L33:
            byte r10 = checkAndCastSecond(r10)
            r3._second = r10
        L39:
            byte r9 = checkAndCastMinute(r9)
            r3._minute = r9
            byte r8 = checkAndCastHour(r8)
            r3._hour = r8
            r3._offset = r12
        L47:
            byte r8 = checkAndCastMonth(r6)
            r3._month = r8
            r2 = r0
        L4e:
            short r8 = checkAndCastYear(r5)
            r3._year = r8
            if (r2 == 0) goto L5c
            byte r5 = checkAndCastDay(r7, r5, r6)
            r3._day = r5
        L5c:
            java.math.BigDecimal r5 = r3._fraction
            com.amazon.ion.Timestamp$Precision r4 = checkFraction(r4, r5)
            r3._precision = r4
            if (r13 == 0) goto L6f
            if (r12 == 0) goto L6f
            int r4 = r12.intValue()
            r3.apply_offset(r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.ion.Timestamp.<init>(com.amazon.ion.Timestamp$Precision, int, int, int, int, int, int, java.math.BigDecimal, java.lang.Integer, boolean):void");
    }

    private Timestamp addMillisForPrecision(long j, Precision precision, boolean z) {
        if (!z && j == 0 && this._precision == precision) {
            return this;
        }
        BigDecimal add = make_localtime().getDecimalMillis().add(BigDecimal.valueOf(j));
        if (this._precision.includes(precision)) {
            precision = this._precision;
        }
        Timestamp timestamp = new Timestamp(add, precision, this._offset);
        int i = z ? 3 : 0;
        BigDecimal bigDecimal = this._fraction;
        if (bigDecimal != null) {
            i = Math.max(i, bigDecimal.scale());
        }
        BigDecimal bigDecimal2 = timestamp._fraction;
        if (bigDecimal2 != null) {
            timestamp._fraction = i == 0 ? null : bigDecimal2.setScale(i, RoundingMode.FLOOR);
        }
        Integer num = this._offset;
        if (num != null && num.intValue() != 0) {
            timestamp.apply_offset(this._offset.intValue());
        }
        return timestamp;
    }

    private Timestamp addMonthForPrecision(int i, Precision precision) {
        Calendar calendarValue = calendarValue();
        calendarValue.add(2, i);
        return new Timestamp(calendarValue, precision, this._fraction, this._offset);
    }

    private void apply_offset(int i) {
        if (i == 0) {
            return;
        }
        if (i < -1440 || i > 1440) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "bad offset "));
            return;
        }
        int i2 = -i;
        int i3 = i2 / 60;
        int i4 = i2 - (i3 * 60);
        byte b = this._minute;
        if (i2 >= 0) {
            byte b2 = (byte) (b + i4);
            this._minute = b2;
            byte b3 = (byte) (this._hour + i3);
            this._hour = b3;
            if (b2 > 59) {
                this._minute = (byte) (b2 - 60);
                this._hour = (byte) (b3 + 1);
            }
            byte b4 = this._hour;
            if (b4 < 24) {
                return;
            }
            this._hour = (byte) (b4 - 24);
            byte b5 = (byte) (this._day + 1);
            this._day = b5;
            if (b5 <= last_day_in_month(this._year, this._month)) {
                return;
            }
            this._day = (byte) 1;
            byte b6 = (byte) (this._month + 1);
            this._month = b6;
            if (b6 <= 12) {
                return;
            }
            this._month = (byte) (b6 - 12);
            short s = (short) (this._year + 1);
            this._year = s;
            if (s <= 9999) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("year exceeds 9999");
            return;
        }
        byte b7 = (byte) (b + i4);
        this._minute = b7;
        byte b8 = (byte) (this._hour + i3);
        this._hour = b8;
        if (b7 < 0) {
            this._minute = (byte) (b7 + 60);
            this._hour = (byte) (b8 - 1);
        }
        byte b9 = this._hour;
        if (b9 >= 0) {
            return;
        }
        this._hour = (byte) (b9 + 24);
        byte b10 = (byte) (this._day - 1);
        this._day = b10;
        if (b10 >= 1) {
            return;
        }
        byte b11 = (byte) (this._month - 1);
        this._month = b11;
        if (b11 >= 1) {
            this._day = (byte) (b10 + last_day_in_month(this._year, b11));
            return;
        }
        byte b12 = (byte) (b11 + 12);
        this._month = b12;
        short s2 = (short) (this._year - 1);
        this._year = s2;
        if (s2 >= 1) {
            this._day = (byte) (b10 + last_day_in_month(s2, b12));
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("year is less than 1");
        }
    }

    private static byte checkAndCastDay(int i, int i2, int i3) {
        int last_day_in_month = last_day_in_month(i2, i3);
        if (i >= 1 && i <= last_day_in_month) {
            return (byte) i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(AppLaunchChecker$$ExternalSyntheticOutline0.m(" must be between 1 and ", i3, last_day_in_month, ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "Day ", " for year ", " and month "), " inclusive"));
        return (byte) 0;
    }

    private static byte checkAndCastHour(int i) {
        if (i >= 0 && i <= 23) {
            return (byte) i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Hour ", " must be between 0 and 23 inclusive"));
        return (byte) 0;
    }

    private static byte checkAndCastMinute(int i) {
        if (i >= 0 && i <= 59) {
            return (byte) i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Minute ", " must be between between 0 and 59 inclusive"));
        return (byte) 0;
    }

    private static byte checkAndCastMonth(int i) {
        if (i >= 1 && i <= 12) {
            return (byte) i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Month ", " must be between 1 and 12 inclusive"));
        return (byte) 0;
    }

    private static byte checkAndCastSecond(int i) {
        if (i >= 0 && i <= 59) {
            return (byte) i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Second ", " must be between between 0 and 59 inclusive"));
        return (byte) 0;
    }

    private static short checkAndCastYear(int i) {
        if (i >= 1 && i <= 9999) {
            return (short) i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Year ", " must be between 1 and 9999 inclusive"));
        return (short) 0;
    }

    private static Precision checkFraction(Precision precision, BigDecimal bigDecimal) {
        if (precision.includes(Precision.SECOND)) {
            if (bigDecimal != null && (bigDecimal.signum() == -1 || BigDecimal.ONE.compareTo(bigDecimal) != 1)) {
                Buffer$$ExternalSyntheticBUOutline0.m("Fractional seconds %s must be greater than or equal to 0 and less than 1", new Object[]{bigDecimal});
                return null;
            }
        } else if (bigDecimal != null) {
            Gson$$ExternalSyntheticBUOutline0.m((Object) bigDecimal, "Fraction must be null for non-second precision: ");
            return null;
        }
        return precision;
    }

    private void clearUnusedPrecision() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision[this._precision.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return;
                    } else {
                        this._month = (byte) 1;
                    }
                }
                this._day = (byte) 1;
            }
            this._hour = (byte) 0;
            this._minute = (byte) 0;
        }
        this._second = (byte) 0;
        this._fraction = null;
    }

    @Deprecated
    public static Timestamp createFromUtcFields(Precision precision, int i, int i2, int i3, int i4, int i5, int i6, BigDecimal bigDecimal, Integer num) {
        return new Timestamp(precision, i, i2, i3, i4, i5, i6, bigDecimal, num, false);
    }

    private static IllegalArgumentException fail(CharSequence charSequence, String str) {
        return new IllegalArgumentException("invalid timestamp: " + str + ": " + ((Object) IonTextUtils.printString(charSequence)));
    }

    private BigDecimal fastRoundZeroFloor(BigDecimal bigDecimal) {
        return isIntegralZero(bigDecimal) ? bigDecimal.signum() < 0 ? BigDecimal.ONE.negate() : BigDecimal.ZERO : bigDecimal.setScale(0, RoundingMode.FLOOR);
    }

    public static Timestamp forCalendar(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return new Timestamp(calendar);
    }

    public static Timestamp forDateZ(Date date) {
        if (date == null) {
            return null;
        }
        return new Timestamp(date.getTime(), UTC_OFFSET);
    }

    public static Timestamp forDay(int i, int i2, int i3) {
        return new Timestamp(i, i2, i3);
    }

    public static Timestamp forEpochSecond(long j, int i, Integer num) {
        Timestamp forMillis = forMillis(j * 1000, num);
        if (i == 0) {
            return forMillis;
        }
        if (i < 0 || i > 999999999) {
            Single$$ExternalSyntheticBUOutline0.m$3("nanoOffset must be between 0 and 999,999,999");
            return null;
        }
        forMillis._fraction = forMillis._fraction.add(BigDecimal.valueOf(i).movePointLeft(9));
        return forMillis;
    }

    public static Timestamp forMillis(long j, Integer num) {
        return new Timestamp(j, num);
    }

    public static Timestamp forMinute(int i, int i2, int i3, int i4, int i5, Integer num) {
        return new Timestamp(i, i2, i3, i4, i5, num);
    }

    public static Timestamp forMonth(int i, int i2) {
        return new Timestamp(i, i2);
    }

    public static Timestamp forSecond(int i, int i2, int i3, int i4, int i5, BigDecimal bigDecimal, Integer num) {
        int intValue = bigDecimal.intValue();
        return new Timestamp(Precision.SECOND, i, i2, i3, i4, i5, intValue, bigDecimal.subtract(BigDecimal.valueOf(intValue)), num, true);
    }

    public static Timestamp forSqlTimestampZ(java.sql.Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }
        Timestamp timestamp2 = new Timestamp(timestamp.getTime(), UTC_OFFSET);
        timestamp2._fraction = BigDecimal.valueOf(timestamp.getNanos()).movePointLeft(9);
        return timestamp2;
    }

    public static Timestamp forYear(int i) {
        return new Timestamp(i);
    }

    private boolean isIntegralZero(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 || bigDecimal.scale() < -63 || bigDecimal.precision() - bigDecimal.scale() <= 0;
    }

    private static boolean isValidFollowChar(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == '\"' || c == ',' || c == '{' || c == '}') {
            return true;
        }
        switch (c) {
            case '\'':
            case '(':
            case ')':
                return true;
            default:
                switch (c) {
                    case '[':
                    case '\\':
                    case ']':
                        return true;
                    default:
                        return false;
                }
        }
    }

    private static int last_day_in_month(int i, int i2) {
        return (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) ? NORMAL_DAYS_IN_MONTH[i2] : LEAP_DAYS_IN_MONTH[i2];
    }

    private Timestamp make_localtime() {
        Integer num = this._offset;
        int intValue = num != null ? num.intValue() : 0;
        Timestamp timestamp = new Timestamp(this._precision, this._year, this._month, this._day, this._hour, this._minute, this._second, this._fraction, this._offset, false);
        timestamp.apply_offset(-intValue);
        return timestamp;
    }

    public static Timestamp now() {
        return new Timestamp(System.currentTimeMillis(), UNKNOWN_OFFSET);
    }

    public static Timestamp nowZ() {
        return new Timestamp(System.currentTimeMillis(), UTC_OFFSET);
    }

    private static void print(Appendable appendable, Timestamp timestamp) throws IOException {
        if (timestamp == null) {
            appendable.append(NULL_TIMESTAMP_IMAGE);
            return;
        }
        print_digits(appendable, timestamp._year, 4);
        if (timestamp._precision == Precision.YEAR) {
            appendable.append(ExifInterface.GPS_DIRECTION_TRUE);
            return;
        }
        appendable.append("-");
        print_digits(appendable, timestamp._month, 2);
        if (timestamp._precision == Precision.MONTH) {
            appendable.append(ExifInterface.GPS_DIRECTION_TRUE);
            return;
        }
        appendable.append("-");
        print_digits(appendable, timestamp._day, 2);
        if (timestamp._precision == Precision.DAY) {
            return;
        }
        appendable.append(ExifInterface.GPS_DIRECTION_TRUE);
        print_digits(appendable, timestamp._hour, 2);
        appendable.append(":");
        print_digits(appendable, timestamp._minute, 2);
        if (timestamp._precision == Precision.SECOND) {
            appendable.append(":");
            print_digits(appendable, timestamp._second, 2);
            BigDecimal bigDecimal = timestamp._fraction;
            if (bigDecimal != null) {
                print_fractional_digits(appendable, bigDecimal);
            }
        }
        Integer num = timestamp._offset;
        if (num == UNKNOWN_OFFSET) {
            appendable.append("-00:00");
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            appendable.append(Matrix.MATRIX_TYPE_ZERO);
            return;
        }
        if (intValue < 0) {
            intValue = -intValue;
            appendable.append('-');
        } else {
            appendable.append(SignatureVisitor.EXTENDS);
        }
        int i = intValue / 60;
        print_digits(appendable, i, 2);
        appendable.append(":");
        print_digits(appendable, intValue - (i * 60), 2);
    }

    private static void print_digits(Appendable appendable, int i, int i2) throws IOException {
        char[] cArr = new char[i2];
        int i3 = i2;
        while (i3 > 0) {
            i3--;
            int i4 = i / 10;
            cArr[i3] = (char) ((i - (i4 * 10)) + 48);
            i = i4;
        }
        while (i3 > 0) {
            i3--;
            cArr[i3] = '0';
        }
        for (int i5 = 0; i5 < i2; i5++) {
            appendable.append(cArr[i5]);
        }
    }

    private static void print_fractional_digits(Appendable appendable, BigDecimal bigDecimal) throws IOException {
        String plainString = bigDecimal.toPlainString();
        if (plainString.charAt(0) == '0') {
            plainString = plainString.substring(1);
        }
        appendable.append(plainString);
    }

    private static int read_digits(CharSequence charSequence, int i, int i2, int i3, String str) {
        int i4 = i + i2;
        if (charSequence.length() < i4) {
            throw fail(charSequence, str + " requires " + i2 + " digits");
        }
        int i5 = 0;
        while (i < i4) {
            char charAt = charSequence.charAt(i);
            if (!Character.isDigit(charAt)) {
                StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, " has non-digit character ");
                m1m.append(IonTextUtils.printCodePointAsString(charAt));
                throw fail(charSequence, m1m.toString());
            }
            i5 = (i5 * 10) + (charAt - '0');
            i++;
        }
        if (i3 != -1) {
            if (i >= charSequence.length() || charSequence.charAt(i) != i3) {
                StringBuilder m1m2 = a$$ExternalSyntheticOutline0.m1m(str, " should end with ");
                m1m2.append(IonTextUtils.printCodePointAsString(i3));
                throw fail(charSequence, m1m2.toString());
            }
        } else if (i < charSequence.length() && Character.isDigit(charSequence.charAt(i))) {
            throw fail(charSequence, str + " requires " + i2 + " digits but has more");
        }
        return i5;
    }

    private static byte requireByte(int i, String str) {
        if (i <= 127 && i >= -128) {
            return (byte) i;
        }
        Buffer$$ExternalSyntheticBUOutline0.m("%s of %d is out of range.", new Object[]{str, Integer.valueOf(i)});
        return (byte) 0;
    }

    private static short requireShort(int i, String str) {
        if (i <= 32767 && i >= -32768) {
            return (short) i;
        }
        Buffer$$ExternalSyntheticBUOutline0.m("%s of %d is out of range.", new Object[]{str, Integer.valueOf(i)});
        return (short) 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void set_fields_from_calendar(java.util.Calendar r7, com.amazon.ion.Timestamp.Precision r8, boolean r9) {
        /*
            r6 = this;
            r6._precision = r8
            java.lang.Integer r0 = com.amazon.ion.Timestamp.UNKNOWN_OFFSET
            r6._offset = r0
            r1 = 14
            boolean r2 = r7.isSet(r1)
            int[] r3 = com.amazon.ion.Timestamp.AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision
            com.amazon.ion.Timestamp$Precision r4 = r6._precision
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            r5 = 0
            switch(r3) {
                case 1: goto L21;
                case 2: goto L21;
                case 3: goto L42;
                case 4: goto L7f;
                case 5: goto L1f;
                case 6: goto L1d;
                default: goto L1b;
            }
        L1b:
            goto La3
        L1d:
            r8 = r5
            goto L8c
        L1f:
            r8 = r5
            goto L80
        L21:
            r3 = 13
            int r3 = r7.get(r3)
            byte r3 = checkAndCastSecond(r3)
            r6._second = r3
            if (r2 == 0) goto L42
            int r1 = r7.get(r1)
            long r1 = (long) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r1)
            r2 = 3
            java.math.BigDecimal r1 = r1.movePointLeft(r2)
            r6._fraction = r1
            checkFraction(r8, r1)
        L42:
            r8 = 11
            int r8 = r7.get(r8)
            byte r8 = checkAndCastHour(r8)
            r6._hour = r8
            r8 = 12
            int r8 = r7.get(r8)
            byte r8 = checkAndCastMinute(r8)
            r6._minute = r8
            if (r9 == 0) goto L7f
            r8 = 15
            boolean r9 = r7.isSet(r8)
            if (r9 == 0) goto L7f
            int r8 = r7.get(r8)
            r9 = 16
            boolean r1 = r7.isSet(r9)
            if (r1 == 0) goto L75
            int r9 = r7.get(r9)
            int r8 = r8 + r9
        L75:
            r9 = 60000(0xea60, float:8.4078E-41)
            int r8 = r8 / r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6._offset = r8
        L7f:
            r8 = r4
        L80:
            r9 = 2
            int r9 = r7.get(r9)
            int r9 = r9 + r4
            byte r9 = checkAndCastMonth(r9)
            r6._month = r9
        L8c:
            int r9 = r7.get(r5)
            if (r9 != r4) goto L97
            int r9 = r7.get(r4)
            goto L9c
        L97:
            int r9 = r7.get(r4)
            int r9 = -r9
        L9c:
            short r9 = checkAndCastYear(r9)
            r6._year = r9
            r5 = r8
        La3:
            if (r5 == 0) goto Lb4
            r8 = 5
            int r7 = r7.get(r8)
            short r8 = r6._year
            byte r9 = r6._month
            byte r7 = checkAndCastDay(r7, r8, r9)
            r6._day = r7
        Lb4:
            java.lang.Integer r7 = r6._offset
            if (r7 == r0) goto Lbf
            int r7 = r7.intValue()
            r6.apply_offset(r7)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.ion.Timestamp.set_fields_from_calendar(java.util.Calendar, com.amazon.ion.Timestamp$Precision, boolean):void");
    }

    private void set_fields_from_millis(long j) {
        if (j < MINIMUM_TIMESTAMP_IN_MILLIS) {
            Single$$ExternalSyntheticBUOutline0.m$3("year is less than 1");
            return;
        }
        Date date = new Date(j);
        this._minute = requireByte(date.getMinutes(), "Minute");
        this._second = requireByte(date.getSeconds(), ThreadParty.Second);
        this._hour = requireByte(date.getHours(), "Hour");
        this._day = requireByte(date.getDate(), "Day");
        this._month = requireByte(date.getMonth() + 1, "Month");
        int i = -date.getTimezoneOffset();
        if (i >= 0 || MINIMUM_TIMESTAMP_IN_MILLIS - i <= j) {
            this._year = requireShort(date.getYear() + DeviceContactsFetcher.MIN_SUPPORTED_YEAR, "Year");
        } else {
            this._year = (short) 0;
        }
        apply_offset(i);
        this._year = checkAndCastYear(this._year);
        byte checkAndCastMonth = checkAndCastMonth(this._month);
        this._month = checkAndCastMonth;
        this._day = checkAndCastDay(this._day, this._year, checkAndCastMonth);
        this._hour = checkAndCastHour(this._hour);
        this._minute = checkAndCastMinute(this._minute);
        this._second = checkAndCastSecond(this._second);
    }

    private static void throwTimestampOutOfRangeError(Number number) {
        throw new IllegalArgumentException("millis: " + number + " is outside of valid the range: from -62135769600000 (0001T), inclusive, to 253402300800000 (10000T) , exclusive");
    }

    public static Timestamp valueOf(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        int read_digits;
        Precision precision;
        int i4;
        int i5;
        BigDecimal bigDecimal;
        int i6;
        int i7;
        Integer num;
        int length = charSequence.length();
        if (length == 0) {
            throw fail(charSequence);
        }
        int i8 = 0;
        if (charSequence.charAt(0) == 'n') {
            int i9 = LEN_OF_NULL_IMAGE;
            if (length < i9 || !NULL_TIMESTAMP_IMAGE.contentEquals(charSequence.subSequence(0, i9))) {
                throw fail(charSequence);
            }
            if (length <= i9 || isValidFollowChar(charSequence.charAt(i9))) {
                return null;
            }
            throw fail(charSequence);
        }
        if (length < 5) {
            throw fail(charSequence, "year is too short (must be at least yyyyT)");
        }
        Precision precision2 = Precision.YEAR;
        int read_digits2 = read_digits(charSequence, 0, 4, -1, TimeGroupBy.YEAR);
        char charAt = charSequence.charAt(4);
        if (charAt == 'T') {
            i4 = 0;
            i5 = 0;
            i = 0;
            precision = precision2;
            bigDecimal = null;
            i2 = 4;
            read_digits = 1;
            i6 = 1;
            i3 = 1;
        } else {
            if (charAt != '-') {
                throw fail(charSequence, "expected \"-\" between year and month, found " + IonTextUtils.printCodePointAsString(charAt));
            }
            if (length < 8) {
                throw fail(charSequence, "month is too short (must be yyyy-mmT)");
            }
            Precision precision3 = Precision.MONTH;
            i = 0;
            int read_digits3 = read_digits(charSequence, 5, 2, -1, TimeGroupBy.MONTH);
            i2 = 7;
            i3 = 1;
            char charAt2 = charSequence.charAt(7);
            if (charAt2 == 'T') {
                i6 = read_digits3;
                precision = precision3;
                i8 = 0;
                i4 = 0;
                i5 = 0;
                read_digits = 1;
            } else {
                if (charAt2 != '-') {
                    throw fail(charSequence, "expected \"-\" between month and day, found " + IonTextUtils.printCodePointAsString(charAt2));
                }
                if (length < 10) {
                    throw fail(charSequence, "too short for yyyy-mm-dd");
                }
                Precision precision4 = Precision.DAY;
                read_digits = read_digits(charSequence, 8, 2, -1, TimeGroupBy.DAY);
                if (length != 10) {
                    char charAt3 = charSequence.charAt(10);
                    if (charAt3 != 'T') {
                        throw fail(charSequence, "expected \"T\" after day, found " + IonTextUtils.printCodePointAsString(charAt3));
                    }
                    if (length != 11) {
                        i2 = 16;
                        if (length < 16) {
                            throw fail(charSequence, "too short for yyyy-mm-ddThh:mm");
                        }
                        int read_digits4 = read_digits(charSequence, 11, 2, 58, "hour");
                        int read_digits5 = read_digits(charSequence, 14, 2, -1, "minutes");
                        Precision precision5 = Precision.MINUTE;
                        if (length <= 16 || charSequence.charAt(16) != ':') {
                            i6 = read_digits3;
                            i8 = read_digits5;
                            precision = precision5;
                            bigDecimal = null;
                            i5 = read_digits4;
                            i4 = 0;
                        } else {
                            i2 = 19;
                            if (length < 19) {
                                throw fail(charSequence, "too short for yyyy-mm-ddThh:mm:ss");
                            }
                            int read_digits6 = read_digits(charSequence, 17, 2, -1, BizMetricsConstants.DURATION_METADATA_NAME);
                            Precision precision6 = Precision.SECOND;
                            if (length <= 19 || charSequence.charAt(19) != '.') {
                                i6 = read_digits3;
                                i8 = read_digits5;
                                precision = precision6;
                                i5 = read_digits4;
                                i4 = 0;
                                i = read_digits6;
                            } else {
                                int i10 = 20;
                                while (length > i10 && Character.isDigit(charSequence.charAt(i10))) {
                                    i10++;
                                }
                                if (i10 <= 20) {
                                    throw fail(charSequence, "must have at least one digit after decimal point");
                                }
                                bigDecimal = new BigDecimal(charSequence.subSequence(19, i10).toString());
                                i6 = read_digits3;
                                i8 = read_digits5;
                                precision = precision6;
                                i5 = read_digits4;
                                i4 = 0;
                                i = read_digits6;
                                i2 = i10;
                            }
                        }
                    }
                }
                precision = precision4;
                i2 = 10;
                i4 = 0;
                i5 = 0;
                bigDecimal = null;
                i6 = read_digits3;
                i8 = 0;
            }
            bigDecimal = null;
        }
        char charAt4 = i2 < length ? charSequence.charAt(i2) : '\n';
        int i11 = i4;
        if (charAt4 == 'Z') {
            i2++;
            int i12 = i3;
            num = Integer.valueOf(i11);
            i7 = i12;
        } else if (charAt4 != '+' && charAt4 != '-') {
            int i13 = AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision[precision.ordinal()];
            if (i13 != 4 && i13 != 5 && i13 != 6) {
                throw fail(charSequence, "missing local offset");
            }
            i7 = i3;
            num = null;
        } else {
            if (length < i2 + 5) {
                throw fail(charSequence, "local offset too short");
            }
            int read_digits7 = read_digits(charSequence, i2 + 1, 2, 58, "local offset hours");
            if (read_digits7 < 0 || read_digits7 > 23) {
                throw fail(charSequence, "local offset hours must be between 0 and 23 inclusive");
            }
            int read_digits8 = read_digits(charSequence, i2 + 4, 2, -1, "local offset minutes");
            if (read_digits8 > 59) {
                throw fail(charSequence, "local offset minutes must be between 0 and 59 inclusive");
            }
            i2 += 6;
            int i14 = (read_digits7 * 60) + read_digits8;
            if (charAt4 == '-') {
                i14 = -i14;
            }
            Integer valueOf = (i14 == 0 && charAt4 == '-') ? null : Integer.valueOf(i14);
            i7 = i3;
            num = valueOf;
        }
        int i15 = i2 + i7;
        if (length <= i15 || isValidFollowChar(charSequence.charAt(i15))) {
            return new Timestamp(precision, read_digits2, i6, read_digits, i5, i8, i, bigDecimal, num, true);
        }
        throw fail(charSequence, "invalid excess characters");
    }

    public final Timestamp addDay(int i) {
        return addMillisForPrecision(i * 86400000, Precision.DAY, false);
    }

    public final Timestamp addHour(int i) {
        return addMillisForPrecision(i * 3600000, Precision.MINUTE, false);
    }

    public final Timestamp addMillis(long j) {
        BigDecimal bigDecimal;
        return (j != 0 || !this._precision.includes(Precision.SECOND) || (bigDecimal = this._fraction) == null || bigDecimal.scale() < 3) ? addMillisForPrecision(j, Precision.SECOND, true) : this;
    }

    public final Timestamp addMinute(int i) {
        return addMillisForPrecision(i * 60000, Precision.MINUTE, false);
    }

    public final Timestamp addMonth(int i) {
        if (i == 0 && this._precision.includes(Precision.MONTH)) {
            return this;
        }
        Precision precision = this._precision;
        Precision precision2 = Precision.MONTH;
        if (precision.includes(precision2)) {
            precision2 = this._precision;
        }
        return addMonthForPrecision(i, precision2);
    }

    public final Timestamp addSecond(int i) {
        return addMillisForPrecision(i * 1000, Precision.SECOND, false);
    }

    public final Timestamp addYear(int i) {
        if (i == 0) {
            return this;
        }
        Calendar calendarValue = calendarValue();
        calendarValue.add(1, i);
        return new Timestamp(calendarValue, this._precision, this._fraction, this._offset);
    }

    public final Timestamp adjustDay(int i) {
        return adjustMillis(i * 86400000);
    }

    public final Timestamp adjustHour(int i) {
        return adjustMillis(i * 3600000);
    }

    public final Timestamp adjustMillis(long j) {
        if (j == 0) {
            return this;
        }
        Timestamp addMillisForPrecision = addMillisForPrecision(j, this._precision, false);
        addMillisForPrecision.clearUnusedPrecision();
        if (addMillisForPrecision._precision.includes(Precision.SECOND)) {
            if (this._fraction == null) {
                addMillisForPrecision._fraction = null;
                return addMillisForPrecision;
            }
            if (addMillisForPrecision._fraction.scale() > this._fraction.scale()) {
                addMillisForPrecision._fraction = addMillisForPrecision._fraction.setScale(this._fraction.scale(), RoundingMode.FLOOR);
            }
        }
        return addMillisForPrecision;
    }

    public final Timestamp adjustMinute(int i) {
        return adjustMillis(i * 60000);
    }

    public final Timestamp adjustMonth(int i) {
        return i == 0 ? this : addMonthForPrecision(i, this._precision);
    }

    public final Timestamp adjustSecond(int i) {
        return adjustMillis(i * 1000);
    }

    public final Timestamp adjustYear(int i) {
        return addYear(i);
    }

    public Calendar calendarValue() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(_Private_Utils.UTC);
        long millis = getMillis();
        Integer num = this._offset;
        if (num == null || num.intValue() == 0) {
            gregorianCalendar.setTimeInMillis(millis);
        } else {
            int intValue = num.intValue() * 60000;
            gregorianCalendar.setTimeInMillis(millis + intValue);
            gregorianCalendar.set(15, intValue);
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision[this._precision.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            gregorianCalendar.clear(2);
                        }
                        return gregorianCalendar;
                    }
                    gregorianCalendar.clear(5);
                }
                gregorianCalendar.clear(11);
                gregorianCalendar.clear(12);
            }
            gregorianCalendar.clear(13);
            gregorianCalendar.clear(14);
        }
        if (this._fraction == null) {
            gregorianCalendar.clear(14);
        }
        return gregorianCalendar;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Timestamp m22659clone() {
        return new Timestamp(this._precision, this._year, this._month, this._day, this._hour, this._minute, this._second, this._fraction, this._offset, false);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp timestamp) {
        long millis = getMillis();
        long millis2 = timestamp.getMillis();
        if (millis != millis2) {
            return millis < millis2 ? -1 : 1;
        }
        BigDecimal bigDecimal = this._fraction;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = timestamp._fraction;
        if (bigDecimal2 == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        return bigDecimal.compareTo(bigDecimal2);
    }

    public Date dateValue() {
        return new Date(getMillis());
    }

    public boolean equals(Timestamp timestamp) {
        if (this == timestamp) {
            return true;
        }
        if (timestamp == null) {
            return false;
        }
        Precision precision = this._precision;
        Precision precision2 = Precision.SECOND;
        Precision precision3 = precision.includes(precision2) ? precision2 : this._precision;
        if (!timestamp._precision.includes(precision2)) {
            precision2 = timestamp._precision;
        }
        if (precision3 != precision2) {
            return false;
        }
        Integer num = this._offset;
        Integer num2 = timestamp._offset;
        if (num == null) {
            if (num2 != null) {
                return false;
            }
        } else if (num2 == null) {
            return false;
        }
        if (this._year != timestamp._year || this._month != timestamp._month || this._day != timestamp._day || this._hour != timestamp._hour || this._minute != timestamp._minute || this._second != timestamp._second) {
            return false;
        }
        if (num != null && num.intValue() != timestamp._offset.intValue()) {
            return false;
        }
        BigDecimal bigDecimal = this._fraction;
        if ((bigDecimal != null && timestamp._fraction == null) || (bigDecimal == null && timestamp._fraction != null)) {
            return false;
        }
        if (bigDecimal == null && timestamp._fraction == null) {
            return true;
        }
        return bigDecimal.equals(timestamp._fraction);
    }

    public int getDay() {
        Integer num = this._offset;
        if (num != null && num.intValue() != 0) {
            this = make_localtime();
        }
        return this._day;
    }

    public BigDecimal getDecimalMillis() {
        switch (AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision[this._precision.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                BigDecimal valueOf = BigDecimal.valueOf(Date.UTC(this._year - 1900, this._month - 1, this._day, this._hour, this._minute, this._second));
                BigDecimal bigDecimal = this._fraction;
                return bigDecimal != null ? valueOf.add(bigDecimal.movePointRight(3)) : valueOf;
            default:
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }

    public BigDecimal getDecimalSecond() {
        BigDecimal valueOf = BigDecimal.valueOf(this._second);
        BigDecimal bigDecimal = this._fraction;
        return bigDecimal != null ? valueOf.add(bigDecimal) : valueOf;
    }

    @Deprecated
    public BigDecimal getFractionalSecond() {
        return this._fraction;
    }

    public int getHour() {
        Integer num = this._offset;
        if (num != null && num.intValue() != 0) {
            this = make_localtime();
        }
        return this._hour;
    }

    public Integer getLocalOffset() {
        return this._offset;
    }

    public long getMillis() {
        long UTC = Date.UTC(this._year - 1900, this._month - 1, this._day, this._hour, this._minute, this._second);
        BigDecimal bigDecimal = this._fraction;
        if (bigDecimal == null) {
            return UTC;
        }
        return UTC + (isIntegralZero(bigDecimal.movePointRight(3)) ? 0 : r2.intValue());
    }

    public int getMinute() {
        Integer num = this._offset;
        if (num != null && num.intValue() != 0) {
            this = make_localtime();
        }
        return this._minute;
    }

    public int getMonth() {
        Integer num = this._offset;
        if (num != null && num.intValue() != 0) {
            this = make_localtime();
        }
        return this._month;
    }

    public Precision getPrecision() {
        return this._precision;
    }

    public int getSecond() {
        return this._second;
    }

    public int getYear() {
        Integer num = this._offset;
        if (num != null && num.intValue() != 0) {
            this = make_localtime();
        }
        return this._year;
    }

    public int getZDay() {
        return this._day;
    }

    public BigDecimal getZDecimalSecond() {
        return getDecimalSecond();
    }

    @Deprecated
    public BigDecimal getZFractionalSecond() {
        return this._fraction;
    }

    public int getZHour() {
        return this._hour;
    }

    public int getZMinute() {
        return this._minute;
    }

    public int getZMonth() {
        return this._month;
    }

    public int getZSecond() {
        return this._second;
    }

    public int getZYear() {
        return this._year;
    }

    public int hashCode() {
        int i = HASH_SIGNATURE * 8191;
        BigDecimal bigDecimal = this._fraction;
        int hashCode = i + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        int i2 = ((((((((((((hashCode ^ ((hashCode << 19) ^ (hashCode >> 13))) * 8191) + this._year) * 8191) + this._month) * 8191) + this._day) * 8191) + this._hour) * 8191) + this._minute) * 8191) + this._second;
        int i3 = i2 ^ ((i2 << 19) ^ (i2 >> 13));
        Precision precision = this._precision;
        if (precision == Precision.FRACTION) {
            precision = Precision.SECOND;
        }
        int hashCode2 = precision.toString().hashCode() + (i3 * 8191);
        int i4 = (((hashCode2 << 19) ^ (hashCode2 >> 13)) ^ hashCode2) * 8191;
        Integer num = this._offset;
        int hashCode3 = i4 + (num != null ? num.hashCode() : 0);
        return ((hashCode3 << 19) ^ (hashCode3 >> 13)) ^ hashCode3;
    }

    public void printZ(Appendable appendable) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision[this._precision.ordinal()]) {
            case 1:
            case 2:
            case 3:
                Timestamp m22659clone = m22659clone();
                m22659clone._offset = UTC_OFFSET;
                m22659clone.print(appendable);
                break;
            case 4:
            case 5:
            case 6:
                print(appendable);
                break;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        try {
            print(sb);
            return sb.toString();
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Exception printing to StringBuilder", e);
            return null;
        }
    }

    public String toZString() {
        StringBuilder sb = new StringBuilder(32);
        try {
            printZ(sb);
            return sb.toString();
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Exception printing to StringBuilder", e);
            return null;
        }
    }

    public Timestamp withLocalOffset(Integer num) {
        Precision precision = getPrecision();
        return (precision.alwaysUnknownOffset() || _Private_Utils.safeEquals(num, getLocalOffset())) ? this : createFromUtcFields(precision, getZYear(), getZMonth(), getZDay(), getZHour(), getZMinute(), getZSecond(), getZFractionalSecond(), num);
    }

    public static Timestamp forMillis(BigDecimal bigDecimal, Integer num) {
        return new Timestamp(bigDecimal, num);
    }

    public static Timestamp forSecond(int i, int i2, int i3, int i4, int i5, int i6, Integer num) {
        return new Timestamp(i, i2, i3, i4, i5, i6, num);
    }

    private static IllegalArgumentException fail(CharSequence charSequence) {
        return new IllegalArgumentException("invalid timestamp: " + ((Object) IonTextUtils.printString(charSequence)));
    }

    private Timestamp(int i, int i2) {
        this(Precision.MONTH, i, i2, 0, 0, 0, 0, NO_FRACTIONAL_SECONDS, UNKNOWN_OFFSET, false);
    }

    @Deprecated
    public Timestamp(int i, int i2, int i3) {
        this(Precision.DAY, i, i2, i3, 0, 0, 0, NO_FRACTIONAL_SECONDS, UNKNOWN_OFFSET, false);
    }

    @Deprecated
    public Timestamp(int i, int i2, int i3, int i4, int i5, Integer num) {
        this(Precision.MINUTE, i, i2, i3, i4, i5, 0, NO_FRACTIONAL_SECONDS, num, true);
    }

    @Deprecated
    public Timestamp(int i, int i2, int i3, int i4, int i5, int i6, Integer num) {
        this(Precision.SECOND, i, i2, i3, i4, i5, i6, NO_FRACTIONAL_SECONDS, num, true);
    }

    @Deprecated
    public Timestamp(int i, int i2, int i3, int i4, int i5, int i6, BigDecimal bigDecimal, Integer num) {
        this(Precision.SECOND, i, i2, i3, i4, i5, i6, bigDecimal, num, true);
    }

    private Timestamp(int i) {
        this(Precision.YEAR, i, 0, 0, 0, 0, 0, NO_FRACTIONAL_SECONDS, UNKNOWN_OFFSET, false);
    }

    @Deprecated
    public Timestamp(Calendar calendar) {
        Precision precision;
        this._month = (byte) 1;
        this._day = (byte) 1;
        if (!calendar.isSet(14) && !calendar.isSet(13)) {
            if (!calendar.isSet(11) && !calendar.isSet(12)) {
                if (calendar.isSet(5)) {
                    precision = Precision.DAY;
                } else if (calendar.isSet(2)) {
                    precision = Precision.MONTH;
                } else if (calendar.isSet(1)) {
                    precision = Precision.YEAR;
                } else {
                    Single$$ExternalSyntheticBUOutline0.m$3("Calendar has no fields set");
                    throw null;
                }
            } else {
                precision = Precision.MINUTE;
            }
        } else {
            precision = Precision.SECOND;
        }
        set_fields_from_calendar(calendar, precision, true);
    }

    private Timestamp(Calendar calendar, Precision precision, BigDecimal bigDecimal, Integer num) {
        this._month = (byte) 1;
        this._day = (byte) 1;
        set_fields_from_calendar(calendar, precision, false);
        this._fraction = bigDecimal;
        if (num != null) {
            this._offset = num;
            apply_offset(num.intValue());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Timestamp) {
            return equals((Timestamp) obj);
        }
        return false;
    }

    private Timestamp(BigDecimal bigDecimal, Precision precision, Integer num) {
        this._month = (byte) 1;
        this._day = (byte) 1;
        if (bigDecimal.compareTo(MINIMUM_TIMESTAMP_IN_MILLIS_DECIMAL) < 0 || MAXIMUM_ALLOWED_TIMESTAMP_IN_MILLIS_DECIMAL.compareTo(bigDecimal) <= 0) {
            throwTimestampOutOfRangeError(bigDecimal);
        }
        set_fields_from_millis(isIntegralZero(bigDecimal) ? 0L : bigDecimal.longValue());
        int i = AnonymousClass1.$SwitchMap$com$amazon$ion$Timestamp$Precision[precision.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        this._month = (byte) 1;
                    }
                    this._offset = num;
                    if (!precision.includes(Precision.SECOND) && bigDecimal.scale() > -3) {
                        BigDecimal movePointLeft = bigDecimal.movePointLeft(3);
                        this._fraction = movePointLeft.subtract(fastRoundZeroFloor(movePointLeft));
                    } else {
                        this._fraction = null;
                    }
                    this._precision = checkFraction(precision, this._fraction);
                }
                this._day = (byte) 1;
            }
            this._hour = (byte) 0;
            this._minute = (byte) 0;
        }
        this._second = (byte) 0;
        this._offset = num;
        if (!precision.includes(Precision.SECOND)) {
        }
        this._fraction = null;
        this._precision = checkFraction(precision, this._fraction);
    }

    public void print(Appendable appendable) throws IOException {
        Integer num = this._offset;
        if (num != null && num.intValue() != 0) {
            this = make_localtime();
        }
        print(appendable, this);
    }

    @Deprecated
    public Timestamp(BigDecimal bigDecimal, Integer num) {
        this._month = (byte) 1;
        this._day = (byte) 1;
        if (bigDecimal != null) {
            if (bigDecimal.compareTo(MINIMUM_TIMESTAMP_IN_MILLIS_DECIMAL) < 0 || MAXIMUM_ALLOWED_TIMESTAMP_IN_MILLIS_DECIMAL.compareTo(bigDecimal) < 0) {
                throwTimestampOutOfRangeError(bigDecimal);
            }
            set_fields_from_millis(isIntegralZero(bigDecimal) ? 0L : bigDecimal.longValue());
            if (bigDecimal.scale() <= -3) {
                this._precision = Precision.SECOND;
                this._fraction = null;
            } else {
                BigDecimal movePointLeft = bigDecimal.movePointLeft(3);
                BigDecimal subtract = movePointLeft.subtract(fastRoundZeroFloor(movePointLeft));
                this._fraction = subtract;
                this._precision = checkFraction(Precision.SECOND, subtract);
            }
            this._offset = num;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("millis is null");
        throw null;
    }

    @Deprecated
    public Timestamp(long j, Integer num) {
        this._month = (byte) 1;
        this._day = (byte) 1;
        if (j < MINIMUM_TIMESTAMP_IN_MILLIS || j >= MAXIMUM_TIMESTAMP_IN_MILLIS) {
            throwTimestampOutOfRangeError(Long.valueOf(j));
        }
        set_fields_from_millis(j);
        BigDecimal movePointLeft = BigDecimal.valueOf(j).movePointLeft(3);
        BigDecimal subtract = movePointLeft.subtract(movePointLeft.setScale(0, RoundingMode.FLOOR));
        this._fraction = subtract;
        this._precision = checkFraction(Precision.SECOND, subtract);
        this._offset = num;
    }
}
