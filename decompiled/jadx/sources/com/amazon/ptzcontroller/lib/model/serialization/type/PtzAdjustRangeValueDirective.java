package com.amazon.ptzcontroller.lib.model.serialization.type;

import com.amazon.alexa.directive.Directive;
import com.amazon.alexa.rangecontroller.lib.model.HeaderName;
import com.amazon.alexa.rangecontroller.lib.model.NamespaceName;
import com.amazon.alexa.rangecontroller.lib.model.api.directive.AdjustRangeValuePayload;
import com.amazon.alexa.rangecontroller.lib.model.serialization.type.RcAlexaDirective;
import com.amazon.ptzcontroller.lib.model.api.ptz.directive.CameraPtzInstance;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PtzAdjustRangeValueDirective extends RcAlexaDirective<CameraPtzInstance, AdjustRangeValuePayload> {
    public PtzAdjustRangeValueDirective(Directive<NamespaceName, HeaderName, CameraPtzInstance, AdjustRangeValuePayload> directive) {
        super(directive);
    }
}
