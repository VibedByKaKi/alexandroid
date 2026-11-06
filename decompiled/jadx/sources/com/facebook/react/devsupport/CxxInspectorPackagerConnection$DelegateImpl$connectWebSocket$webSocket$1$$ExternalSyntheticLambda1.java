package com.facebook.react.devsupport;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f$0;

    public /* synthetic */ CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1$$ExternalSyntheticLambda1(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = webSocketDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.f$0;
        switch (i) {
            case 0:
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onClosed$lambda$3(webSocketDelegate);
                break;
            default:
                webSocketDelegate.didOpen();
                break;
        }
    }
}
