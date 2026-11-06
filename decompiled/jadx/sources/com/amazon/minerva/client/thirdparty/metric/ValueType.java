package com.amazon.minerva.client.thirdparty.metric;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class ValueType {
    public static final ValueType STRING;
    public static final ValueType SYMBOL;
    private final Class<?> clazz;
    public static final ValueType BOOLEAN = new ValueType("BOOLEAN", 0, Boolean.class) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.1
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> int getSizeInBytes(T t) {
            return 1;
        }

        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> boolean isEmpty(T t) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> String toString(T t) {
            return Boolean.toString(((Boolean) t).booleanValue());
        }
    };
    public static final ValueType INTEGER = new ValueType("INTEGER", 1, Long.class) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.2
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> int getSizeInBytes(T t) {
            return 8;
        }

        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> boolean isEmpty(T t) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> String toString(T t) {
            return Long.toString(((Long) t).longValue());
        }
    };
    public static final ValueType FLOAT = new ValueType("FLOAT", 2, Double.class) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.3
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> int getSizeInBytes(T t) {
            return 8;
        }

        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> boolean isEmpty(T t) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> String toString(T t) {
            return Double.toString(((Double) t).doubleValue());
        }
    };
    public static final ValueType TIMESTAMP = new ValueType(CognitoServiceConstants.CHLG_RESP_TIMESTAMP, 3, Timestamp.class) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.4
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> int getSizeInBytes(T t) {
            return 8;
        }

        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> boolean isEmpty(T t) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> String toString(T t) {
            Timestamp timestamp = (Timestamp) t;
            return timestamp.getEpochMillis() + "_" + timestamp.getTimeZoneOffset();
        }
    };
    public static final ValueType AGGREGATED_INTEGER = new ValueType("AGGREGATED_INTEGER", 6, AggregatedLong.class) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.7
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> int getSizeInBytes(T t) {
            Objects.requireNonNull(t, "value can not be null.");
            return ((AggregatedLong) t).getSizeInBytes();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> boolean isEmpty(T t) {
            Objects.requireNonNull(t, "value can not be null.");
            return ((AggregatedLong) t).isEmpty();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> String toString(T t) {
            Objects.requireNonNull(t, "value can not be null.");
            return ((AggregatedLong) t).toString();
        }
    };
    public static final ValueType AGGREGATED_FLOAT = new ValueType("AGGREGATED_FLOAT", 7, AggregatedDouble.class) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.8
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> int getSizeInBytes(T t) {
            Objects.requireNonNull(t, "value can not be null.");
            return ((AggregatedDouble) t).getSizeInBytes();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> boolean isEmpty(T t) {
            Objects.requireNonNull(t, "value can not be null.");
            return ((AggregatedDouble) t).isEmpty();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
        public <T> String toString(T t) {
            Objects.requireNonNull(t, "value can not be null.");
            return ((AggregatedDouble) t).toString();
        }
    };
    private static final /* synthetic */ ValueType[] $VALUES = $values();

    private static /* synthetic */ ValueType[] $values() {
        return new ValueType[]{BOOLEAN, INTEGER, FLOAT, TIMESTAMP, STRING, SYMBOL, AGGREGATED_INTEGER, AGGREGATED_FLOAT};
    }

    static {
        Class<String> cls = String.class;
        STRING = new ValueType("STRING", 4, cls) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
            public <T> int getSizeInBytes(T t) {
                Objects.requireNonNull(t, "value can not be null.");
                return ((String) t).length();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
            public <T> boolean isEmpty(T t) {
                Objects.requireNonNull(t, "value can not be null.");
                return ((String) t).isEmpty();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
            public <T> String toString(T t) {
                return (String) t;
            }
        };
        SYMBOL = new ValueType("SYMBOL", 5, cls) { // from class: com.amazon.minerva.client.thirdparty.metric.ValueType.6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
            public <T> int getSizeInBytes(T t) {
                Objects.requireNonNull(t, "value can not be null.");
                return ((String) t).length();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
            public <T> boolean isEmpty(T t) {
                Objects.requireNonNull(t, "value can not be null.");
                return ((String) t).isEmpty();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amazon.minerva.client.thirdparty.metric.ValueType
            public <T> String toString(T t) {
                return (String) t;
            }
        };
    }

    private ValueType(String str, int i, Class cls) {
        this.clazz = cls;
    }

    public static ValueType fromInt(int i) {
        if (i >= 0 && i <= values().length) {
            return values()[i];
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "invalid index: "));
        return null;
    }

    public static ValueType valueOf(String str) {
        return (ValueType) Enum.valueOf(ValueType.class, str);
    }

    public static ValueType[] values() {
        return (ValueType[]) $VALUES.clone();
    }

    public Class<?> getCompatibleClass() {
        return this.clazz;
    }

    public abstract <T> int getSizeInBytes(T t);

    public abstract <T> boolean isEmpty(T t);

    public <T> TypedValue<T> of(T t) {
        return new TypedValue<>(this, t);
    }

    public abstract <T> String toString(T t);
}
