package com.amazon.dee.app.elements.bridges;

import android.content.DialogInterface;
import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class DeviceStateModule$$ExternalSyntheticLambda1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ DeviceStateModule$$ExternalSyntheticLambda1(int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        Promise promise = this.f$0;
        switch (i2) {
            case 0:
                DeviceStateModule.lambda$requestEnable$1(promise, dialogInterface, i);
                break;
            case 1:
                DeviceStateModule.lambda$requestEnable$3(promise, dialogInterface, i);
                break;
            case 2:
                DeviceStateServiceDelegate.lambda$requestEnable$3(promise, dialogInterface, i);
                break;
            default:
                DeviceStateServiceDelegate.lambda$requestEnable$1(promise, dialogInterface, i);
                break;
        }
    }
}
