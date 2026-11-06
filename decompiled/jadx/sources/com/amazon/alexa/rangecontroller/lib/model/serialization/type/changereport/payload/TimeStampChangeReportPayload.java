package com.amazon.alexa.rangecontroller.lib.model.serialization.type.changereport.payload;

import com.amazon.alexa.changereport.Change;
import com.amazon.alexa.changereport.payload.ChangeReportPayload;
import com.amazon.alexa.rangecontroller.lib.model.EmptyInstance;
import com.amazon.alexa.rangecontroller.lib.model.NamespaceName;
import com.amazon.alexa.rangecontroller.lib.model.PropertyName;
import org.apache.commons.net.ntp.TimeStamp;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class TimeStampChangeReportPayload extends ChangeReportPayload<NamespaceName, PropertyName, EmptyInstance, TimeStamp> {
    public TimeStampChangeReportPayload(Change<NamespaceName, PropertyName, EmptyInstance, TimeStamp> change) {
        super(change);
    }
}
