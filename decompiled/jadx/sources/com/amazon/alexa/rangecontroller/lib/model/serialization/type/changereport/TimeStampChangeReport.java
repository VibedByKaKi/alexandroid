package com.amazon.alexa.rangecontroller.lib.model.serialization.type.changereport;

import com.amazon.alexa.changereport.ChangeReport;
import com.amazon.alexa.context.Context;
import com.amazon.alexa.event.Event;
import com.amazon.alexa.rangecontroller.lib.model.EmptyInstance;
import com.amazon.alexa.rangecontroller.lib.model.HeaderName;
import com.amazon.alexa.rangecontroller.lib.model.NamespaceName;
import com.amazon.alexa.rangecontroller.lib.model.serialization.type.changereport.payload.TimeStampChangeReportPayload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class TimeStampChangeReport extends ChangeReport<NamespaceName, HeaderName, EmptyInstance, TimeStampChangeReportPayload> {
    public TimeStampChangeReport(Event<NamespaceName, HeaderName, EmptyInstance, TimeStampChangeReportPayload> event, Context context) {
        super(event, context);
    }
}
