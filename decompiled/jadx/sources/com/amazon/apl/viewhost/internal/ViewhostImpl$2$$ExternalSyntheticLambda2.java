package com.amazon.apl.viewhost.internal;

import com.amazon.apl.viewhost.internal.ViewhostImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewhostImpl$2$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DocumentHandleImpl f$0;

    public /* synthetic */ ViewhostImpl$2$$ExternalSyntheticLambda2(DocumentHandleImpl documentHandleImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = documentHandleImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DocumentHandleImpl documentHandleImpl = this.f$0;
        switch (i) {
            case 0:
                ViewhostImpl.AnonymousClass2.lambda$onFailure$2(documentHandleImpl);
                break;
            default:
                documentHandleImpl.lambda$finish$21();
                break;
        }
    }
}
