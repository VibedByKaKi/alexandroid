package com.amazon.alexa.smarthomecameras.directives;

import com.amazon.alexa.smarthomecameras.util.GsonHelper;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DirectivePayloadParser<T extends Serializable> {
    private final Class<T> payloadClass;

    public DirectivePayloadParser(Class<T> cls) {
        this.payloadClass = cls;
    }

    public T parseDirectivePayload(com.amazon.alexa.api.compat.model.AlexaDirective alexaDirective) {
        return (T) GsonHelper.fromJson(alexaDirective.getAlexaPayload().getPayload(), (Class) this.payloadClass);
    }
}
