package org.json;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JSONWriter {
    private static final int maxdepth = 200;
    private boolean comma = false;
    protected char mode = 'i';
    private final JSONObject[] stack = new JSONObject[200];
    private int top = 0;
    protected Appendable writer;

    public JSONWriter(Appendable appendable) {
        this.writer = appendable;
    }

    private JSONWriter append(String str) throws JSONException {
        if (str == null) {
            XML$$ExternalSyntheticBUOutline0.m$1("Null pointer");
            return null;
        }
        char c = this.mode;
        if (c != 'o' && c != 'a') {
            XML$$ExternalSyntheticBUOutline0.m$1("Value out of sequence.");
            return null;
        }
        try {
            if (this.comma && c == 'a') {
                this.writer.append(AbstractJsonLexerKt.COMMA);
            }
            this.writer.append(str);
            if (this.mode == 'o') {
                this.mode = 'k';
            }
            this.comma = true;
            return this;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    private JSONWriter end(char c, char c2) throws JSONException {
        if (this.mode != c) {
            throw new JSONException(c == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
        }
        pop(c);
        try {
            this.writer.append(c2);
            this.comma = true;
            return this;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    private void pop(char c) throws JSONException {
        int i = this.top;
        if (i <= 0) {
            XML$$ExternalSyntheticBUOutline0.m$1("Nesting error.");
            return;
        }
        JSONObject[] jSONObjectArr = this.stack;
        char c2 = 'k';
        if ((jSONObjectArr[i + (-1)] == null ? 'a' : 'k') != c) {
            XML$$ExternalSyntheticBUOutline0.m$1("Nesting error.");
            return;
        }
        int i2 = i - 1;
        this.top = i2;
        if (i2 == 0) {
            c2 = 'd';
        } else if (jSONObjectArr[i - 2] == null) {
            c2 = 'a';
        }
        this.mode = c2;
    }

    private void push(JSONObject jSONObject) throws JSONException {
        int i = this.top;
        if (i >= 200) {
            XML$$ExternalSyntheticBUOutline0.m$1("Nesting too deep.");
            return;
        }
        this.stack[i] = jSONObject;
        this.mode = jSONObject == null ? 'a' : 'k';
        this.top = i + 1;
    }

    public static String valueToString(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (!(obj instanceof JSONString)) {
            if (!(obj instanceof Number)) {
                return ((obj instanceof Boolean) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) ? obj.toString() : obj instanceof Map ? new JSONObject((Map<?, ?>) obj).toString() : obj instanceof Collection ? new JSONArray((Collection<?>) obj).toString() : obj.getClass().isArray() ? new JSONArray(obj).toString() : obj instanceof Enum ? JSONObject.quote(((Enum) obj).name()) : JSONObject.quote(obj.toString());
            }
            String numberToString = JSONObject.numberToString((Number) obj);
            return JSONObject.NUMBER_PATTERN.matcher(numberToString).matches() ? numberToString : JSONObject.quote(numberToString);
        }
        try {
            String jSONString = ((JSONString) obj).toJSONString();
            if (jSONString != null) {
                return jSONString;
            }
            XML$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m("Bad value from toJSONString: ", jSONString));
            return null;
        } catch (Exception e) {
            throw new JSONException(e);
        }
    }

    public JSONWriter array() throws JSONException {
        char c = this.mode;
        if (c != 'i' && c != 'o' && c != 'a') {
            XML$$ExternalSyntheticBUOutline0.m$1("Misplaced array.");
            return null;
        }
        push(null);
        append(MarkdownConstants.LEFT_BRACKET);
        this.comma = false;
        return this;
    }

    public JSONWriter endArray() throws JSONException {
        return end('a', AbstractJsonLexerKt.END_LIST);
    }

    public JSONWriter endObject() throws JSONException {
        return end('k', AbstractJsonLexerKt.END_OBJ);
    }

    public JSONWriter key(String str) throws JSONException {
        if (str == null) {
            XML$$ExternalSyntheticBUOutline0.m$1("Null key.");
            return null;
        }
        if (this.mode != 'k') {
            XML$$ExternalSyntheticBUOutline0.m$1("Misplaced key.");
            return null;
        }
        try {
            JSONObject jSONObject = this.stack[this.top - 1];
            if (jSONObject.has(str)) {
                throw new JSONException("Duplicate key \"" + str + DeviceConfigConstants.DOUBLE_QUOTE);
            }
            jSONObject.put(str, true);
            if (this.comma) {
                this.writer.append(AbstractJsonLexerKt.COMMA);
            }
            this.writer.append(JSONObject.quote(str));
            this.writer.append(AbstractJsonLexerKt.COLON);
            this.comma = false;
            this.mode = 'o';
            return this;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    public JSONWriter object() throws JSONException {
        if (this.mode == 'i') {
            this.mode = 'o';
        }
        char c = this.mode;
        if (c != 'o' && c != 'a') {
            XML$$ExternalSyntheticBUOutline0.m$1("Misplaced object.");
            return null;
        }
        append("{");
        push(new JSONObject());
        this.comma = false;
        return this;
    }

    public JSONWriter value(boolean z) throws JSONException {
        return append(z ? "true" : "false");
    }

    public JSONWriter value(double d) throws JSONException {
        return value(Double.valueOf(d));
    }

    public JSONWriter value(long j) throws JSONException {
        return append(Long.toString(j));
    }

    public JSONWriter value(Object obj) throws JSONException {
        return append(valueToString(obj));
    }
}
