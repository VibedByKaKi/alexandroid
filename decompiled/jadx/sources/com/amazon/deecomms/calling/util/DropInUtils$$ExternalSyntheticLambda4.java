package com.amazon.deecomms.calling.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import com.amazon.alexa.smarthomecameras.turbomodule.LiveViewControllerModule;
import com.amazon.dee.app.elements.bridges.DeviceStateModule;
import com.amazon.dee.app.elements.bridges.DeviceStateServiceDelegate;
import com.amazon.deecomms.common.ApplicationManager;
import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DropInUtils$$ExternalSyntheticLambda4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ DropInUtils$$ExternalSyntheticLambda4(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                DropInUtils.lambda$showProfileDialog$4((Context) this.f$0, (String) this.f$1, (ApplicationManager) this.f$2, dialogInterface, i);
                break;
            case 1:
                LiveViewControllerModule.requestMicrophonePermission$lambda$0$0((SharedPreferences) this.f$0, (LiveViewControllerModule) this.f$1, (Activity) this.f$2, dialogInterface, i);
                break;
            case 2:
                ((DeviceStateModule) this.f$0).lambda$requestEnable$0((Intent) this.f$1, (Promise) this.f$2, dialogInterface, i);
                break;
            default:
                ((DeviceStateServiceDelegate) this.f$0).lambda$requestEnable$0((Intent) this.f$1, (Promise) this.f$2, dialogInterface, i);
                break;
        }
    }
}
