package com.amazon.ptzcontroller.lib.model.factory;

import com.amazon.alexa.directive.AlexaDirective;
import com.amazon.alexa.rangecontroller.lib.model.HeaderName;
import com.amazon.alexa.rangecontroller.lib.model.NamespaceName;
import com.amazon.alexa.rangecontroller.lib.model.api.directive.AdjustRangeValuePayload;
import com.amazon.alexa.rangecontroller.lib.model.factory.RcDirectiveFactory;
import com.amazon.ptzcontroller.lib.model.api.ptz.directive.CameraPtzInstance;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PtzDirectiveFactory {
    private PtzDirectiveFactory() {
    }

    public static AlexaDirective<NamespaceName, HeaderName, CameraPtzInstance, AdjustRangeValuePayload> forAdjustRangeValue(CameraPtzInstance cameraPtzInstance, double d, String str) {
        return RcDirectiveFactory.forAdjustRangeValue(cameraPtzInstance, d, str).create();
    }
}
