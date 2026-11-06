package com.amazon.alexa.accessory.speech;

import com.amazon.alexa.accessory.protocol.Lcrc;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class LocalCommandCoordinationObserver$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalCommandCoordinationObserver f$0;

    public /* synthetic */ LocalCommandCoordinationObserver$$ExternalSyntheticLambda5(LocalCommandCoordinationObserver localCommandCoordinationObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = localCommandCoordinationObserver;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        LocalCommandCoordinationObserver localCommandCoordinationObserver = this.f$0;
        switch (i) {
            case 0:
                localCommandCoordinationObserver.handleNotifyReserveResponse((Lcrc.NotifyReserveResponse) obj);
                break;
            case 1:
                localCommandCoordinationObserver.handleNotifyResponseStartStatus((Lcrc.NotifyResponseStartStatus) obj);
                break;
            case 2:
                localCommandCoordinationObserver.lambda$initializeDeviceType$0((String) obj);
                break;
            default:
                localCommandCoordinationObserver.lambda$initializeDeviceType$1((Throwable) obj);
                break;
        }
    }
}
