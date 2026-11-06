package com.dee.app.logging;

import com.amazon.alexa.app.notification.actions.NotificationActionConstants;
import com.amazon.alexa.smarthomecameras.constants.ErrorConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NETWORK_GENERAL' uses external variables
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
/* loaded from: classes6.dex */
public final class ErrorCode {
    private static final /* synthetic */ ErrorCode[] $VALUES;
    public static final ErrorCode AIRPLANE_MODE;
    public static final ErrorCode BAD_URL;
    public static final ErrorCode COMPONENT_ERROR;
    public static final ErrorCode CONNECT_EXCEPTION;
    public static final ErrorCode EXPECTED_NATIVE_GOT_WEB;
    public static final ErrorCode JSON_EXCEPTION;
    public static final ErrorCode NETWORK_GENERAL;
    public static final ErrorCode NO_NETWORK;
    public static final ErrorCode RESPONSE_4XX_LEVEL;
    public static final ErrorCode RESPONSE_5XX_LEVEL;
    public static final ErrorCode SSL_ERROR;
    public static final ErrorCode UNKNOWN_HOST;
    private final String defaultMessage;
    private final int flags;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorType {
        NONE(0),
        NOT_REPORTED(1),
        RETRYABLE(2),
        SERVER(4),
        NETWORK(8),
        FATAL(16),
        DEBUG(32),
        ASSERT(64),
        ERROR(128);

        private final int flag;

        ErrorType(int i) {
            this.flag = i;
        }

        public boolean isIn(int i) {
            int i2 = this.flag;
            return (i & i2) == i2;
        }

        public boolean isNotIn(int i) {
            return !isIn(i);
        }
    }

    private static /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{NETWORK_GENERAL, NO_NETWORK, AIRPLANE_MODE, UNKNOWN_HOST, SSL_ERROR, CONNECT_EXCEPTION, JSON_EXCEPTION, RESPONSE_5XX_LEVEL, RESPONSE_4XX_LEVEL, BAD_URL, COMPONENT_ERROR, EXPECTED_NATIVE_GOT_WEB};
    }

    static {
        ErrorType errorType = ErrorType.NETWORK;
        ErrorType errorType2 = ErrorType.RETRYABLE;
        NETWORK_GENERAL = new ErrorCode("NETWORK_GENERAL", 0, "A network error occurred.", errorType, errorType2);
        NO_NETWORK = new ErrorCode(ErrorConstants.NO_NETWORK, 1, "No network connection found.", errorType);
        AIRPLANE_MODE = new ErrorCode("AIRPLANE_MODE", 2, "Airplane mode is on.", errorType, errorType2);
        UNKNOWN_HOST = new ErrorCode("UNKNOWN_HOST", 3, "Unknown host exception.", errorType);
        SSL_ERROR = new ErrorCode("SSL_ERROR", 4, "SSL handshake exception.", errorType);
        CONNECT_EXCEPTION = new ErrorCode("CONNECT_EXCEPTION", 5, "Unable to connect to host.", errorType);
        ErrorType errorType3 = ErrorType.ERROR;
        JSON_EXCEPTION = new ErrorCode(NotificationActionConstants.MetricConstants.JSON_EXCEPTION, 6, "JSON parsing exception.", errorType3);
        ErrorType errorType4 = ErrorType.SERVER;
        RESPONSE_5XX_LEVEL = new ErrorCode("RESPONSE_5XX_LEVEL", 7, "5xx level response from server.", errorType4);
        RESPONSE_4XX_LEVEL = new ErrorCode("RESPONSE_4XX_LEVEL", 8, "4xx level response from server.", errorType4);
        BAD_URL = new ErrorCode("BAD_URL", 9, "A bad URL was specified.", errorType3);
        COMPONENT_ERROR = new ErrorCode("COMPONENT_ERROR", 10, "A component errored out.", new ErrorType[0]);
        EXPECTED_NATIVE_GOT_WEB = new ErrorCode("EXPECTED_NATIVE_GOT_WEB", 11, "Expected native, got web.", errorType4);
        $VALUES = $values();
    }

    private ErrorCode(String str, int i, String str2, ErrorType... errorTypeArr) {
        int i2 = 0;
        for (ErrorType errorType : errorTypeArr) {
            i2 |= errorType.flag;
        }
        this.defaultMessage = str2;
        this.flags = i2;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    public String getDefaultMessage() {
        return this.defaultMessage;
    }

    public int getFlags() {
        return this.flags;
    }

    public boolean isDebug() {
        return ErrorType.DEBUG.isIn(this.flags);
    }

    public boolean isError() {
        return ErrorType.ERROR.isIn(this.flags) || shouldAssert() || isFatal();
    }

    public boolean isFatal() {
        return ErrorType.FATAL.isIn(this.flags);
    }

    public boolean isRetryable() {
        return ErrorType.RETRYABLE.isIn(this.flags);
    }

    public boolean shouldAssert() {
        return ErrorType.ASSERT.isIn(this.flags);
    }

    public WritableMap toWritableMap() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("name", name());
        createMap.putString("message", this.defaultMessage);
        createMap.putInt("errorCode", this.flags);
        return createMap;
    }
}
