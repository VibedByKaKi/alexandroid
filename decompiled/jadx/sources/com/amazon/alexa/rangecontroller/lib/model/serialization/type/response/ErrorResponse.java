package com.amazon.alexa.rangecontroller.lib.model.serialization.type.response;

import com.amazon.alexa.context.Context;
import com.amazon.alexa.event.Event;
import com.amazon.alexa.rangecontroller.lib.model.EmptyInstance;
import com.amazon.alexa.rangecontroller.lib.model.HeaderName;
import com.amazon.alexa.rangecontroller.lib.model.NamespaceName;
import com.amazon.alexa.response.Response;
import com.amazon.alexa.response.payload.ErrorResponsePayload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ErrorResponse extends Response<NamespaceName, HeaderName, EmptyInstance, ErrorResponsePayload> {
    public ErrorResponse(Event<NamespaceName, HeaderName, EmptyInstance, ErrorResponsePayload> event, Context context) {
        super(event, context);
    }
}
