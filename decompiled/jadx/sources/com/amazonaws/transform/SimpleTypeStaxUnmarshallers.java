package com.amazonaws.transform;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SimpleTypeStaxUnmarshallers {
    private static Log log = LogFactory.getLog((Class<?>) SimpleTypeStaxUnmarshallers.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BigDecimalStaxUnmarshaller implements Unmarshaller<BigDecimal, StaxUnmarshallerContext> {
        private static BigDecimalStaxUnmarshaller instance;

        public static BigDecimalStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new BigDecimalStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public BigDecimal unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return new BigDecimal(readText);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BigIntegerStaxUnmarshaller implements Unmarshaller<BigInteger, StaxUnmarshallerContext> {
        private static BigIntegerStaxUnmarshaller instance;

        public static BigIntegerStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new BigIntegerStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public BigInteger unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return new BigInteger(readText);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BooleanStaxUnmarshaller implements Unmarshaller<Boolean, StaxUnmarshallerContext> {
        private static BooleanStaxUnmarshaller instance;

        public static BooleanStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new BooleanStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public Boolean unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return Boolean.valueOf(Boolean.parseBoolean(readText));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ByteBufferStaxUnmarshaller implements Unmarshaller<ByteBuffer, StaxUnmarshallerContext> {
        private static ByteBufferStaxUnmarshaller instance;

        public static ByteBufferStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new ByteBufferStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public ByteBuffer unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            return ByteBuffer.wrap(Base64.decode(staxUnmarshallerContext.readText()));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ByteStaxUnmarshaller implements Unmarshaller<Byte, StaxUnmarshallerContext> {
        private static ByteStaxUnmarshaller instance;

        public static ByteStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new ByteStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public Byte unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return Byte.valueOf(readText);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DateStaxUnmarshaller implements Unmarshaller<Date, StaxUnmarshallerContext> {
        private static DateStaxUnmarshaller instance;

        public static DateStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new DateStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public Date unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            try {
                return DateUtils.parseISO8601Date(readText);
            } catch (Exception e) {
                Log log = SimpleTypeStaxUnmarshallers.log;
                StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Unable to parse date '", readText, "':  ");
                m2m.append(e.getMessage());
                log.warn(m2m.toString(), e);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DoubleStaxUnmarshaller implements Unmarshaller<Double, StaxUnmarshallerContext> {
        private static DoubleStaxUnmarshaller instance;

        public static DoubleStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new DoubleStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public Double unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(readText));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FloatStaxUnmarshaller implements Unmarshaller<Float, StaxUnmarshallerContext> {
        private static FloatStaxUnmarshaller instance;

        public static FloatStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new FloatStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public Float unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return Float.valueOf(readText);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class IntegerStaxUnmarshaller implements Unmarshaller<Integer, StaxUnmarshallerContext> {
        private static IntegerStaxUnmarshaller instance;

        public static IntegerStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new IntegerStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public Integer unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(readText));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LongStaxUnmarshaller implements Unmarshaller<Long, StaxUnmarshallerContext> {
        private static LongStaxUnmarshaller instance;

        public static LongStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new LongStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public Long unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            String readText = staxUnmarshallerContext.readText();
            if (readText == null) {
                return null;
            }
            return Long.valueOf(Long.parseLong(readText));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class StringStaxUnmarshaller implements Unmarshaller<String, StaxUnmarshallerContext> {
        private static StringStaxUnmarshaller instance;

        public static StringStaxUnmarshaller getInstance() {
            if (instance == null) {
                instance = new StringStaxUnmarshaller();
            }
            return instance;
        }

        @Override // com.amazonaws.transform.Unmarshaller
        public String unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
            return staxUnmarshallerContext.readText();
        }
    }
}
