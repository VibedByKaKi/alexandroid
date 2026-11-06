package com.amazon.alexa.location.phase3;

import com.amazon.alexa.location.TriggeringGeofenceInfo;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Phase3LocationService$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Phase3LocationService f$0;

    public /* synthetic */ Phase3LocationService$$ExternalSyntheticLambda3(Phase3LocationService phase3LocationService, int i) {
        this.$r8$classId = i;
        this.f$0 = phase3LocationService;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Phase3LocationService phase3LocationService = this.f$0;
        switch (i) {
            case 0:
                phase3LocationService.lambda$startPhase3$5((TriggeringGeofenceInfo) obj);
                break;
            case 1:
                phase3LocationService.lambda$startPhase3$6((Throwable) obj);
                break;
            case 2:
                phase3LocationService.transitionConfiguration((Configuration) obj);
                break;
            default:
                phase3LocationService.lambda$start$0((Throwable) obj);
                break;
        }
    }
}
