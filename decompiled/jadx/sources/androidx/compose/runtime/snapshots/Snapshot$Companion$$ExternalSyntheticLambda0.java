package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Snapshot$Companion$$ExternalSyntheticLambda0 implements ObserverHandle {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Snapshot$Companion$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Snapshot.Companion.registerApplyObserver$lambda$3((Function2) obj);
                break;
            case 1:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$6((Function1) obj);
                break;
            default:
                SnapshotObserverKt.observeSnapshots$lambda$3((SnapshotObserver) obj);
                break;
        }
    }
}
