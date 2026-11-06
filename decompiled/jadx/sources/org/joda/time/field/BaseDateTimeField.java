package org.joda.time.field;

import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class BaseDateTimeField extends DateTimeField {
    private final DateTimeFieldType iType;

    public BaseDateTimeField(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            this.iType = dateTimeFieldType;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The type must not be null");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r12 >= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r3 = getMinimumValue(r9, r11);
        r4 = r11[r10] + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r4 < r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r10 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r0 = r9.getField(r10 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (getRangeDurationField().getType() != r0.getDurationField().getType()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        rx.Single$$ExternalSyntheticBUOutline0.m$3("Fields invalid for add");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        r12 = r12 - ((r3 - 1) - r11[r10]);
        r11 = r0.add(r9, r10 - 1, r11, -1);
        r11[r10] = getMaximumValue(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        rx.Single$$ExternalSyntheticBUOutline0.m$3("Maximum value exceeded for add");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
    
        r11[r10] = (int) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        return set(r9, r10, r11, r11[r10]);
     */
    @Override // org.joda.time.DateTimeField
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] add(org.joda.time.ReadablePartial r9, int r10, int[] r11, int r12) {
        /*
            r8 = this;
            if (r12 != 0) goto L3
            return r11
        L3:
            r0 = 0
        L4:
            java.lang.String r1 = "Fields invalid for add"
            java.lang.String r2 = "Maximum value exceeded for add"
            if (r12 <= 0) goto L56
            int r3 = r8.getMaximumValue(r9, r11)
            r4 = r11[r10]
            int r4 = r4 + r12
            long r4 = (long) r4
            long r6 = (long) r3
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L1b
            int r3 = (int) r4
            r11[r10] = r3
            goto L56
        L1b:
            if (r0 != 0) goto L42
            if (r10 == 0) goto L3d
            int r0 = r10 + (-1)
            org.joda.time.DateTimeField r0 = r9.getField(r0)
            org.joda.time.DurationField r2 = r8.getRangeDurationField()
            org.joda.time.DurationFieldType r2 = r2.getType()
            org.joda.time.DurationField r4 = r0.getDurationField()
            org.joda.time.DurationFieldType r4 = r4.getType()
            if (r2 != r4) goto L38
            goto L42
        L38:
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r1)
            r8 = 0
            return r8
        L3d:
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r2)
            r8 = 0
            return r8
        L42:
            int r3 = r3 + 1
            r1 = r11[r10]
            int r3 = r3 - r1
            int r12 = r12 - r3
            int r1 = r10 + (-1)
            r2 = 1
            int[] r11 = r0.add(r9, r1, r11, r2)
            int r1 = r8.getMinimumValue(r9, r11)
            r11[r10] = r1
            goto L4
        L56:
            if (r12 >= 0) goto La4
            int r3 = r8.getMinimumValue(r9, r11)
            r4 = r11[r10]
            int r4 = r4 + r12
            long r4 = (long) r4
            long r6 = (long) r3
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L69
            int r12 = (int) r4
            r11[r10] = r12
            goto La4
        L69:
            if (r0 != 0) goto L90
            if (r10 == 0) goto L8b
            int r0 = r10 + (-1)
            org.joda.time.DateTimeField r0 = r9.getField(r0)
            org.joda.time.DurationField r4 = r8.getRangeDurationField()
            org.joda.time.DurationFieldType r4 = r4.getType()
            org.joda.time.DurationField r5 = r0.getDurationField()
            org.joda.time.DurationFieldType r5 = r5.getType()
            if (r4 != r5) goto L86
            goto L90
        L86:
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r1)
            r8 = 0
            return r8
        L8b:
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r2)
            r8 = 0
            return r8
        L90:
            int r3 = r3 + (-1)
            r4 = r11[r10]
            int r3 = r3 - r4
            int r12 = r12 - r3
            int r3 = r10 + (-1)
            r4 = -1
            int[] r11 = r0.add(r9, r3, r11, r4)
            int r3 = r8.getMaximumValue(r9, r11)
            r11[r10] = r3
            goto L56
        La4:
            r12 = r11[r10]
            int[] r8 = r8.set(r9, r10, r11, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.BaseDateTimeField.add(org.joda.time.ReadablePartial, int, int[], int):int[]");
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, getMinimumValue(j), getMaximumValue(j)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r12 >= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r2 = getMinimumValue(r9, r11);
        r3 = r11[r10];
        r4 = r3 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r4 < r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r10 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0 = r9.getField(r10 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (getRangeDurationField().getType() != r0.getDurationField().getType()) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        r12 = r12 - ((r2 - 1) - r11[r10]);
        r11 = r0.addWrapPartial(r9, r10 - 1, r11, -1);
        r11[r10] = getMaximumValue(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        rx.Single$$ExternalSyntheticBUOutline0.m$3("Fields invalid for add");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0073, code lost:
    
        r12 = r12 - ((r2 - 1) - r3);
        r11[r10] = getMaximumValue(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        r11[r10] = (int) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        return set(r9, r10, r11, r11[r10]);
     */
    @Override // org.joda.time.DateTimeField
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] addWrapPartial(org.joda.time.ReadablePartial r9, int r10, int[] r11, int r12) {
        /*
            r8 = this;
            if (r12 != 0) goto L3
            return r11
        L3:
            r0 = 0
        L4:
            java.lang.String r1 = "Fields invalid for add"
            if (r12 <= 0) goto L5b
            int r2 = r8.getMaximumValue(r9, r11)
            r3 = r11[r10]
            int r4 = r3 + r12
            long r4 = (long) r4
            long r6 = (long) r2
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L1a
            int r2 = (int) r4
            r11[r10] = r2
            goto L5b
        L1a:
            if (r0 != 0) goto L47
            if (r10 != 0) goto L29
            int r2 = r2 + 1
            int r2 = r2 - r3
            int r12 = r12 - r2
            int r1 = r8.getMinimumValue(r9, r11)
            r11[r10] = r1
            goto L4
        L29:
            int r0 = r10 + (-1)
            org.joda.time.DateTimeField r0 = r9.getField(r0)
            org.joda.time.DurationField r3 = r8.getRangeDurationField()
            org.joda.time.DurationFieldType r3 = r3.getType()
            org.joda.time.DurationField r4 = r0.getDurationField()
            org.joda.time.DurationFieldType r4 = r4.getType()
            if (r3 != r4) goto L42
            goto L47
        L42:
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r1)
            r8 = 0
            return r8
        L47:
            int r2 = r2 + 1
            r1 = r11[r10]
            int r2 = r2 - r1
            int r12 = r12 - r2
            int r1 = r10 + (-1)
            r2 = 1
            int[] r11 = r0.addWrapPartial(r9, r1, r11, r2)
            int r1 = r8.getMinimumValue(r9, r11)
            r11[r10] = r1
            goto L4
        L5b:
            if (r12 >= 0) goto Lb0
            int r2 = r8.getMinimumValue(r9, r11)
            r3 = r11[r10]
            int r4 = r3 + r12
            long r4 = (long) r4
            long r6 = (long) r2
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L6f
            int r12 = (int) r4
            r11[r10] = r12
            goto Lb0
        L6f:
            if (r0 != 0) goto L9c
            if (r10 != 0) goto L7e
            int r2 = r2 + (-1)
            int r2 = r2 - r3
            int r12 = r12 - r2
            int r2 = r8.getMaximumValue(r9, r11)
            r11[r10] = r2
            goto L5b
        L7e:
            int r0 = r10 + (-1)
            org.joda.time.DateTimeField r0 = r9.getField(r0)
            org.joda.time.DurationField r3 = r8.getRangeDurationField()
            org.joda.time.DurationFieldType r3 = r3.getType()
            org.joda.time.DurationField r4 = r0.getDurationField()
            org.joda.time.DurationFieldType r4 = r4.getType()
            if (r3 != r4) goto L97
            goto L9c
        L97:
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r1)
            r8 = 0
            return r8
        L9c:
            int r2 = r2 + (-1)
            r3 = r11[r10]
            int r2 = r2 - r3
            int r12 = r12 - r2
            int r2 = r10 + (-1)
            r3 = -1
            int[] r11 = r0.addWrapPartial(r9, r2, r11, r3)
            int r2 = r8.getMaximumValue(r9, r11)
            r11[r10] = r2
            goto L5b
        Lb0:
            r12 = r11[r10]
            int[] r8 = r8.set(r9, r10, r11, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.BaseDateTimeField.addWrapPartial(org.joda.time.ReadablePartial, int, int[], int):int[]");
    }

    public int convertText(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(this.getType(), str);
        }
    }

    @Override // org.joda.time.DateTimeField
    public abstract int get(long j);

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return getAsShortText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        return getAsText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j, long j2) {
        return getDurationField().getDifference(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        return getDurationField().getDifferenceAsLong(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getDurationField();

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return 0;
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMaximumValue();

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMinimumValue();

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j) {
        long roundFloor = roundFloor(j);
        return roundFloor != j ? add(roundFloor, 1) : j;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long roundFloor(long j);

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return roundCeiling - j <= j - roundFloor ? roundCeiling : roundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        long j2 = j - roundFloor;
        long j3 = roundCeiling - j;
        return (j2 >= j3 && (j3 < j2 || (get(roundCeiling) & 1) == 0)) ? roundCeiling : roundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return j - roundFloor <= roundCeiling - j ? roundFloor : roundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long set(long j, int i);

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        FieldUtils.verifyValueBounds(this, i2, getMinimumValue(readablePartial, iArr), getMaximumValue(readablePartial, iArr));
        iArr[i] = i2;
        while (true) {
            i++;
            if (i >= readablePartial.size()) {
                return iArr;
            }
            DateTimeField field = readablePartial.getField(i);
            if (iArr[i] > field.getMaximumValue(readablePartial, iArr)) {
                iArr[i] = field.getMaximumValue(readablePartial, iArr);
            }
            if (iArr[i] < field.getMinimumValue(readablePartial, iArr)) {
                iArr[i] = field.getMinimumValue(readablePartial, iArr);
            }
        }
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j) {
        return getAsShortText(j, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j) {
        return getAsText(j, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i, Locale locale) {
        return getAsShortText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j, Locale locale) {
        return getAsShortText(get(j), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j, Locale locale) {
        return getAsText(get(j), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return set(readablePartial, i, iArr, FieldUtils.getWrappedValue(iArr[i], i2, getMinimumValue(readablePartial), getMaximumValue(readablePartial)));
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j, String str, Locale locale) {
        return set(j, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public final long set(long j, String str) {
        return set(j, str, null);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, String str, Locale locale) {
        return set(readablePartial, i, iArr, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j, int i) {
        return getDurationField().add(j, i);
    }
}
