package org.joda.time.format;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class PeriodFormatterBuilder {
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MAX_FIELD = 9;
    private static final int MILLIS = 7;
    private static final int MINUTES = 5;
    private static final int MONTHS = 1;
    private static final ConcurrentMap<String, Pattern> PATTERNS = new ConcurrentHashMap();
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_NEVER = 5;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int SECONDS = 6;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int WEEKS = 2;
    private static final int YEARS = 0;
    private List<Object> iElementPairs;
    private FieldFormatter[] iFieldFormatters;
    private int iMaxParsedDigits;
    private int iMinPrintedDigits;
    private boolean iNotParser;
    private boolean iNotPrinter;
    private PeriodFieldAffix iPrefix;
    private int iPrintZeroSetting;
    private boolean iRejectSignedValues;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class IgnorableAffix implements PeriodFieldAffix {
        private volatile String[] iOtherAffixes;

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void finish(Set<PeriodFieldAffix> set) {
            if (this.iOtherAffixes == null) {
                int i = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : getAffixes()) {
                    if (str2.length() < i) {
                        i = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (PeriodFieldAffix periodFieldAffix : set) {
                    if (periodFieldAffix != null) {
                        for (String str3 : periodFieldAffix.getAffixes()) {
                            if (str3.length() > i || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.iOtherAffixes = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        public boolean matchesOtherAffix(int i, String str, int i2) {
            String str2;
            int i3;
            if (this.iOtherAffixes != null) {
                String[] strArr = this.iOtherAffixes;
                int length = strArr.length;
                int i4 = 0;
                while (i4 < length) {
                    String str3 = strArr[i4];
                    int length2 = str3.length();
                    if (i < length2) {
                        str2 = str;
                        i3 = i2;
                        if (str2.regionMatches(true, i3, str3, 0, length2)) {
                            return true;
                        }
                    } else {
                        str2 = str;
                        i3 = i2;
                    }
                    if (i == length2 && str2.regionMatches(false, i3, str3, 0, length2)) {
                        return true;
                    }
                    i4++;
                    str = str2;
                    i2 = i3;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PeriodFieldAffix {
        int calculatePrintedLength(int i);

        void finish(Set<PeriodFieldAffix> set);

        String[] getAffixes();

        int parse(String str, int i);

        void printTo(Writer writer, int i) throws IOException;

        void printTo(StringBuffer stringBuffer, int i);

        int scan(String str, int i);
    }

    public PeriodFormatterBuilder() {
        clear();
    }

    private PeriodFormatterBuilder append0(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.iElementPairs.add(periodPrinter);
        this.iElementPairs.add(periodParser);
        this.iNotPrinter = (periodPrinter == null) | this.iNotPrinter;
        this.iNotParser |= periodParser == null;
        return this;
    }

    private void appendField(int i, int i2) {
        FieldFormatter fieldFormatter = new FieldFormatter(i2, this.iPrintZeroSetting, this.iMaxParsedDigits, this.iRejectSignedValues, i, this.iFieldFormatters, this.iPrefix, null);
        append0(fieldFormatter, fieldFormatter);
        this.iFieldFormatters[i] = fieldFormatter;
        this.iPrefix = null;
    }

    private PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr, boolean z, boolean z2) {
        Separator separator;
        if (str == null || str2 == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        clearPrefix();
        List<Object> list = this.iElementPairs;
        if (list.size() == 0) {
            if (z2 && !z) {
                Literal literal = Literal.EMPTY;
                Separator separator2 = new Separator(str, str2, strArr, literal, literal, z, z2);
                append0(separator2, separator2);
            }
            return this;
        }
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                separator = null;
                break;
            }
            if (list.get(i) instanceof Separator) {
                separator = (Separator) list.get(i);
                list = list.subList(size, list.size());
                break;
            }
            size -= 2;
        }
        if (separator != null && list.size() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot have two adjacent separators");
            return null;
        }
        Object[] createComposite = createComposite(list);
        list.clear();
        Separator separator3 = new Separator(str, str2, strArr, (PeriodPrinter) createComposite[0], (PeriodParser) createComposite[1], z, z2);
        list.add(separator3);
        list.add(separator3);
        return this;
    }

    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix periodFieldAffix) {
        Object obj;
        Object obj2;
        if (this.iElementPairs.size() > 0) {
            obj = ErrorUtils$$ExternalSyntheticOutline0.m(this.iElementPairs, 2);
            obj2 = ErrorUtils$$ExternalSyntheticOutline0.m(this.iElementPairs, 1);
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj == null || obj2 == null || obj != obj2 || !(obj instanceof FieldFormatter)) {
            Single$$ExternalSyntheticBUOutline0.m$2("No field to apply suffix to");
            return null;
        }
        clearPrefix();
        FieldFormatter fieldFormatter = new FieldFormatter((FieldFormatter) obj, periodFieldAffix);
        List<Object> list = this.iElementPairs;
        list.set(list.size() - 2, fieldFormatter);
        List<Object> list2 = this.iElementPairs;
        list2.set(list2.size() - 1, fieldFormatter);
        this.iFieldFormatters[fieldFormatter.getFieldType()] = fieldFormatter;
        return this;
    }

    private void clearPrefix() throws IllegalStateException {
        if (this.iPrefix == null) {
            this.iPrefix = null;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Prefix not followed by field");
        }
    }

    private static Object[] createComposite(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            Literal literal = Literal.EMPTY;
            return new Object[]{literal, literal};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        Composite composite = new Composite(list);
        return new Object[]{composite, composite};
    }

    private static PeriodFormatter toFormatter(List<Object> list, boolean z, boolean z2) {
        if (z && z2) {
            Single$$ExternalSyntheticBUOutline0.m$2("Builder has created neither a printer nor a parser");
            return null;
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof Separator)) {
            Separator separator = (Separator) list.get(0);
            if (separator.iAfterParser == null && separator.iAfterPrinter == null) {
                PeriodFormatter formatter = toFormatter(list.subList(2, size), z, z2);
                Separator finish = separator.finish(formatter.getPrinter(), formatter.getParser());
                return new PeriodFormatter(finish, finish);
            }
        }
        Object[] createComposite = createComposite(list);
        return z ? new PeriodFormatter(null, (PeriodParser) createComposite[1]) : z2 ? new PeriodFormatter((PeriodPrinter) createComposite[0], null) : new PeriodFormatter((PeriodPrinter) createComposite[0], (PeriodParser) createComposite[1]);
    }

    public PeriodFormatterBuilder append(PeriodFormatter periodFormatter) {
        if (periodFormatter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("No formatter supplied");
            return null;
        }
        clearPrefix();
        append0(periodFormatter.getPrinter(), periodFormatter.getParser());
        return this;
    }

    public PeriodFormatterBuilder appendDays() {
        appendField(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours() {
        appendField(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Literal must not be null");
            return null;
        }
        clearPrefix();
        Literal literal = new Literal(str);
        append0(literal, literal);
        return this;
    }

    public PeriodFormatterBuilder appendMillis() {
        appendField(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit() {
        appendField(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes() {
        appendField(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths() {
        appendField(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendPrefix(new RegExAffix(strArr, strArr2));
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public PeriodFormatterBuilder appendSeconds() {
        appendField(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis() {
        appendField(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
        appendField(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String str) {
        return appendSeparator(str, str, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String str) {
        return appendSeparator(str, str, null, true, false);
    }

    public PeriodFormatterBuilder appendWeeks() {
        appendField(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears() {
        appendField(0);
        return this;
    }

    public void clear() {
        this.iMinPrintedDigits = 1;
        this.iPrintZeroSetting = 2;
        this.iMaxParsedDigits = 10;
        this.iRejectSignedValues = false;
        this.iPrefix = null;
        List<Object> list = this.iElementPairs;
        if (list == null) {
            this.iElementPairs = new ArrayList();
        } else {
            list.clear();
        }
        this.iNotPrinter = false;
        this.iNotParser = false;
        this.iFieldFormatters = new FieldFormatter[10];
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i) {
        this.iMaxParsedDigits = i;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i) {
        this.iMinPrintedDigits = i;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways() {
        this.iPrintZeroSetting = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported() {
        this.iPrintZeroSetting = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever() {
        this.iPrintZeroSetting = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst() {
        this.iPrintZeroSetting = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast() {
        this.iPrintZeroSetting = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean z) {
        this.iRejectSignedValues = z;
        return this;
    }

    public PeriodParser toParser() {
        if (this.iNotParser) {
            return null;
        }
        return toFormatter().getParser();
    }

    public PeriodPrinter toPrinter() {
        if (this.iNotPrinter) {
            return null;
        }
        return toFormatter().getPrinter();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Literal implements PeriodPrinter, PeriodParser {
        static final Literal EMPTY = new Literal("");
        private final String iText;

        public Literal(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            return 0;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            String str2 = this.iText;
            return str.regionMatches(true, i, str2, 0, str2.length()) ? this.iText.length() + i : ~i;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            writer.write(this.iText);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleAffix extends IgnorableAffix {
        private final String iText;

        public SimpleAffix(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i) {
            String str2 = this.iText;
            int length = str2.length();
            return (!str.regionMatches(true, i, str2, 0, length) || matchesOtherAffix(length, str, i)) ? ~i : i + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i) {
            String str2 = this.iText;
            int length = str2.length();
            int length2 = str.length();
            int i2 = i;
            while (i2 < length2) {
                String str3 = str;
                if (str3.regionMatches(true, i2, str2, 0, length) && !matchesOtherAffix(length, str3, i2)) {
                    return i2;
                }
                switch (str3.charAt(i2)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i2++;
                        str = str3;
                }
                return ~i;
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i) throws IOException {
            writer.write(this.iText);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CompositeAffix extends IgnorableAffix {
        private final PeriodFieldAffix iLeft;
        private final String[] iLeftRightCombinations;
        private final PeriodFieldAffix iRight;

        public CompositeAffix(PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iLeft = periodFieldAffix;
            this.iRight = periodFieldAffix2;
            HashSet hashSet = new HashSet();
            for (String str : periodFieldAffix.getAffixes()) {
                for (String str2 : this.iRight.getAffixes()) {
                    hashSet.add(str + str2);
                }
            }
            this.iLeftRightCombinations = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i) {
            return this.iLeft.calculatePrintedLength(i) + this.iRight.calculatePrintedLength(i);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iLeftRightCombinations.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i) {
            int parse = this.iLeft.parse(str, i);
            return (parse < 0 || (parse = this.iRight.parse(str, parse)) < 0 || !matchesOtherAffix(parse(str, parse) - parse, str, i)) ? parse : ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i) {
            this.iLeft.printTo(stringBuffer, i);
            this.iRight.printTo(stringBuffer, i);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i) {
            int scan;
            int scan2 = this.iLeft.scan(str, i);
            return (scan2 < 0 || ((scan = this.iRight.scan(str, this.iLeft.parse(str, scan2))) >= 0 && matchesOtherAffix(this.iRight.parse(str, scan) - scan2, str, i))) ? ~i : scan2 > 0 ? scan2 : scan;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i) throws IOException {
            this.iLeft.printTo(writer, i);
            this.iRight.printTo(writer, i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PluralAffix extends IgnorableAffix {
        private final String iPluralText;
        private final String iSingularText;

        public PluralAffix(String str, String str2) {
            this.iSingularText = str;
            this.iPluralText = str2;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i) {
            return (i == 1 ? this.iSingularText : this.iPluralText).length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iSingularText, this.iPluralText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i) {
            String str2;
            String str3;
            int length;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            if (str.regionMatches(true, i, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i)) {
                length = str2.length();
            } else {
                if (!str.regionMatches(true, i, str3, 0, str3.length()) || matchesOtherAffix(str3.length(), str, i)) {
                    return ~i;
                }
                length = str3.length();
            }
            return length + i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i) {
            stringBuffer.append(i == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i) {
            String str2;
            String str3;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            int length = str2.length();
            int length2 = str3.length();
            int length3 = str.length();
            int i2 = i;
            while (i2 < length3) {
                String str6 = str;
                if (!str6.regionMatches(true, i2, str2, 0, length) || matchesOtherAffix(str2.length(), str6, i2)) {
                    int i3 = length2;
                    if (!str6.regionMatches(true, i2, str3, 0, i3) || matchesOtherAffix(str3.length(), str6, i2)) {
                        i2++;
                        str = str6;
                        length2 = i3;
                    }
                }
                return i2;
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i) throws IOException {
            writer.write(i == 1 ? this.iSingularText : this.iPluralText);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RegExAffix extends IgnorableAffix {
        private static final Comparator<String> LENGTH_DESC_COMPARATOR = new Comparator<String>() { // from class: org.joda.time.format.PeriodFormatterBuilder.RegExAffix.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        };
        private final Pattern[] iPatterns;
        private final String[] iSuffixes;
        private final String[] iSuffixesSortedDescByLength;

        public RegExAffix(String[] strArr, String[] strArr2) {
            this.iSuffixes = (String[]) strArr2.clone();
            this.iPatterns = new Pattern[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                Pattern pattern = (Pattern) PeriodFormatterBuilder.PATTERNS.get(strArr[i]);
                if (pattern == null) {
                    pattern = Pattern.compile(strArr[i]);
                    PeriodFormatterBuilder.PATTERNS.putIfAbsent(strArr[i], pattern);
                }
                this.iPatterns[i] = pattern;
            }
            String[] strArr3 = (String[]) this.iSuffixes.clone();
            this.iSuffixesSortedDescByLength = strArr3;
            Arrays.sort(strArr3, LENGTH_DESC_COMPARATOR);
        }

        private int selectSuffixIndex(int i) {
            String valueOf = String.valueOf(i);
            int i2 = 0;
            while (true) {
                Pattern[] patternArr = this.iPatterns;
                if (i2 >= patternArr.length) {
                    return patternArr.length - 1;
                }
                if (patternArr[i2].matcher(valueOf).matches()) {
                    return i2;
                }
                i2++;
            }
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i) {
            return this.iSuffixes[selectSuffixIndex(i)].length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iSuffixes.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i) {
            String[] strArr = this.iSuffixesSortedDescByLength;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = strArr[i2];
                String str3 = str;
                int i3 = i;
                if (str3.regionMatches(true, i3, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str3, i3)) {
                    return str2.length() + i3;
                }
                i2++;
                str = str3;
                i = i3;
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.iSuffixes[selectSuffixIndex(i)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i) {
            int length = str.length();
            for (int i2 = i; i2 < length; i2++) {
                String[] strArr = this.iSuffixesSortedDescByLength;
                int length2 = strArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    String str2 = strArr[i3];
                    String str3 = str;
                    if (str3.regionMatches(true, i2, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str3, i2)) {
                        return i2;
                    }
                    i3++;
                    str = str3;
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i) throws IOException {
            writer.write(this.iSuffixes[selectSuffixIndex(i)]);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Composite implements PeriodPrinter, PeriodParser {
        private final PeriodParser[] iParsers;
        private final PeriodPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.iPrinters = null;
            } else {
                this.iPrinters = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.iParsers = null;
            } else {
                this.iParsers = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof Composite) {
                        addArrayToList(list2, ((Composite) obj).iPrinters);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof PeriodParser) {
                    if (obj2 instanceof Composite) {
                        addArrayToList(list3, ((Composite) obj2).iParsers);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                i += periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int i2 = 0;
            while (i2 < i) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 += periodPrinterArr[length].countFieldsToPrint(readablePeriod, Integer.MAX_VALUE, locale);
            }
            return i2;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            PeriodParser[] periodParserArr = this.iParsers;
            if (periodParserArr == null) {
                Duration$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            int length = periodParserArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = periodParserArr[i2].parseInto(readWritablePeriod, str, i, locale);
            }
            return i;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(writer, readablePeriod, locale);
            }
        }
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        if (periodPrinter == null && periodParser == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("No printer or parser supplied");
            return null;
        }
        clearPrefix();
        append0(periodPrinter, periodParser);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendPrefix(new PluralAffix(str, str2));
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private void appendField(int i) {
        appendField(i, this.iMinPrintedDigits);
    }

    public PeriodFormatterBuilder appendPrefix(String str) {
        if (str != null) {
            return appendPrefix(new SimpleAffix(str));
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix periodFieldAffix) {
        if (periodFieldAffix != null) {
            PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix = new CompositeAffix(periodFieldAffix2, periodFieldAffix);
            }
            this.iPrefix = periodFieldAffix;
            return this;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FieldFormatter implements PeriodPrinter, PeriodParser {
        private final FieldFormatter[] iFieldFormatters;
        private final int iFieldType;
        private final int iMaxParsedDigits;
        private final int iMinPrintedDigits;
        private final PeriodFieldAffix iPrefix;
        private final int iPrintZeroSetting;
        private final boolean iRejectSignedValues;
        private final PeriodFieldAffix iSuffix;

        public FieldFormatter(FieldFormatter fieldFormatter, PeriodFieldAffix periodFieldAffix) {
            this.iMinPrintedDigits = fieldFormatter.iMinPrintedDigits;
            this.iPrintZeroSetting = fieldFormatter.iPrintZeroSetting;
            this.iMaxParsedDigits = fieldFormatter.iMaxParsedDigits;
            this.iRejectSignedValues = fieldFormatter.iRejectSignedValues;
            this.iFieldType = fieldFormatter.iFieldType;
            this.iFieldFormatters = fieldFormatter.iFieldFormatters;
            this.iPrefix = fieldFormatter.iPrefix;
            PeriodFieldAffix periodFieldAffix2 = fieldFormatter.iSuffix;
            this.iSuffix = periodFieldAffix2 != null ? new CompositeAffix(periodFieldAffix2, periodFieldAffix) : periodFieldAffix;
        }

        private int parseInt(String str, int i, int i2) {
            if (i2 >= 10) {
                return Integer.parseInt(str.substring(i, i2 + i));
            }
            boolean z = false;
            if (i2 <= 0) {
                return 0;
            }
            int i3 = i + 1;
            char charAt = str.charAt(i);
            int i4 = i2 - 1;
            if (charAt == '-') {
                i4 = i2 - 2;
                if (i4 < 0) {
                    return 0;
                }
                charAt = str.charAt(i3);
                z = true;
                i3 = i + 2;
            }
            int i5 = charAt - '0';
            while (true) {
                int i6 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                int charAt2 = (str.charAt(i3) + ((i5 << 3) + (i5 << 1))) - 48;
                i4 = i6;
                i3++;
                i5 = charAt2;
            }
            return z ? -i5 : i5;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return 0;
            }
            int max = Math.max(FormatUtils.calculateDigitCount(fieldValue), this.iMinPrintedDigits);
            if (this.iFieldType >= 8) {
                int max2 = Math.max(max, fieldValue < 0 ? 5 : 4);
                max = (this.iFieldType == 9 && Math.abs(fieldValue) % 1000 == 0) ? max2 - 3 : max2 + 1;
                fieldValue /= 1000;
            }
            int i = (int) fieldValue;
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                max += periodFieldAffix.calculatePrintedLength(i);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            return periodFieldAffix2 != null ? max + periodFieldAffix2.calculatePrintedLength(i) : max;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            if (i <= 0) {
                return 0;
            }
            return (this.iPrintZeroSetting == 4 || getFieldValue(readablePeriod) != Long.MAX_VALUE) ? 1 : 0;
        }

        public void finish(FieldFormatter[] fieldFormatterArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (FieldFormatter fieldFormatter : fieldFormatterArr) {
                if (fieldFormatter != null && !equals(fieldFormatter)) {
                    hashSet.add(fieldFormatter.iPrefix);
                    hashSet2.add(fieldFormatter.iSuffix);
                }
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.finish(hashSet);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.finish(hashSet2);
            }
        }

        public int getFieldType() {
            return this.iFieldType;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long getFieldValue(org.joda.time.ReadablePeriod r10) {
            /*
                r9 = this;
                int r0 = r9.iPrintZeroSetting
                r1 = 4
                if (r0 != r1) goto L7
                r0 = 0
                goto Lb
            L7:
                org.joda.time.PeriodType r0 = r10.getPeriodType()
            Lb:
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                if (r0 == 0) goto L1b
                int r3 = r9.iFieldType
                boolean r3 = r9.isSupported(r0, r3)
                if (r3 != 0) goto L1b
                return r1
            L1b:
                int r3 = r9.iFieldType
                switch(r3) {
                    case 0: goto L78;
                    case 1: goto L6f;
                    case 2: goto L66;
                    case 3: goto L5d;
                    case 4: goto L54;
                    case 5: goto L4b;
                    case 6: goto L42;
                    case 7: goto L38;
                    case 8: goto L21;
                    case 9: goto L21;
                    default: goto L20;
                }
            L20:
                return r1
            L21:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.seconds()
                int r3 = r10.get(r3)
                org.joda.time.DurationFieldType r4 = org.joda.time.DurationFieldType.millis()
                int r4 = r10.get(r4)
                long r5 = (long) r3
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r7
                long r3 = (long) r4
                long r5 = r5 + r3
                goto L81
            L38:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.millis()
                int r3 = r10.get(r3)
            L40:
                long r5 = (long) r3
                goto L81
            L42:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.seconds()
                int r3 = r10.get(r3)
                goto L40
            L4b:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.minutes()
                int r3 = r10.get(r3)
                goto L40
            L54:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.hours()
                int r3 = r10.get(r3)
                goto L40
            L5d:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.days()
                int r3 = r10.get(r3)
                goto L40
            L66:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.weeks()
                int r3 = r10.get(r3)
                goto L40
            L6f:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.months()
                int r3 = r10.get(r3)
                goto L40
            L78:
                org.joda.time.DurationFieldType r3 = org.joda.time.DurationFieldType.years()
                int r3 = r10.get(r3)
                goto L40
            L81:
                r3 = 0
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 != 0) goto Ldd
                int r3 = r9.iPrintZeroSetting
                r4 = 1
                if (r3 == r4) goto Lb8
                r7 = 2
                if (r3 == r7) goto L94
                r9 = 5
                if (r3 == r9) goto L93
                goto Ldd
            L93:
                return r1
            L94:
                boolean r10 = r9.isZero(r10)
                if (r10 == 0) goto Lb7
                org.joda.time.format.PeriodFormatterBuilder$FieldFormatter[] r10 = r9.iFieldFormatters
                int r3 = r9.iFieldType
                r10 = r10[r3]
                if (r10 != r9) goto Lb7
                int r3 = r3 + r4
            La3:
                r10 = 9
                if (r3 > r10) goto Ldd
                boolean r10 = r9.isSupported(r0, r3)
                if (r10 == 0) goto Lb4
                org.joda.time.format.PeriodFormatterBuilder$FieldFormatter[] r10 = r9.iFieldFormatters
                r10 = r10[r3]
                if (r10 == 0) goto Lb4
                return r1
            Lb4:
                int r3 = r3 + 1
                goto La3
            Lb7:
                return r1
            Lb8:
                boolean r10 = r9.isZero(r10)
                if (r10 == 0) goto Ldc
                org.joda.time.format.PeriodFormatterBuilder$FieldFormatter[] r10 = r9.iFieldFormatters
                int r3 = r9.iFieldType
                r10 = r10[r3]
                if (r10 != r9) goto Ldc
                r10 = 8
                int r10 = java.lang.Math.min(r3, r10)
            Lcc:
                int r10 = r10 + (-1)
                if (r10 < 0) goto Ldd
                boolean r3 = r9.isSupported(r0, r10)
                if (r3 == 0) goto Lcc
                org.joda.time.format.PeriodFormatterBuilder$FieldFormatter[] r3 = r9.iFieldFormatters
                r3 = r3[r10]
                if (r3 == 0) goto Lcc
            Ldc:
                return r1
            Ldd:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.FieldFormatter.getFieldValue(org.joda.time.ReadablePeriod):long");
        }

        public boolean isSupported(PeriodType periodType, int i) {
            switch (i) {
                case 8:
                case 9:
                    if (periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis())) {
                    }
                    break;
            }
            return false;
        }

        public boolean isZero(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i = 0; i < size; i++) {
                if (readablePeriod.getValue(i) != 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        
            if (r15 > '9') goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
        
            return ~r3;
         */
        @Override // org.joda.time.format.PeriodParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.ReadWritablePeriod r17, java.lang.String r18, int r19, java.util.Locale r20) {
            /*
                Method dump skipped, instructions count: 323
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.FieldFormatter.parseInto(org.joda.time.ReadWritablePeriod, java.lang.String, int, java.util.Locale):int");
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(stringBuffer, i);
            }
            int length = stringBuffer.length();
            int i2 = this.iMinPrintedDigits;
            if (i2 <= 1) {
                FormatUtils.appendUnpaddedInteger(stringBuffer, i);
            } else {
                FormatUtils.appendPaddedInteger(stringBuffer, i, i2);
            }
            if (this.iFieldType >= 8) {
                int abs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || abs > 0) {
                    if (fieldValue < 0 && fieldValue > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    FormatUtils.appendPaddedInteger(stringBuffer, abs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(stringBuffer, i);
            }
        }

        public void setFieldValue(ReadWritablePeriod readWritablePeriod, int i, int i2) {
            switch (i) {
                case 0:
                    readWritablePeriod.setYears(i2);
                    break;
                case 1:
                    readWritablePeriod.setMonths(i2);
                    break;
                case 2:
                    readWritablePeriod.setWeeks(i2);
                    break;
                case 3:
                    readWritablePeriod.setDays(i2);
                    break;
                case 4:
                    readWritablePeriod.setHours(i2);
                    break;
                case 5:
                    readWritablePeriod.setMinutes(i2);
                    break;
                case 6:
                    readWritablePeriod.setSeconds(i2);
                    break;
                case 7:
                    readWritablePeriod.setMillis(i2);
                    break;
            }
        }

        public FieldFormatter(int i, int i2, int i3, boolean z, int i4, FieldFormatter[] fieldFormatterArr, PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iMinPrintedDigits = i;
            this.iPrintZeroSetting = i2;
            this.iMaxParsedDigits = i3;
            this.iRejectSignedValues = z;
            this.iFieldType = i4;
            this.iFieldFormatters = fieldFormatterArr;
            this.iPrefix = periodFieldAffix;
            this.iSuffix = periodFieldAffix2;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(writer, i);
            }
            int i2 = this.iMinPrintedDigits;
            if (i2 <= 1) {
                FormatUtils.writeUnpaddedInteger(writer, i);
            } else {
                FormatUtils.writePaddedInteger(writer, i, i2);
            }
            if (this.iFieldType >= 8) {
                int abs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || abs > 0) {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, abs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(writer, i);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Separator implements PeriodPrinter, PeriodParser {
        private volatile PeriodParser iAfterParser;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private final PeriodPrinter iBeforePrinter;
        private final String iFinalText;
        private final String[] iParsedForms;
        private final String iText;
        private final boolean iUseAfter;
        private final boolean iUseBefore;

        public Separator(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z, boolean z2) {
            this.iText = str;
            this.iFinalText = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.iParsedForms = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.iParsedForms = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.iBeforePrinter = periodPrinter;
            this.iBeforeParser = periodParser;
            this.iUseBefore = z;
            this.iUseAfter = z2;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            int length;
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            int calculatePrintedLength = periodPrinter2.calculatePrintedLength(readablePeriod, locale) + periodPrinter.calculatePrintedLength(readablePeriod, locale);
            if (!this.iUseBefore) {
                if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    length = this.iText.length();
                    return length + calculatePrintedLength;
                }
                return calculatePrintedLength;
            }
            if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                if (this.iUseAfter) {
                    int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                    if (countFieldsToPrint > 0) {
                        length = (countFieldsToPrint > 1 ? this.iText : this.iFinalText).length();
                    }
                } else {
                    length = this.iText.length();
                }
                return length + calculatePrintedLength;
            }
            return calculatePrintedLength;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            int countFieldsToPrint = this.iBeforePrinter.countFieldsToPrint(readablePeriod, i, locale);
            return countFieldsToPrint < i ? this.iAfterPrinter.countFieldsToPrint(readablePeriod, i, locale) + countFieldsToPrint : countFieldsToPrint;
        }

        public Separator finish(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.iAfterPrinter = periodPrinter;
            this.iAfterParser = periodParser;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        @Override // org.joda.time.format.PeriodParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.ReadWritablePeriod r11, java.lang.String r12, int r13, java.util.Locale r14) {
            /*
                r10 = this;
                org.joda.time.format.PeriodParser r0 = r10.iBeforeParser
                int r3 = r0.parseInto(r11, r12, r13, r14)
                if (r3 >= 0) goto L9
                return r3
            L9:
                r0 = 0
                if (r3 <= r13) goto L3c
                java.lang.String[] r13 = r10.iParsedForms
                int r7 = r13.length
                r8 = r0
            L10:
                if (r8 >= r7) goto L3c
                r4 = r13[r8]
                if (r4 == 0) goto L2e
                int r1 = r4.length()
                if (r1 == 0) goto L2e
                r5 = 0
                int r6 = r4.length()
                r2 = 1
                r1 = r12
                boolean r12 = r1.regionMatches(r2, r3, r4, r5, r6)
                if (r12 == 0) goto L2a
                goto L2f
            L2a:
                int r8 = r8 + 1
                r12 = r1
                goto L10
            L2e:
                r1 = r12
            L2f:
                if (r4 != 0) goto L32
                goto L36
            L32:
                int r0 = r4.length()
            L36:
                int r3 = r3 + r0
                r12 = 1
                r9 = r0
                r0 = r12
                r12 = r9
                goto L3e
            L3c:
                r1 = r12
                r12 = -1
            L3e:
                org.joda.time.format.PeriodParser r13 = r10.iAfterParser
                int r11 = r13.parseInto(r11, r1, r3, r14)
                if (r11 >= 0) goto L47
                goto L59
            L47:
                if (r0 == 0) goto L4f
                if (r11 != r3) goto L4f
                if (r12 <= 0) goto L4f
                int r10 = ~r3
                return r10
            L4f:
                if (r11 <= r3) goto L59
                if (r0 != 0) goto L59
                boolean r10 = r10.iUseBefore
                if (r10 != 0) goto L59
                int r10 = ~r3
                return r10
            L59:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.Separator.parseInto(org.joda.time.ReadWritablePeriod, java.lang.String, int, java.util.Locale):int");
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (countFieldsToPrint > 0) {
                            stringBuffer.append(countFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        stringBuffer.append(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                stringBuffer.append(this.iText);
            }
            periodPrinter2.printTo(stringBuffer, readablePeriod, locale);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(writer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (countFieldsToPrint > 0) {
                            writer.write(countFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        writer.write(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                writer.write(this.iText);
            }
            periodPrinter2.printTo(writer, readablePeriod, locale);
        }
    }

    public PeriodFormatterBuilder appendSuffix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendSuffix(new PluralAffix(str, str2));
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public PeriodFormatterBuilder appendSuffix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendSuffix(new RegExAffix(strArr, strArr2));
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public PeriodFormatterBuilder appendSuffix(String str) {
        if (str != null) {
            return appendSuffix(new SimpleAffix(str));
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public PeriodFormatter toFormatter() {
        PeriodFormatter formatter = toFormatter(this.iElementPairs, this.iNotPrinter, this.iNotParser);
        for (FieldFormatter fieldFormatter : this.iFieldFormatters) {
            if (fieldFormatter != null) {
                fieldFormatter.finish(this.iFieldFormatters);
            }
        }
        this.iFieldFormatters = (FieldFormatter[]) this.iFieldFormatters.clone();
        return formatter;
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2) {
        return appendSeparator(str, str2, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr) {
        return appendSeparator(str, str2, strArr, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str) {
        return appendSeparator(str, str, null, true, true);
    }
}
