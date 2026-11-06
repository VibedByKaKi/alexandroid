package com.amazon.dee.app.ui.main;

import rx.AsyncEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AuthenticationExceptionHandler$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AsyncEmitter f$0;

    public /* synthetic */ AuthenticationExceptionHandler$$ExternalSyntheticLambda1(int i, AsyncEmitter asyncEmitter) {
        this.$r8$classId = i;
        this.f$0 = asyncEmitter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AsyncEmitter asyncEmitter = this.f$0;
        switch (i) {
            case 0:
                AuthenticationExceptionHandler.lambda$handle$1(asyncEmitter);
                break;
            case 1:
                AuthenticationExceptionHandler.lambda$showRetryOrExitDialog$3(asyncEmitter);
                break;
            case 2:
                AuthenticationExceptionHandler.lambda$showRetryOrExitDialog$4(asyncEmitter);
                break;
            default:
                AuthenticationExceptionHandler.lambda$showRetryOrExitDialog$5(asyncEmitter);
                break;
        }
    }
}
