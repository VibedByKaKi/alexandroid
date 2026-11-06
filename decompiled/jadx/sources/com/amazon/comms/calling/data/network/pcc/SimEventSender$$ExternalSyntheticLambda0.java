package com.amazon.comms.calling.data.network.pcc;

import amazon.speech.simclient.context.DeviceContextAddCallback;
import amazon.speech.simclient.context.DeviceContextAddResult;
import amazon.speech.simclient.event.EventResult;
import amazon.speech.simclient.event.EventStatusCallback;
import amazon.speech.simclient.focus.FocusModificationCallback;
import amazon.speech.simclient.focus.FocusModificationResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class SimEventSender$$ExternalSyntheticLambda0 implements FocusModificationCallback, EventStatusCallback, DeviceContextAddCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SimEventSender f$0;

    public /* synthetic */ SimEventSender$$ExternalSyntheticLambda0(SimEventSender simEventSender, int i) {
        this.$r8$classId = i;
        this.f$0 = simEventSender;
    }

    @Override // amazon.speech.simclient.context.DeviceContextAddCallback
    public void onFinished(DeviceContextAddResult deviceContextAddResult) {
        int i = this.$r8$classId;
        SimEventSender simEventSender = this.f$0;
        switch (i) {
            case 3:
                SimEventSender.sendEvent$lambda$1(simEventSender, deviceContextAddResult);
                break;
            default:
                SimEventSender.sendDeviceContextVersion$lambda$3(simEventSender, deviceContextAddResult);
                break;
        }
    }

    @Override // amazon.speech.simclient.event.EventStatusCallback
    public void onResult(EventResult eventResult) {
        SimEventSender.sendEvent$lambda$0(this.f$0, eventResult);
    }

    @Override // amazon.speech.simclient.focus.FocusModificationCallback
    public void onFinished(FocusModificationResult focusModificationResult) {
        int i = this.$r8$classId;
        SimEventSender simEventSender = this.f$0;
        switch (i) {
            case 0:
                SimEventSender.acquireCommsFocus$lambda$5$lambda$4(simEventSender, focusModificationResult);
                break;
            default:
                SimEventSender.releaseCommsFocus$lambda$8$lambda$7(simEventSender, focusModificationResult);
                break;
        }
    }
}
