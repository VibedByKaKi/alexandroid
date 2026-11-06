package com.amazon.alexa.smarthomecameras.directives.processor;

import com.amazon.alexa.api.compat.model.AlexaDirective;
import com.amazon.alexa.smarthomecameras.eventsender.EventSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface DirectiveProcessor {
    boolean processDirective(AlexaDirective alexaDirective, EventSender eventSender);
}
