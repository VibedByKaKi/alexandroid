package org.apache.commons.lang3.builder;

import com.amazon.alexa.mobilytics.configuration.DefaultRecordChecker;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class ToStringStyle implements Serializable {
    private static final long serialVersionUID = -2587890625525655916L;
    private boolean fieldSeparatorAtEnd;
    private boolean fieldSeparatorAtStart;
    private boolean useShortClassName;
    public static final ToStringStyle DEFAULT_STYLE = new DefaultToStringStyle();
    public static final ToStringStyle MULTI_LINE_STYLE = new MultiLineToStringStyle();
    public static final ToStringStyle NO_FIELD_NAMES_STYLE = new NoFieldNameToStringStyle();
    public static final ToStringStyle SHORT_PREFIX_STYLE = new ShortPrefixToStringStyle();
    public static final ToStringStyle SIMPLE_STYLE = new SimpleToStringStyle();
    public static final ToStringStyle NO_CLASS_NAME_STYLE = new NoClassNameToStringStyle();
    public static final ToStringStyle JSON_STYLE = new JsonToStringStyle();
    private static final ThreadLocal<WeakHashMap<Object, Object>> REGISTRY = ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(23));
    private boolean useFieldNames = true;
    private boolean useClassName = true;
    private boolean useIdentityHashCode = true;
    private String contentStart = MarkdownConstants.LEFT_BRACKET;
    private String contentEnd = MarkdownConstants.RIGHT_BRACKET;
    private String fieldNameValueSeparator = "=";
    private String fieldSeparator = ",";
    private String arrayStart = "{";
    private String arraySeparator = ",";
    private boolean arrayContentDetail = true;
    private String arrayEnd = StringSubstitutor.DEFAULT_VAR_END;
    private boolean defaultFullDetail = true;
    private String nullText = DefaultRecordChecker.Regex.EMPTY;
    private String sizeStartText = "<size=";
    private String sizeEndText = ">";
    private String summaryObjectStartText = "<";
    private String summaryObjectEndText = ">";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DefaultToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return ToStringStyle.DEFAULT_STYLE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MultiLineToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        public MultiLineToStringStyle() {
            setContentStart(MarkdownConstants.LEFT_BRACKET);
            setFieldSeparator(System.lineSeparator() + "  ");
            setFieldSeparatorAtStart(true);
            setContentEnd(System.lineSeparator() + MarkdownConstants.RIGHT_BRACKET);
        }

        private Object readResolve() {
            return ToStringStyle.MULTI_LINE_STYLE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NoClassNameToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        public NoClassNameToStringStyle() {
            setUseClassName(false);
            setUseIdentityHashCode(false);
        }

        private Object readResolve() {
            return ToStringStyle.NO_CLASS_NAME_STYLE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NoFieldNameToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        public NoFieldNameToStringStyle() {
            setUseFieldNames(false);
        }

        private Object readResolve() {
            return ToStringStyle.NO_FIELD_NAMES_STYLE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ShortPrefixToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        public ShortPrefixToStringStyle() {
            setUseShortClassName(true);
            setUseIdentityHashCode(false);
        }

        private Object readResolve() {
            return ToStringStyle.SHORT_PREFIX_STYLE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SimpleToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        public SimpleToStringStyle() {
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setUseFieldNames(false);
            setContentStart("");
            setContentEnd("");
        }

        private Object readResolve() {
            return ToStringStyle.SIMPLE_STYLE;
        }
    }

    public static Map<Object, Object> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj) {
        return getRegistry().containsKey(obj);
    }

    public static void register(Object obj) {
        if (obj != null) {
            getRegistry().put(obj, null);
        }
    }

    public static void unregister(Object obj) {
        if (obj != null) {
            Map<Object, Object> registry = getRegistry();
            registry.remove(obj);
            if (registry.isEmpty()) {
                REGISTRY.remove();
            }
        }
    }

    public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (zArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, zArr);
        } else {
            appendSummary(stringBuffer, str, zArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendClassName(StringBuffer stringBuffer, Object obj) {
        if (!isUseClassName() || obj == null) {
            return;
        }
        register(obj);
        if (isUseShortClassName()) {
            stringBuffer.append(getShortClassName(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    public void appendContentEnd(StringBuffer stringBuffer) {
        stringBuffer.append(getContentEnd());
    }

    public void appendContentStart(StringBuffer stringBuffer) {
        stringBuffer.append(getContentStart());
    }

    public void appendCyclicObject(StringBuffer stringBuffer, String str, Object obj) {
        ObjectUtils.identityToString(stringBuffer, obj);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void appendEnd(StringBuffer stringBuffer, Object obj) {
        if (!isFieldSeparatorAtEnd()) {
            removeLastFieldSeparator(stringBuffer);
        }
        appendContentEnd(stringBuffer);
        unregister(obj);
    }

    public void appendFieldEnd(StringBuffer stringBuffer, String str) {
        appendFieldSeparator(stringBuffer);
    }

    public void appendFieldSeparator(StringBuffer stringBuffer) {
        stringBuffer.append(getFieldSeparator());
    }

    public void appendFieldStart(StringBuffer stringBuffer, String str) {
        if (!isUseFieldNames() || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(getFieldNameValueSeparator());
    }

    public void appendIdentityHashCode(StringBuffer stringBuffer, Object obj) {
        if (!isUseIdentityHashCode() || obj == null) {
            return;
        }
        register(obj);
        stringBuffer.append('@');
        stringBuffer.append(ObjectUtils.identityHashCodeHex(obj));
    }

    public void appendInternal(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        if (isRegistered(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            appendCyclicObject(stringBuffer, str, obj);
            return;
        }
        register(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    appendDetail(stringBuffer, str, (Collection<?>) obj);
                } else {
                    appendSummarySize(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z) {
                    appendDetail(stringBuffer, str, (Map<?, ?>) obj);
                } else {
                    appendSummarySize(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (long[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (int[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (short[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (byte[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (char[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (double[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (float[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    appendDetail(stringBuffer, str, (boolean[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (boolean[]) obj);
                }
            } else if (ObjectUtils.isArray(obj)) {
                if (z) {
                    appendDetail(stringBuffer, str, (Object[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (Object[]) obj);
                }
            } else if (z) {
                appendDetail(stringBuffer, str, obj);
            } else {
                appendSummary(stringBuffer, str, obj);
            }
            unregister(obj);
        } catch (Throwable th) {
            unregister(obj);
            throw th;
        }
    }

    public void appendNullText(StringBuffer stringBuffer, String str) {
        stringBuffer.append(getNullText());
    }

    public void appendStart(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            appendClassName(stringBuffer, obj);
            appendIdentityHashCode(stringBuffer, obj);
            appendContentStart(stringBuffer);
            if (isFieldSeparatorAtStart()) {
                appendFieldSeparator(stringBuffer);
            }
        }
    }

    public void appendSummary(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(getSummaryObjectStartText());
        stringBuffer.append(getShortClassName(obj.getClass()));
        stringBuffer.append(getSummaryObjectEndText());
    }

    public void appendSummarySize(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(getSizeStartText());
        stringBuffer.append(i);
        stringBuffer.append(getSizeEndText());
    }

    public void appendSuper(StringBuffer stringBuffer, String str) {
        appendToString(stringBuffer, str);
    }

    public void appendToString(StringBuffer stringBuffer, String str) {
        if (str != null) {
            int length = getContentStart().length() + str.indexOf(getContentStart());
            int lastIndexOf = str.lastIndexOf(getContentEnd());
            if (length == lastIndexOf || length < 0 || lastIndexOf < 0) {
                return;
            }
            if (isFieldSeparatorAtStart()) {
                removeLastFieldSeparator(stringBuffer);
            }
            stringBuffer.append((CharSequence) str, length, lastIndexOf);
            appendFieldSeparator(stringBuffer);
        }
    }

    public String getArrayEnd() {
        return this.arrayEnd;
    }

    public String getArraySeparator() {
        return this.arraySeparator;
    }

    public String getArrayStart() {
        return this.arrayStart;
    }

    public String getContentEnd() {
        return this.contentEnd;
    }

    public String getContentStart() {
        return this.contentStart;
    }

    public String getFieldNameValueSeparator() {
        return this.fieldNameValueSeparator;
    }

    public String getFieldSeparator() {
        return this.fieldSeparator;
    }

    public String getNullText() {
        return this.nullText;
    }

    public String getShortClassName(Class<?> cls) {
        return ClassUtils.getShortClassName(cls);
    }

    public String getSizeEndText() {
        return this.sizeEndText;
    }

    public String getSizeStartText() {
        return this.sizeStartText;
    }

    public String getSummaryObjectEndText() {
        return this.summaryObjectEndText;
    }

    public String getSummaryObjectStartText() {
        return this.summaryObjectStartText;
    }

    public boolean isArrayContentDetail() {
        return this.arrayContentDetail;
    }

    public boolean isDefaultFullDetail() {
        return this.defaultFullDetail;
    }

    public boolean isFieldSeparatorAtEnd() {
        return this.fieldSeparatorAtEnd;
    }

    public boolean isFieldSeparatorAtStart() {
        return this.fieldSeparatorAtStart;
    }

    public boolean isFullDetail(Boolean bool) {
        return bool == null ? isDefaultFullDetail() : bool.booleanValue();
    }

    public boolean isUseClassName() {
        return this.useClassName;
    }

    public boolean isUseFieldNames() {
        return this.useFieldNames;
    }

    public boolean isUseIdentityHashCode() {
        return this.useIdentityHashCode;
    }

    public boolean isUseShortClassName() {
        return this.useShortClassName;
    }

    public void reflectionAppendArrayDetail(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(getArrayStart());
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            appendDetail(stringBuffer, str, i, Array.get(obj, i));
        }
        stringBuffer.append(getArrayEnd());
    }

    public void removeLastFieldSeparator(StringBuffer stringBuffer) {
        if (Strings.CS.endsWith(stringBuffer, getFieldSeparator())) {
            stringBuffer.setLength(stringBuffer.length() - getFieldSeparator().length());
        }
    }

    public void setArrayContentDetail(boolean z) {
        this.arrayContentDetail = z;
    }

    public void setArrayEnd(String str) {
        this.arrayEnd = ObjectUtils.toString(str);
    }

    public void setArraySeparator(String str) {
        this.arraySeparator = ObjectUtils.toString(str);
    }

    public void setArrayStart(String str) {
        this.arrayStart = ObjectUtils.toString(str);
    }

    public void setContentEnd(String str) {
        this.contentEnd = ObjectUtils.toString(str);
    }

    public void setContentStart(String str) {
        this.contentStart = ObjectUtils.toString(str);
    }

    public void setDefaultFullDetail(boolean z) {
        this.defaultFullDetail = z;
    }

    public void setFieldNameValueSeparator(String str) {
        this.fieldNameValueSeparator = ObjectUtils.toString(str);
    }

    public void setFieldSeparator(String str) {
        this.fieldSeparator = ObjectUtils.toString(str);
    }

    public void setFieldSeparatorAtEnd(boolean z) {
        this.fieldSeparatorAtEnd = z;
    }

    public void setFieldSeparatorAtStart(boolean z) {
        this.fieldSeparatorAtStart = z;
    }

    public void setNullText(String str) {
        this.nullText = ObjectUtils.toString(str);
    }

    public void setSizeEndText(String str) {
        this.sizeEndText = ObjectUtils.toString(str);
    }

    public void setSizeStartText(String str) {
        this.sizeStartText = ObjectUtils.toString(str);
    }

    public void setSummaryObjectEndText(String str) {
        this.summaryObjectEndText = ObjectUtils.toString(str);
    }

    public void setSummaryObjectStartText(String str) {
        this.summaryObjectStartText = ObjectUtils.toString(str);
    }

    public void setUseClassName(boolean z) {
        this.useClassName = z;
    }

    public void setUseFieldNames(boolean z) {
        this.useFieldNames = z;
    }

    public void setUseIdentityHashCode(boolean z) {
        this.useIdentityHashCode = z;
    }

    public void setUseShortClassName(boolean z) {
        this.useShortClassName = z;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JsonToStringStyle extends ToStringStyle {
        private static final String FIELD_NAME_QUOTE = "\"";
        private static final long serialVersionUID = 1;

        public JsonToStringStyle() {
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setContentStart("{");
            setContentEnd(StringSubstitutor.DEFAULT_VAR_END);
            setArrayStart(MarkdownConstants.LEFT_BRACKET);
            setArrayEnd(MarkdownConstants.RIGHT_BRACKET);
            setFieldSeparator(",");
            setFieldNameValueSeparator(":");
            setNullText("null");
            setSummaryObjectStartText("\"<");
            setSummaryObjectEndText(">\"");
            setSizeStartText("\"<size=");
            setSizeEndText(">\"");
        }

        private void appendValueAsString(StringBuffer stringBuffer, String str) {
            stringBuffer.append('\"');
            stringBuffer.append(StringEscapeUtils.escapeJson(str));
            stringBuffer.append('\"');
        }

        private void checkAppendInput(String str, Boolean bool) {
            checkFieldName(str);
            checkIsFullDetail(bool);
        }

        private void checkFieldName(String str) {
            if (str != null) {
                return;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$1("Field names are mandatory when using JsonToStringStyle");
        }

        private void checkIsFullDetail(Boolean bool) {
            if (isFullDetail(bool)) {
                return;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$1("FullDetail must be true when using JsonToStringStyle");
        }

        private boolean isJsonArray(String str) {
            return str.startsWith(getArrayStart()) && str.endsWith(getArrayEnd());
        }

        private boolean isJsonObject(String str) {
            return str.startsWith(getContentStart()) && str.endsWith(getContentEnd());
        }

        private Object readResolve() {
            return ToStringStyle.JSON_STYLE;
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, zArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendDetail(StringBuffer stringBuffer, String str, Map<?, ?> map) {
            if (map == null || map.isEmpty()) {
                stringBuffer.append(map);
                return;
            }
            stringBuffer.append(getContentStart());
            boolean z = true;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String objects = Objects.toString(entry.getKey(), null);
                if (objects != null) {
                    if (z) {
                        z = false;
                    } else {
                        appendFieldEnd(stringBuffer, objects);
                    }
                    appendFieldStart(stringBuffer, objects);
                    Object value = entry.getValue();
                    if (value == null) {
                        appendNullText(stringBuffer, objects);
                    } else {
                        appendInternal(stringBuffer, objects, value, true);
                    }
                }
            }
            stringBuffer.append(getContentEnd());
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendFieldStart(StringBuffer stringBuffer, String str) {
            checkFieldName(str);
            super.appendFieldStart(stringBuffer, "\"" + StringEscapeUtils.escapeJson(str) + "\"");
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, bArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, cArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, dArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, fArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, iArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, jArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, obj, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, objArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
            checkAppendInput(str, bool);
            super.append(stringBuffer, str, sArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendDetail(StringBuffer stringBuffer, String str, Collection<?> collection) {
            if (collection != null && !collection.isEmpty()) {
                stringBuffer.append(getArrayStart());
                Iterator<?> it2 = collection.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    appendDetail(stringBuffer, str, i, it2.next());
                    i++;
                }
                stringBuffer.append(getArrayEnd());
                return;
            }
            stringBuffer.append(collection);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendDetail(StringBuffer stringBuffer, String str, char c) {
            appendValueAsString(stringBuffer, String.valueOf(c));
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                appendNullText(stringBuffer, str);
                return;
            }
            if (!(obj instanceof String) && !(obj instanceof Character)) {
                if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                    String obj2 = obj.toString();
                    if (!isJsonObject(obj2) && !isJsonArray(obj2)) {
                        appendDetail(stringBuffer, str, obj2);
                        return;
                    } else {
                        stringBuffer.append(obj);
                        return;
                    }
                }
                stringBuffer.append(obj);
                return;
            }
            appendValueAsString(stringBuffer, obj.toString());
        }
    }

    public void append(StringBuffer stringBuffer, String str, boolean z) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, z);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, byte[] bArr) {
        appendSummarySize(stringBuffer, str, bArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, char[] cArr) {
        appendSummarySize(stringBuffer, str, cArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, double[] dArr) {
        appendSummarySize(stringBuffer, str, dArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, byte b) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, b);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, float[] fArr) {
        appendSummarySize(stringBuffer, str, fArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, int[] iArr) {
        appendSummarySize(stringBuffer, str, iArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, long[] jArr) {
        appendSummarySize(stringBuffer, str, jArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (bArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, bArr);
        } else {
            appendSummary(stringBuffer, str, bArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, boolean[] zArr) {
        appendSummarySize(stringBuffer, str, zArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, Object[] objArr) {
        appendSummarySize(stringBuffer, str, objArr.length);
    }

    public void appendSummary(StringBuffer stringBuffer, String str, short[] sArr) {
        appendSummarySize(stringBuffer, str, sArr.length);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, byte b) {
        stringBuffer.append((int) b);
    }

    public void append(StringBuffer stringBuffer, String str, char c) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, c);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (cArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, cArr);
        } else {
            appendSummary(stringBuffer, str, cArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, char c) {
        stringBuffer.append(c);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, double d) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, d);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (dArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, dArr);
        } else {
            appendSummary(stringBuffer, str, dArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, float f) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, f);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (fArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, fArr);
        } else {
            appendSummary(stringBuffer, str, fArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(getArraySeparator());
        }
        if (obj == null) {
            appendNullText(stringBuffer, str);
        } else {
            appendInternal(stringBuffer, str, obj, isArrayContentDetail());
        }
    }

    public void append(StringBuffer stringBuffer, String str, int i) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, i);
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (iArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, iArr);
        } else {
            appendSummary(stringBuffer, str, iArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, long j) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, j);
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (jArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, jArr);
        } else {
            appendSummary(stringBuffer, str, jArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < objArr.length; i++) {
            appendDetail(stringBuffer, str, i, objArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (obj == null) {
            appendNullText(stringBuffer, str);
        } else {
            appendInternal(stringBuffer, str, obj, isFullDetail(bool));
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append((int) s);
    }

    public void appendDetail(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(getArrayStart());
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(getArraySeparator());
            }
            appendDetail(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(getArrayEnd());
    }

    public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (objArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, objArr);
        } else {
            appendSummary(stringBuffer, str, objArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, short s) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, s);
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (sArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, sArr);
        } else {
            appendSummary(stringBuffer, str, sArr);
        }
        appendFieldEnd(stringBuffer, str);
    }
}
