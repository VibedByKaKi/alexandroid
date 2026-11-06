package com.amazon.alexa.accessory.avsclient;

import com.amazon.alexa.accessory.avsclient.AccessoryDiagnostics;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.io.Source;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryDiagnostics$$ExternalSyntheticLambda1 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessoryDiagnostics$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                AccessoryDiagnostics.lambda$uploadAccessoryClientDiagnostics$16((AccessoryDiagnostics.AccessoryDevice) obj);
                break;
            case 1:
                AccessoryDiagnostics.lambda$uploadAccessoryDiagnostics$15((AccessoryDiagnostics.AccessoryDevice) obj);
                break;
            case 2:
                AccessoryDiagnostics.lambda$uploadApplicationLogs$13((AccessoryDiagnostics.AccessoryDevice) obj);
                break;
            default:
                IOUtils.closeQuietly((Source) obj);
                break;
        }
    }
}
