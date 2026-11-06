package com.amazon.apl.viewhost.internal;

import com.amazon.apl.android.ExtensionMediator;
import com.amazon.apl.viewhost.internal.EmbeddedDocumentRequestImpl;
import com.amazon.apl.viewhost.internal.ViewhostImpl;
import com.amazon.apl.viewhost.request.UpdateViewStateRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewhostImpl$$ExternalSyntheticLambda15 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ViewhostImpl$$ExternalSyntheticLambda15(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((UpdateViewStateRequest.UpdateViewStateCallback) obj).onComplete();
                break;
            case 1:
                ((EmbeddedDocumentRequestImpl.AnonymousClass1) obj).lambda$onFailure$1();
                break;
            default:
                ViewhostImpl.AnonymousClass1.lambda$onComplete$0((ExtensionMediator) obj);
                break;
        }
    }
}
