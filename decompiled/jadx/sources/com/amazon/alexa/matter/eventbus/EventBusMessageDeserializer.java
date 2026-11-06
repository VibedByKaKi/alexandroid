package com.amazon.alexa.matter.eventbus;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.EventBusMessage;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface EventBusMessageDeserializer {
    @NonNull
    EventBusMessage deserialize(@NonNull String str) throws IOException;
}
