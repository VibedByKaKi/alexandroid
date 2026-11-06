package org.codehaus.jackson;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import org.codehaus.jackson.type.TypeReference;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class JsonParser implements Closeable, Versioned {
    private static final int MAX_BYTE_I = 255;
    private static final int MAX_SHORT_I = 32767;
    private static final int MIN_BYTE_I = -128;
    private static final int MIN_SHORT_I = -32768;
    protected JsonToken _currToken;
    protected int _features;
    protected JsonToken _lastClearedToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.codehaus.jackson.JsonParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$codehaus$jackson$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$org$codehaus$jackson$JsonToken = iArr;
            try {
                iArr[JsonToken.VALUE_TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true);

        final boolean _defaultState;

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (getMask() & i) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser(int i) {
        this._features = i;
    }

    public JsonParseException _constructError(String str) {
        return new JsonParseException(str, getCurrentLocation());
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public JsonParser configure(Feature feature, boolean z) {
        if (z) {
            enableFeature(feature);
            return this;
        }
        disableFeature(feature);
        return this;
    }

    public JsonParser disable(Feature feature) {
        this._features = (~feature.getMask()) & this._features;
        return this;
    }

    public void disableFeature(Feature feature) {
        disable(feature);
    }

    public JsonParser enable(Feature feature) {
        this._features = feature.getMask() | this._features;
        return this;
    }

    public void enableFeature(Feature feature) {
        enable(feature);
    }

    public abstract BigInteger getBigIntegerValue() throws IOException, JsonParseException;

    public byte[] getBinaryValue() throws IOException, JsonParseException {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant) throws IOException, JsonParseException;

    public boolean getBooleanValue() throws IOException, JsonParseException {
        if (getCurrentToken() == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (getCurrentToken() == JsonToken.VALUE_FALSE) {
            return false;
        }
        XML$$ExternalSyntheticBUOutline0.m("Current token (" + this._currToken + ") not of boolean type", getCurrentLocation());
        return false;
    }

    public byte getByteValue() throws IOException, JsonParseException {
        int intValue = getIntValue();
        if (intValue >= MIN_BYTE_I && intValue <= 255) {
            return (byte) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java byte");
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName() throws IOException, JsonParseException;

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public abstract BigDecimal getDecimalValue() throws IOException, JsonParseException;

    public abstract double getDoubleValue() throws IOException, JsonParseException;

    public Object getEmbeddedObject() throws IOException, JsonParseException {
        return null;
    }

    public abstract float getFloatValue() throws IOException, JsonParseException;

    public Object getInputSource() {
        return null;
    }

    public abstract int getIntValue() throws IOException, JsonParseException;

    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    public abstract long getLongValue() throws IOException, JsonParseException;

    public abstract NumberType getNumberType() throws IOException, JsonParseException;

    public abstract Number getNumberValue() throws IOException, JsonParseException;

    public abstract JsonStreamContext getParsingContext();

    public short getShortValue() throws IOException, JsonParseException {
        int intValue = getIntValue();
        if (intValue >= MIN_SHORT_I && intValue <= 32767) {
            return (short) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java short");
    }

    public abstract String getText() throws IOException, JsonParseException;

    public abstract char[] getTextCharacters() throws IOException, JsonParseException;

    public abstract int getTextLength() throws IOException, JsonParseException;

    public abstract int getTextOffset() throws IOException, JsonParseException;

    public abstract JsonLocation getTokenLocation();

    public boolean getValueAsBoolean() throws IOException, JsonParseException {
        return getValueAsBoolean(false);
    }

    public double getValueAsDouble() throws IOException, JsonParseException {
        return getValueAsDouble(0.0d);
    }

    public int getValueAsInt() throws IOException, JsonParseException {
        return getValueAsInt(0);
    }

    public long getValueAsLong() throws IOException, JsonParseException {
        return getValueAsLong(0L);
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public boolean hasTextCharacters() {
        return false;
    }

    public abstract boolean isClosed();

    public boolean isEnabled(Feature feature) {
        return (this._features & feature.getMask()) != 0;
    }

    public boolean isExpectedStartArrayToken() {
        return getCurrentToken() == JsonToken.START_ARRAY;
    }

    public final boolean isFeatureEnabled(Feature feature) {
        return isEnabled(feature);
    }

    public Boolean nextBooleanValue() throws IOException, JsonParseException {
        int i = AnonymousClass1.$SwitchMap$org$codehaus$jackson$JsonToken[nextToken().ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public boolean nextFieldName(SerializableString serializableString) throws IOException, JsonParseException {
        return nextToken() == JsonToken.FIELD_NAME && serializableString.getValue().equals(getCurrentName());
    }

    public int nextIntValue(int i) throws IOException, JsonParseException {
        return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i;
    }

    public long nextLongValue(long j) throws IOException, JsonParseException {
        return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j;
    }

    public String nextTextValue() throws IOException, JsonParseException {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract JsonToken nextToken() throws IOException, JsonParseException;

    public JsonToken nextValue() throws IOException, JsonParseException {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    public <T> T readValueAs(Class<T> cls) throws IOException, JsonProcessingException {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return (T) codec.readValue(this, cls);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        return null;
    }

    public JsonNode readValueAsTree() throws IOException, JsonProcessingException {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readTree(this);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree");
        return null;
    }

    public <T> Iterator<T> readValuesAs(Class<T> cls) throws IOException, JsonProcessingException {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValues(this, cls);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        return null;
    }

    public int releaseBuffered(OutputStream outputStream) throws IOException {
        return -1;
    }

    public abstract void setCodec(ObjectCodec objectCodec);

    public void setFeature(Feature feature, boolean z) {
        configure(feature, z);
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonParser skipChildren() throws IOException, JsonParseException;

    @Override // org.codehaus.jackson.Versioned
    public Version version() {
        return Version.unknownVersion();
    }

    public int releaseBuffered(Writer writer) throws IOException {
        return -1;
    }

    public JsonParser() {
    }

    public boolean getValueAsBoolean(boolean z) throws IOException, JsonParseException {
        return z;
    }

    public int getValueAsInt(int i) throws IOException, JsonParseException {
        return i;
    }

    public double getValueAsDouble(double d) throws IOException, JsonParseException {
        return d;
    }

    public long getValueAsLong(long j) throws IOException, JsonParseException {
        return j;
    }

    public <T> T readValueAs(TypeReference<?> typeReference) throws IOException, JsonProcessingException {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return (T) codec.readValue(this, typeReference);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        return null;
    }

    public <T> Iterator<T> readValuesAs(TypeReference<?> typeReference) throws IOException, JsonProcessingException {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValues(this, typeReference);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        return null;
    }
}
