package com.amazon.alexa.client.alexaservice.networking.adapters;

import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Payload;
import com.google.gson.JsonParseException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface PayloadTypeMapper {
    Class<? extends Payload> getPayloadType(Name name) throws JsonParseException;
}
