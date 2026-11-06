package com.amazon.alexa.handsfree.notification;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.metrics.NotificationEventMetadata;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaConnectionFailureConverter {

    @VisibleForTesting
    static final String CONNECTION_FAILURE_ALEXA_LEADER_MISSED = "ALEXA_LEADER_IS_MISSED";

    @VisibleForTesting
    static final String CONNECTION_FAILURE_AUTHORIZATION_MISSED = "AUTHORIZATION_IS_MISSED";

    @VisibleForTesting
    static final String CONNECTION_FAILURE_UNKNOWN = "UNKNOWN";

    public Optional<NotificationEventMetadata.ConnectionFailureReason> getConnectionFailureReasonFromString(@NonNull String str) {
        str.getClass();
        switch (str) {
            case "AUTHORIZATION_IS_MISSED":
                return Optional.of(NotificationEventMetadata.ConnectionFailureReason.AUTHORIZATION_IS_MISSED);
            case "UNKNOWN":
                return Optional.of(NotificationEventMetadata.ConnectionFailureReason.UNKNOWN_REASON);
            case "ALEXA_LEADER_IS_MISSED":
                return Optional.of(NotificationEventMetadata.ConnectionFailureReason.ALEXA_LEADER_IS_MISSED);
            default:
                return Optional.empty();
        }
    }
}
