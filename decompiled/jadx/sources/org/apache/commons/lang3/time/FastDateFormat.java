package org.apache.commons.lang3.time;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FastDateFormat extends Format implements DateParser, DatePrinter {
    private static final AbstractFormatCache<FastDateFormat> CACHE = new AbstractFormatCache<FastDateFormat>() { // from class: org.apache.commons.lang3.time.FastDateFormat.1
        @Override // org.apache.commons.lang3.time.AbstractFormatCache
        public FastDateFormat createInstance(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    };
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final long serialVersionUID = 2;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    public FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.printer = new FastDatePrinter(str, timeZone, locale);
        this.parser = new FastDateParser(str, timeZone, locale, date);
    }

    public static void clear() {
        AbstractFormatCache.clear();
        CACHE.clearInstance();
    }

    public static FastDateFormat getDateInstance(int i) {
        return CACHE.getDateInstance(i, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2) {
        return CACHE.getDateTimeInstance(i, i2, (TimeZone) null, (Locale) null);
    }

    public static FastDateFormat getInstance(String str) {
        return CACHE.getInstance(str, null, null);
    }

    public static FastDateFormat getTimeInstance(int i) {
        return CACHE.getTimeInstance(i, null, null);
    }

    @Deprecated
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.format(calendar, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDateFormat) {
            return this.printer.equals(((FastDateFormat) obj).printer);
        }
        return false;
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.DatePrinter
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.printer.format(obj));
        return stringBuffer;
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public String getPattern() {
        return this.printer.getPattern();
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Date parse(String str) throws ParseException {
        return this.parser.parse(str);
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.DateParser
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.parser.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.printer.getPattern() + "," + this.printer.getLocale() + "," + this.printer.getTimeZone().getID() + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.parser.parse(str, parsePosition, calendar);
    }

    public static FastDateFormat getDateInstance(int i, Locale locale) {
        return CACHE.getDateInstance(i, null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, Locale locale) {
        return CACHE.getDateTimeInstance(i, i2, (TimeZone) null, locale);
    }

    public static FastDateFormat getInstance() {
        return CACHE.getInstance();
    }

    public static FastDateFormat getTimeInstance(int i, Locale locale) {
        return CACHE.getTimeInstance(i, null, locale);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(Calendar calendar, B b) {
        return (B) this.printer.format(calendar, (Calendar) b);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone) {
        return CACHE.getDateInstance(i, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone) {
        return getDateTimeInstance(i, i2, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return CACHE.getInstance(str, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone) {
        return CACHE.getTimeInstance(i, timeZone, null);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @Deprecated
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.format(calendar, stringBuffer);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return CACHE.getDateInstance(i, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return CACHE.getDateTimeInstance(i, i2, timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return CACHE.getInstance(str, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return CACHE.getTimeInstance(i, timeZone, locale);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(Date date) {
        return this.printer.format(date);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return CACHE.getInstance(str, timeZone, locale);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(Date date, B b) {
        return (B) this.printer.format(date, (Date) b);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @Deprecated
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        return this.printer.format(date, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(long j) {
        return this.printer.format(j);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(long j, B b) {
        return (B) this.printer.format(j, (long) b);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @Deprecated
    public StringBuffer format(long j, StringBuffer stringBuffer) {
        return this.printer.format(j, stringBuffer);
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }
}
