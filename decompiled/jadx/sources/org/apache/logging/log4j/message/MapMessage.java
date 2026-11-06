package org.apache.logging.log4j.message;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.logging.log4j.message.MapMessage;
import org.apache.logging.log4j.util.BiConsumer;
import org.apache.logging.log4j.util.EnglishEnums;
import org.apache.logging.log4j.util.IndexedReadOnlyStringMap;
import org.apache.logging.log4j.util.IndexedStringMap;
import org.apache.logging.log4j.util.MultiFormatStringBuilderFormattable;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.apache.logging.log4j.util.SortedArrayStringMap;
import org.apache.logging.log4j.util.StringBuilders;
import org.apache.logging.log4j.util.TriConsumer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AsynchronouslyFormattable
@PerformanceSensitive({"allocation"})
/* loaded from: classes11.dex */
public class MapMessage<M extends MapMessage<M, V>, V> implements MultiFormatStringBuilderFormattable {
    private static final long serialVersionUID = -5031471831131487120L;
    private final IndexedStringMap data;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.apache.logging.log4j.message.MapMessage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$logging$log4j$message$MapMessage$MapFormat;

        static {
            int[] iArr = new int[MapFormat.values().length];
            $SwitchMap$org$apache$logging$log4j$message$MapMessage$MapFormat = iArr;
            try {
                iArr[MapFormat.XML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$logging$log4j$message$MapMessage$MapFormat[MapFormat.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$logging$log4j$message$MapMessage$MapFormat[MapFormat.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$logging$log4j$message$MapMessage$MapFormat[MapFormat.JAVA_UNQUOTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MapFormat {
        XML,
        JSON,
        JAVA,
        JAVA_UNQUOTED;

        public static MapFormat lookupIgnoreCase(String str) {
            MapFormat mapFormat = XML;
            if (mapFormat.name().equalsIgnoreCase(str)) {
                return mapFormat;
            }
            MapFormat mapFormat2 = JSON;
            if (mapFormat2.name().equalsIgnoreCase(str)) {
                return mapFormat2;
            }
            MapFormat mapFormat3 = JAVA;
            if (mapFormat3.name().equalsIgnoreCase(str)) {
                return mapFormat3;
            }
            MapFormat mapFormat4 = JAVA_UNQUOTED;
            if (mapFormat4.name().equalsIgnoreCase(str)) {
                return mapFormat4;
            }
            return null;
        }

        public static String[] names() {
            return new String[]{XML.name(), JSON.name(), JAVA.name(), JAVA_UNQUOTED.name()};
        }
    }

    public MapMessage() {
        this.data = new SortedArrayStringMap();
    }

    private void asJava(StringBuilder sb, boolean z) {
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.data.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.data.getKeyAt(i));
            sb.append('=');
            if (z) {
                sb.append('\"');
            }
            ParameterFormatter.recursiveDeepToString(this.data.getValueAt(i), sb);
            if (z) {
                sb.append('\"');
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
    }

    private StringBuilder format(MapFormat mapFormat, StringBuilder sb) {
        if (mapFormat == null) {
            appendMap(sb);
            return sb;
        }
        int i = AnonymousClass1.$SwitchMap$org$apache$logging$log4j$message$MapMessage$MapFormat[mapFormat.ordinal()];
        if (i == 1) {
            asXml(sb);
            return sb;
        }
        if (i == 2) {
            asJson(sb);
            return sb;
        }
        if (i == 3) {
            asJava(sb);
            return sb;
        }
        if (i != 4) {
            appendMap(sb);
            return sb;
        }
        asJavaUnquoted(sb);
        return sb;
    }

    private MapFormat getFormat(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                MapFormat lookupIgnoreCase = MapFormat.lookupIgnoreCase(str);
                if (lookupIgnoreCase != null) {
                    return lookupIgnoreCase;
                }
            }
        }
        return null;
    }

    public void appendMap(StringBuilder sb) {
        for (int i = 0; i < this.data.size(); i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(this.data.getKeyAt(i));
            sb.append('=');
            sb.append('\"');
            ParameterFormatter.recursiveDeepToString(this.data.getValueAt(i), sb);
            sb.append('\"');
        }
    }

    public void asJavaUnquoted(StringBuilder sb) {
        asJava(sb, false);
    }

    public void asJson(StringBuilder sb) {
        MapMessageJsonFormatter.format(sb, this.data);
    }

    public String asString(String str) {
        try {
            return format((MapFormat) EnglishEnums.valueOf(MapFormat.class, str), new StringBuilder()).toString();
        } catch (IllegalArgumentException unused) {
            return this.asString();
        }
    }

    public void asXml(StringBuilder sb) {
        sb.append("<Map>\n");
        for (int i = 0; i < this.data.size(); i++) {
            sb.append("  <Entry key=\"");
            int length = sb.length();
            sb.append(this.data.getKeyAt(i));
            StringBuilders.escapeXml(sb, length);
            sb.append("\">");
            int length2 = sb.length();
            ParameterFormatter.recursiveDeepToString(this.data.getValueAt(i), sb);
            StringBuilders.escapeXml(sb, length2);
            sb.append("</Entry>\n");
        }
        sb.append("</Map>");
    }

    public void clear() {
        this.data.clear();
    }

    public boolean containsKey(String str) {
        return this.data.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapMessage) {
            return this.data.equals(((MapMessage) obj).data);
        }
        return false;
    }

    public <CV> void forEach(BiConsumer<String, ? super CV> biConsumer) {
        this.data.forEach(biConsumer);
    }

    @Override // org.apache.logging.log4j.util.MultiFormatStringBuilderFormattable
    public void formatTo(String[] strArr, StringBuilder sb) {
        format(getFormat(strArr), sb);
    }

    public String get(String str) {
        return ParameterFormatter.deepToString(this.data.getValue(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, V> getData() {
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < this.data.size(); i++) {
            treeMap.put(this.data.getKeyAt(i), this.data.getValueAt(i));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // org.apache.logging.log4j.message.MultiformatMessage
    public String[] getFormats() {
        return MapFormat.names();
    }

    @Override // org.apache.logging.log4j.message.MultiformatMessage
    public String getFormattedMessage(String[] strArr) {
        return format(getFormat(strArr), new StringBuilder()).toString();
    }

    public IndexedReadOnlyStringMap getIndexedReadOnlyStringMap() {
        return this.data;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Object[] getParameters() {
        Object[] objArr = new Object[this.data.size()];
        for (int i = 0; i < this.data.size(); i++) {
            objArr[i] = this.data.getValueAt(i);
        }
        return objArr;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Throwable getThrowable() {
        return null;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public M newInstance(Map<String, V> map) {
        return (M) new MapMessage(map);
    }

    public void put(String str, String str2) {
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("No value provided for key ", str));
            return;
        }
        String key = toKey(str);
        validate(key, str2);
        this.data.putValue(key, str2);
    }

    public void putAll(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.data.putValue(entry.getKey(), entry.getValue());
        }
    }

    public String remove(String str) {
        String str2 = get(str);
        this.data.remove(str);
        return str2;
    }

    public String toString() {
        return asString();
    }

    public M with(String str, boolean z) {
        String key = toKey(str);
        validate(key, z);
        this.data.putValue(key, Boolean.valueOf(z));
        return this;
    }

    public void validate(String str, char c) {
    }

    public void validate(String str, double d) {
    }

    public void validate(String str, float f) {
    }

    public void validate(String str, int i) {
    }

    public void validate(String str, long j) {
    }

    public <CV, S> void forEach(TriConsumer<String, ? super CV, S> triConsumer, S s) {
        this.data.forEach(triConsumer, s);
    }

    public void validate(String str, Object obj) {
    }

    public void validate(String str, String str2) {
    }

    @Override // org.apache.logging.log4j.util.StringBuilderFormattable
    public void formatTo(StringBuilder sb) {
        format(null, sb);
    }

    public void validate(String str, short s) {
    }

    public void validate(String str, boolean z) {
    }

    public MapMessage(int i) {
        this.data = new SortedArrayStringMap(i);
    }

    public MapMessage(Map<String, V> map) {
        this.data = new SortedArrayStringMap((Map<String, ?>) map);
    }

    public M with(String str, byte b) {
        String key = toKey(str);
        validate(key, b);
        this.data.putValue(key, Byte.valueOf(b));
        return this;
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormattedMessage() {
        return asString();
    }

    public M with(String str, char c) {
        String key = toKey(str);
        validate(key, c);
        this.data.putValue(key, Character.valueOf(c));
        return this;
    }

    public M with(String str, double d) {
        String key = toKey(str);
        validate(key, d);
        this.data.putValue(key, Double.valueOf(d));
        return this;
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormat() {
        return "";
    }

    public String toKey(String str) {
        return str;
    }

    public M with(String str, float f) {
        String key = toKey(str);
        validate(key, f);
        this.data.putValue(key, Float.valueOf(f));
        return this;
    }

    public String asString() {
        return format(null, new StringBuilder()).toString();
    }

    public M with(String str, int i) {
        String key = toKey(str);
        validate(key, i);
        this.data.putValue(key, Integer.valueOf(i));
        return this;
    }

    public M with(String str, long j) {
        String key = toKey(str);
        validate(key, j);
        this.data.putValue(key, Long.valueOf(j));
        return this;
    }

    public M with(String str, Object obj) {
        String key = toKey(str);
        validate(key, obj);
        this.data.putValue(key, obj);
        return this;
    }

    public M with(String str, short s) {
        String key = toKey(str);
        validate(key, s);
        this.data.putValue(key, Short.valueOf(s));
        return this;
    }

    public M with(String str, String str2) {
        put(toKey(str), str2);
        return this;
    }

    public void validate(String str, byte b) {
    }

    public void asJava(StringBuilder sb) {
        asJava(sb, true);
    }
}
