package org.json.simple;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JSONObject extends HashMap implements Map, JSONAware, JSONStreamAware {
    private static final long serialVersionUID = -503443796854799292L;

    public JSONObject() {
    }

    public static String escape(String str) {
        return JSONValue.escape(str);
    }

    public static String toJSONString(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(AbstractJsonLexerKt.COMMA);
            }
            toJSONString(String.valueOf(entry.getKey()), entry.getValue(), stringBuffer);
        }
        stringBuffer.append(AbstractJsonLexerKt.END_OBJ);
        return stringBuffer.toString();
    }

    public static String toString(String str, Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        toJSONString(str, obj, stringBuffer);
        return stringBuffer.toString();
    }

    public static void writeJSONString(Map map, Writer writer) throws IOException {
        if (map == null) {
            writer.write("null");
            return;
        }
        writer.write(123);
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            writer.write(34);
            writer.write(escape(String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            JSONValue.writeJSONString(entry.getValue(), writer);
        }
        writer.write(125);
    }

    public JSONObject(Map map) {
        super(map);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return toJSONString();
    }

    @Override // org.json.simple.JSONAware
    public String toJSONString() {
        return toJSONString(this);
    }

    private static String toJSONString(String str, Object obj, StringBuffer stringBuffer) {
        stringBuffer.append('\"');
        if (str == null) {
            stringBuffer.append("null");
        } else {
            JSONValue.escape(str, stringBuffer);
        }
        stringBuffer.append('\"');
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        stringBuffer.append(JSONValue.toJSONString(obj));
        return stringBuffer.toString();
    }

    @Override // org.json.simple.JSONStreamAware
    public void writeJSONString(Writer writer) throws IOException {
        writeJSONString(this, writer);
    }
}
