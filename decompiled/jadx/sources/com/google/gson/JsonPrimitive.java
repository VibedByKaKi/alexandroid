package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class JsonPrimitive extends JsonElement {
    private final Object value;

    public JsonPrimitive(Character ch) {
        Objects.requireNonNull(ch);
        this.value = ch.toString();
    }

    private static int hashOfDoubleValue(double d) {
        long j = (long) d;
        return d == ((double) j) ? Long.hashCode(j) : Double.hashCode(d);
    }

    private static boolean isIntegral(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.value;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.value == null) {
            return jsonPrimitive.value == null;
        }
        if (isIntegral(this) && isIntegral(jsonPrimitive)) {
            return ((this.value instanceof BigInteger) || (jsonPrimitive.value instanceof BigInteger)) ? getAsBigInteger().equals(jsonPrimitive.getAsBigInteger()) : getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
        }
        Object obj2 = this.value;
        if (obj2 instanceof Number) {
            Object obj3 = jsonPrimitive.value;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return getAsBigDecimal().compareTo(jsonPrimitive.getAsBigDecimal()) == 0;
                }
                double asDouble = getAsDouble();
                double asDouble2 = jsonPrimitive.getAsDouble();
                return asDouble == asDouble2 || (Double.isNaN(asDouble) && Double.isNaN(asDouble2));
            }
        }
        return obj2.equals(jsonPrimitive.value);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object obj = this.value;
        return obj instanceof BigDecimal ? (BigDecimal) obj : NumberLimits.parseBigDecimal(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object obj = this.value;
        return obj instanceof BigInteger ? (BigInteger) obj : isIntegral(this) ? BigInteger.valueOf(getAsNumber().longValue()) : NumberLimits.parseBigInteger(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return isBoolean() ? ((Boolean) this.value).booleanValue() : Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (!asString.isEmpty()) {
            return asString.charAt(0);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("String value is empty");
        return (char) 0;
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object obj = this.value;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Primitive is neither a number nor a string");
        return null;
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (isNumber()) {
            return getAsNumber().toString();
        }
        boolean isBoolean = isBoolean();
        Object obj2 = this.value;
        if (isBoolean) {
            return ((Boolean) obj2).toString();
        }
        Buffer$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(obj2, new StringBuilder("Unexpected value type: ")));
        return null;
    }

    public int hashCode() {
        if (this.value == null) {
            return 31;
        }
        if (isIntegral(this)) {
            return hashOfDoubleValue(getAsNumber().doubleValue());
        }
        Object obj = this.value;
        return obj instanceof Number ? hashOfDoubleValue(getAsNumber().doubleValue()) : obj.hashCode();
    }

    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    public boolean isNumber() {
        return this.value instanceof Number;
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.value = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.value = str;
    }

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.value = bool;
    }
}
