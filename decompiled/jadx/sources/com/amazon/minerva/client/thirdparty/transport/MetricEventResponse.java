package com.amazon.minerva.client.thirdparty.transport;

import com.amazon.ion.IonString;
import com.amazon.ion.IonSymbol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MetricEventResponse {
    private final IonString metricEventId;
    private final IonSymbol status;

    public MetricEventResponse(IonString ionString, IonSymbol ionSymbol) {
        this.metricEventId = ionString;
        this.status = ionSymbol;
    }

    public IonString getMetricEventId() {
        return this.metricEventId;
    }

    public IonSymbol getStatus() {
        return this.status;
    }
}
