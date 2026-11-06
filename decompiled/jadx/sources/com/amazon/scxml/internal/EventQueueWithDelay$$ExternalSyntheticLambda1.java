package com.amazon.scxml.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class EventQueueWithDelay$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Event f$0;
    public final /* synthetic */ EventQueueWithDelay f$1;
    public final /* synthetic */ double f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ EventQueueWithDelay$$ExternalSyntheticLambda1(Event event, EventQueueWithDelay eventQueueWithDelay, double d, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = event;
        this.f$1 = eventQueueWithDelay;
        this.f$2 = d;
        this.f$3 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit push$lambda$2;
        Unit push$lambda$2$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                push$lambda$2 = EventQueueWithDelay.push$lambda$2(this.f$0, this.f$1, this.f$2, this.f$3);
                return push$lambda$2;
            default:
                push$lambda$2$lambda$1 = EventQueueWithDelay.push$lambda$2$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3);
                return push$lambda$2$lambda$1;
        }
    }
}
