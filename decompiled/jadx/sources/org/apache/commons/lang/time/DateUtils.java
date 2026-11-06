package org.apache.commons.lang.time;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.time.TimeZones;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objectweb.asm.signature.SignatureVisitor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DateUtils {
    public static final int MILLIS_IN_DAY = 86400000;
    public static final int MILLIS_IN_HOUR = 3600000;
    public static final int MILLIS_IN_MINUTE = 60000;
    public static final int MILLIS_IN_SECOND = 1000;
    public static final long MILLIS_PER_DAY = 86400000;
    public static final long MILLIS_PER_HOUR = 3600000;
    public static final long MILLIS_PER_MINUTE = 60000;
    public static final long MILLIS_PER_SECOND = 1000;
    private static final int MODIFY_CEILING = 2;
    private static final int MODIFY_ROUND = 1;
    private static final int MODIFY_TRUNCATE = 0;
    public static final int RANGE_MONTH_MONDAY = 6;
    public static final int RANGE_MONTH_SUNDAY = 5;
    public static final int RANGE_WEEK_CENTER = 4;
    public static final int RANGE_WEEK_MONDAY = 2;
    public static final int RANGE_WEEK_RELATIVE = 3;
    public static final int RANGE_WEEK_SUNDAY = 1;
    public static final int SEMI_MONTH = 1001;
    public static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone(TimeZones.GMT_ID);
    private static final int[][] fields = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DateIterator implements Iterator {
        private final Calendar endFinal;
        private final Calendar spot;

        public DateIterator(Calendar calendar, Calendar calendar2) {
            this.endFinal = calendar2;
            this.spot = calendar;
            calendar.add(5, -1);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.spot.before(this.endFinal);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.spot.equals(this.endFinal)) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.spot.add(5, 1);
            return this.spot.clone();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static Date add(Date date, int i, int i2) {
        if (date == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i, i2);
        return calendar.getTime();
    }

    public static Date addDays(Date date, int i) {
        return add(date, 5, i);
    }

    public static Date addHours(Date date, int i) {
        return add(date, 11, i);
    }

    public static Date addMilliseconds(Date date, int i) {
        return add(date, 14, i);
    }

    public static Date addMinutes(Date date, int i) {
        return add(date, 12, i);
    }

    public static Date addMonths(Date date, int i) {
        return add(date, 2, i);
    }

    public static Date addSeconds(Date date, int i) {
        return add(date, 13, i);
    }

    public static Date addWeeks(Date date, int i) {
        return add(date, 3, i);
    }

    public static Date addYears(Date date, int i) {
        return add(date, 1, i);
    }

    public static Date ceiling(Object obj, int i) {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
            return null;
        }
        if (obj instanceof Date) {
            return ceiling((Date) obj, i);
        }
        if (obj instanceof Calendar) {
            return ceiling((Calendar) obj, i).getTime();
        }
        StringBuffer stringBuffer = new StringBuffer("Could not find ceiling of for type: ");
        stringBuffer.append(obj.getClass());
        throw new ClassCastException(stringBuffer.toString());
    }

    private static long getFragment(Calendar calendar, int i, int i2) {
        if (calendar == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
            return 0L;
        }
        long millisPerUnit = getMillisPerUnit(i2);
        long j = i != 1 ? i != 2 ? 0L : (calendar.get(5) * 86400000) / millisPerUnit : (calendar.get(6) * 86400000) / millisPerUnit;
        if (i == 1 || i == 2 || i == 5 || i == 6) {
            j += (calendar.get(11) * 3600000) / millisPerUnit;
        } else {
            switch (i) {
                case 11:
                    break;
                case 12:
                    j += (calendar.get(13) * 1000) / millisPerUnit;
                case 13:
                    return (calendar.get(14) / millisPerUnit) + j;
                case 14:
                    return j;
                default:
                    StringBuffer stringBuffer = new StringBuffer("The fragment ");
                    stringBuffer.append(i);
                    stringBuffer.append(" is not supported");
                    XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
                    return 0L;
            }
        }
        j += (calendar.get(12) * 60000) / millisPerUnit;
        j += (calendar.get(13) * 1000) / millisPerUnit;
        return (calendar.get(14) / millisPerUnit) + j;
    }

    public static long getFragmentInDays(Date date, int i) {
        return getFragment(date, i, 6);
    }

    public static long getFragmentInHours(Date date, int i) {
        return getFragment(date, i, 11);
    }

    public static long getFragmentInMilliseconds(Date date, int i) {
        return getFragment(date, i, 14);
    }

    public static long getFragmentInMinutes(Date date, int i) {
        return getFragment(date, i, 12);
    }

    public static long getFragmentInSeconds(Date date, int i) {
        return getFragment(date, i, 13);
    }

    private static long getMillisPerUnit(int i) {
        if (i == 5 || i == 6) {
            return 86400000L;
        }
        switch (i) {
            case 11:
                return 3600000L;
            case 12:
                return 60000L;
            case 13:
                return 1000L;
            case 14:
                return 1L;
            default:
                StringBuffer stringBuffer = new StringBuffer("The unit ");
                stringBuffer.append(i);
                stringBuffer.append(" cannot be represented is milleseconds");
                XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
                return 0L;
        }
    }

    private static int indexOfSignChars(String str, int i) {
        int indexOf = StringUtils.indexOf(str, SignatureVisitor.EXTENDS, i);
        return indexOf < 0 ? StringUtils.indexOf(str, '-', i) : indexOf;
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return false;
    }

    public static boolean isSameInstant(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            return calendar.getTime().getTime() == calendar2.getTime().getTime();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return false;
    }

    public static boolean isSameLocalTime(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(10) == calendar2.get(10) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[LOOP:0: B:20:0x006e->B:22:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[LOOP:1: B:24:0x0078->B:26:0x007e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Iterator iterator(java.util.Calendar r8, int r9) {
        /*
            if (r8 == 0) goto L88
            r0 = -1
            r1 = 5
            r2 = 2
            r3 = 1
            r4 = 7
            switch(r9) {
                case 1: goto L3a;
                case 2: goto L3a;
                case 3: goto L3a;
                case 4: goto L3a;
                case 5: goto L1e;
                case 6: goto L1e;
                default: goto La;
            }
        La:
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            java.lang.String r0 = "The range style "
            r8.<init>(r0)
            r8.append(r9)
            java.lang.String r9 = " is not valid."
            r8.append(r9)
            org.json.XML$$ExternalSyntheticBUOutline0.m(r8)
            r8 = 0
            return r8
        L1e:
            java.util.Calendar r8 = truncate(r8, r2)
            java.lang.Object r5 = r8.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            r5.add(r2, r3)
            r5.add(r1, r0)
            r6 = 6
            if (r9 != r6) goto L35
            r6 = r5
            r5 = r8
        L33:
            r8 = r3
            goto L5e
        L35:
            r2 = r3
            r6 = r5
            r5 = r8
        L38:
            r8 = r4
            goto L5e
        L3a:
            java.util.Calendar r5 = truncate(r8, r1)
            java.util.Calendar r6 = truncate(r8, r1)
            if (r9 == r2) goto L33
            r2 = 3
            if (r9 == r2) goto L58
            r7 = 4
            if (r9 == r7) goto L4c
            r2 = r3
            goto L38
        L4c:
            int r9 = r8.get(r4)
            int r9 = r9 - r2
            int r8 = r8.get(r4)
            int r8 = r8 + r2
            r2 = r9
            goto L5e
        L58:
            int r2 = r8.get(r4)
            int r8 = r2 + (-1)
        L5e:
            if (r2 >= r3) goto L62
            int r2 = r2 + 7
        L62:
            if (r2 <= r4) goto L66
            int r2 = r2 + (-7)
        L66:
            if (r8 >= r3) goto L6a
            int r8 = r8 + 7
        L6a:
            if (r8 <= r4) goto L6e
            int r8 = r8 + (-7)
        L6e:
            int r9 = r5.get(r4)
            if (r9 == r2) goto L78
            r5.add(r1, r0)
            goto L6e
        L78:
            int r9 = r6.get(r4)
            if (r9 == r8) goto L82
            r6.add(r1, r3)
            goto L78
        L82:
            org.apache.commons.lang.time.DateUtils$DateIterator r8 = new org.apache.commons.lang.time.DateUtils$DateIterator
            r8.<init>(r5, r6)
            return r8
        L88:
            java.lang.String r8 = "The date must not be null"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.time.DateUtils.iterator(java.util.Calendar, int):java.util.Iterator");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
    
        if (r18 == 9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        if (r18 == 1001) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
    
        r7 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
    
        r4 = 0;
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        if (r8 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r4 = r17.getActualMinimum(r9[r5][0]);
        r6 = r17.getActualMaximum(r9[r5][0]);
        r8 = r17.get(r9[r5][0]) - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
    
        if (r8 <= ((r6 - r4) / 2)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0127, code lost:
    
        r6 = r4;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0129, code lost:
    
        if (r4 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012b, code lost:
    
        r8 = r9[r5][0];
        r17.set(r8, r17.get(r8) - r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0137, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cc, code lost:
    
        if (r10[0] != 5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ce, code lost:
    
        r4 = r17.get(5);
        r6 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d4, code lost:
    
        if (r6 < 15) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d6, code lost:
    
        r6 = r4 - 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d9, code lost:
    
        if (r6 <= 7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00db, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00df, code lost:
    
        r7 = r6;
        r6 = r4;
        r4 = r7;
        r8 = true;
        r7 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00dd, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e8, code lost:
    
        if (r10[0] != 11) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ea, code lost:
    
        r4 = r17.get(11);
        r7 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f0, code lost:
    
        if (r4 < 12) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f2, code lost:
    
        r4 = r4 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f4, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f6, code lost:
    
        if (r6 < 6) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f8, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fc, code lost:
    
        r6 = r4;
        r4 = r6;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00fa, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void modify(java.util.Calendar r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.time.DateUtils.modify(java.util.Calendar, int, int):void");
    }

    public static Date parseDate(String str, String[] strArr) throws ParseException {
        return parseDateWithLeniency(str, strArr, true);
    }

    public static Date parseDateStrictly(String str, String[] strArr) throws ParseException {
        return parseDateWithLeniency(str, strArr, false);
    }

    private static Date parseDateWithLeniency(String str, String[] strArr, boolean z) throws ParseException {
        String str2;
        if (str == null || strArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Date and Patterns must not be null");
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.setLenient(z);
        ParsePosition parsePosition = new ParsePosition(0);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str3.endsWith("ZZ")) {
                str3 = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, str3);
            }
            simpleDateFormat.applyPattern(str3);
            parsePosition.setIndex(0);
            if (strArr[i].endsWith("ZZ")) {
                int indexOfSignChars = indexOfSignChars(str, 0);
                str2 = str;
                while (indexOfSignChars >= 0) {
                    str2 = reformatTimezone(str2, indexOfSignChars);
                    indexOfSignChars = indexOfSignChars(str2, indexOfSignChars + 1);
                }
            } else {
                str2 = str;
            }
            Date parse = simpleDateFormat.parse(str2, parsePosition);
            if (parse != null && parsePosition.getIndex() == str2.length()) {
                return parse;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m(-1, "Unable to parse the date: ".concat(str));
        return null;
    }

    private static String reformatTimezone(String str, int i) {
        int i2;
        if (i < 0 || (i2 = i + 5) >= str.length() || !Character.isDigit(str.charAt(i + 1)) || !Character.isDigit(str.charAt(i + 2))) {
            return str;
        }
        int i3 = i + 3;
        if (str.charAt(i3) != ':') {
            return str;
        }
        int i4 = i + 4;
        return (Character.isDigit(str.charAt(i4)) && Character.isDigit(str.charAt(i2))) ? str.substring(0, i3).concat(str.substring(i4)) : str;
    }

    public static Date round(Object obj, int i) {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
            return null;
        }
        if (obj instanceof Date) {
            return round((Date) obj, i);
        }
        if (obj instanceof Calendar) {
            return round((Calendar) obj, i).getTime();
        }
        StringBuffer stringBuffer = new StringBuffer("Could not round ");
        stringBuffer.append(obj);
        throw new ClassCastException(stringBuffer.toString());
    }

    private static Date set(Date date, int i, int i2) {
        if (date == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(i, i2);
        return calendar.getTime();
    }

    public static Date setDays(Date date, int i) {
        return set(date, 5, i);
    }

    public static Date setHours(Date date, int i) {
        return set(date, 11, i);
    }

    public static Date setMilliseconds(Date date, int i) {
        return set(date, 14, i);
    }

    public static Date setMinutes(Date date, int i) {
        return set(date, 12, i);
    }

    public static Date setMonths(Date date, int i) {
        return set(date, 2, i);
    }

    public static Date setSeconds(Date date, int i) {
        return set(date, 13, i);
    }

    public static Date setYears(Date date, int i) {
        return set(date, 1, i);
    }

    public static Calendar toCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date truncate(Object obj, int i) {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
            return null;
        }
        if (obj instanceof Date) {
            return truncate((Date) obj, i);
        }
        if (obj instanceof Calendar) {
            return truncate((Calendar) obj, i).getTime();
        }
        StringBuffer stringBuffer = new StringBuffer("Could not truncate ");
        stringBuffer.append(obj);
        throw new ClassCastException(stringBuffer.toString());
    }

    public static int truncatedCompareTo(Calendar calendar, Calendar calendar2, int i) {
        return truncate(calendar, i).getTime().compareTo(truncate(calendar2, i).getTime());
    }

    public static boolean truncatedEquals(Calendar calendar, Calendar calendar2, int i) {
        return truncatedCompareTo(calendar, calendar2, i) == 0;
    }

    public static long getFragmentInDays(Calendar calendar, int i) {
        return getFragment(calendar, i, 6);
    }

    public static long getFragmentInHours(Calendar calendar, int i) {
        return getFragment(calendar, i, 11);
    }

    public static long getFragmentInMilliseconds(Calendar calendar, int i) {
        return getFragment(calendar, i, 14);
    }

    public static long getFragmentInMinutes(Calendar calendar, int i) {
        return getFragment(calendar, i, 12);
    }

    public static long getFragmentInSeconds(Calendar calendar, int i) {
        return getFragment(calendar, i, 13);
    }

    public static boolean truncatedEquals(Date date, Date date2, int i) {
        return truncatedCompareTo(date, date2, i) == 0;
    }

    public static int truncatedCompareTo(Date date, Date date2, int i) {
        return truncate(date, i).compareTo(truncate(date2, i));
    }

    public static boolean isSameInstant(Date date, Date date2) {
        if (date != null && date2 != null) {
            return date.getTime() == date2.getTime();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return false;
    }

    public static boolean isSameDay(Date date, Date date2) {
        if (date != null && date2 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            return isSameDay(calendar, calendar2);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return false;
    }

    public static Calendar round(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i, 1);
            return calendar2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }

    public static Calendar truncate(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i, 0);
            return calendar2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }

    public static Date round(Date date, int i) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            modify(calendar, i, 1);
            return calendar.getTime();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }

    public static Date truncate(Date date, int i) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            modify(calendar, i, 0);
            return calendar.getTime();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }

    public static Calendar ceiling(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i, 2);
            return calendar2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }

    public static Date ceiling(Date date, int i) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            modify(calendar, i, 2);
            return calendar.getTime();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }

    private static long getFragment(Date date, int i, int i2) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return getFragment(calendar, i, i2);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return 0L;
    }

    public static Iterator iterator(Date date, int i) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return iterator(calendar, i);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }

    public static Iterator iterator(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Date) {
                return iterator((Date) obj, i);
            }
            if (obj instanceof Calendar) {
                return iterator((Calendar) obj, i);
            }
            StringBuffer stringBuffer = new StringBuffer("Could not iterate based on ");
            stringBuffer.append(obj);
            throw new ClassCastException(stringBuffer.toString());
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The date must not be null");
        return null;
    }
}
