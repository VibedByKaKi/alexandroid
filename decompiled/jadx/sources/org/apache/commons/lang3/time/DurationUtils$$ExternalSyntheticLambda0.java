package org.apache.commons.lang3.time;

import java.time.Instant;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableRunnable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class DurationUtils$$ExternalSyntheticLambda0 implements FailableConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DurationUtils$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // org.apache.commons.lang3.function.FailableConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((FailableRunnable) obj2).run();
                break;
            default:
                ((FailableConsumer) obj2).accept((Instant) obj);
                break;
        }
    }
}
