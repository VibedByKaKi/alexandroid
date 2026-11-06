package com.amazon.comms.models.events;

import com.amazon.comms.models.common.CommsConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties({"stackTrace", "localizedMessage", "suppressed"})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
/* loaded from: classes20.dex */
public class LocalApplicationException extends RuntimeException implements SimEvent {
    @Override // com.amazon.comms.models.events.SimEvent
    public String getEventName() {
        return "LocalApplicationException";
    }

    @Override // com.amazon.comms.models.events.SimEvent
    public String getNamespace() {
        return CommsConstants.COMMUNICATIONS_NAMESPACE;
    }

    public Class<?> getType() {
        return getClass();
    }
}
