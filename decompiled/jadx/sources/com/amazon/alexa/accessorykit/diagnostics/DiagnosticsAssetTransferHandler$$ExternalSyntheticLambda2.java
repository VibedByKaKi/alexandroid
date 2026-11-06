package com.amazon.alexa.accessorykit.diagnostics;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DiagnosticsAssetTransferHandler$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DiagnosticsAssetTransferHandler f$0;

    public /* synthetic */ DiagnosticsAssetTransferHandler$$ExternalSyntheticLambda2(DiagnosticsAssetTransferHandler diagnosticsAssetTransferHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = diagnosticsAssetTransferHandler;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DiagnosticsAssetTransferHandler diagnosticsAssetTransferHandler = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                diagnosticsAssetTransferHandler.lambda$downloadAllBatches$23(th);
                break;
            case 1:
                diagnosticsAssetTransferHandler.lambda$startDiagnosticTransfer$1(th);
                break;
            default:
                diagnosticsAssetTransferHandler.lambda$handleCloudPath$10(th);
                break;
        }
    }
}
