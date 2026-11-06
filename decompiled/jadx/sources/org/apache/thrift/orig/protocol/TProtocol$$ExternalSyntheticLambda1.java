package org.apache.thrift.orig.protocol;

import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import org.apache.thrift.orig.protocol.TProtocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class TProtocol$$ExternalSyntheticLambda1 implements TProtocol.ReadCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IntFunction f$0;
    public final /* synthetic */ TProtocol.ReadCollectionCallback f$1;

    public /* synthetic */ TProtocol$$ExternalSyntheticLambda1(IntFunction intFunction, TProtocol.ReadCollectionCallback readCollectionCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = intFunction;
        this.f$1 = readCollectionCallback;
    }

    @Override // org.apache.thrift.orig.protocol.TProtocol.ReadCallback
    public final Object accept(Object obj) {
        Set lambda$readSet$2;
        List lambda$readList$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$readSet$2 = TProtocol.lambda$readSet$2(this.f$0, this.f$1, (TSet) obj);
                return lambda$readSet$2;
            default:
                lambda$readList$1 = TProtocol.lambda$readList$1(this.f$0, this.f$1, (TList) obj);
                return lambda$readList$1;
        }
    }
}
