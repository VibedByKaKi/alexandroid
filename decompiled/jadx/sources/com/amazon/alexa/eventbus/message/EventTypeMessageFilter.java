package com.amazon.alexa.eventbus.message;

import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EventTypeMessageFilter implements MessageFilter {
    private String matchString;

    public EventTypeMessageFilter(@NonNull String str) {
        this.matchString = str;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public boolean isMatch(@NonNull Message message) {
        if (message.getEventType() == null) {
            return false;
        }
        if (AppLaunchChecker$$ExternalSyntheticOutline0.m(1, this.matchString) != '*') {
            return message.getEventType().equals(this.matchString);
        }
        return message.getEventType().startsWith(AppLaunchChecker$$ExternalSyntheticOutline0.m(2, 0, this.matchString));
    }
}
