package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import okhttp3.HttpUrl;
import org.apache.commons.net.nntp.NNTPReply;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class NumberConverter {
    private static final BigDecimal BD_MAX_LONG;
    private static final BigDecimal BD_MIN_LONG;
    private static final byte MINUS = 45;
    private static final byte[] MIN_INT;
    private static final byte[] MIN_LONG;
    public static final short[] SHORT_EMPTY_ARRAY = new short[0];
    public static final int[] INT_EMPTY_ARRAY = new int[0];
    public static final long[] LONG_EMPTY_ARRAY = new long[0];
    public static final float[] FLOAT_EMPTY_ARRAY = new float[0];
    public static final double[] DOUBLE_EMPTY_ARRAY = new double[0];
    public static final Short SHORT_ZERO = 0;
    public static final Integer INT_ZERO = 0;
    public static final Long LONG_ZERO = 0L;
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    private static final int[] DIGITS = new int[1000];
    private static final int[] DIFF = {111, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 444, 888, 1776};
    private static final int[] ERROR = {50, 100, 200, 400, 800};
    private static final int[] SCALE_10 = {10000, 1000, 100, 10, 1};
    private static final double[] POW_10 = {10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d, 1.0E23d, 1.0E24d, 1.0E25d, 1.0E26d, 1.0E27d, 1.0E28d, 1.0E29d, 1.0E30d, 1.0E31d, 1.0E32d, 1.0E33d, 1.0E34d, 1.0E35d, 1.0E36d, 1.0E37d, 1.0E38d, 1.0E39d, 1.0E40d, 1.0E41d, 1.0E42d, 1.0E43d, 1.0E44d, 1.0E45d, 1.0E46d, 1.0E47d, 1.0E48d, 1.0E49d, 1.0E50d, 1.0E51d, 1.0E52d, 1.0E53d, 1.0E54d, 1.0E55d, 1.0E56d, 1.0E57d, 1.0E58d, 1.0E59d, 1.0E60d, 1.0E61d, 1.0E62d, 1.0E63d, 1.0E64d, 1.0E65d};
    public static final JsonReader.ReadObject<Double> DOUBLE_READER = new JsonReader.ReadObject<Double>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Double read(JsonReader jsonReader) throws IOException {
            return Double.valueOf(NumberConverter.deserializeDouble(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Double> NULLABLE_DOUBLE_READER = new JsonReader.ReadObject<Double>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Double read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Double.valueOf(NumberConverter.deserializeDouble(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Double> DOUBLE_WRITER = new JsonWriter.WriteObject<Double>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable Double d) {
            NumberConverter.serializeNullable(d, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<double[]> DOUBLE_ARRAY_READER = new JsonReader.ReadObject<double[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public double[] read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() != 91) {
                throw jsonReader.newParseError("Expecting '[' for double array start");
            }
            jsonReader.getNextToken();
            return NumberConverter.deserializeDoubleArray(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<double[]> DOUBLE_ARRAY_WRITER = new JsonWriter.WriteObject<double[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable double[] dArr) {
            NumberConverter.serialize(dArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Float> FLOAT_READER = new JsonReader.ReadObject<Float>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.6
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Float read(JsonReader jsonReader) throws IOException {
            return Float.valueOf(NumberConverter.deserializeFloat(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Float> NULLABLE_FLOAT_READER = new JsonReader.ReadObject<Float>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.7
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Float read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Float.valueOf(NumberConverter.deserializeFloat(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Float> FLOAT_WRITER = new JsonWriter.WriteObject<Float>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.8
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable Float f) {
            NumberConverter.serializeNullable(f, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<float[]> FLOAT_ARRAY_READER = new JsonReader.ReadObject<float[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.9
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public float[] read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() != 91) {
                throw jsonReader.newParseError("Expecting '[' for float array start");
            }
            jsonReader.getNextToken();
            return NumberConverter.deserializeFloatArray(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<float[]> FLOAT_ARRAY_WRITER = new JsonWriter.WriteObject<float[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.10
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable float[] fArr) {
            NumberConverter.serialize(fArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Integer> INT_READER = new JsonReader.ReadObject<Integer>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.11
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Integer read(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(NumberConverter.deserializeInt(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Integer> NULLABLE_INT_READER = new JsonReader.ReadObject<Integer>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.12
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Integer read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Integer.valueOf(NumberConverter.deserializeInt(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Integer> INT_WRITER = new JsonWriter.WriteObject<Integer>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.13
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable Integer num) {
            NumberConverter.serializeNullable(num, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<int[]> INT_ARRAY_READER = new JsonReader.ReadObject<int[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.14
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public int[] read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() != 91) {
                throw jsonReader.newParseError("Expecting '[' for int array start");
            }
            jsonReader.getNextToken();
            return NumberConverter.deserializeIntArray(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<int[]> INT_ARRAY_WRITER = new JsonWriter.WriteObject<int[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.15
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable int[] iArr) {
            NumberConverter.serialize(iArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Short> SHORT_READER = new JsonReader.ReadObject<Short>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.16
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Short read(JsonReader jsonReader) throws IOException {
            return Short.valueOf(NumberConverter.deserializeShort(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Short> NULLABLE_SHORT_READER = new JsonReader.ReadObject<Short>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.17
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Short read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Short.valueOf(NumberConverter.deserializeShort(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Short> SHORT_WRITER = new JsonWriter.WriteObject<Short>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.18
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable Short sh) {
            if (sh == null) {
                jsonWriter.writeNull();
            } else {
                NumberConverter.serialize(sh.intValue(), jsonWriter);
            }
        }
    };
    public static final JsonReader.ReadObject<short[]> SHORT_ARRAY_READER = new JsonReader.ReadObject<short[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.19
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public short[] read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() != 91) {
                throw jsonReader.newParseError("Expecting '[' for short array start");
            }
            jsonReader.getNextToken();
            return NumberConverter.deserializeShortArray(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<short[]> SHORT_ARRAY_WRITER = new JsonWriter.WriteObject<short[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.20
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable short[] sArr) {
            NumberConverter.serialize(sArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Long> LONG_READER = new JsonReader.ReadObject<Long>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.21
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Long read(JsonReader jsonReader) throws IOException {
            return Long.valueOf(NumberConverter.deserializeLong(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Long> NULLABLE_LONG_READER = new JsonReader.ReadObject<Long>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.22
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Long read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Long.valueOf(NumberConverter.deserializeLong(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Long> LONG_WRITER = new JsonWriter.WriteObject<Long>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.23
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable Long l) {
            NumberConverter.serializeNullable(l, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<long[]> LONG_ARRAY_READER = new JsonReader.ReadObject<long[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.24
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public long[] read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() != 91) {
                throw jsonReader.newParseError("Expecting '[' for long array start");
            }
            jsonReader.getNextToken();
            return NumberConverter.deserializeLongArray(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<long[]> LONG_ARRAY_WRITER = new JsonWriter.WriteObject<long[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.25
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable long[] jArr) {
            NumberConverter.serialize(jArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<BigDecimal> DecimalReader = new JsonReader.ReadObject<BigDecimal>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.26
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public BigDecimal read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NumberConverter.deserializeDecimal(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<BigDecimal> DecimalWriter = new JsonWriter.WriteObject<BigDecimal>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.27
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable BigDecimal bigDecimal) {
            NumberConverter.serializeNullable(bigDecimal, jsonWriter);
        }
    };
    static final JsonReader.ReadObject<Number> NumberReader = new JsonReader.ReadObject<Number>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.28
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NumberConverter.deserializeNumber(jsonReader);
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NumberInfo {
        final char[] buffer;
        final int length;

        public NumberInfo(char[] cArr, int i) {
            this.buffer = cArr;
            this.length = i;
        }
    }

    static {
        int i = 0;
        while (true) {
            int[] iArr = DIGITS;
            if (i >= iArr.length) {
                MIN_INT = "-2147483648".getBytes();
                MIN_LONG = "-9223372036854775808".getBytes();
                BD_MAX_LONG = BigDecimal.valueOf(Long.MAX_VALUE);
                BD_MIN_LONG = BigDecimal.valueOf(Long.MIN_VALUE);
                return;
            }
            iArr[i] = (i % 10) + (i < 10 ? 33554432 : i < 100 ? 16777216 : 0) + (((i / 100) + 48) << 16) + ((((i / 10) % 10) + 48) << 8) + 48;
            i++;
        }
    }

    private static double approximateDouble(int i, double d, int i2) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i3 = ((int) (doubleToRawLongBits >> 52)) - 1022;
        return Double.longBitsToDouble(doubleToRawLongBits + (((i * SCALE_10[i2 + 1]) + ERROR[i3]) / DIFF[i3]));
    }

    private static Number bigDecimalOrDouble(BigDecimal bigDecimal, JsonReader.UnknownNumberParsing unknownNumberParsing) {
        return unknownNumberParsing == JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL ? bigDecimal : Double.valueOf(bigDecimal.doubleValue());
    }

    public static BigDecimal deserializeDecimal(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 34) {
            return parseNumberGeneric(jsonReader.chars, jsonReader.parseString(), jsonReader, true);
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        if (currentIndex == jsonReader.length()) {
            NumberInfo readLongNumber = readLongNumber(jsonReader, scanNumber);
            return parseNumberGeneric(readLongNumber.buffer, readLongNumber.length, jsonReader, false);
        }
        int i = currentIndex - scanNumber;
        if (i > 18) {
            return parseNumberGeneric(jsonReader.prepareBuffer(scanNumber, i), i, jsonReader, false);
        }
        byte[] bArr = jsonReader.buffer;
        return bArr[scanNumber] == 45 ? parseNegativeDecimal(bArr, jsonReader, scanNumber, currentIndex) : parsePositiveDecimal(bArr, jsonReader, scanNumber, currentIndex);
    }

    public static ArrayList<BigDecimal> deserializeDecimalCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(DecimalReader);
    }

    public static ArrayList<BigDecimal> deserializeDecimalNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(DecimalReader);
    }

    public static double deserializeDouble(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 34) {
            return parseDoubleGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - jsonReader.getCurrentIndex()) - 1, jsonReader, true);
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        return bArr[scanNumber] == 45 ? -parseDouble(bArr, jsonReader, scanNumber, currentIndex, 1) : parseDouble(bArr, jsonReader, scanNumber, currentIndex, 0);
    }

    public static double[] deserializeDoubleArray(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 93) {
            return DOUBLE_EMPTY_ARRAY;
        }
        double[] dArr = new double[4];
        dArr[0] = deserializeDouble(jsonReader);
        int i = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i == dArr.length) {
                dArr = Arrays.copyOf(dArr, dArr.length << 1);
            }
            dArr[i] = deserializeDouble(jsonReader);
            i++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(dArr, i);
    }

    public static ArrayList<Double> deserializeDoubleCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(DOUBLE_READER);
    }

    public static ArrayList<Double> deserializeDoubleNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(DOUBLE_READER);
    }

    public static float deserializeFloat(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 34) {
            return parseFloatGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - jsonReader.getCurrentIndex()) - 1, jsonReader, true);
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        if (currentIndex == jsonReader.length()) {
            NumberInfo readLongNumber = readLongNumber(jsonReader, scanNumber);
            return parseFloatGeneric(readLongNumber.buffer, readLongNumber.length, jsonReader, false);
        }
        byte[] bArr = jsonReader.buffer;
        return bArr[scanNumber] == 45 ? -parseFloat(bArr, jsonReader, scanNumber, currentIndex, 1) : parseFloat(bArr, jsonReader, scanNumber, currentIndex, 0);
    }

    public static float[] deserializeFloatArray(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 93) {
            return FLOAT_EMPTY_ARRAY;
        }
        float[] fArr = new float[4];
        fArr[0] = deserializeFloat(jsonReader);
        int i = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i == fArr.length) {
                fArr = Arrays.copyOf(fArr, fArr.length << 1);
            }
            fArr[i] = deserializeFloat(jsonReader);
            i++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(fArr, i);
    }

    public static ArrayList<Float> deserializeFloatCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(FLOAT_READER);
    }

    public static ArrayList<Float> deserializeFloatNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(FLOAT_READER);
    }

    public static int deserializeInt(JsonReader jsonReader) throws IOException {
        int i;
        byte b;
        byte b2;
        if (jsonReader.last() == 34) {
            int currentIndex = jsonReader.getCurrentIndex();
            try {
                return parseNumberGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - currentIndex) - 1, jsonReader, true).intValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.newParseErrorAt("Integer overflow detected", jsonReader.getCurrentIndex() - currentIndex);
            }
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex2 = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        byte b3 = bArr[scanNumber];
        if (b3 != 45) {
            if (b3 == 48 && currentIndex2 > (i = scanNumber + 1) && (b = bArr[i]) >= 48 && b <= 57) {
                numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
            }
            return parsePositiveInt(bArr, jsonReader, scanNumber, currentIndex2, 0);
        }
        int i2 = scanNumber + 2;
        if (currentIndex2 > i2 && bArr[scanNumber + 1] == 48 && (b2 = bArr[i2]) >= 48 && b2 <= 57) {
            numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
        }
        return parseNegativeInt(bArr, jsonReader, scanNumber, currentIndex2);
    }

    public static int[] deserializeIntArray(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 93) {
            return INT_EMPTY_ARRAY;
        }
        int[] iArr = new int[4];
        iArr[0] = deserializeInt(jsonReader);
        int i = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i == iArr.length) {
                iArr = Arrays.copyOf(iArr, iArr.length << 1);
            }
            iArr[i] = deserializeInt(jsonReader);
            i++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(iArr, i);
    }

    public static ArrayList<Integer> deserializeIntCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(INT_READER);
    }

    public static ArrayList<Integer> deserializeIntNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(INT_READER);
    }

    public static long deserializeLong(JsonReader jsonReader) throws IOException {
        boolean z;
        char c = 1;
        if (jsonReader.last() == 34) {
            int currentIndex = jsonReader.getCurrentIndex();
            try {
                return parseNumberGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - currentIndex) - 1, jsonReader, true).longValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.newParseErrorAt("Long overflow detected", jsonReader.getCurrentIndex() - currentIndex);
            }
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex2 = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        byte b = bArr[scanNumber];
        char c2 = 3;
        int i = 9;
        if (b == 45) {
            int i2 = scanNumber + 1;
            if (i2 == currentIndex2) {
                numberException(jsonReader, scanNumber, currentIndex2, "Digit not found");
            }
            z = bArr[i2] == 48;
            int i3 = i2;
            long j = 0;
            while (i3 < currentIndex2) {
                int i4 = bArr[i3] - 48;
                if (i4 < 0 || i4 > 9) {
                    if (z && i3 > scanNumber + 2) {
                        numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
                    }
                    if (i3 <= i2 || !jsonReader.allWhitespace(i3, currentIndex2)) {
                        return parseLongGeneric(jsonReader, scanNumber, currentIndex2);
                    }
                    return j;
                }
                char c3 = c;
                byte[] bArr2 = bArr;
                j = ((j << 3) + (j << c)) - i4;
                if (j > 0) {
                    numberException(jsonReader, scanNumber, currentIndex2, "Long overflow detected");
                }
                i3++;
                c = c3;
                bArr = bArr2;
            }
            if (z && i3 > scanNumber + 2) {
                numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
            }
            return j;
        }
        if (scanNumber == currentIndex2) {
            numberException(jsonReader, scanNumber, currentIndex2, "Digit not found");
        }
        z = bArr[scanNumber] == 48;
        int i5 = scanNumber;
        long j2 = 0;
        while (i5 < currentIndex2) {
            int i6 = bArr[i5] - 48;
            if (i6 < 0 || i6 > i) {
                if (z && i5 > scanNumber + 1) {
                    numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
                }
                if ((b != 43 || i5 <= scanNumber + 1 || !jsonReader.allWhitespace(i5, currentIndex2)) && (b == 43 || i5 <= scanNumber || !jsonReader.allWhitespace(i5, currentIndex2))) {
                    return parseLongGeneric(jsonReader, scanNumber, currentIndex2);
                }
                return j2;
            }
            j2 = (j2 << c2) + (j2 << 1) + i6;
            if (j2 < 0) {
                numberException(jsonReader, scanNumber, currentIndex2, "Long overflow detected");
            }
            i5++;
            c2 = 3;
            i = 9;
        }
        if (z && i5 > scanNumber + 1) {
            numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
        }
        return j2;
    }

    public static long[] deserializeLongArray(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 93) {
            return LONG_EMPTY_ARRAY;
        }
        long[] jArr = new long[4];
        jArr[0] = deserializeLong(jsonReader);
        int i = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i == jArr.length) {
                jArr = Arrays.copyOf(jArr, jArr.length << 1);
            }
            jArr[i] = deserializeLong(jsonReader);
            i++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(jArr, i);
    }

    public static ArrayList<Long> deserializeLongCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(LONG_READER);
    }

    public static ArrayList<Long> deserializeLongNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(LONG_READER);
    }

    public static Number deserializeNumber(JsonReader jsonReader) throws IOException {
        JsonReader.UnknownNumberParsing unknownNumberParsing = jsonReader.unknownNumbers;
        if (unknownNumberParsing == JsonReader.UnknownNumberParsing.BIGDECIMAL) {
            return deserializeDecimal(jsonReader);
        }
        if (unknownNumberParsing == JsonReader.UnknownNumberParsing.DOUBLE) {
            return Double.valueOf(deserializeDouble(jsonReader));
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        if (currentIndex == jsonReader.length()) {
            NumberInfo readLongNumber = readLongNumber(jsonReader, scanNumber);
            return tryLongFromBigDecimal(readLongNumber.buffer, readLongNumber.length, jsonReader);
        }
        int i = currentIndex - scanNumber;
        if (i > 18) {
            return tryLongFromBigDecimal(jsonReader.prepareBuffer(scanNumber, i), i, jsonReader);
        }
        byte[] bArr = jsonReader.buffer;
        return bArr[scanNumber] == 45 ? parseNegativeNumber(bArr, jsonReader, scanNumber, currentIndex) : parsePositiveNumber(bArr, jsonReader, scanNumber, currentIndex);
    }

    public static short deserializeShort(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 34) {
            int currentIndex = jsonReader.getCurrentIndex();
            try {
                return parseNumberGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - currentIndex) - 1, jsonReader, true).shortValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.newParseErrorAt("Short overflow detected", jsonReader.getCurrentIndex() - currentIndex);
            }
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex2 = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        int parseNegativeInt = bArr[scanNumber] == 45 ? parseNegativeInt(bArr, jsonReader, scanNumber, currentIndex2) : parsePositiveInt(bArr, jsonReader, scanNumber, currentIndex2, 0);
        if (parseNegativeInt < -32768 || parseNegativeInt > 32767) {
            throw jsonReader.newParseErrorAt("Short overflow detected", jsonReader.getCurrentIndex());
        }
        return (short) parseNegativeInt;
    }

    public static short[] deserializeShortArray(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 93) {
            return SHORT_EMPTY_ARRAY;
        }
        short[] sArr = new short[4];
        sArr[0] = (short) deserializeInt(jsonReader);
        int i = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i == sArr.length) {
                sArr = Arrays.copyOf(sArr, sArr.length << 1);
            }
            sArr[i] = (short) deserializeInt(jsonReader);
            i++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(sArr, i);
    }

    public static void deserializeShortCollection(JsonReader jsonReader, Collection<Short> collection) throws IOException {
        jsonReader.deserializeCollection(SHORT_READER, collection);
    }

    public static ArrayList<Short> deserializeShortNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(SHORT_READER);
    }

    private static double doubleExponent(JsonReader jsonReader, long j, int i, double d, byte[] bArr, int i2, int i3, int i4, int i5) throws IOException {
        double d2;
        double pow;
        if (jsonReader.doublePrecision == JsonReader.DoublePrecision.EXACT) {
            int i6 = (i3 - i2) - i4;
            return parseDoubleGeneric(jsonReader.prepareBuffer(i2 + i4, i6), i6, jsonReader, false);
        }
        int i7 = i5 + 1;
        byte b = bArr[i7];
        int parseNegativeInt = (b == 45 ? parseNegativeInt(bArr, jsonReader, i7, i3) : b == 43 ? parsePositiveInt(bArr, jsonReader, i7, i3, 1) : parsePositiveInt(bArr, jsonReader, i7, i3, 0)) - i;
        if (d == 0.0d) {
            if (parseNegativeInt == 0 || j == 0) {
                return j;
            }
            if (parseNegativeInt > 0) {
                double[] dArr = POW_10;
                if (parseNegativeInt < dArr.length) {
                    return j * dArr[parseNegativeInt - 1];
                }
            }
            if (parseNegativeInt < 0) {
                int i8 = -parseNegativeInt;
                double[] dArr2 = POW_10;
                if (i8 < dArr2.length) {
                    return j / dArr2[i8 - 1];
                }
            }
            if (jsonReader.doublePrecision != JsonReader.DoublePrecision.HIGH) {
                if (parseNegativeInt > 0 && parseNegativeInt < 300) {
                    d2 = j;
                    pow = Math.pow(10.0d, parseNegativeInt);
                    return pow * d2;
                }
                if (parseNegativeInt > -300 && parseNegativeInt < 0) {
                    return j / Math.pow(10.0d, parseNegativeInt);
                }
            }
            int i9 = (i3 - i2) - i4;
            return parseDoubleGeneric(jsonReader.prepareBuffer(i2 + i4, i9), i9, jsonReader, false);
        }
        if (parseNegativeInt == 0) {
            return j + d;
        }
        if (parseNegativeInt > 0) {
            double[] dArr3 = POW_10;
            if (parseNegativeInt < dArr3.length) {
                double d3 = dArr3[parseNegativeInt - 1];
                return (j * d3) + (d * d3);
            }
        }
        if (parseNegativeInt < 0) {
            int i10 = -parseNegativeInt;
            double[] dArr4 = POW_10;
            if (i10 < dArr4.length) {
                double d4 = dArr4[i10 - 1];
                return (j / d4) + (d / d4);
            }
        }
        if (jsonReader.doublePrecision != JsonReader.DoublePrecision.HIGH) {
            if (parseNegativeInt > 0 && parseNegativeInt < 300) {
                d2 = j;
                pow = Math.pow(10.0d, parseNegativeInt);
                return pow * d2;
            }
            if (parseNegativeInt > -300 && parseNegativeInt < 0) {
                return j / Math.pow(10.0d, parseNegativeInt);
            }
        }
        int i92 = (i3 - i2) - i4;
        return parseDoubleGeneric(jsonReader.prepareBuffer(i2 + i4, i92), i92, jsonReader, false);
    }

    private static float floatExponent(JsonReader jsonReader, long j, int i, byte[] bArr, int i2, int i3) throws IOException {
        byte b = bArr[i3];
        int parseNegativeInt = (b == 45 ? parseNegativeInt(bArr, jsonReader, i3, i2) : b == 43 ? parsePositiveInt(bArr, jsonReader, i3, i2, 1) : parsePositiveInt(bArr, jsonReader, i3, i2, 0)) - i;
        if (parseNegativeInt == 0 || j == 0) {
            return j;
        }
        if (parseNegativeInt > 0) {
            double[] dArr = POW_10;
            if (parseNegativeInt < dArr.length) {
                return (float) (j * dArr[parseNegativeInt - 1]);
            }
        }
        if (parseNegativeInt < 0) {
            int i4 = -parseNegativeInt;
            double[] dArr2 = POW_10;
            if (i4 < dArr2.length) {
                return (float) (j / dArr2[i4 - 1]);
            }
        }
        return parseNegativeInt > 0 ? Float.POSITIVE_INFINITY : 0.0f;
    }

    public static void numberException(JsonReader jsonReader, int i, int i2, String str) throws ParsingException {
        int i3 = i2 - i;
        if (i3 <= jsonReader.maxNumberDigits) {
            throw jsonReader.newParseErrorWith("Error parsing number", i3, "", str, null, ". Error parsing number");
        }
        throw jsonReader.newParseErrorWith("Too many digits detected in number", i3, "", "Too many digits detected in number", Integer.valueOf(i2), "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01bb, code lost:
    
        if (r15 != 69) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01bf, code lost:
    
        if (r9 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c8, code lost:
    
        return r2 * com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.POW_10[r9 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c9, code lost:
    
        if (r9 >= 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d3, code lost:
    
        return r2 / com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.POW_10[(-r9) - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        numberException(r26, r27, r28, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double parseDouble(byte[] r25, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r26, int r27, int r28, int r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.parseDouble(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int, int):double");
    }

    private static double parseDoubleGeneric(char[] cArr, int i, JsonReader jsonReader, boolean z) throws IOException {
        int i2;
        char c;
        int i3 = i;
        while (i3 > 0 && Character.isWhitespace(cArr[i3 - 1])) {
            i3--;
        }
        if (i3 > jsonReader.maxNumberDigits) {
            throw jsonReader.newParseErrorWith("Too many digits detected in number", i, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        int i4 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i4] == '0' && i3 > (i2 = i4 + 1) && (c = cArr[i2]) >= '0' && c <= '9') {
            throw jsonReader.newParseErrorAt("Leading zero is not allowed. Error parsing number", i + (z ? 2 : 0));
        }
        try {
            return Double.parseDouble(new String(cArr, 0, i3));
        } catch (NumberFormatException e) {
            throw jsonReader.newParseErrorAt("Error parsing number", i + (z ? 2 : 0), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        numberException(r23, r24, r5, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float parseFloat(byte[] r22, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r23, int r24, int r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.parseFloat(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int, int):float");
    }

    private static float parseFloatGeneric(char[] cArr, int i, JsonReader jsonReader, boolean z) throws ParsingException {
        int i2;
        char c;
        int i3 = i;
        while (i3 > 0 && Character.isWhitespace(cArr[i3 - 1])) {
            i3--;
        }
        if (i3 > jsonReader.maxNumberDigits) {
            throw jsonReader.newParseErrorWith("Too many digits detected in number", i, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        int i4 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i4] == '0' && i3 > (i2 = i4 + 1) && (c = cArr[i2]) >= '0' && c <= '9') {
            throw jsonReader.newParseErrorAt("Leading zero is not allowed. Error parsing number", i + (z ? 2 : 0));
        }
        try {
            return Float.parseFloat(new String(cArr, 0, i3));
        } catch (NumberFormatException e) {
            throw jsonReader.newParseErrorAt("Error parsing number", i + (z ? 2 : 0), e);
        }
    }

    private static long parseLongGeneric(JsonReader jsonReader, int i, int i2) throws IOException {
        int i3 = i2 - i;
        char[] prepareBuffer = jsonReader.prepareBuffer(i, i3);
        if (i3 > 0 && prepareBuffer[i3 - 1] == '.') {
            numberException(jsonReader, i, i2, "Number ends with a dot");
        }
        BigDecimal parseNumberGeneric = parseNumberGeneric(prepareBuffer, i3, jsonReader, false);
        if (parseNumberGeneric.scale() > 0) {
            numberException(jsonReader, i, i2, "Expecting long, but found decimal value ", parseNumberGeneric);
        }
        return parseNumberGeneric.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        numberException(r22, r23, r24, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.math.BigDecimal parseNegativeDecimal(byte[] r21, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.parseNegativeDecimal(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.math.BigDecimal");
    }

    private static int parseNegativeInt(byte[] bArr, JsonReader jsonReader, int i, int i2) throws IOException {
        int i3 = i + 1;
        if (i3 == i2) {
            numberException(jsonReader, i, i2, "Digit not found");
        }
        int i4 = 0;
        for (int i5 = i3; i5 < i2; i5++) {
            int i6 = bArr[i5] - 48;
            if (i6 < 0 || i6 > 9) {
                if (i5 <= i3 || !jsonReader.allWhitespace(i5, i2)) {
                    if (i5 == i2 - 1 && bArr[i5] == 46) {
                        numberException(jsonReader, i, i2, "Number ends with a dot");
                    }
                    int i7 = i2 - i;
                    BigDecimal parseNumberGeneric = parseNumberGeneric(jsonReader.prepareBuffer(i, i7), i7, jsonReader, false);
                    if (parseNumberGeneric.scale() > 0) {
                        numberException(jsonReader, i, i2, "Expecting int but found decimal value", parseNumberGeneric);
                    }
                    return parseNumberGeneric.intValue();
                }
                return i4;
            }
            i4 = ((i4 << 3) + (i4 << 1)) - i6;
            if (i4 > 0) {
                numberException(jsonReader, i, i2, "Integer overflow detected");
            }
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        numberException(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Number parseNegativeNumber(byte[] r19, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.parseNegativeNumber(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.lang.Number");
    }

    private static BigDecimal parseNumberGeneric(char[] cArr, int i, JsonReader jsonReader, boolean z) throws ParsingException {
        int i2;
        char c;
        int i3 = i;
        while (i3 > 0 && Character.isWhitespace(cArr[i3 - 1])) {
            i3--;
        }
        if (i3 > jsonReader.maxNumberDigits) {
            throw jsonReader.newParseErrorWith("Too many digits detected in number", i, "", "Too many digits detected in number", Integer.valueOf(i3), "");
        }
        int i4 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i4] == '0' && i3 > (i2 = i4 + 1) && (c = cArr[i2]) >= '0' && c <= '9') {
            throw jsonReader.newParseErrorAt("Leading zero is not allowed. Error parsing number", i + (z ? 2 : 0));
        }
        try {
            return new BigDecimal(cArr, 0, i3);
        } catch (NumberFormatException e) {
            throw jsonReader.newParseErrorAt("Error parsing number", i + (z ? 2 : 0), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        numberException(r22, r23, r24, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.math.BigDecimal parsePositiveDecimal(byte[] r21, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.parsePositiveDecimal(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.math.BigDecimal");
    }

    private static int parsePositiveInt(byte[] bArr, JsonReader jsonReader, int i, int i2, int i3) throws IOException {
        int i4 = i3 + i;
        if (i4 == i2) {
            numberException(jsonReader, i, i2, "Digit not found");
        }
        int i5 = 0;
        for (int i6 = i4; i6 < i2; i6++) {
            int i7 = bArr[i6] - 48;
            if (i7 < 0 || i7 > 9) {
                if (i6 <= i4 || !jsonReader.allWhitespace(i6, i2)) {
                    if (i6 == i2 - 1 && bArr[i6] == 46) {
                        numberException(jsonReader, i, i2, "Number ends with a dot");
                    }
                    int i8 = i2 - i;
                    BigDecimal parseNumberGeneric = parseNumberGeneric(jsonReader.prepareBuffer(i, i8), i8, jsonReader, false);
                    if (parseNumberGeneric.scale() > 0) {
                        numberException(jsonReader, i, i2, "Expecting int but found decimal value", parseNumberGeneric);
                    }
                    return parseNumberGeneric.intValue();
                }
                return i5;
            }
            i5 = (i5 << 3) + (i5 << 1) + i7;
            if (i5 < 0) {
                numberException(jsonReader, i, i2, "Integer overflow detected");
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        numberException(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Number parsePositiveNumber(byte[] r19, com.bugsnag.android.repackaged.dslplatform.json.JsonReader r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.parsePositiveNumber(byte[], com.bugsnag.android.repackaged.dslplatform.json.JsonReader, int, int):java.lang.Number");
    }

    public static int read2(char[] cArr, int i) {
        int i2 = cArr[i] - '0';
        return (((i2 << 3) + (i2 << 1)) + cArr[i + 1]) - 48;
    }

    public static int read4(char[] cArr, int i) {
        int i2 = cArr[i + 1] - '0';
        int i3 = cArr[i + 2] - '0';
        return ((((((((cArr[i] - '0') * 1000) + (i2 << 6)) + (i2 << 5)) + (i2 << 2)) + (i3 << 3)) + (i3 << 1)) + cArr[i + 3]) - 48;
    }

    private static NumberInfo readLongNumber(JsonReader jsonReader, int i) throws IOException {
        int length = jsonReader.length() - i;
        char[] prepareBuffer = jsonReader.prepareBuffer(i, length);
        while (jsonReader.length() == jsonReader.getCurrentIndex() && !jsonReader.isEndOfStream()) {
            jsonReader.scanNumber();
            int currentIndex = jsonReader.getCurrentIndex();
            int i2 = length + currentIndex;
            int i3 = jsonReader.maxNumberDigits;
            if (i2 > i3) {
                throw jsonReader.newParseErrorFormat("Too many digits detected in number", i2, "Number of digits larger than %d. Unable to read number", Integer.valueOf(i3));
            }
            char[] cArr = new char[i2];
            System.arraycopy(prepareBuffer, 0, cArr, 0, length);
            System.arraycopy(jsonReader.prepareBuffer(0, currentIndex), 0, cArr, length, currentIndex);
            length = i2;
            prepareBuffer = cArr;
        }
        return new NumberInfo(prepareBuffer, length);
    }

    private static int serialize(byte[] bArr, int i, long j) {
        int i2;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                int i3 = 0;
                while (true) {
                    byte[] bArr2 = MIN_LONG;
                    if (i3 >= bArr2.length) {
                        return i + bArr2.length;
                    }
                    bArr[i + i3] = bArr2[i3];
                    i3++;
                }
            } else {
                j = -j;
                bArr[i] = 45;
                i++;
            }
        }
        long j2 = j / 1000;
        if (j2 == 0) {
            return i + writeFirstBuf(bArr, DIGITS[(int) j], i);
        }
        int i4 = (int) (j - (j2 * 1000));
        long j3 = j2 / 1000;
        if (j3 == 0) {
            int[] iArr = DIGITS;
            int i5 = iArr[i4];
            int writeFirstBuf = writeFirstBuf(bArr, iArr[(int) j2], i);
            writeBuf(bArr, i5, i + writeFirstBuf);
            return i + 3 + writeFirstBuf;
        }
        int i6 = (int) (j2 - (j3 * 1000));
        long j4 = j3 / 1000;
        if (j4 == 0) {
            int[] iArr2 = DIGITS;
            int i7 = iArr2[i4];
            int i8 = iArr2[i6];
            int writeFirstBuf2 = i + writeFirstBuf(bArr, iArr2[(int) j3], i);
            writeBuf(bArr, i8, writeFirstBuf2);
            writeBuf(bArr, i7, writeFirstBuf2 + 3);
            return writeFirstBuf2 + 6;
        }
        int i9 = (int) (j3 - (j4 * 1000));
        int i10 = (int) (j4 / 1000);
        if (i10 == 0) {
            int[] iArr3 = DIGITS;
            int i11 = iArr3[i4];
            int i12 = iArr3[i6];
            int i13 = iArr3[i9];
            int writeFirstBuf3 = i + writeFirstBuf(bArr, iArr3[(int) j4], i);
            writeBuf(bArr, i13, writeFirstBuf3);
            writeBuf(bArr, i12, writeFirstBuf3 + 3);
            writeBuf(bArr, i11, writeFirstBuf3 + 6);
            return writeFirstBuf3 + 9;
        }
        int i14 = (int) (j4 - (i10 * 1000));
        int i15 = i10 / 1000;
        if (i15 == 0) {
            int[] iArr4 = DIGITS;
            int i16 = iArr4[i4];
            int i17 = iArr4[i6];
            int i18 = iArr4[i9];
            int i19 = iArr4[i14];
            int writeFirstBuf4 = i + writeFirstBuf(bArr, iArr4[i10], i);
            writeBuf(bArr, i19, writeFirstBuf4);
            writeBuf(bArr, i18, writeFirstBuf4 + 3);
            writeBuf(bArr, i17, writeFirstBuf4 + 6);
            writeBuf(bArr, i16, writeFirstBuf4 + 9);
            return writeFirstBuf4 + 12;
        }
        int i20 = i15 / 1000;
        int[] iArr5 = DIGITS;
        int i21 = iArr5[i4];
        int i22 = iArr5[i6];
        int i23 = iArr5[i9];
        int i24 = iArr5[i14];
        int i25 = iArr5[i10 - (i15 * 1000)];
        if (i20 == 0) {
            i2 = i + writeFirstBuf(bArr, iArr5[i15], i);
        } else {
            bArr[i] = (byte) (i20 + 48);
            writeBuf(bArr, iArr5[i15 - (i20 * 1000)], i + 1);
            i2 = i + 4;
        }
        writeBuf(bArr, i25, i2);
        writeBuf(bArr, i24, i2 + 3);
        writeBuf(bArr, i23, i2 + 6);
        writeBuf(bArr, i22, i2 + 9);
        writeBuf(bArr, i21, i2 + 12);
        return i2 + 15;
    }

    public static void serializeNullable(@Nullable Double d, JsonWriter jsonWriter) {
        if (d == null) {
            jsonWriter.writeNull();
        } else {
            serialize(d.doubleValue(), jsonWriter);
        }
    }

    private static Number tryLongFromBigDecimal(char[] cArr, int i, JsonReader jsonReader) throws IOException {
        BigDecimal parseNumberGeneric = parseNumberGeneric(cArr, i, jsonReader, false);
        if (parseNumberGeneric.scale() == 0 && parseNumberGeneric.precision() <= 19) {
            if (parseNumberGeneric.signum() == 1) {
                if (parseNumberGeneric.compareTo(BD_MAX_LONG) <= 0) {
                    return Long.valueOf(parseNumberGeneric.longValue());
                }
            } else if (parseNumberGeneric.compareTo(BD_MIN_LONG) >= 0) {
                return Long.valueOf(parseNumberGeneric.longValue());
            }
        }
        return bigDecimalOrDouble(parseNumberGeneric, jsonReader.unknownNumbers);
    }

    public static void write2(int i, byte[] bArr, int i2) {
        int i3 = DIGITS[i];
        bArr[i2] = (byte) (i3 >> 8);
        bArr[i2 + 1] = (byte) i3;
    }

    public static void write3(int i, byte[] bArr, int i2) {
        int i3 = DIGITS[i];
        bArr[i2] = (byte) (i3 >> 16);
        bArr[i2 + 1] = (byte) (i3 >> 8);
        bArr[i2 + 2] = (byte) i3;
    }

    public static void write4(int i, byte[] bArr, int i2) {
        if (i > 9999) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Only 4 digits numbers are supported. Provided: "));
            return;
        }
        int i3 = i / 1000;
        int i4 = DIGITS[i - (i3 * 1000)];
        bArr[i2] = (byte) (i3 + 48);
        bArr[i2 + 1] = (byte) (i4 >> 16);
        bArr[i2 + 2] = (byte) (i4 >> 8);
        bArr[i2 + 3] = (byte) i4;
    }

    private static void writeBuf(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) i;
    }

    private static int writeFirstBuf(byte[] bArr, int i, int i2) {
        int i3 = i >> 24;
        if (i3 == 0) {
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            i2 += 2;
            bArr[i4] = (byte) (i >> 8);
        } else if (i3 == 1) {
            bArr[i2] = (byte) (i >> 8);
            i2++;
        }
        bArr[i2] = (byte) i;
        return 3 - i3;
    }

    public static void deserializeDecimalCollection(JsonReader jsonReader, Collection<BigDecimal> collection) throws IOException {
        jsonReader.deserializeCollection(DecimalReader, collection);
    }

    public static void deserializeDecimalNullableCollection(JsonReader jsonReader, Collection<BigDecimal> collection) throws IOException {
        jsonReader.deserializeNullableCollection(DecimalReader, collection);
    }

    public static void deserializeDoubleCollection(JsonReader jsonReader, Collection<Double> collection) throws IOException {
        jsonReader.deserializeCollection(DOUBLE_READER, collection);
    }

    public static void deserializeDoubleNullableCollection(JsonReader jsonReader, Collection<Double> collection) throws IOException {
        jsonReader.deserializeNullableCollection(DOUBLE_READER, collection);
    }

    public static void deserializeFloatCollection(JsonReader jsonReader, Collection<Float> collection) throws IOException {
        jsonReader.deserializeCollection(FLOAT_READER, collection);
    }

    public static void deserializeFloatNullableCollection(JsonReader jsonReader, Collection<Float> collection) throws IOException {
        jsonReader.deserializeNullableCollection(FLOAT_READER, collection);
    }

    public static void deserializeIntCollection(JsonReader jsonReader, Collection<Integer> collection) throws IOException {
        jsonReader.deserializeCollection(INT_READER, collection);
    }

    public static void deserializeIntNullableCollection(JsonReader jsonReader, Collection<Integer> collection) throws IOException {
        jsonReader.deserializeNullableCollection(INT_READER, collection);
    }

    public static void deserializeLongCollection(JsonReader jsonReader, Collection<Long> collection) throws IOException {
        jsonReader.deserializeCollection(LONG_READER, collection);
    }

    public static void deserializeLongNullableCollection(JsonReader jsonReader, Collection<Long> collection) throws IOException {
        jsonReader.deserializeNullableCollection(LONG_READER, collection);
    }

    public static void deserializeShortNullableCollection(JsonReader jsonReader, Collection<Short> collection) throws IOException {
        jsonReader.deserializeNullableCollection(SHORT_READER, collection);
    }

    public static void serializeNullable(@Nullable Float f, JsonWriter jsonWriter) {
        if (f == null) {
            jsonWriter.writeNull();
        } else {
            serialize(f.floatValue(), jsonWriter);
        }
    }

    public static void serializeNullable(@Nullable Integer num, JsonWriter jsonWriter) {
        if (num == null) {
            jsonWriter.writeNull();
        } else {
            serialize(num.intValue(), jsonWriter);
        }
    }

    public static void serializeNullable(@Nullable Long l, JsonWriter jsonWriter) {
        if (l == null) {
            jsonWriter.writeNull();
        } else {
            serialize(l.longValue(), jsonWriter);
        }
    }

    public static void serializeNullable(@Nullable BigDecimal bigDecimal, JsonWriter jsonWriter) {
        if (bigDecimal == null) {
            jsonWriter.writeNull();
        } else {
            jsonWriter.writeAscii(bigDecimal.toString());
        }
    }

    public static void numberException(JsonReader jsonReader, int i, int i2, String str, Object obj) throws ParsingException {
        int i3 = i2 - i;
        if (i3 > jsonReader.maxNumberDigits) {
            throw jsonReader.newParseErrorWith("Too many digits detected in number", i3, "", "Too many digits detected in number", Integer.valueOf(i2), "");
        }
        throw jsonReader.newParseErrorWith("Error parsing number", i3, "", str, obj, ". Error parsing number");
    }

    public static void serialize(@Nullable double[] dArr, JsonWriter jsonWriter) {
        if (dArr == null) {
            jsonWriter.writeNull();
            return;
        }
        if (dArr.length == 0) {
            jsonWriter.writeAscii(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        serialize(dArr[0], jsonWriter);
        for (int i = 1; i < dArr.length; i++) {
            jsonWriter.writeByte(JsonWriter.COMMA);
            serialize(dArr[i], jsonWriter);
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public static void serialize(float f, JsonWriter jsonWriter) {
        if (f == Float.POSITIVE_INFINITY) {
            jsonWriter.writeAscii("\"Infinity\"");
            return;
        }
        if (f == Float.NEGATIVE_INFINITY) {
            jsonWriter.writeAscii("\"-Infinity\"");
        } else if (f != f) {
            jsonWriter.writeAscii("\"NaN\"");
        } else {
            jsonWriter.writeAscii(Float.toString(f));
        }
    }

    public static void serialize(@Nullable float[] fArr, JsonWriter jsonWriter) {
        if (fArr == null) {
            jsonWriter.writeNull();
            return;
        }
        if (fArr.length == 0) {
            jsonWriter.writeAscii(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        serialize(fArr[0], jsonWriter);
        for (int i = 1; i < fArr.length; i++) {
            jsonWriter.writeByte(JsonWriter.COMMA);
            serialize(fArr[i], jsonWriter);
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public static void serialize(int i, JsonWriter jsonWriter) {
        byte[] ensureCapacity = jsonWriter.ensureCapacity(11);
        int size = jsonWriter.size();
        jsonWriter.advance(serialize(ensureCapacity, size, i) - size);
    }

    private static int serialize(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                int i4 = 0;
                while (true) {
                    byte[] bArr2 = MIN_INT;
                    if (i4 < bArr2.length) {
                        bArr[i + i4] = bArr2[i4];
                        i4++;
                    } else {
                        return i + bArr2.length;
                    }
                }
            } else {
                i2 = -i2;
                bArr[i] = 45;
                i++;
            }
        }
        int i5 = i2 / 1000;
        if (i5 == 0) {
            return i + writeFirstBuf(bArr, DIGITS[i2], i);
        }
        int i6 = i2 - (i5 * 1000);
        int i7 = i5 / 1000;
        if (i7 == 0) {
            int[] iArr = DIGITS;
            int i8 = iArr[i6];
            int writeFirstBuf = writeFirstBuf(bArr, iArr[i5], i);
            writeBuf(bArr, i8, i + writeFirstBuf);
            return i + 3 + writeFirstBuf;
        }
        int i9 = i7 / 1000;
        int[] iArr2 = DIGITS;
        int i10 = iArr2[i6];
        int i11 = iArr2[i5 - (i7 * 1000)];
        if (i9 == 0) {
            i3 = i + writeFirstBuf(bArr, iArr2[i7], i);
        } else {
            bArr[i] = (byte) (i9 + 48);
            writeBuf(bArr, iArr2[i7 - (i9 * 1000)], i + 1);
            i3 = i + 4;
        }
        writeBuf(bArr, i11, i3);
        writeBuf(bArr, i10, i3 + 3);
        return i3 + 6;
    }

    public static void serialize(@Nullable int[] iArr, JsonWriter jsonWriter) {
        if (iArr == null) {
            jsonWriter.writeNull();
            return;
        }
        if (iArr.length == 0) {
            jsonWriter.writeAscii(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        byte[] ensureCapacity = jsonWriter.ensureCapacity((iArr.length * 11) + 2);
        int size = jsonWriter.size();
        ensureCapacity[size] = JsonWriter.ARRAY_START;
        int serialize = serialize(ensureCapacity, size + 1, iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            ensureCapacity[serialize] = JsonWriter.COMMA;
            serialize = serialize(ensureCapacity, serialize + 1, iArr[i]);
        }
        ensureCapacity[serialize] = JsonWriter.ARRAY_END;
        jsonWriter.advance((serialize + 1) - jsonWriter.size());
    }

    public static void serialize(@Nullable short[] sArr, JsonWriter jsonWriter) {
        if (sArr == null) {
            jsonWriter.writeNull();
            return;
        }
        if (sArr.length == 0) {
            jsonWriter.writeAscii(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        serialize((int) sArr[0], jsonWriter);
        for (int i = 1; i < sArr.length; i++) {
            jsonWriter.writeByte(JsonWriter.COMMA);
            serialize((int) sArr[i], jsonWriter);
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public static void serialize(long j, JsonWriter jsonWriter) {
        byte[] ensureCapacity = jsonWriter.ensureCapacity(21);
        int size = jsonWriter.size();
        jsonWriter.advance(serialize(ensureCapacity, size, j) - size);
    }

    public static void serialize(double d, JsonWriter jsonWriter) {
        jsonWriter.writeDouble(d);
    }

    public static void serialize(@Nullable long[] jArr, JsonWriter jsonWriter) {
        if (jArr == null) {
            jsonWriter.writeNull();
            return;
        }
        if (jArr.length == 0) {
            jsonWriter.writeAscii(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        byte[] ensureCapacity = jsonWriter.ensureCapacity((jArr.length * 21) + 2);
        int size = jsonWriter.size();
        ensureCapacity[size] = JsonWriter.ARRAY_START;
        int serialize = serialize(ensureCapacity, size + 1, jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            ensureCapacity[serialize] = JsonWriter.COMMA;
            serialize = serialize(ensureCapacity, serialize + 1, jArr[i]);
        }
        ensureCapacity[serialize] = JsonWriter.ARRAY_END;
        jsonWriter.advance((serialize + 1) - jsonWriter.size());
    }

    public static void serialize(BigDecimal bigDecimal, JsonWriter jsonWriter) {
        jsonWriter.writeAscii(bigDecimal.toString());
    }
}
