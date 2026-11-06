package org.apache.commons.lang3;

import java.util.function.Function;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.FailableConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Functions$$ExternalSyntheticLambda8 implements FailableConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Functions$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // org.apache.commons.lang3.function.FailableConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Functions.FailableConsumer) obj2).accept((Throwable) obj);
                break;
            default:
                ((Function) obj2).apply(obj);
                break;
        }
    }
}
