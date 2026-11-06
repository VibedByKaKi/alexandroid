package com.amazon.alexa.hho.stickynotes;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Subscriber;
import com.amazon.alexa.identity.api.IdentityEvent;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
class IdentitySubscriber implements Subscriber {
    private final Handler handler;
    private final UUID uuid = UUID.randomUUID();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Handler {
        void handleIdentityChanged();
    }

    public IdentitySubscriber(Handler handler) {
        this.handler = handler;
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public UUID getUUID() {
        return this.uuid;
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public void onMessageReceived(@NonNull Message message) {
        if (IdentityEvent.IDENTITY_CHANGED.equals(message.getEventType())) {
            this.handler.handleIdentityChanged();
        }
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public boolean supportsMessage(@NonNull Message message) {
        return IdentityEvent.IDENTITY_CHANGED.equals(message.getEventType());
    }
}
