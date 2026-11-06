package com.amazon.alexa.accessorykit.diagnostics;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Supplier;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DiagnosticsManager$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DiagnosticsManager f$0;
    public final /* synthetic */ Serializable f$1;

    public /* synthetic */ DiagnosticsManager$$ExternalSyntheticLambda0(DiagnosticsManager diagnosticsManager, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = diagnosticsManager;
        this.f$1 = serializable;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource lambda$requestDiagnostics$2;
        CompletableSource lambda$startDiagnostics$3;
        CompletableSource lambda$handleTransferResult$11;
        switch (this.$r8$classId) {
            case 0:
                lambda$requestDiagnostics$2 = this.f$0.lambda$requestDiagnostics$2((String) this.f$1);
                return lambda$requestDiagnostics$2;
            case 1:
                lambda$startDiagnostics$3 = this.f$0.lambda$startDiagnostics$3((String) this.f$1);
                return lambda$startDiagnostics$3;
            default:
                lambda$handleTransferResult$11 = this.f$0.lambda$handleTransferResult$11((AtomicBoolean) this.f$1);
                return lambda$handleTransferResult$11;
        }
    }
}
