package com.amazon.alexa.client.alexaservice.networking.message.payload;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.messages.Message;
import java.util.Collection;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ComposedMessage extends ComposedMessage {
    private final Collection<ComponentState> context;
    private final Message directive;
    private final Message event;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ComposedMessage.Builder {
        private Collection<ComponentState> context;
        private Message directive;
        private Message event;

        @Override // com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage.Builder
        public ComposedMessage build() {
            return new AutoValue_ComposedMessage(this.context, this.event, this.directive, 0);
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage.Builder
        public ComposedMessage.Builder setContext(Collection<ComponentState> collection) {
            this.context = collection;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage.Builder
        public ComposedMessage.Builder setDirective(Message message) {
            this.directive = message;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage.Builder
        public ComposedMessage.Builder setEvent(Message message) {
            this.event = message;
            return this;
        }
    }

    private AutoValue_ComposedMessage(@Nullable Collection<ComponentState> collection, @Nullable Message message, @Nullable Message message2) {
        this.context = collection;
        this.event = message;
        this.directive = message2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComposedMessage) {
            ComposedMessage composedMessage = (ComposedMessage) obj;
            Collection<ComponentState> collection = this.context;
            if (collection != null ? collection.equals(composedMessage.getContext()) : composedMessage.getContext() == null) {
                Message message = this.event;
                if (message != null ? message.equals(composedMessage.getEvent()) : composedMessage.getEvent() == null) {
                    Message message2 = this.directive;
                    if (message2 != null ? message2.equals(composedMessage.getDirective()) : composedMessage.getDirective() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage
    @Nullable
    public Collection<ComponentState> getContext() {
        return this.context;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage
    @Nullable
    public Message getDirective() {
        return this.directive;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.payload.ComposedMessage
    @Nullable
    public Message getEvent() {
        return this.event;
    }

    public int hashCode() {
        Collection<ComponentState> collection = this.context;
        int hashCode = ((collection == null ? 0 : collection.hashCode()) ^ 1000003) * 1000003;
        Message message = this.event;
        int hashCode2 = (hashCode ^ (message == null ? 0 : message.hashCode())) * 1000003;
        Message message2 = this.directive;
        return hashCode2 ^ (message2 != null ? message2.hashCode() : 0);
    }

    public String toString() {
        return "ComposedMessage{context=" + this.context + ", event=" + this.event + ", directive=" + this.directive + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_ComposedMessage(Collection collection, Message message, Message message2, int i) {
        this(collection, message, message2);
    }
}
