package com.amazon.alexa.client.alexaservice.base.system;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.capabilities.agents.BaseCapabilityAgent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class SystemCapabilityAgent$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BaseCapabilityAgent f$0;
    public final /* synthetic */ Event.NotGated f$1;

    public /* synthetic */ SystemCapabilityAgent$$ExternalSyntheticLambda0(BaseCapabilityAgent baseCapabilityAgent, Event.NotGated notGated, int i) {
        this.$r8$classId = i;
        this.f$0 = baseCapabilityAgent;
        this.f$1 = notGated;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SystemCapabilityAgent) this.f$0).lambda$on$0((SendSystemLocalesReportEvent) this.f$1);
                break;
            default:
                ((LanguageCapabilityAgent) this.f$0).lambda$on$0((SendRequestedLocalesReportEvent) this.f$1);
                break;
        }
    }
}
