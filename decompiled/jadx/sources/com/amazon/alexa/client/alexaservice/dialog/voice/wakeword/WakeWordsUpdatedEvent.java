package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class WakeWordsUpdatedEvent extends Event.NotGated {
    public static WakeWordsUpdatedEvent create(List<String> list) {
        return create(list, false);
    }

    public abstract List<String> getWakeWords();

    public abstract boolean isFromDirective();

    public static WakeWordsUpdatedEvent create(List<String> list, boolean z) {
        return new AutoValue_WakeWordsUpdatedEvent(list, z);
    }
}
