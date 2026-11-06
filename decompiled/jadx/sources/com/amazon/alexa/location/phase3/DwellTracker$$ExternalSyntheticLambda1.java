package com.amazon.alexa.location.phase3;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DwellTracker$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DwellTracker f$0;

    public /* synthetic */ DwellTracker$$ExternalSyntheticLambda1(DwellTracker dwellTracker, int i) {
        this.$r8$classId = i;
        this.f$0 = dwellTracker;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DwellTracker dwellTracker = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                dwellTracker.lambda$updateDwellSession$1(th);
                break;
            case 1:
                dwellTracker.lambda$updateDwellSession$3(th);
                break;
            default:
                dwellTracker.lambda$resetCurrentDwellSession$5(th);
                break;
        }
    }
}
