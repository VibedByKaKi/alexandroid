package org.apache.commons.lang3;

import org.apache.commons.lang3.function.FailableBiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ThreadUtils$$ExternalSyntheticLambda1 implements FailableBiConsumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ThreadUtils$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.lang3.function.FailableBiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Thread.sleep(((Long) obj).longValue(), ((Integer) obj2).intValue());
                break;
            default:
                AppendableJoiner.lambda$new$0((Appendable) obj, obj2);
                break;
        }
    }
}
