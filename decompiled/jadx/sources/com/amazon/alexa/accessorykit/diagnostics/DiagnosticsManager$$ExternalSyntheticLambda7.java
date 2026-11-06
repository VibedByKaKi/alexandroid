package com.amazon.alexa.accessorykit.diagnostics;

import com.amazon.alexa.accessory.protocol.Common;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DiagnosticsManager$$ExternalSyntheticLambda7 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Serializable f$0;

    public /* synthetic */ DiagnosticsManager$$ExternalSyntheticLambda7(Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = serializable;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$handleTransferResult$10;
        SingleSource lambda$handleP2PPath$20;
        SingleSource lambda$handleCloudPath$13;
        int i = this.$r8$classId;
        Serializable serializable = this.f$0;
        switch (i) {
            case 0:
                lambda$handleTransferResult$10 = DiagnosticsManager.lambda$handleTransferResult$10((AtomicBoolean) serializable, (Throwable) obj);
                return lambda$handleTransferResult$10;
            case 1:
                lambda$handleP2PPath$20 = DiagnosticsAssetTransferHandler.lambda$handleP2PPath$20((Throwable) serializable, (Common.ErrorCode) obj);
                return lambda$handleP2PPath$20;
            default:
                lambda$handleCloudPath$13 = DiagnosticsAssetTransferHandler.lambda$handleCloudPath$13((TimeoutException) serializable, (Common.ErrorCode) obj);
                return lambda$handleCloudPath$13;
        }
    }
}
