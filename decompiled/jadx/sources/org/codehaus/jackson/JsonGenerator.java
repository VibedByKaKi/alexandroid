package org.codehaus.jackson;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.io.CharacterEscapes;
import org.codehaus.jackson.io.SerializedString;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class JsonGenerator implements Closeable, Versioned {
    protected PrettyPrinter _cfgPrettyPrinter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        FLUSH_PASSED_TO_STREAM(true),
        ESCAPE_NON_ASCII(false);

        final boolean _defaultState;
        final int _mask = 1 << ordinal();

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

        public int getMask() {
            return this._mask;
        }
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public JsonGenerator configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
            return this;
        }
        disable(feature);
        return this;
    }

    public abstract void copyCurrentEvent(JsonParser jsonParser) throws IOException, JsonProcessingException;

    public abstract void copyCurrentStructure(JsonParser jsonParser) throws IOException, JsonProcessingException;

    public abstract JsonGenerator disable(Feature feature);

    @Deprecated
    public void disableFeature(Feature feature) {
        disable(feature);
    }

    public abstract JsonGenerator enable(Feature feature);

    @Deprecated
    public void enableFeature(Feature feature) {
        enable(feature);
    }

    public abstract void flush() throws IOException;

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public int getHighestEscapedChar() {
        return 0;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    @Deprecated
    public boolean isFeatureEnabled(Feature feature) {
        return isEnabled(feature);
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    @Deprecated
    public void setFeature(Feature feature, boolean z) {
        configure(feature, z);
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Generator of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    @Override // org.codehaus.jackson.Versioned
    public Version version() {
        return Version.unknownVersion();
    }

    public final void writeArrayFieldStart(String str) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException;

    public void writeBinary(byte[] bArr) throws IOException, JsonGenerationException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public final void writeBinaryField(String str, byte[] bArr) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z) throws IOException, JsonGenerationException;

    public final void writeBooleanField(String str, boolean z) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeBoolean(z);
    }

    public abstract void writeEndArray() throws IOException, JsonGenerationException;

    public abstract void writeEndObject() throws IOException, JsonGenerationException;

    public abstract void writeFieldName(String str) throws IOException, JsonGenerationException;

    public void writeFieldName(SerializedString serializedString) throws IOException, JsonGenerationException {
        writeFieldName(serializedString.getValue());
    }

    public abstract void writeNull() throws IOException, JsonGenerationException;

    public final void writeNullField(String str) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d) throws IOException, JsonGenerationException;

    public abstract void writeNumber(float f) throws IOException, JsonGenerationException;

    public abstract void writeNumber(int i) throws IOException, JsonGenerationException;

    public abstract void writeNumber(long j) throws IOException, JsonGenerationException;

    public abstract void writeNumber(String str) throws IOException, JsonGenerationException, UnsupportedOperationException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException, JsonGenerationException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException, JsonGenerationException;

    public final void writeNumberField(String str, int i) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeNumber(i);
    }

    public abstract void writeObject(Object obj) throws IOException, JsonProcessingException;

    public final void writeObjectField(String str, Object obj) throws IOException, JsonProcessingException {
        writeFieldName(str);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String str) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeStartObject();
    }

    public abstract void writeRaw(char c) throws IOException, JsonGenerationException;

    public abstract void writeRaw(String str) throws IOException, JsonGenerationException;

    public abstract void writeRaw(String str, int i, int i2) throws IOException, JsonGenerationException;

    public abstract void writeRaw(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    public abstract void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException;

    public abstract void writeRawValue(String str) throws IOException, JsonGenerationException;

    public abstract void writeRawValue(String str, int i, int i2) throws IOException, JsonGenerationException;

    public abstract void writeRawValue(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    public abstract void writeStartArray() throws IOException, JsonGenerationException;

    public abstract void writeStartObject() throws IOException, JsonGenerationException;

    public abstract void writeString(String str) throws IOException, JsonGenerationException;

    public void writeString(SerializableString serializableString) throws IOException, JsonGenerationException {
        writeString(serializableString.getValue());
    }

    public abstract void writeString(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    public void writeStringField(String str, String str2) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(JsonNode jsonNode) throws IOException, JsonProcessingException;

    public abstract void writeUTF8String(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException;

    public final void writeNumberField(String str, long j) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeNumber(j);
    }

    public void writeFieldName(SerializableString serializableString) throws IOException, JsonGenerationException {
        writeFieldName(serializableString.getValue());
    }

    public final void writeNumberField(String str, double d) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeNumber(d);
    }

    public void writeBinary(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i, i2);
    }

    public final void writeNumberField(String str, float f) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeNumber(f);
    }

    public final void writeNumberField(String str, BigDecimal bigDecimal) throws IOException, JsonGenerationException {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i) {
        return this;
    }
}
