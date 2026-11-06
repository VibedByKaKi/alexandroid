package org.apache.commons.text;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.DeviceDatabaseUtils;
import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.translate.AggregateTranslator;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.apache.commons.text.translate.CsvTranslators;
import org.apache.commons.text.translate.EntityArrays;
import org.apache.commons.text.translate.JavaUnicodeEscaper;
import org.apache.commons.text.translate.LookupTranslator;
import org.apache.commons.text.translate.NumericEntityEscaper;
import org.apache.commons.text.translate.NumericEntityUnescaper;
import org.apache.commons.text.translate.OctalUnescaper;
import org.apache.commons.text.translate.UnicodeUnescaper;
import org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemover;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StringEscapeUtils {
    public static final CharSequenceTranslator ESCAPE_CSV;
    public static final CharSequenceTranslator ESCAPE_ECMASCRIPT;
    public static final CharSequenceTranslator ESCAPE_HTML3;
    public static final CharSequenceTranslator ESCAPE_HTML4;
    public static final CharSequenceTranslator ESCAPE_JAVA;
    public static final CharSequenceTranslator ESCAPE_JSON;
    public static final CharSequenceTranslator ESCAPE_XML10;
    public static final CharSequenceTranslator ESCAPE_XML11;
    public static final CharSequenceTranslator ESCAPE_XSI;
    public static final CharSequenceTranslator UNESCAPE_CSV;
    public static final CharSequenceTranslator UNESCAPE_ECMASCRIPT;
    public static final CharSequenceTranslator UNESCAPE_HTML3;
    public static final CharSequenceTranslator UNESCAPE_HTML4;
    public static final CharSequenceTranslator UNESCAPE_JAVA;
    public static final CharSequenceTranslator UNESCAPE_JSON;
    public static final CharSequenceTranslator UNESCAPE_XML;
    public static final CharSequenceTranslator UNESCAPE_XSI;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private final StringBuilder sb;
        private final CharSequenceTranslator translator;

        private Builder(CharSequenceTranslator charSequenceTranslator) {
            this.sb = new StringBuilder();
            this.translator = charSequenceTranslator;
        }

        public Builder append(String str) {
            this.sb.append(str);
            return this;
        }

        public Builder escape(String str) {
            this.sb.append(this.translator.translate(str));
            return this;
        }

        public String toString() {
            return this.sb.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class XsiUnescaper extends CharSequenceTranslator {
        private static final char BACKSLASH = '\\';

        @Override // org.apache.commons.text.translate.CharSequenceTranslator
        public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i != 0) {
                Single$$ExternalSyntheticBUOutline0.m$2("XsiUnescaper should never reach the [1] index");
                return 0;
            }
            String charSequence2 = charSequence.toString();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int indexOf = charSequence2.indexOf(92, i2);
                if (indexOf == -1) {
                    break;
                }
                if (indexOf > i3) {
                    writer.write(charSequence2.substring(i3, indexOf));
                }
                i3 = indexOf + 1;
                i2 = indexOf + 2;
            }
            if (i3 < charSequence2.length()) {
                writer.write(charSequence2.substring(i3));
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static {
        LookupTranslator lookupTranslator = new LookupTranslator(Collections.unmodifiableMap(Automotive$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, "\\\"", "\\", "\\\\")));
        Map<CharSequence, CharSequence> map = EntityArrays.JAVA_CTRL_CHARS_ESCAPE;
        ESCAPE_JAVA = new AggregateTranslator(lookupTranslator, new LookupTranslator(map), JavaUnicodeEscaper.outsideOf(32, 127));
        HashMap m = Automotive$$ExternalSyntheticOutline0.m("'", "\\'", DeviceConfigConstants.DOUBLE_QUOTE, "\\\"");
        m.put("\\", "\\\\");
        m.put("/", "\\/");
        ESCAPE_ECMASCRIPT = new AggregateTranslator(new LookupTranslator(Collections.unmodifiableMap(m)), new LookupTranslator(map), JavaUnicodeEscaper.outsideOf(32, 127));
        HashMap m2 = Automotive$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, "\\\"", "\\", "\\\\");
        m2.put("/", "\\/");
        ESCAPE_JSON = new AggregateTranslator(new LookupTranslator(Collections.unmodifiableMap(m2)), new LookupTranslator(map), JavaUnicodeEscaper.outsideOf(32, 126));
        HashMap m3 = Automotive$$ExternalSyntheticOutline0.m(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", "\u0001", "");
        m3.put("\u0002", "");
        m3.put("\u0003", "");
        m3.put("\u0004", "");
        m3.put("\u0005", "");
        m3.put("\u0006", "");
        m3.put("\u0007", "");
        m3.put("\b", "");
        m3.put("\u000b", "");
        m3.put("\f", "");
        m3.put("\u000e", "");
        m3.put("\u000f", "");
        m3.put("\u0010", "");
        m3.put("\u0011", "");
        m3.put("\u0012", "");
        m3.put("\u0013", "");
        m3.put("\u0014", "");
        m3.put("\u0015", "");
        m3.put("\u0016", "");
        m3.put("\u0017", "");
        m3.put("\u0018", "");
        m3.put("\u0019", "");
        m3.put("\u001a", "");
        m3.put("\u001b", "");
        m3.put("\u001c", "");
        m3.put("\u001d", "");
        m3.put("\u001e", "");
        m3.put("\u001f", "");
        m3.put("\ufffe", "");
        m3.put("\uffff", "");
        Map<CharSequence, CharSequence> map2 = EntityArrays.BASIC_ESCAPE;
        LookupTranslator lookupTranslator2 = new LookupTranslator(map2);
        Map<CharSequence, CharSequence> map3 = EntityArrays.APOS_ESCAPE;
        ESCAPE_XML10 = new AggregateTranslator(lookupTranslator2, new LookupTranslator(map3), new LookupTranslator(Collections.unmodifiableMap(m3)), NumericEntityEscaper.between(127, 132), NumericEntityEscaper.between(134, 159), new UnicodeUnpairedSurrogateRemover());
        HashMap m4 = Automotive$$ExternalSyntheticOutline0.m(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", "\u000b", "&#11;");
        m4.put("\f", "&#12;");
        m4.put("\ufffe", "");
        m4.put("\uffff", "");
        ESCAPE_XML11 = new AggregateTranslator(new LookupTranslator(map2), new LookupTranslator(map3), new LookupTranslator(Collections.unmodifiableMap(m4)), NumericEntityEscaper.between(1, 8), NumericEntityEscaper.between(14, 31), NumericEntityEscaper.between(127, 132), NumericEntityEscaper.between(134, 159), new UnicodeUnpairedSurrogateRemover());
        LookupTranslator lookupTranslator3 = new LookupTranslator(map2);
        Map<CharSequence, CharSequence> map4 = EntityArrays.ISO8859_1_ESCAPE;
        ESCAPE_HTML3 = new AggregateTranslator(lookupTranslator3, new LookupTranslator(map4));
        ESCAPE_HTML4 = new AggregateTranslator(new LookupTranslator(map2), new LookupTranslator(map4), new LookupTranslator(EntityArrays.HTML40_EXTENDED_ESCAPE));
        ESCAPE_CSV = new CsvTranslators.CsvEscaper();
        HashMap m5 = Automotive$$ExternalSyntheticOutline0.m("|", "\\|", WebConstants.UriConstants.AMPERSAND_KEY, "\\&");
        m5.put(";", "\\;");
        m5.put("<", "\\<");
        m5.put(">", "\\>");
        m5.put(MarkdownConstants.LEFT_PARENTHESIS, "\\(");
        m5.put(MarkdownConstants.RIGHT_PARENTHESIS, "\\)");
        m5.put("$", "\\$");
        m5.put("`", "\\`");
        m5.put("\\", "\\\\");
        m5.put(DeviceConfigConstants.DOUBLE_QUOTE, "\\\"");
        m5.put("'", "\\'");
        m5.put(" ", "\\ ");
        m5.put(DeviceDatabaseUtils.DELIMITER, "\\\t");
        m5.put("\r\n", "");
        m5.put("\n", "");
        m5.put("*", "\\*");
        m5.put("?", "\\?");
        m5.put(MarkdownConstants.LEFT_BRACKET, "\\[");
        m5.put("#", "\\#");
        m5.put("~", "\\~");
        m5.put("=", "\\=");
        m5.put("%", "\\%");
        ESCAPE_XSI = new LookupTranslator(Collections.unmodifiableMap(m5));
        HashMap m6 = Automotive$$ExternalSyntheticOutline0.m("\\\\", "\\", "\\\"", DeviceConfigConstants.DOUBLE_QUOTE);
        m6.put("\\'", "'");
        m6.put("\\", "");
        AggregateTranslator aggregateTranslator = new AggregateTranslator(new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_UNESCAPE), new LookupTranslator(Collections.unmodifiableMap(m6)));
        UNESCAPE_JAVA = aggregateTranslator;
        UNESCAPE_ECMASCRIPT = aggregateTranslator;
        UNESCAPE_JSON = aggregateTranslator;
        Map<CharSequence, CharSequence> map5 = EntityArrays.BASIC_UNESCAPE;
        LookupTranslator lookupTranslator4 = new LookupTranslator(map5);
        Map<CharSequence, CharSequence> map6 = EntityArrays.ISO8859_1_UNESCAPE;
        UNESCAPE_HTML3 = new AggregateTranslator(lookupTranslator4, new LookupTranslator(map6), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0]));
        UNESCAPE_HTML4 = new AggregateTranslator(new LookupTranslator(map5), new LookupTranslator(map6), new LookupTranslator(EntityArrays.HTML40_EXTENDED_UNESCAPE), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0]));
        UNESCAPE_XML = new AggregateTranslator(new LookupTranslator(map5), new LookupTranslator(EntityArrays.APOS_UNESCAPE), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0]));
        UNESCAPE_CSV = new CsvTranslators.CsvUnescaper();
        UNESCAPE_XSI = new XsiUnescaper();
    }

    public static Builder builder(CharSequenceTranslator charSequenceTranslator) {
        return new Builder(charSequenceTranslator);
    }

    public static String escapeCsv(String str) {
        return ESCAPE_CSV.translate(str);
    }

    public static String escapeEcmaScript(String str) {
        return ESCAPE_ECMASCRIPT.translate(str);
    }

    public static String escapeHtml3(String str) {
        return ESCAPE_HTML3.translate(str);
    }

    public static String escapeHtml4(String str) {
        return ESCAPE_HTML4.translate(str);
    }

    public static String escapeJava(String str) {
        return ESCAPE_JAVA.translate(str);
    }

    public static String escapeJson(String str) {
        return ESCAPE_JSON.translate(str);
    }

    public static String escapeXSI(String str) {
        return ESCAPE_XSI.translate(str);
    }

    public static String escapeXml10(String str) {
        return ESCAPE_XML10.translate(str);
    }

    public static String escapeXml11(String str) {
        return ESCAPE_XML11.translate(str);
    }

    public static String unescapeCsv(String str) {
        return UNESCAPE_CSV.translate(str);
    }

    public static String unescapeEcmaScript(String str) {
        return UNESCAPE_ECMASCRIPT.translate(str);
    }

    public static String unescapeHtml3(String str) {
        return UNESCAPE_HTML3.translate(str);
    }

    public static String unescapeHtml4(String str) {
        return UNESCAPE_HTML4.translate(str);
    }

    public static String unescapeJava(String str) {
        return UNESCAPE_JAVA.translate(str);
    }

    public static String unescapeJson(String str) {
        return UNESCAPE_JSON.translate(str);
    }

    public static String unescapeXSI(String str) {
        return UNESCAPE_XSI.translate(str);
    }

    public static String unescapeXml(String str) {
        return UNESCAPE_XML.translate(str);
    }
}
