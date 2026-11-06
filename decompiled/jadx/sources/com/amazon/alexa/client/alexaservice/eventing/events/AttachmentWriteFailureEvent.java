package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AttachmentWriteFailureEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FailureType {
        SOCKET_TIMEOUT,
        CLIENT_TIMEOUT,
        UNKNOWN,
        PEER_RESET_DIALOG_PRESERVED
    }

    public static AttachmentWriteFailureEvent createClientTimeout() {
        return new AutoValue_AttachmentWriteFailureEvent(FailureType.CLIENT_TIMEOUT);
    }

    public static AttachmentWriteFailureEvent createPeerResetDialogPreserved() {
        return new AutoValue_AttachmentWriteFailureEvent(FailureType.PEER_RESET_DIALOG_PRESERVED);
    }

    public static AttachmentWriteFailureEvent createSocketTimeout() {
        return new AutoValue_AttachmentWriteFailureEvent(FailureType.SOCKET_TIMEOUT);
    }

    public static AttachmentWriteFailureEvent createUnknown() {
        return new AutoValue_AttachmentWriteFailureEvent(FailureType.UNKNOWN);
    }

    public abstract FailureType getType();
}
