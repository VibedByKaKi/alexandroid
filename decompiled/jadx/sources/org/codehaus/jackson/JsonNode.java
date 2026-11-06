package org.codehaus.jackson;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.JsonParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class JsonNode implements Iterable<JsonNode> {
    protected static final List<JsonNode> NO_NODES;
    protected static final List<String> NO_STRINGS;

    static {
        List list = Collections.EMPTY_LIST;
        NO_NODES = list;
        NO_STRINGS = list;
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public double asDouble() {
        return asDouble(0.0d);
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public abstract String asText();

    public abstract JsonToken asToken();

    public abstract boolean equals(Object obj);

    public abstract JsonNode findParent(String str);

    public final List<JsonNode> findParents(String str) {
        List<JsonNode> findParents = findParents(str, null);
        return findParents == null ? Collections.EMPTY_LIST : findParents;
    }

    public abstract List<JsonNode> findParents(String str, List<JsonNode> list);

    public abstract JsonNode findPath(String str);

    public abstract JsonNode findValue(String str);

    public final List<JsonNode> findValues(String str) {
        List<JsonNode> findValues = findValues(str, null);
        return findValues == null ? Collections.EMPTY_LIST : findValues;
    }

    public abstract List<JsonNode> findValues(String str, List<JsonNode> list);

    public final List<String> findValuesAsText(String str) {
        List<String> findValuesAsText = findValuesAsText(str, null);
        return findValuesAsText == null ? Collections.EMPTY_LIST : findValuesAsText;
    }

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public JsonNode get(int i) {
        return null;
    }

    public BigInteger getBigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] getBinaryValue() throws IOException {
        return null;
    }

    public boolean getBooleanValue() {
        return false;
    }

    public BigDecimal getDecimalValue() {
        return BigDecimal.ZERO;
    }

    public double getDoubleValue() {
        return 0.0d;
    }

    public Iterator<JsonNode> getElements() {
        return NO_NODES.iterator();
    }

    public Iterator<String> getFieldNames() {
        return NO_STRINGS.iterator();
    }

    public Iterator<Map.Entry<String, JsonNode>> getFields() {
        return Collections.EMPTY_LIST.iterator();
    }

    public int getIntValue() {
        return 0;
    }

    public long getLongValue() {
        return 0L;
    }

    public abstract JsonParser.NumberType getNumberType();

    public Number getNumberValue() {
        return null;
    }

    @Deprecated
    public final JsonNode getPath(String str) {
        return path(str);
    }

    public String getTextValue() {
        return null;
    }

    @Deprecated
    public boolean getValueAsBoolean() {
        return asBoolean(false);
    }

    @Deprecated
    public double getValueAsDouble() {
        return asDouble(0.0d);
    }

    @Deprecated
    public int getValueAsInt() {
        return asInt(0);
    }

    @Deprecated
    public long getValueAsLong() {
        return asLong(0L);
    }

    @Deprecated
    public String getValueAsText() {
        return asText();
    }

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public boolean isBinary() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isContainerNode() {
        return false;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public boolean isMissingNode() {
        return false;
    }

    public boolean isNull() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public boolean isPojo() {
        return false;
    }

    public boolean isTextual() {
        return false;
    }

    public boolean isValueNode() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return getElements();
    }

    public abstract JsonNode path(int i);

    public abstract JsonNode path(String str);

    public int size() {
        return 0;
    }

    public abstract String toString();

    public abstract JsonParser traverse();

    public JsonNode with(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), can not call with() on it");
    }

    public JsonNode get(String str) {
        return null;
    }

    @Deprecated
    public final JsonNode getPath(int i) {
        return path(i);
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public int asInt(int i) {
        return i;
    }

    @Deprecated
    public boolean getValueAsBoolean(boolean z) {
        return asBoolean(z);
    }

    @Deprecated
    public int getValueAsInt(int i) {
        return asInt(i);
    }

    public double asDouble(double d) {
        return d;
    }

    public long asLong(long j) {
        return j;
    }

    @Deprecated
    public double getValueAsDouble(double d) {
        return asDouble(d);
    }

    @Deprecated
    public long getValueAsLong(long j) {
        return asLong(j);
    }

    public boolean has(int i) {
        return get(i) != null;
    }
}
