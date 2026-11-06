package com.amazon.dee.app.ui.web;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.dee.app.ui.web.AccountManagementBridge;
import com.amazon.dee.app.ui.web.OOBEBridge;
import com.amazon.dee.app.ui.web.PermissionsBridge;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AlexaWebView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AlexaWebView$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((AlexaWebView) this.f$0).lambda$selectLibrary$1((HouseholdLibraryInfo) this.f$1);
                break;
            case 1:
                ((AccountManagementBridge.SignInMethod) this.f$0).lambda$execute$2((JavaScriptResponse) this.f$1);
                break;
            case 2:
                ((OOBEBridge.HasTachyonMethod) this.f$0).lambda$execute$0((JavaScriptResponse) this.f$1);
                break;
            case 3:
                ((OOBEBridge.StartTachyonOOBEMethod) this.f$0).lambda$launchCommsOobeIfNeeded$2((JavaScriptResponse) this.f$1);
                break;
            case 4:
                ((PermissionsBridge.CheckLocationPermission) this.f$0).lambda$presentPrimerDialogAndRequestLocationPermission$1((JSONObject) this.f$1);
                break;
            case 5:
                ((AlexaWebView) this.f$0).lambda$selectDevice$0((DeviceInfo) this.f$1);
                break;
            default:
                ((EventBusWebViewBridge) this.f$0).lambda$onTCommMessage$0((Message) this.f$1);
                break;
        }
    }
}
