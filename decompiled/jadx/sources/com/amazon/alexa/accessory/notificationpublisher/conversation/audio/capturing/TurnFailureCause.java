package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentErrorCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/TurnFailureCause;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", ClassifyIntentErrorCode.CLOUD_TURN_FAILED, ClassifyIntentErrorCode.WEBSOCKET_OPEN_FAILED, ClassifyIntentErrorCode.WEBSOCKET_SEND_REJECTED, ClassifyIntentErrorCode.WEBSOCKET_CLOSED, ClassifyIntentErrorCode.WEBSOCKET_FAILURE, ClassifyIntentErrorCode.MALFORMED_INBOUND_FRAME, "NO_OPEN_SESSION", "OTHER_TRANSPORT_ERROR", "UNKNOWN_DISPOSITION", "CAPTURE_TERMINATED", "CAPTURE_TIMEOUT", "Companion", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TurnFailureCause {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TurnFailureCause[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String label;
    public static final TurnFailureCause CLOUD_TURN_FAILED = new TurnFailureCause(ClassifyIntentErrorCode.CLOUD_TURN_FAILED, 0, "cloudTurnFailed");
    public static final TurnFailureCause WEBSOCKET_OPEN_FAILED = new TurnFailureCause(ClassifyIntentErrorCode.WEBSOCKET_OPEN_FAILED, 1, "websocketOpenFailed");
    public static final TurnFailureCause WEBSOCKET_SEND_REJECTED = new TurnFailureCause(ClassifyIntentErrorCode.WEBSOCKET_SEND_REJECTED, 2, "websocketSendRejected");
    public static final TurnFailureCause WEBSOCKET_CLOSED = new TurnFailureCause(ClassifyIntentErrorCode.WEBSOCKET_CLOSED, 3, "websocketClosed");
    public static final TurnFailureCause WEBSOCKET_FAILURE = new TurnFailureCause(ClassifyIntentErrorCode.WEBSOCKET_FAILURE, 4, "websocketFailure");
    public static final TurnFailureCause MALFORMED_INBOUND_FRAME = new TurnFailureCause(ClassifyIntentErrorCode.MALFORMED_INBOUND_FRAME, 5, "malformedInboundFrame");
    public static final TurnFailureCause NO_OPEN_SESSION = new TurnFailureCause("NO_OPEN_SESSION", 6, "noOpenSession");
    public static final TurnFailureCause OTHER_TRANSPORT_ERROR = new TurnFailureCause("OTHER_TRANSPORT_ERROR", 7, "otherTransportError");
    public static final TurnFailureCause UNKNOWN_DISPOSITION = new TurnFailureCause("UNKNOWN_DISPOSITION", 8, "unknownDisposition");
    public static final TurnFailureCause CAPTURE_TERMINATED = new TurnFailureCause("CAPTURE_TERMINATED", 9, "captureTerminated");
    public static final TurnFailureCause CAPTURE_TIMEOUT = new TurnFailureCause("CAPTURE_TIMEOUT", 10, "captureTimeout");

    private static final /* synthetic */ TurnFailureCause[] $values() {
        return new TurnFailureCause[]{CLOUD_TURN_FAILED, WEBSOCKET_OPEN_FAILED, WEBSOCKET_SEND_REJECTED, WEBSOCKET_CLOSED, WEBSOCKET_FAILURE, MALFORMED_INBOUND_FRAME, NO_OPEN_SESSION, OTHER_TRANSPORT_ERROR, UNKNOWN_DISPOSITION, CAPTURE_TERMINATED, CAPTURE_TIMEOUT};
    }

    static {
        TurnFailureCause[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private TurnFailureCause(String str, int i, String str2) {
        this.label = str2;
    }

    @NotNull
    public static EnumEntries<TurnFailureCause> getEntries() {
        return $ENTRIES;
    }

    public static TurnFailureCause valueOf(String str) {
        return (TurnFailureCause) Enum.valueOf(TurnFailureCause.class, str);
    }

    public static TurnFailureCause[] values() {
        return (TurnFailureCause[]) $VALUES.clone();
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/TurnFailureCause$Companion;", "", "<init>", "()V", "fromClientErrorCode", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/TurnFailureCause;", "code", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final TurnFailureCause fromClientErrorCode(@NotNull String code) {
            code.getClass();
            switch (code.hashCode()) {
                case -1164712134:
                    if (code.equals(ClassifyIntentErrorCode.WEBSOCKET_OPEN_FAILED)) {
                        return TurnFailureCause.WEBSOCKET_OPEN_FAILED;
                    }
                    break;
                case -850790190:
                    if (code.equals(ClassifyIntentErrorCode.WEBSOCKET_FAILURE)) {
                        return TurnFailureCause.WEBSOCKET_FAILURE;
                    }
                    break;
                case 793081021:
                    if (code.equals(ClassifyIntentErrorCode.WEBSOCKET_SEND_REJECTED)) {
                        return TurnFailureCause.WEBSOCKET_SEND_REJECTED;
                    }
                    break;
                case 996459285:
                    if (code.equals(ClassifyIntentErrorCode.CLOUD_TURN_FAILED)) {
                        return TurnFailureCause.CLOUD_TURN_FAILED;
                    }
                    break;
                case 1871497027:
                    if (code.equals(ClassifyIntentErrorCode.MALFORMED_INBOUND_FRAME)) {
                        return TurnFailureCause.MALFORMED_INBOUND_FRAME;
                    }
                    break;
                case 2113768708:
                    if (code.equals(ClassifyIntentErrorCode.WEBSOCKET_CLOSED)) {
                        return TurnFailureCause.WEBSOCKET_CLOSED;
                    }
                    break;
            }
            return TurnFailureCause.OTHER_TRANSPORT_ERROR;
        }

        private Companion() {
        }
    }
}
