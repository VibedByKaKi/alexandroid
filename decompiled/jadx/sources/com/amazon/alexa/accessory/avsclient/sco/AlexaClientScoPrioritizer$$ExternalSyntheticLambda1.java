package com.amazon.alexa.accessory.avsclient.sco;

import com.amazon.alexa.accessory.Accessory;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AlexaClientScoPrioritizer$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaClientScoPrioritizer f$0;

    public /* synthetic */ AlexaClientScoPrioritizer$$ExternalSyntheticLambda1(AlexaClientScoPrioritizer alexaClientScoPrioritizer, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaClientScoPrioritizer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AlexaClientScoPrioritizer alexaClientScoPrioritizer = this.f$0;
        switch (i) {
            case 0:
                alexaClientScoPrioritizer.lambda$determineCurrentStatus$3((List) obj);
                break;
            default:
                alexaClientScoPrioritizer.lambda$observeSessions$0((Accessory) obj);
                break;
        }
    }
}
