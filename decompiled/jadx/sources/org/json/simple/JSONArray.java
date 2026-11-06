package org.json.simple;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JSONArray extends ArrayList implements List, JSONAware, JSONStreamAware {
    private static final long serialVersionUID = 3957988303675231981L;

    public static String toJSONString(List list) {
        if (list == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer(MarkdownConstants.LEFT_BRACKET);
        boolean z = true;
        for (Object obj : list) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(AbstractJsonLexerKt.COMMA);
            }
            if (obj == null) {
                stringBuffer.append("null");
            } else {
                stringBuffer.append(JSONValue.toJSONString(obj));
            }
        }
        stringBuffer.append(AbstractJsonLexerKt.END_LIST);
        return stringBuffer.toString();
    }

    public static void writeJSONString(List list, Writer writer) throws IOException {
        if (list == null) {
            writer.write("null");
            return;
        }
        writer.write(91);
        boolean z = true;
        for (Object obj : list) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            if (obj == null) {
                writer.write("null");
            } else {
                JSONValue.writeJSONString(obj, writer);
            }
        }
        writer.write(93);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return toJSONString();
    }

    @Override // org.json.simple.JSONStreamAware
    public void writeJSONString(Writer writer) throws IOException {
        writeJSONString(this, writer);
    }

    @Override // org.json.simple.JSONAware
    public String toJSONString() {
        return toJSONString(this);
    }
}
