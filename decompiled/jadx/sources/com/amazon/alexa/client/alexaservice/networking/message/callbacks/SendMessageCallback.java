package com.amazon.alexa.client.alexaservice.networking.message.callbacks;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.core.messages.Message;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SendMessageCallback {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DropReason {
        ERROR,
        NETWORK,
        AUTHORIZATION,
        TIMEOUT,
        CANCELLED,
        TEARDOWN,
        ATTACHMENT_READ_FAILURE;

        public boolean isNetworkRelated() {
            return (this == CANCELLED || this == TEARDOWN || this == ATTACHMENT_READ_FAILURE) ? false : true;
        }
    }

    void onFailure(RequestIdentifier requestIdentifier, @Nullable Integer num, @Nullable Exception exc);

    void onMessageReceived(RequestIdentifier requestIdentifier, Message message);

    void onRequestDropped(RequestIdentifier requestIdentifier, DropReason dropReason);

    void onRequestFinished(RequestIdentifier requestIdentifier);

    void onRequestQueued(RequestIdentifier requestIdentifier);

    void onRequestStarted(RequestIdentifier requestIdentifier);

    void onSuccess(RequestIdentifier requestIdentifier, Collection<Message> collection);
}
