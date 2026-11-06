package com.amazon.alexa.matter.service.request;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.Request;
import com.amazon.alexa.matter.service.response.Responder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface RequestHandler {
    void handle(@NonNull Request request, @NonNull Responder responder);
}
