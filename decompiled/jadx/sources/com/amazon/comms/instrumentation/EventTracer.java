package com.amazon.comms.instrumentation;

import com.amazon.comms.instrumentation.EventTracer.Interval;
import java.lang.Enum;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface EventTracer<EEvent extends Enum<EEvent>, EInterval extends Enum<EInterval> & Interval<EEvent>> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interval<EEvent> {
        EEvent getBegin();

        EEvent getEnd();

        boolean recordMetric();
    }

    void mark(EEvent eevent);

    void mark(EEvent eevent, String str);

    void markHistoric(EEvent eevent, long j, long j2);

    void setShadow(EventTracer eventTracer);
}
