package com.amazon.alexa.rangecontroller.lib.model.serialization.type.directive;

import com.amazon.alexa.directive.Directive;
import com.amazon.alexa.rangecontroller.lib.model.HeaderName;
import com.amazon.alexa.rangecontroller.lib.model.NamespaceName;
import com.amazon.alexa.rangecontroller.lib.model.api.directive.AdjustRangeValuePayload;
import com.amazon.alexa.rangecontroller.lib.model.serialization.type.RcAlexaDirective;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AdjustRangeValueDirective<T> extends RcAlexaDirective<T, AdjustRangeValuePayload> {
    public AdjustRangeValueDirective(Directive<NamespaceName, HeaderName, T, AdjustRangeValuePayload> directive) {
        super(directive);
    }
}
