package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/ErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "BAD_REQUEST", "SESSION_EXTENSION_UNAVAILABLE", "ENDPOINT_UNREACHABLE", "ENDPOINT_NOT_FOUND", "ENDPOINT_MEDIA_CONNECTION_LOST", "MAX_ONGOING_LIVE_VIEW_SESSIONS", "ENDPOINT_UNAUTHORIZED", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;
    public static final ErrorCode INTERNAL_ERROR = new ErrorCode("INTERNAL_ERROR", 0);
    public static final ErrorCode BAD_REQUEST = new ErrorCode("BAD_REQUEST", 1);
    public static final ErrorCode SESSION_EXTENSION_UNAVAILABLE = new ErrorCode("SESSION_EXTENSION_UNAVAILABLE", 2);
    public static final ErrorCode ENDPOINT_UNREACHABLE = new ErrorCode("ENDPOINT_UNREACHABLE", 3);
    public static final ErrorCode ENDPOINT_NOT_FOUND = new ErrorCode("ENDPOINT_NOT_FOUND", 4);
    public static final ErrorCode ENDPOINT_MEDIA_CONNECTION_LOST = new ErrorCode("ENDPOINT_MEDIA_CONNECTION_LOST", 5);
    public static final ErrorCode MAX_ONGOING_LIVE_VIEW_SESSIONS = new ErrorCode("MAX_ONGOING_LIVE_VIEW_SESSIONS", 6);
    public static final ErrorCode ENDPOINT_UNAUTHORIZED = new ErrorCode("ENDPOINT_UNAUTHORIZED", 7);

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{INTERNAL_ERROR, BAD_REQUEST, SESSION_EXTENSION_UNAVAILABLE, ENDPOINT_UNREACHABLE, ENDPOINT_NOT_FOUND, ENDPOINT_MEDIA_CONNECTION_LOST, MAX_ONGOING_LIVE_VIEW_SESSIONS, ENDPOINT_UNAUTHORIZED};
    }

    static {
        ErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ErrorCode(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }
}
