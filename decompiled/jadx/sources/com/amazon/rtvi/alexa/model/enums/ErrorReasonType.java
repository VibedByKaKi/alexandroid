package com.amazon.rtvi.alexa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/rtvi/alexa/model/enums/ErrorReasonType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALREADY_IN_CAPTURING", "INVALID_STATE", "TIMEOUT_WAITING_FOR_RESOURCE", "CAPTURE_SOURCE_UNAVAILABLE", "PERMISSION_DENIED", "UNKNOWN_FAILURE", "TRANSMISSION_CHANNEL_FAILURE", "INSUFFICIENT_RESOURCES", "CACHED_DATA_CLEARED", "UNSUPPORTED_CAPTURE_CONFIG", "USER_STOPPED", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorReasonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorReasonType[] $VALUES;

    @JsonValue
    @NotNull
    private final String value;
    public static final ErrorReasonType ALREADY_IN_CAPTURING = new ErrorReasonType("ALREADY_IN_CAPTURING", 0, "ALREADY_IN_CAPTURING");
    public static final ErrorReasonType INVALID_STATE = new ErrorReasonType("INVALID_STATE", 1, "INVALID_STATE");
    public static final ErrorReasonType TIMEOUT_WAITING_FOR_RESOURCE = new ErrorReasonType("TIMEOUT_WAITING_FOR_RESOURCE", 2, "TIMEOUT_WAITING_FOR_RESOURCE");
    public static final ErrorReasonType CAPTURE_SOURCE_UNAVAILABLE = new ErrorReasonType("CAPTURE_SOURCE_UNAVAILABLE", 3, "CAPTURE_SOURCE_UNAVAILABLE");
    public static final ErrorReasonType PERMISSION_DENIED = new ErrorReasonType("PERMISSION_DENIED", 4, "PERMISSION_DENIED");
    public static final ErrorReasonType UNKNOWN_FAILURE = new ErrorReasonType("UNKNOWN_FAILURE", 5, "UNKNOWN_FAILURE");
    public static final ErrorReasonType TRANSMISSION_CHANNEL_FAILURE = new ErrorReasonType("TRANSMISSION_CHANNEL_FAILURE", 6, "TRANSMISSION_CHANNEL_FAILURE");
    public static final ErrorReasonType INSUFFICIENT_RESOURCES = new ErrorReasonType("INSUFFICIENT_RESOURCES", 7, "INSUFFICIENT_RESOURCES");
    public static final ErrorReasonType CACHED_DATA_CLEARED = new ErrorReasonType("CACHED_DATA_CLEARED", 8, "CACHED_DATA_CLEARED");
    public static final ErrorReasonType UNSUPPORTED_CAPTURE_CONFIG = new ErrorReasonType("UNSUPPORTED_CAPTURE_CONFIG", 9, "UNSUPPORTED_CAPTURE_CONFIG");
    public static final ErrorReasonType USER_STOPPED = new ErrorReasonType("USER_STOPPED", 10, "USER_STOPPED");

    private static final /* synthetic */ ErrorReasonType[] $values() {
        return new ErrorReasonType[]{ALREADY_IN_CAPTURING, INVALID_STATE, TIMEOUT_WAITING_FOR_RESOURCE, CAPTURE_SOURCE_UNAVAILABLE, PERMISSION_DENIED, UNKNOWN_FAILURE, TRANSMISSION_CHANNEL_FAILURE, INSUFFICIENT_RESOURCES, CACHED_DATA_CLEARED, UNSUPPORTED_CAPTURE_CONFIG, USER_STOPPED};
    }

    static {
        ErrorReasonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ErrorReasonType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ErrorReasonType> getEntries() {
        return $ENTRIES;
    }

    public static ErrorReasonType valueOf(String str) {
        return (ErrorReasonType) Enum.valueOf(ErrorReasonType.class, str);
    }

    public static ErrorReasonType[] values() {
        return (ErrorReasonType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
