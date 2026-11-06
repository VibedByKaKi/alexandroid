package com.amazon.dee.app.services.internetsharing.socks5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/socks5/ErrorCode;", "", "value", "", "<init>", "(Ljava/lang/String;IB)V", "getValue", "()B", "SUCCESS", "GENERAL_FAILURE", "NOT_ALLOWED", "NET_UNREACHABLE", "HOST_UNREACHABLE", "CONN_REFUSED", "TTL_EXPIRED", "COMMAND_NOT_SUPPORTED", "ADDRESSTYPE_NOT_SUPPORTED", "NOT_IN_ALLOWLIST", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;
    private final byte value;
    public static final ErrorCode SUCCESS = new ErrorCode("SUCCESS", 0, (byte) 0);
    public static final ErrorCode GENERAL_FAILURE = new ErrorCode("GENERAL_FAILURE", 1, (byte) 1);
    public static final ErrorCode NOT_ALLOWED = new ErrorCode("NOT_ALLOWED", 2, (byte) 2);
    public static final ErrorCode NET_UNREACHABLE = new ErrorCode("NET_UNREACHABLE", 3, (byte) 3);
    public static final ErrorCode HOST_UNREACHABLE = new ErrorCode("HOST_UNREACHABLE", 4, (byte) 4);
    public static final ErrorCode CONN_REFUSED = new ErrorCode("CONN_REFUSED", 5, (byte) 5);
    public static final ErrorCode TTL_EXPIRED = new ErrorCode("TTL_EXPIRED", 6, (byte) 6);
    public static final ErrorCode COMMAND_NOT_SUPPORTED = new ErrorCode("COMMAND_NOT_SUPPORTED", 7, (byte) 7);
    public static final ErrorCode ADDRESSTYPE_NOT_SUPPORTED = new ErrorCode("ADDRESSTYPE_NOT_SUPPORTED", 8, (byte) 8);
    public static final ErrorCode NOT_IN_ALLOWLIST = new ErrorCode("NOT_IN_ALLOWLIST", 9, (byte) 9);

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{SUCCESS, GENERAL_FAILURE, NOT_ALLOWED, NET_UNREACHABLE, HOST_UNREACHABLE, CONN_REFUSED, TTL_EXPIRED, COMMAND_NOT_SUPPORTED, ADDRESSTYPE_NOT_SUPPORTED, NOT_IN_ALLOWLIST};
    }

    static {
        ErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ErrorCode(String str, int i, byte b) {
        this.value = b;
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

    public final byte getValue() {
        return this.value;
    }
}
