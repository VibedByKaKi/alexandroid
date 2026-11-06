package com.amazon.deecomms.calling.controller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DeviceCallingServiceEventListener$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceCallingServiceEventListener f$0;

    public /* synthetic */ DeviceCallingServiceEventListener$$ExternalSyntheticLambda0(DeviceCallingServiceEventListener deviceCallingServiceEventListener, int i) {
        this.$r8$classId = i;
        this.f$0 = deviceCallingServiceEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DeviceCallingServiceEventListener deviceCallingServiceEventListener = this.f$0;
        switch (i) {
            case 0:
                deviceCallingServiceEventListener.lambda$onAccepted$3();
                break;
            case 1:
                deviceCallingServiceEventListener.lambda$handleIncomingCall$1();
                break;
            case 2:
                deviceCallingServiceEventListener.lambda$onError$5();
                break;
            case 3:
                deviceCallingServiceEventListener.lambda$onError$6();
                break;
            default:
                deviceCallingServiceEventListener.lambda$handleOutgoingCall$0();
                break;
        }
    }
}
