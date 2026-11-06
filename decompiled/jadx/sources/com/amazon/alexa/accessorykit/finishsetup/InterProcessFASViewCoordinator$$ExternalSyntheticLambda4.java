package com.amazon.alexa.accessorykit.finishsetup;

import com.amazon.alexa.accessory.internal.util.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class InterProcessFASViewCoordinator$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InterProcessFASViewCoordinator$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.$r8$classId) {
            case 0:
                Logger.e("Unable to observe newly setup devices.", th);
                break;
            default:
                Logger.e("Unable to dismiss views on blocklisted session connect.", th);
                break;
        }
    }
}
