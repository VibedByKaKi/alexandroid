package com.amazon.alexa.accessorykit.diagnostics;

import com.amazon.alexa.accessory.protocol.Assettransfer;
import com.amazon.alexa.accessorykit.diagnostics.DiagnosticsAssetTransferHandler;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DiagnosticsAssetTransferHandler$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DiagnosticsAssetTransferHandler$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        boolean lambda$downloadAllBatches$24;
        boolean lambda$awaitTransferSessionStart$7;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$downloadAllBatches$24 = ((DiagnosticsAssetTransferHandler) obj2).lambda$downloadAllBatches$24((Assettransfer.NotifyTransferState) obj);
                return lambda$downloadAllBatches$24;
            default:
                lambda$awaitTransferSessionStart$7 = DiagnosticsAssetTransferHandler.lambda$awaitTransferSessionStart$7((DiagnosticsAssetTransferHandler.SessionEvent) obj2, (Assettransfer.NotifyTransferState) obj);
                return lambda$awaitTransferSessionStart$7;
        }
    }
}
