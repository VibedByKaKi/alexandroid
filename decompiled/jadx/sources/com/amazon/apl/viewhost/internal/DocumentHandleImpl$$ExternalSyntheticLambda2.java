package com.amazon.apl.viewhost.internal;

import com.amazon.apl.viewhost.request.ExecuteCommandsRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class DocumentHandleImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExecuteCommandsRequest.ExecuteCommandsCallback f$0;

    public /* synthetic */ DocumentHandleImpl$$ExternalSyntheticLambda2(ExecuteCommandsRequest.ExecuteCommandsCallback executeCommandsCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = executeCommandsCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ExecuteCommandsRequest.ExecuteCommandsCallback executeCommandsCallback = this.f$0;
        switch (i) {
            case 0:
                executeCommandsCallback.onComplete();
                break;
            case 1:
                executeCommandsCallback.onTerminated();
                break;
            default:
                executeCommandsCallback.onComplete();
                break;
        }
    }
}
