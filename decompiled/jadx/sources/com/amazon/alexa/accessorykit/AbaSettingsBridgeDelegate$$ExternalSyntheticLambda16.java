package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.Accessory;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AbaSettingsBridgeDelegate$$ExternalSyntheticLambda16 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GlobalSessionListener f$0;

    public /* synthetic */ AbaSettingsBridgeDelegate$$ExternalSyntheticLambda16(GlobalSessionListener globalSessionListener, int i) {
        this.$r8$classId = i;
        this.f$0 = globalSessionListener;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        GlobalSessionListener globalSessionListener = this.f$0;
        Accessory accessory = (Accessory) obj;
        switch (i) {
            case 0:
                globalSessionListener.onAccessorySessionConnected(accessory);
                break;
            default:
                globalSessionListener.onAccessorySessionReleased(accessory);
                break;
        }
    }
}
