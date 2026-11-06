package com.amazon.alexa.photos.hva;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
class SetEventFilter implements MessageFilter {

    @NonNull
    private final Set<String> events;

    public SetEventFilter(@NonNull Set<String> set) {
        this.events = set;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public boolean isMatch(@NonNull Message message) {
        return this.events.contains(message.getEventType());
    }
}
