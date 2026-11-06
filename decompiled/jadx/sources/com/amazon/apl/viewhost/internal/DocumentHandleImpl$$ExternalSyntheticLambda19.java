package com.amazon.apl.viewhost.internal;

import com.amazon.apl.viewhost.DocumentHandle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class DocumentHandleImpl$$ExternalSyntheticLambda19 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DocumentHandle.DocumentSettingsCallback f$0;

    public /* synthetic */ DocumentHandleImpl$$ExternalSyntheticLambda19(DocumentHandle.DocumentSettingsCallback documentSettingsCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = documentSettingsCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DocumentHandle.DocumentSettingsCallback documentSettingsCallback = this.f$0;
        switch (i) {
            case 0:
                documentSettingsCallback.onFailure("Document is no longer valid");
                break;
            case 1:
                documentSettingsCallback.onFailure("Document not valid anymore");
                break;
            default:
                documentSettingsCallback.onFailure("unexpected serialization failure");
                break;
        }
    }
}
