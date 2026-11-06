package com.amazon.alexa.eventing;

import com.amazon.alexa.eventing.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class Event$$ExternalSyntheticLambda0 implements Event.ObserverAction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EventHandler f$0;

    public /* synthetic */ Event$$ExternalSyntheticLambda0(EventHandler eventHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = eventHandler;
    }

    @Override // com.amazon.alexa.eventing.Event.ObserverAction
    public final void apply(Event.Observer observer) {
        int i = this.$r8$classId;
        EventHandler eventHandler = this.f$0;
        switch (i) {
            case 0:
                Event.subscribe$lambda$4$lambda$3(eventHandler, observer);
                break;
            default:
                Event.subscribe$lambda$1(eventHandler, observer);
                break;
        }
    }
}
