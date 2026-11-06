package org.codehaus.jackson;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public enum JsonToken {
    NOT_AVAILABLE(null),
    START_OBJECT("{"),
    END_OBJECT(StringSubstitutor.DEFAULT_VAR_END),
    START_ARRAY(MarkdownConstants.LEFT_BRACKET),
    END_ARRAY(MarkdownConstants.RIGHT_BRACKET),
    FIELD_NAME(null),
    VALUE_EMBEDDED_OBJECT(null),
    VALUE_STRING(null),
    VALUE_NUMBER_INT(null),
    VALUE_NUMBER_FLOAT(null),
    VALUE_TRUE("true"),
    VALUE_FALSE("false"),
    VALUE_NULL("null");

    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    JsonToken(String str) {
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
            return;
        }
        this._serialized = str;
        char[] charArray = str.toCharArray();
        this._serializedChars = charArray;
        int length = charArray.length;
        this._serializedBytes = new byte[length];
        for (int i = 0; i < length; i++) {
            this._serializedBytes[i] = (byte) this._serializedChars[i];
        }
    }

    public byte[] asByteArray() {
        return this._serializedBytes;
    }

    public char[] asCharArray() {
        return this._serializedChars;
    }

    public String asString() {
        return this._serialized;
    }

    public boolean isNumeric() {
        return this == VALUE_NUMBER_INT || this == VALUE_NUMBER_FLOAT;
    }

    public boolean isScalarValue() {
        return ordinal() >= VALUE_EMBEDDED_OBJECT.ordinal();
    }
}
