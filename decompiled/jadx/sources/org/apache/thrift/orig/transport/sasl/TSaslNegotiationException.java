package org.apache.thrift.orig.transport.sasl;

import org.apache.thrift.orig.transport.TTransportException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TSaslNegotiationException extends TTransportException {
    private final ErrorType error;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INTERNAL_ERROR' uses external variables
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
    public static final class ErrorType {
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType AUTHENTICATION_FAILURE;
        public static final ErrorType INTERNAL_ERROR;
        public static final ErrorType MECHANISME_MISMATCH;
        public static final ErrorType PROTOCOL_ERROR;
        public final NegotiationStatus code;

        private static /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{INTERNAL_ERROR, PROTOCOL_ERROR, MECHANISME_MISMATCH, AUTHENTICATION_FAILURE};
        }

        static {
            NegotiationStatus negotiationStatus = NegotiationStatus.ERROR;
            INTERNAL_ERROR = new ErrorType("INTERNAL_ERROR", 0, negotiationStatus);
            PROTOCOL_ERROR = new ErrorType("PROTOCOL_ERROR", 1, negotiationStatus);
            NegotiationStatus negotiationStatus2 = NegotiationStatus.BAD;
            MECHANISME_MISMATCH = new ErrorType("MECHANISME_MISMATCH", 2, negotiationStatus2);
            AUTHENTICATION_FAILURE = new ErrorType("AUTHENTICATION_FAILURE", 3, negotiationStatus2);
            $VALUES = $values();
        }

        private ErrorType(String str, int i, NegotiationStatus negotiationStatus) {
            this.code = negotiationStatus;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public TSaslNegotiationException(ErrorType errorType, String str) {
        super(str);
        this.error = errorType;
    }

    public String getDetails() {
        if (getCause() == null) {
            return getSummary();
        }
        return getSummary() + "\nReason: " + getCause().getMessage();
    }

    public ErrorType getErrorType() {
        return this.error;
    }

    public String getSummary() {
        return this.error.name() + ": " + getMessage();
    }

    public TSaslNegotiationException(ErrorType errorType, String str, Throwable th) {
        super(str, th);
        this.error = errorType;
    }
}
