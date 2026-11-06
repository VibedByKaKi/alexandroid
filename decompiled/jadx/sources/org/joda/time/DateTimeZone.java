package org.joda.time;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.dee.sdk.iotsoftap.Constants;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.time.TimeZones;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;
import org.objectweb.asm.signature.SignatureVisitor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class DateTimeZone implements Serializable {
    public static final String DEFAULT_TZ_DATA_PATH = "org/joda/time/tz/data";
    private static final int MAX_MILLIS = 86399999;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LazyInit {
        static final Map<String, String> CONVERSION_MAP = buildMap();
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.LazyInit.1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public DateTimeZone getZone() {
                    return null;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public String toString() {
                    return AnonymousClass1.class.getName();
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withUTC() {
                    return this;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap m = Automotive$$ExternalSyntheticOutline0.m(TimeZones.GMT_ID, Constants.UTC, "WET", "WET");
            m.put("CET", "CET");
            m.put("MET", "CET");
            m.put("ECT", "CET");
            m.put("EET", "EET");
            m.put("MIT", "Pacific/Apia");
            m.put("HST", "Pacific/Honolulu");
            m.put("AST", "America/Anchorage");
            m.put("PST", "America/Los_Angeles");
            m.put("MST", "America/Denver");
            m.put("PNT", "America/Phoenix");
            m.put("CST", "America/Chicago");
            m.put("EST", "America/New_York");
            m.put("IET", "America/Indiana/Indianapolis");
            m.put("PRT", "America/Puerto_Rico");
            m.put("CNT", "America/St_Johns");
            m.put("AGT", "America/Argentina/Buenos_Aires");
            m.put("BET", "America/Sao_Paulo");
            m.put("ART", "Africa/Cairo");
            m.put("CAT", "Africa/Harare");
            m.put("EAT", "Africa/Addis_Ababa");
            m.put("NET", "Asia/Yerevan");
            m.put("PLT", "Asia/Karachi");
            m.put("IST", "Asia/Kolkata");
            m.put("BST", "Asia/Dhaka");
            m.put("VST", "Asia/Ho_Chi_Minh");
            m.put("CTT", "Asia/Shanghai");
            m.put("JST", "Asia/Tokyo");
            m.put("ACT", "Australia/Darwin");
            m.put("AET", "Australia/Sydney");
            m.put("SST", "Pacific/Guadalcanal");
            m.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(m);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        public Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    public DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Id must not be null");
            throw null;
        }
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            int digit = Character.digit(sb.charAt(i), 10);
            if (digit >= 0) {
                sb.setCharAt(i, (char) (digit + 48));
            }
        }
        return sb.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i) {
        return i == 0 ? UTC : new FixedDateTimeZone(str, null, i, i);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals(Constants.UTC)) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int parseOffset = parseOffset(str);
            return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("The datetime zone id '", str, "' is not recognised"));
        return null;
    }

    public static DateTimeZone forOffsetHours(int i) throws IllegalArgumentException {
        return forOffsetHoursMinutes(i, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i, int i2) throws IllegalArgumentException {
        if (i == 0 && i2 == 0) {
            return UTC;
        }
        if (i < -23 || i > 23) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Hours out of range: "));
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Minutes out of range: "));
            return null;
        }
        if (i > 0 && i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Positive hours must not have negative minutes: "));
            return null;
        }
        int i3 = i * 60;
        try {
            return forOffsetMillis(FieldUtils.safeMultiply(i3 < 0 ? i3 - Math.abs(i2) : i3 + i2, 60000));
        } catch (ArithmeticException unused) {
            Single$$ExternalSyntheticBUOutline0.m$3("Offset is too large");
            return null;
        }
    }

    public static DateTimeZone forOffsetMillis(int i) {
        if (i >= -86399999 && i <= MAX_MILLIS) {
            return fixedOffsetZone(printOffset(i), i);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Millis out of range: "));
        return null;
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        char charAt;
        if (timeZone == null) {
            return getDefault();
        }
        String id = timeZone.getID();
        if (id == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The TimeZone id must not be null");
            return null;
        }
        if (id.equals(Constants.UTC)) {
            return UTC;
        }
        String convertedId = getConvertedId(id);
        Provider provider = getProvider();
        DateTimeZone zone = convertedId != null ? provider.getZone(convertedId) : null;
        if (zone == null) {
            zone = provider.getZone(id);
        }
        if (zone != null) {
            return zone;
        }
        if (convertedId != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("The datetime zone id '", id, "' is not recognised"));
            return null;
        }
        String substring = id.substring(3);
        if (substring.length() > 2 && (charAt = substring.charAt(1)) > '9' && Character.isDigit(charAt)) {
            substring = convertToAsciiNumber(substring);
        }
        int parseOffset = parseOffset(substring);
        return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZone = cDefault.get();
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Timezone");
            if (property != null) {
                dateTimeZone = forID(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZone == null) {
            try {
                dateTimeZone = forTimeZone(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZone == null) {
            dateTimeZone = UTC;
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        AtomicReference<DateTimeZone> atomicReference = cDefault;
        while (!atomicReference.compareAndSet(null, dateTimeZone2)) {
            if (atomicReference.get() != null) {
                return cDefault.get();
            }
        }
        return dateTimeZone2;
    }

    private static NameProvider getDefaultNameProvider() {
        NameProvider nameProvider = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!NameProvider.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + NameProvider.class);
                    }
                    nameProvider = (NameProvider) cls.asSubclass(NameProvider.class).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SecurityException unused) {
        }
        return nameProvider == null ? new DefaultNameProvider() : nameProvider;
    }

    private static Provider getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (Provider.class.isAssignableFrom(cls)) {
                        return validateProvider((Provider) cls.asSubclass(Provider.class).getConstructor(null).newInstance(null));
                    }
                    throw new IllegalArgumentException("System property referred to class that does not implement " + Provider.class);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new ZoneInfoProvider(new File(property2)));
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
        } catch (SecurityException unused2) {
        }
        try {
            return validateProvider(new ZoneInfoProvider(DEFAULT_TZ_DATA_PATH));
        } catch (Exception e3) {
            e3.printStackTrace();
            return new UTCProvider();
        }
    }

    public static NameProvider getNameProvider() {
        AtomicReference<NameProvider> atomicReference = cNameProvider;
        NameProvider nameProvider = atomicReference.get();
        if (nameProvider != null) {
            return nameProvider;
        }
        NameProvider defaultNameProvider = getDefaultNameProvider();
        while (!atomicReference.compareAndSet(null, defaultNameProvider)) {
            if (atomicReference.get() != null) {
                return cNameProvider.get();
            }
        }
        return defaultNameProvider;
    }

    public static Provider getProvider() {
        AtomicReference<Provider> atomicReference = cProvider;
        Provider provider = atomicReference.get();
        if (provider != null) {
            return provider;
        }
        Provider defaultProvider = getDefaultProvider();
        while (!atomicReference.compareAndSet(null, defaultProvider)) {
            if (atomicReference.get() != null) {
                return cProvider.get();
            }
        }
        return defaultProvider;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append(SignatureVisitor.EXTENDS);
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        FormatUtils.appendPaddedInteger(stringBuffer, i2, 2);
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        FormatUtils.appendPaddedInteger(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        FormatUtils.appendPaddedInteger(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone != null) {
            cDefault.set(dateTimeZone);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The datetime zone must not be null");
        }
    }

    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (nameProvider == null) {
            nameProvider = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider);
    }

    public static void setProvider(Provider provider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("The provider doesn't have any available ids");
            return null;
        }
        if (!availableIDs.contains(Constants.UTC)) {
            Single$$ExternalSyntheticBUOutline0.m$3("The provider doesn't support UTC");
            return null;
        }
        if (UTC.equals(provider.getZone(Constants.UTC))) {
            return provider;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid UTC zone provided");
        return null;
    }

    public long adjustOffset(long j, boolean z) {
        long j2 = j - 10800000;
        long offset = getOffset(j2);
        long offset2 = getOffset(10800000 + j);
        if (offset <= offset2) {
            return j;
        }
        long j3 = offset - offset2;
        long nextTransition = nextTransition(j2);
        long j4 = nextTransition - j3;
        return (j < j4 || j >= nextTransition + j3) ? j : j - j4 >= j3 ? z ? j : j - j3 : z ? j + j3 : j;
    }

    public long convertLocalToUTC(long j, boolean z) {
        long j2;
        int offset = getOffset(j);
        long j3 = j - offset;
        int offset2 = getOffset(j3);
        if (offset != offset2 && (z || offset < 0)) {
            long nextTransition = nextTransition(j3);
            if (nextTransition == j3) {
                nextTransition = Long.MAX_VALUE;
            }
            long j4 = j - offset2;
            long nextTransition2 = nextTransition(j4);
            if (nextTransition != (nextTransition2 != j4 ? nextTransition2 : Long.MAX_VALUE)) {
                if (z) {
                    throw new IllegalInstantException(j, getID());
                }
                long j5 = offset;
                j2 = j - j5;
                if ((j ^ j2) < 0 || (j ^ j5) >= 0) {
                    return j2;
                }
                Duration$$ExternalSyntheticBUOutline0.m("Subtracting time zone offset caused overflow");
                return 0L;
            }
        }
        offset = offset2;
        long j52 = offset;
        j2 = j - j52;
        if ((j ^ j2) < 0) {
        }
        return j2;
    }

    public long convertUTCToLocal(long j) {
        long offset = getOffset(j);
        long j2 = j + offset;
        if ((j ^ j2) >= 0 || (j ^ offset) < 0) {
            return j2;
        }
        Duration$$ExternalSyntheticBUOutline0.m("Adding time zone offset caused overflow");
        return 0L;
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        return dateTimeZone2 == this ? j : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j), false, j);
    }

    public String getName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        boolean z = nameProvider instanceof DefaultNameProvider;
        String str = this.iID;
        String name = z ? ((DefaultNameProvider) nameProvider).getName(locale, str, nameKey, isStandardOffset(j)) : nameProvider.getName(locale, str, nameKey);
        return name != null ? name : printOffset(getOffset(j));
    }

    public abstract String getNameKey(long j);

    public abstract int getOffset(long j);

    public final int getOffset(ReadableInstant readableInstant) {
        return readableInstant == null ? getOffset(DateTimeUtils.currentTimeMillis()) : getOffset(readableInstant.getMillis());
    }

    public int getOffsetFromLocal(long j) {
        int offset = getOffset(j);
        long j2 = j - offset;
        int offset2 = getOffset(j2);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long nextTransition = nextTransition(j2);
                if (nextTransition == j2) {
                    nextTransition = Long.MAX_VALUE;
                }
                long j3 = j - offset2;
                long nextTransition2 = nextTransition(j3);
                if (nextTransition != (nextTransition2 != j3 ? nextTransition2 : Long.MAX_VALUE)) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long previousTransition = previousTransition(j2);
            if (previousTransition < j2) {
                int offset3 = getOffset(previousTransition);
                if (j2 - previousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public String getShortName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        boolean z = nameProvider instanceof DefaultNameProvider;
        String str = this.iID;
        String shortName = z ? ((DefaultNameProvider) nameProvider).getShortName(locale, str, nameKey, isStandardOffset(j)) : nameProvider.getShortName(locale, str, nameKey);
        return shortName != null ? shortName : printOffset(getOffset(j));
    }

    public abstract int getStandardOffset(long j);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    public boolean isStandardOffset(long j) {
        return getOffset(j) == getStandardOffset(j);
    }

    public abstract long nextTransition(long j);

    public abstract long previousTransition(long j);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }

    public final String getName(long j) {
        return getName(j, null);
    }

    public final String getShortName(long j) {
        return getShortName(j, null);
    }

    public long convertLocalToUTC(long j, boolean z, long j2) {
        int offset = getOffset(j2);
        long j3 = j - offset;
        return getOffset(j3) == offset ? j3 : convertLocalToUTC(j, z);
    }
}
