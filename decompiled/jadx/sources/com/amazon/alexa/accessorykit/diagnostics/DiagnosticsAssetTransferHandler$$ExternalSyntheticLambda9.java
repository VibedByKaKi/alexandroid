package com.amazon.alexa.accessorykit.diagnostics;

import com.amazon.alexa.accessory.protocol.Assettransfer;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DiagnosticsAssetTransferHandler$$ExternalSyntheticLambda9 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DiagnosticsAssetTransferHandler f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DiagnosticsAssetTransferHandler$$ExternalSyntheticLambda9(DiagnosticsAssetTransferHandler diagnosticsAssetTransferHandler, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = diagnosticsAssetTransferHandler;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$handleCloudPath$12;
        SingleSource lambda$handleCloudPath$14;
        SingleSource lambda$handleP2PPath$21;
        switch (this.$r8$classId) {
            case 0:
                lambda$handleCloudPath$12 = this.f$0.lambda$handleCloudPath$12(this.f$1, (Assettransfer.NotifyTransferState) obj);
                return lambda$handleCloudPath$12;
            case 1:
                lambda$handleCloudPath$14 = this.f$0.lambda$handleCloudPath$14(this.f$1, (Throwable) obj);
                return lambda$handleCloudPath$14;
            default:
                lambda$handleP2PPath$21 = this.f$0.lambda$handleP2PPath$21(this.f$1, (Throwable) obj);
                return lambda$handleP2PPath$21;
        }
    }
}
