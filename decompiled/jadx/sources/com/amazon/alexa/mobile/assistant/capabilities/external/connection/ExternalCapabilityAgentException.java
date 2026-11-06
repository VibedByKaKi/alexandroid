package com.amazon.alexa.mobile.assistant.capabilities.external.connection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\rB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "reason", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentException$FailureReason;", "cause", "", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentException$FailureReason;Ljava/lang/Throwable;)V", "getReason", "()Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentException$FailureReason;", "FailureReason", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ExternalCapabilityAgentException extends Exception {

    @NotNull
    private final FailureReason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentException$FailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTION_FAILURE", "REMOTE_EXCEPTION", "NULL_SERVICE", "PROCESSING_TIMEOUT", "UNKNOWN", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FailureReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason CONNECTION_FAILURE = new FailureReason("CONNECTION_FAILURE", 0);
        public static final FailureReason REMOTE_EXCEPTION = new FailureReason("REMOTE_EXCEPTION", 1);
        public static final FailureReason NULL_SERVICE = new FailureReason("NULL_SERVICE", 2);
        public static final FailureReason PROCESSING_TIMEOUT = new FailureReason("PROCESSING_TIMEOUT", 3);
        public static final FailureReason UNKNOWN = new FailureReason("UNKNOWN", 4);

        private static final /* synthetic */ FailureReason[] $values() {
            return new FailureReason[]{CONNECTION_FAILURE, REMOTE_EXCEPTION, NULL_SERVICE, PROCESSING_TIMEOUT, UNKNOWN};
        }

        static {
            FailureReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private FailureReason(String str, int i) {
        }

        @NotNull
        public static EnumEntries<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalCapabilityAgentException(@NotNull String str, @NotNull FailureReason failureReason, @Nullable Throwable th) {
        super(str, th);
        str.getClass();
        failureReason.getClass();
        this.reason = failureReason;
    }

    @NotNull
    public final FailureReason getReason() {
        return this.reason;
    }

    public /* synthetic */ ExternalCapabilityAgentException(String str, FailureReason failureReason, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, failureReason, (i & 4) != 0 ? null : th);
    }
}
