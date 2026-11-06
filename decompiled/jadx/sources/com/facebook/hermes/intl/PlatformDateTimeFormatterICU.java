package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import androidx.annotation.RequiresApi;
import androidx.core.text.util.LocalePreferences;
import com.amazon.clouddrive.cdasdk.cds.common.TimeGroupBy;
import com.facebook.hermes.intl.IPlatformDateTimeFormatter;
import com.reactcommunity.rndatetimepicker.RNConstants;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PlatformDateTimeFormatterICU implements IPlatformDateTimeFormatter {
    private DateFormat mDateFormat = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.facebook.hermes.intl.PlatformDateTimeFormatterICU$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$DateStyle;
        static final /* synthetic */ int[] $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$TimeStyle;

        static {
            int[] iArr = new int[IPlatformDateTimeFormatter.TimeStyle.values().length];
            $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$TimeStyle = iArr;
            try {
                iArr[IPlatformDateTimeFormatter.TimeStyle.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$TimeStyle[IPlatformDateTimeFormatter.TimeStyle.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$TimeStyle[IPlatformDateTimeFormatter.TimeStyle.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$TimeStyle[IPlatformDateTimeFormatter.TimeStyle.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$TimeStyle[IPlatformDateTimeFormatter.TimeStyle.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[IPlatformDateTimeFormatter.DateStyle.values().length];
            $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$DateStyle = iArr2;
            try {
                iArr2[IPlatformDateTimeFormatter.DateStyle.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$DateStyle[IPlatformDateTimeFormatter.DateStyle.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$DateStyle[IPlatformDateTimeFormatter.DateStyle.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$DateStyle[IPlatformDateTimeFormatter.DateStyle.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$DateStyle[IPlatformDateTimeFormatter.DateStyle.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PatternUtils {
        private PatternUtils() {
        }

        public static String getPatternWithoutLiterals(String str) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    z = !z;
                } else if (!z && ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }
    }

    @RequiresApi(api = 24)
    private static String getPatternForStyle(ILocaleObject<?> iLocaleObject, IPlatformDateTimeFormatter.DateStyle dateStyle, IPlatformDateTimeFormatter.TimeStyle timeStyle) throws JSRangeErrorException {
        return dateStyle == IPlatformDateTimeFormatter.DateStyle.UNDEFINED ? ((SimpleDateFormat) DateFormat.getTimeInstance(toICUTimeStyle(timeStyle), (ULocale) iLocaleObject.getLocale())).toLocalizedPattern() : timeStyle == IPlatformDateTimeFormatter.TimeStyle.UNDEFINED ? ((SimpleDateFormat) DateFormat.getDateInstance(toICUDateStyle(dateStyle), (ULocale) iLocaleObject.getLocale())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(toICUDateStyle(dateStyle), toICUTimeStyle(timeStyle), (ULocale) iLocaleObject.getLocale())).toLocalizedPattern();
    }

    @RequiresApi(api = 24)
    private static String getSkeleton(ILocaleObject<?> iLocaleObject, IPlatformDateTimeFormatter.WeekDay weekDay, IPlatformDateTimeFormatter.Era era, IPlatformDateTimeFormatter.Year year, IPlatformDateTimeFormatter.Month month, IPlatformDateTimeFormatter.Day day, IPlatformDateTimeFormatter.Hour hour, IPlatformDateTimeFormatter.Minute minute, IPlatformDateTimeFormatter.Second second, IPlatformDateTimeFormatter.TimeZoneName timeZoneName, IPlatformDateTimeFormatter.HourCycle hourCycle, IPlatformDateTimeFormatter.DateStyle dateStyle, IPlatformDateTimeFormatter.TimeStyle timeStyle, Object obj) throws JSRangeErrorException {
        StringBuilder sb = new StringBuilder();
        if (dateStyle == IPlatformDateTimeFormatter.DateStyle.UNDEFINED && timeStyle == IPlatformDateTimeFormatter.TimeStyle.UNDEFINED) {
            sb.append(weekDay.getSkeleonSymbol());
            sb.append(era.getSkeleonSymbol());
            sb.append(year.getSkeleonSymbol());
            sb.append(month.getSkeleonSymbol());
            sb.append(day.getSkeleonSymbol());
            if (hourCycle == IPlatformDateTimeFormatter.HourCycle.H11 || hourCycle == IPlatformDateTimeFormatter.HourCycle.H12) {
                sb.append(hour.getSkeleonSymbol12());
            } else {
                sb.append(hour.getSkeleonSymbol24());
            }
            sb.append(minute.getSkeleonSymbol());
            sb.append(second.getSkeleonSymbol());
            sb.append(timeZoneName.getSkeleonSymbol());
        } else {
            sb.append(getPatternForStyle(iLocaleObject, dateStyle, timeStyle));
            HashMap<String, String> unicodeExtensions = iLocaleObject.getUnicodeExtensions();
            if (unicodeExtensions.containsKey("hc")) {
                String str = unicodeExtensions.get("hc");
                if (str == LocalePreferences.HourCycle.H11 || str == LocalePreferences.HourCycle.H12) {
                    replacePatternChars(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == LocalePreferences.HourCycle.H23 || str == LocalePreferences.HourCycle.H24) {
                    replacePatternChars(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (hourCycle == IPlatformDateTimeFormatter.HourCycle.H11 || hourCycle == IPlatformDateTimeFormatter.HourCycle.H12) {
                replacePatternChars(sb, new char[]{'H', 'K', 'k'}, 'h');
            } else if (hourCycle == IPlatformDateTimeFormatter.HourCycle.H23 || hourCycle == IPlatformDateTimeFormatter.HourCycle.H24) {
                replacePatternChars(sb, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!JSObjects.isUndefined(obj) && !JSObjects.isNull(obj)) {
                if (JSObjects.getJavaBoolean(obj)) {
                    replacePatternChars(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    replacePatternChars(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb.toString();
    }

    private static void replaceChars(StringBuilder sb, String str, String str2) {
        int indexOf = sb.indexOf(str);
        if (indexOf != -1) {
            sb.replace(indexOf, str.length() + indexOf, str2);
        }
    }

    private static void replacePatternChars(StringBuilder sb, char[] cArr, char c) {
        for (int i = 0; i < sb.length(); i++) {
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (sb.charAt(i) == cArr[i2]) {
                        sb.setCharAt(i, c);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    @RequiresApi(api = 24)
    public static int toICUDateStyle(IPlatformDateTimeFormatter.DateStyle dateStyle) throws JSRangeErrorException {
        int i = AnonymousClass1.$SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$DateStyle[dateStyle.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new JSRangeErrorException("Invalid DateStyle: " + dateStyle.toString());
    }

    @RequiresApi(api = 24)
    public static int toICUTimeStyle(IPlatformDateTimeFormatter.TimeStyle timeStyle) throws JSRangeErrorException {
        int i = AnonymousClass1.$SwitchMap$com$facebook$hermes$intl$IPlatformDateTimeFormatter$TimeStyle[timeStyle.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new JSRangeErrorException("Invalid DateStyle: " + timeStyle.toString());
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public void configure(ILocaleObject<?> iLocaleObject, String str, String str2, IPlatformDateTimeFormatter.FormatMatcher formatMatcher, IPlatformDateTimeFormatter.WeekDay weekDay, IPlatformDateTimeFormatter.Era era, IPlatformDateTimeFormatter.Year year, IPlatformDateTimeFormatter.Month month, IPlatformDateTimeFormatter.Day day, IPlatformDateTimeFormatter.Hour hour, IPlatformDateTimeFormatter.Minute minute, IPlatformDateTimeFormatter.Second second, IPlatformDateTimeFormatter.TimeZoneName timeZoneName, IPlatformDateTimeFormatter.HourCycle hourCycle, Object obj, IPlatformDateTimeFormatter.DateStyle dateStyle, IPlatformDateTimeFormatter.TimeStyle timeStyle, Object obj2) throws JSRangeErrorException {
        Calendar calendar;
        ILocaleObject<?> iLocaleObject2;
        String skeleton = getSkeleton(iLocaleObject, weekDay, era, year, month, day, hour, minute, second, timeZoneName, hourCycle, dateStyle, timeStyle, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(JSObjects.getJavaString(str));
            ILocaleObject<?> cloneObject = iLocaleObject.cloneObject();
            cloneObject.setUnicodeExtensions("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) cloneObject.getLocale());
        }
        if (str2.isEmpty()) {
            iLocaleObject2 = iLocaleObject;
        } else {
            try {
                if (NumberingSystem.getInstanceByName(JSObjects.getJavaString(str2)) == null) {
                    throw new JSRangeErrorException("Invalid numbering system: ".concat(str2));
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.add(JSObjects.getJavaString(str2));
                iLocaleObject2 = iLocaleObject;
                iLocaleObject2.setUnicodeExtensions("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new JSRangeErrorException("Invalid numbering system: ".concat(str2));
            }
        }
        if (calendar != null) {
            this.mDateFormat = DateFormat.getPatternInstance(calendar, skeleton, (ULocale) iLocaleObject2.getLocale());
        } else {
            this.mDateFormat = DateFormat.getPatternInstance(skeleton, (ULocale) iLocaleObject2.getLocale());
        }
        if (JSObjects.isUndefined(obj) || JSObjects.isNull(obj)) {
            return;
        }
        this.mDateFormat.setTimeZone(TimeZone.getTimeZone(JSObjects.getJavaString(obj)));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public String fieldToString(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? TimeGroupBy.MONTH : attribute == DateFormat.Field.DAY_OF_MONTH ? TimeGroupBy.DAY : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? "hour" : attribute == DateFormat.Field.MINUTE ? "minute" : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? RNConstants.ARG_TZ_NAME : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return TimeGroupBy.YEAR;
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public String format(double d) {
        return this.mDateFormat.format(new Date((long) d));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public AttributedCharacterIterator formatToParts(double d) {
        return this.mDateFormat.formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (ULocale uLocale : ULocale.getAvailableLocales()) {
            arrayList.add(uLocale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public String getDefaultCalendarName(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        return UnicodeExtensionKeys.resolveCalendarAlias(DateFormat.getDateInstance(3, (ULocale) iLocaleObject.getLocale()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public IPlatformDateTimeFormatter.HourCycle getDefaultHourCycle(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        try {
            String patternWithoutLiterals = PatternUtils.getPatternWithoutLiterals(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) iLocaleObject.getLocale())).toPattern());
            return patternWithoutLiterals.contains(String.valueOf('h')) ? IPlatformDateTimeFormatter.HourCycle.H12 : patternWithoutLiterals.contains(String.valueOf('K')) ? IPlatformDateTimeFormatter.HourCycle.H11 : patternWithoutLiterals.contains(String.valueOf('H')) ? IPlatformDateTimeFormatter.HourCycle.H23 : IPlatformDateTimeFormatter.HourCycle.H24;
        } catch (ClassCastException unused) {
            return IPlatformDateTimeFormatter.HourCycle.H24;
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public String getDefaultNumberingSystem(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        return NumberingSystem.getInstance((ULocale) iLocaleObject.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    @RequiresApi(api = 24)
    public String getDefaultTimeZone(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        return Calendar.getInstance((ULocale) iLocaleObject.getLocale()).getTimeZone().getID();
    }
}
