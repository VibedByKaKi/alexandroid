package com.amazon.matter.commission;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class SystemCommissioningClient$$ExternalSyntheticLambda0 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SystemCommissioningClient f$0;

    public /* synthetic */ SystemCommissioningClient$$ExternalSyntheticLambda0(SystemCommissioningClient systemCommissioningClient, int i) {
        this.$r8$classId = i;
        this.f$0 = systemCommissioningClient;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = this.$r8$classId;
        SystemCommissioningClient systemCommissioningClient = this.f$0;
        switch (i) {
            case 1:
                systemCommissioningClient.lambda$suppressSystemCommissioningOverlay$3(exc);
                break;
            default:
                systemCommissioningClient.lambda$suppressSystemCommissioningOverlayTask$1(exc);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.$r8$classId;
        SystemCommissioningClient systemCommissioningClient = this.f$0;
        Void r2 = (Void) obj;
        switch (i) {
            case 0:
                systemCommissioningClient.lambda$suppressSystemCommissioningOverlay$2(r2);
                break;
            default:
                systemCommissioningClient.lambda$suppressSystemCommissioningOverlayTask$0(r2);
                break;
        }
    }
}
