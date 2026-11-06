package com.amazon.alexa.rangecontroller.lib.model.serialization.type.changereport.payload;

import com.amazon.alexa.changereport.Change;
import com.amazon.alexa.changereport.payload.ChangeReportPayload;
import com.amazon.alexa.rangecontroller.lib.model.EmptyInstance;
import com.amazon.alexa.rangecontroller.lib.model.NamespaceName;
import com.amazon.alexa.rangecontroller.lib.model.PropertyName;
import com.google.gson.JsonElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RcChangeReportPayload extends ChangeReportPayload<NamespaceName, PropertyName, EmptyInstance, JsonElement> {
    public RcChangeReportPayload(Change<NamespaceName, PropertyName, EmptyInstance, JsonElement> change) {
        super(change);
    }
}
