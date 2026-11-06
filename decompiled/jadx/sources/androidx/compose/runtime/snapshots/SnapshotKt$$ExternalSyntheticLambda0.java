package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class SnapshotKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SnapshotKt$$ExternalSyntheticLambda0(int i, Function1 function1, Function1 function12) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit mergedReadObserver$lambda$2;
        Unit mergedWriteObserver$lambda$3;
        Unit mergeObservers$lambda$6;
        switch (this.$r8$classId) {
            case 0:
                mergedReadObserver$lambda$2 = SnapshotKt.mergedReadObserver$lambda$2(this.f$0, this.f$1, obj);
                return mergedReadObserver$lambda$2;
            case 1:
                mergedWriteObserver$lambda$3 = SnapshotKt.mergedWriteObserver$lambda$3(this.f$0, this.f$1, obj);
                return mergedWriteObserver$lambda$3;
            default:
                mergeObservers$lambda$6 = SnapshotObserverKt.mergeObservers$lambda$6(this.f$0, this.f$1, obj);
                return mergeObservers$lambda$6;
        }
    }
}
