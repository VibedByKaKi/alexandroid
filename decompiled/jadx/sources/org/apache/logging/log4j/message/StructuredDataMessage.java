package org.apache.logging.log4j.message;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.logging.log4j.util.EnglishEnums;
import org.apache.logging.log4j.util.StringBuilders;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AsynchronouslyFormattable
/* loaded from: classes11.dex */
public class StructuredDataMessage extends MapMessage<StructuredDataMessage, String> {
    private static final int HASHVAL = 31;
    private static final int MAX_LENGTH = 32;
    private static final long serialVersionUID = 1703221292892071920L;
    private StructuredDataId id;
    private final int maxLength;
    private String message;
    private String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Format {
        XML,
        FULL
    }

    private StructuredDataMessage(StructuredDataMessage structuredDataMessage, Map<String, String> map) {
        super(map);
        this.id = structuredDataMessage.id;
        this.message = structuredDataMessage.message;
        this.type = structuredDataMessage.type;
        this.maxLength = 32;
    }

    private void asXml(StructuredDataId structuredDataId, StringBuilder sb) {
        sb.append("<StructuredData>\n");
        sb.append("<type>");
        int length = sb.length();
        sb.append(this.type);
        StringBuilders.escapeXml(sb, length);
        sb.append("</type>\n");
        sb.append("<id>");
        int length2 = sb.length();
        structuredDataId.formatTo(sb);
        StringBuilders.escapeXml(sb, length2);
        sb.append("</id>\n");
        super.asXml(sb);
        sb.append("\n</StructuredData>\n");
    }

    private Format getFormat(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return Format.FULL;
        }
        for (String str : strArr) {
            Format format = Format.XML;
            if (format.name().equalsIgnoreCase(str)) {
                return format;
            }
            Format format2 = Format.FULL;
            if (format2.name().equalsIgnoreCase(str)) {
                return format2;
            }
        }
        return null;
    }

    public final void asString(Format format, StructuredDataId structuredDataId, StringBuilder sb) {
        String format2;
        boolean equals = Format.FULL.equals(format);
        if (equals) {
            if (getType() == null) {
                return;
            }
            sb.append(getType());
            sb.append(' ');
        }
        StructuredDataId id = getId();
        if (id != null) {
            structuredDataId = id.makeId(structuredDataId);
        }
        if (structuredDataId == null || structuredDataId.getName() == null) {
            return;
        }
        if (Format.XML.equals(format)) {
            asXml(structuredDataId, sb);
            return;
        }
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        StringBuilders.appendValue(sb, structuredDataId);
        sb.append(' ');
        appendMap(sb);
        sb.append(AbstractJsonLexerKt.END_LIST);
        if (!equals || (format2 = getFormat()) == null) {
            return;
        }
        sb.append(' ');
        sb.append(format2);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StructuredDataMessage)) {
            return false;
        }
        StructuredDataMessage structuredDataMessage = (StructuredDataMessage) obj;
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.type;
        String str2 = structuredDataMessage.type;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        StructuredDataId structuredDataId = this.id;
        StructuredDataId structuredDataId2 = structuredDataMessage.id;
        if (structuredDataId == null ? structuredDataId2 != null : !structuredDataId.equals(structuredDataId2)) {
            return false;
        }
        String str3 = this.message;
        String str4 = structuredDataMessage.message;
        return str3 == null ? str4 == null : str3.equals(str4);
    }

    @Override // org.apache.logging.log4j.message.MapMessage, org.apache.logging.log4j.util.MultiFormatStringBuilderFormattable
    public void formatTo(String[] strArr, StringBuilder sb) {
        asString(getFormat(strArr), null, sb);
    }

    @Override // org.apache.logging.log4j.message.MapMessage, org.apache.logging.log4j.message.MultiformatMessage
    public String[] getFormats() {
        String[] strArr = new String[Format.values().length];
        Format[] values = Format.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr[i2] = values[i].name();
            i++;
            i2++;
        }
        return strArr;
    }

    @Override // org.apache.logging.log4j.message.MapMessage, org.apache.logging.log4j.message.MultiformatMessage
    public String getFormattedMessage(String[] strArr) {
        return asString(getFormat(strArr), null);
    }

    public StructuredDataId getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        StructuredDataId structuredDataId = this.id;
        int hashCode3 = (hashCode2 + (structuredDataId != null ? structuredDataId.hashCode() : 0)) * 31;
        String str2 = this.message;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public StructuredDataMessage newInstance(Map<String, String> map) {
        return new StructuredDataMessage(this, map);
    }

    public void setId(String str) {
        this.id = new StructuredDataId(str, null, null);
    }

    public void setMessageFormat(String str) {
        this.message = str;
    }

    public void setType(String str) {
        if (str.length() <= 32) {
            this.type = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("structured data type exceeds maximum length of 32 characters: ".concat(str));
        }
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public String toString() {
        return asString(null, null);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, boolean z) {
        validateKey(str);
    }

    public void validateKey(String str) {
        if (this.maxLength > 0 && str.length() > this.maxLength) {
            OnnxMap$$ExternalSyntheticBUOutline0.m$1(this.maxLength, "Structured data keys are limited to ", " characters. key: ", str);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~' || charAt == '=' || charAt == ']' || charAt == '\"') {
                Single$$ExternalSyntheticBUOutline0.m$3("Structured data keys must contain printable US ASCII charactersand may not contain a space, =, ], or \"");
                return;
            }
        }
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, byte b) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, char c) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, double d) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, float f) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, int i) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage, org.apache.logging.log4j.util.StringBuilderFormattable
    public void formatTo(StringBuilder sb) {
        asString(Format.FULL, null, sb);
    }

    public void setId(StructuredDataId structuredDataId) {
        this.id = structuredDataId;
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, long j) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage, org.apache.logging.log4j.message.Message
    public String getFormattedMessage() {
        return asString(Format.FULL, null);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, Object obj) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, short s) {
        validateKey(str);
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public void validate(String str, String str2) {
        validateKey(str);
    }

    public StructuredDataMessage(String str, String str2, String str3, int i) {
        this.id = new StructuredDataId(str, (String[]) null, (String[]) null, i);
        this.message = str2;
        this.type = str3;
        this.maxLength = i;
    }

    public StructuredDataMessage(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, map, 32);
    }

    public StructuredDataMessage(String str, String str2, String str3, Map<String, String> map, int i) {
        super(map);
        this.id = new StructuredDataId(str, (String[]) null, (String[]) null, i);
        this.message = str2;
        this.type = str3;
        this.maxLength = i;
    }

    public StructuredDataMessage(StructuredDataId structuredDataId, String str, String str2) {
        this(structuredDataId, str, str2, 32);
    }

    public StructuredDataMessage(StructuredDataId structuredDataId, String str, String str2, int i) {
        this.id = structuredDataId;
        this.message = str;
        this.type = str2;
        this.maxLength = i;
    }

    public StructuredDataMessage(StructuredDataId structuredDataId, String str, String str2, Map<String, String> map) {
        this(structuredDataId, str, str2, map, 32);
    }

    public StructuredDataMessage(StructuredDataId structuredDataId, String str, String str2, Map<String, String> map, int i) {
        super(map);
        this.id = structuredDataId;
        this.message = str;
        this.type = str2;
        this.maxLength = i;
    }

    public StructuredDataMessage(String str, String str2, String str3) {
        this(str, str2, str3, 32);
    }

    public StructuredDataMessage() {
        this.maxLength = 32;
    }

    @Override // org.apache.logging.log4j.message.MapMessage, org.apache.logging.log4j.message.Message
    public String getFormat() {
        return this.message;
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public String asString(String str) {
        try {
            return asString((Format) EnglishEnums.valueOf(Format.class, str), null);
        } catch (IllegalArgumentException unused) {
            return this.asString();
        }
    }

    public final String asString(Format format, StructuredDataId structuredDataId) {
        StringBuilder sb = new StringBuilder();
        asString(format, structuredDataId, sb);
        return sb.toString();
    }

    @Override // org.apache.logging.log4j.message.MapMessage
    public String asString() {
        return asString(Format.FULL, null);
    }
}
