package com.amazon.alexa.matter.eventbus;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.Request;
import com.amazon.alexa.matter.eventbus.schema.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface EventBusPublisher {
    boolean publish(@NonNull Request request);

    boolean publish(@NonNull Response response);
}
