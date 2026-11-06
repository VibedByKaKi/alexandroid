package org.json.simple;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JSONValue {
    public static void escape(String str, StringBuffer stringBuffer) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt == '\r') {
                stringBuffer.append("\\r");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '/') {
                stringBuffer.append("\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        stringBuffer.append("\\b");
                        break;
                    case '\t':
                        stringBuffer.append("\\t");
                        break;
                    case '\n':
                        stringBuffer.append("\\n");
                        break;
                    default:
                        if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                            stringBuffer.append(charAt);
                            break;
                        } else {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append("\\u");
                            for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(hexString.toUpperCase());
                            break;
                        }
                        break;
                }
            } else {
                stringBuffer.append("\\\\");
            }
        }
    }

    public static Object parse(Reader reader) {
        try {
            return new JSONParser().parse(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseWithException(Reader reader) throws IOException, ParseException {
        return new JSONParser().parse(reader);
    }

    public static String toJSONString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            StringBuffer stringBuffer = new StringBuffer(DeviceConfigConstants.DOUBLE_QUOTE);
            stringBuffer.append(escape((String) obj));
            stringBuffer.append(DeviceConfigConstants.DOUBLE_QUOTE);
            return stringBuffer.toString();
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            return (d.isInfinite() || d.isNaN()) ? "null" : obj.toString();
        }
        if (!(obj instanceof Float)) {
            return obj instanceof Number ? obj.toString() : obj instanceof Boolean ? obj.toString() : obj instanceof JSONAware ? ((JSONAware) obj).toJSONString() : obj instanceof Map ? JSONObject.toJSONString((Map) obj) : obj instanceof List ? JSONArray.toJSONString((List) obj) : obj.toString();
        }
        Float f = (Float) obj;
        return (f.isInfinite() || f.isNaN()) ? "null" : obj.toString();
    }

    public static void writeJSONString(Object obj, Writer writer) throws IOException {
        if (obj == null) {
            writer.write("null");
            return;
        }
        if (obj instanceof String) {
            writer.write(34);
            writer.write(escape((String) obj));
            writer.write(34);
            return;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                writer.write("null");
                return;
            } else {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                writer.write("null");
                return;
            } else {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Number) {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof Boolean) {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof JSONStreamAware) {
            ((JSONStreamAware) obj).writeJSONString(writer);
            return;
        }
        if (obj instanceof JSONAware) {
            writer.write(((JSONAware) obj).toJSONString());
            return;
        }
        if (obj instanceof Map) {
            JSONObject.writeJSONString((Map) obj, writer);
        } else if (obj instanceof List) {
            JSONArray.writeJSONString((List) obj, writer);
        } else {
            writer.write(obj.toString());
        }
    }

    public static Object parseWithException(String str) throws ParseException {
        return new JSONParser().parse(str);
    }

    public static Object parse(String str) {
        return parse(new StringReader(str));
    }

    public static String escape(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        escape(str, stringBuffer);
        return stringBuffer.toString();
    }
}
