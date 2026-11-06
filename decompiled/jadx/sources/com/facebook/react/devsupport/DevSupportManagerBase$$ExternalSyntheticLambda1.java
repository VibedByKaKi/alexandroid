package com.facebook.react.devsupport;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DevSupportManagerBase$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DevSupportManagerBase$$ExternalSyntheticLambda1(DevSupportManagerBase devSupportManagerBase, PackagerStatusCallback packagerStatusCallback) {
        this.$r8$classId = 4;
        this.f$1 = devSupportManagerBase;
        this.f$0 = packagerStatusCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DevSupportManagerBase.reportBundleLoadingFailure$lambda$23((Exception) this.f$0, (DevSupportManagerBase) this.f$1);
                break;
            case 1:
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onFailure$lambda$0((Throwable) this.f$0, (CxxInspectorPackagerConnection.WebSocketDelegate) this.f$1);
                break;
            case 2:
                ((CxxInspectorPackagerConnection.WebSocketDelegate) this.f$0).didReceiveMessage((String) this.f$1);
                break;
            case 3:
                ((DefaultDevLoadingViewImplementation) this.f$0).showInternal((String) this.f$1);
                break;
            default:
                DevSupportManagerBase.isPackagerRunning$lambda$22((DevSupportManagerBase) this.f$1, (PackagerStatusCallback) this.f$0);
                break;
        }
    }

    public /* synthetic */ DevSupportManagerBase$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
