package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.api.TextInputType;
import com.amazon.alexa.client.alexaservice.ApiCallIdentifier;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.eventing.events.AutoValue_SendMessageEvent;
import com.amazon.alexa.client.alexaservice.networking.adapters.MessageCallbackAdapter;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentTimeoutsConfiguration;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentWriteCallbacks;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback;
import com.amazon.alexa.client.alexaservice.networking.message.request.StreamingMultipartRequestBody;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.messages.Message;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SendMessageEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract SendMessageEvent autoBuild();

        public SendMessageEvent build() {
            if (getApiCallMetadata() == null) {
                setApiCallMetadata(ApiCallMetadata.NONE);
            }
            return autoBuild();
        }

        public abstract ApiCallMetadata getApiCallMetadata();

        public abstract Builder setApiCallMetadata(ApiCallMetadata apiCallMetadata);

        public abstract Builder setAttachmentIdentifier(AttachmentIdentifier attachmentIdentifier);

        public abstract Builder setAttachmentWriteCallbacks(@Nullable AttachmentWriteCallbacks attachmentWriteCallbacks);

        public abstract Builder setClient(@Nullable ExtendedClient extendedClient);

        public abstract Builder setContext(Set<ComponentState> set);

        public abstract Builder setDataAttachmentIdentifier(@Nullable AttachmentIdentifier attachmentIdentifier);

        public abstract Builder setDataAttachmentWriteCallbacks(@Nullable AttachmentWriteCallbacks attachmentWriteCallbacks);

        public abstract Builder setGuaranteedDelivery(boolean z);

        public abstract Builder setInputType(@Nullable TextInputType textInputType);

        public abstract Builder setMessage(Message message);

        public abstract Builder setSendMessageCallback(SendMessageCallback sendMessageCallback);

        public abstract Builder setStreamingMultipartBody(@Nullable StreamingMultipartRequestBody streamingMultipartRequestBody);

        public abstract Builder setTimeoutsConfiguration(AttachmentTimeoutsConfiguration attachmentTimeoutsConfiguration);
    }

    public static Builder builder() {
        return new AutoValue_SendMessageEvent.Builder().setApiCallMetadata(ApiCallMetadata.NONE).setGuaranteedDelivery(false).setStreamingMultipartBody(null).setInputType(null).setSendMessageCallback(MessageCallbackAdapter.getInstance());
    }

    public abstract ApiCallMetadata getApiCallMetadata();

    @Nullable
    public abstract AttachmentIdentifier getAttachmentIdentifier();

    @Nullable
    public abstract AttachmentWriteCallbacks getAttachmentWriteCallbacks();

    @Nullable
    public abstract ExtendedClient getClient();

    @Nullable
    public abstract Set<ComponentState> getContext();

    @Nullable
    public abstract AttachmentIdentifier getDataAttachmentIdentifier();

    @Nullable
    public abstract AttachmentWriteCallbacks getDataAttachmentWriteCallbacks();

    @Nullable
    public abstract TextInputType getInputType();

    public abstract Message getMessage();

    public abstract SendMessageCallback getSendMessageCallback();

    @Nullable
    public abstract StreamingMultipartRequestBody getStreamingMultipartBody();

    @Nullable
    public abstract AttachmentTimeoutsConfiguration getTimeoutsConfiguration();

    public boolean hasApiCallIdentifier() {
        return getApiCallMetadata().getApiCallIdentifier() != ApiCallIdentifier.NONE;
    }

    public boolean hasContext() {
        Set<ComponentState> context = getContext();
        return (context == null || context.isEmpty()) ? false : true;
    }

    public abstract boolean isGuaranteedDelivery();

    public abstract Builder toBuilder();
}
