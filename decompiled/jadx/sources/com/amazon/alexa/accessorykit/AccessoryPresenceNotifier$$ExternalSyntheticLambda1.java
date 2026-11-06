package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.Accessory;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryPresenceNotifier$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryPresenceNotifier f$0;

    public /* synthetic */ AccessoryPresenceNotifier$$ExternalSyntheticLambda1(AccessoryPresenceNotifier accessoryPresenceNotifier, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryPresenceNotifier;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AccessoryPresenceNotifier accessoryPresenceNotifier = this.f$0;
        switch (i) {
            case 0:
                accessoryPresenceNotifier.lambda$observerClientSessions$5((Accessory) obj);
                break;
            default:
                accessoryPresenceNotifier.lambda$observerClientDevices$3((List) obj);
                break;
        }
    }
}
