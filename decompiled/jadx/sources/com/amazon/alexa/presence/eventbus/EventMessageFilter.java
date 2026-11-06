package com.amazon.alexa.presence.eventbus;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class EventMessageFilter implements MessageFilter {
    private final String matchString;

    @Inject
    public EventMessageFilter(@NonNull String str) {
        this.matchString = str;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public boolean isMatch(@NonNull Message message) {
        if (message.getEventType() == null) {
            return false;
        }
        return message.getEventType().equals(this.matchString);
    }
}
