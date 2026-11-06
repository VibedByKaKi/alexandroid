package com.amazon.ptzcontroller.lib.api;

import com.amazon.alexa.rangecontroller.lib.model.api.directive.AdjustRangeValuePayload;
import com.amazon.ptzcontroller.lib.model.serialization.type.PtzAdjustRangeValueDirective;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface PtzHandler {
    void handle(PtzAdjustRangeValueDirective ptzAdjustRangeValueDirective, AdjustRangeValuePayload adjustRangeValuePayload);
}
