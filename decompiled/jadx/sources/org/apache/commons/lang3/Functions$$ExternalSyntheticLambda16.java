package org.apache.commons.lang3;

import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.FailableIntConsumer;
import org.apache.commons.lang3.function.FailableRunnable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Functions$$ExternalSyntheticLambda16 implements FailableRunnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ Functions$$ExternalSyntheticLambda16(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // org.apache.commons.lang3.function.FailableRunnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Functions.lambda$tryWithResources$1((Functions.FailableRunnable[]) this.f$0, this.f$1);
                break;
            default:
                ((FailableIntConsumer) this.f$0).accept(this.f$1);
                break;
        }
    }
}
