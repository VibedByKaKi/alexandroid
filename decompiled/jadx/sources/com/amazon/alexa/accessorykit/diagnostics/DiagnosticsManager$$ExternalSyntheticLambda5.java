package com.amazon.alexa.accessorykit.diagnostics;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DiagnosticsManager$$ExternalSyntheticLambda5 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DiagnosticsManager f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DiagnosticsManager$$ExternalSyntheticLambda5(DiagnosticsManager diagnosticsManager, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = diagnosticsManager;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handleTransferResult$8(this.f$1);
                break;
            default:
                this.f$0.lambda$requestDiagnostics$0(this.f$1);
                break;
        }
    }
}
