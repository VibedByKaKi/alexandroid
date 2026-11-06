package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UpdateWakeWordsEvent extends Event.NotGated {
    public static UpdateWakeWordsEvent create(List<String> list) {
        return new AutoValue_UpdateWakeWordsEvent(list);
    }

    public abstract List<String> getWakeWords();
}
