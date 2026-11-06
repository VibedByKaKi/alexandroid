package org.apache.commons.lang3;

import org.apache.commons.lang3.function.FailableBiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ObjectUtils$$ExternalSyntheticLambda0 implements FailableBiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ObjectUtils$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // org.apache.commons.lang3.function.FailableBiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.wait(((Long) obj).longValue(), ((Integer) obj2).intValue());
                break;
            default:
                ((Thread) this.f$0).join(((Long) obj).longValue(), ((Integer) obj2).intValue());
                break;
        }
    }
}
