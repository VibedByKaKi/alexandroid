package com.facebook.hermes.intl;

import com.amazon.clouddrive.cdasdk.cds.common.TimeGroupBy;
import com.facebook.hermes.intl.IPlatformDateTimeFormatter;
import com.reactcommunity.rndatetimepicker.RNConstants;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PlatformDateTimeFormatterAndroid implements IPlatformDateTimeFormatter {
    private DateFormat mDateFormat = null;

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

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public void configure(ILocaleObject<?> iLocaleObject, String str, String str2, IPlatformDateTimeFormatter.FormatMatcher formatMatcher, IPlatformDateTimeFormatter.WeekDay weekDay, IPlatformDateTimeFormatter.Era era, IPlatformDateTimeFormatter.Year year, IPlatformDateTimeFormatter.Month month, IPlatformDateTimeFormatter.Day day, IPlatformDateTimeFormatter.Hour hour, IPlatformDateTimeFormatter.Minute minute, IPlatformDateTimeFormatter.Second second, IPlatformDateTimeFormatter.TimeZoneName timeZoneName, IPlatformDateTimeFormatter.HourCycle hourCycle, Object obj, IPlatformDateTimeFormatter.DateStyle dateStyle, IPlatformDateTimeFormatter.TimeStyle timeStyle, Object obj2) throws JSRangeErrorException {
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(JSObjects.getJavaString(str));
            iLocaleObject.setUnicodeExtensions("ca", arrayList);
        }
        if (!str2.isEmpty()) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(JSObjects.getJavaString(str2));
            iLocaleObject.setUnicodeExtensions("nu", arrayList2);
        }
        boolean z = true;
        boolean z2 = (year == null && month == null && day == null) ? false : true;
        if (hour == null && minute == null && second == null) {
            z = false;
        }
        if (z2 && z) {
            this.mDateFormat = DateFormat.getDateTimeInstance(0, 0, (Locale) iLocaleObject.getLocale());
        } else if (z2) {
            this.mDateFormat = DateFormat.getDateInstance(0, (Locale) iLocaleObject.getLocale());
        } else if (z) {
            this.mDateFormat = DateFormat.getTimeInstance(0, (Locale) iLocaleObject.getLocale());
        }
        if (JSObjects.isUndefined(obj) || JSObjects.isNull(obj)) {
            return;
        }
        this.mDateFormat.setTimeZone(TimeZone.getTimeZone(JSObjects.getJavaString(obj)));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
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
    public String format(double d) {
        return this.mDateFormat.format(new Date((long) d));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public AttributedCharacterIterator formatToParts(double d) {
        return this.mDateFormat.formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : DateFormat.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String getDefaultCalendarName(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        return DateFormat.getDateInstance(3, (Locale) iLocaleObject.getLocale()).getCalendar().toString();
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public IPlatformDateTimeFormatter.HourCycle getDefaultHourCycle(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        try {
            String patternWithoutLiterals = PatternUtils.getPatternWithoutLiterals(((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) iLocaleObject.getLocale())).toPattern());
            return patternWithoutLiterals.contains(String.valueOf('h')) ? IPlatformDateTimeFormatter.HourCycle.H12 : patternWithoutLiterals.contains(String.valueOf('K')) ? IPlatformDateTimeFormatter.HourCycle.H11 : patternWithoutLiterals.contains(String.valueOf('H')) ? IPlatformDateTimeFormatter.HourCycle.H23 : IPlatformDateTimeFormatter.HourCycle.H24;
        } catch (ClassCastException unused) {
            return IPlatformDateTimeFormatter.HourCycle.H24;
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String getDefaultNumberingSystem(ILocaleObject<?> iLocaleObject) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String getDefaultTimeZone(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        return Calendar.getInstance((Locale) iLocaleObject.getLocale()).getTimeZone().getID();
    }
}
