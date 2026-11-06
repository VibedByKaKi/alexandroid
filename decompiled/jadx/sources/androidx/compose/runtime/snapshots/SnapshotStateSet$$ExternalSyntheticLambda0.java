package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class SnapshotStateSet$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Collection f$0;

    public /* synthetic */ SnapshotStateSet$$ExternalSyntheticLambda0(Collection collection, int i) {
        this.$r8$classId = i;
        this.f$0 = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean retainAll$lambda$5;
        int i = this.$r8$classId;
        Collection collection = this.f$0;
        switch (i) {
            case 0:
                retainAll$lambda$5 = SnapshotStateSet.retainAll$lambda$5(collection, (Set) obj);
                break;
            case 1:
                retainAll$lambda$5 = AbstractPersistentList.retainAll$lambda$3(collection, obj);
                break;
            case 2:
                retainAll$lambda$5 = collection.contains(obj);
                break;
            case 3:
                retainAll$lambda$5 = collection.contains(obj);
                break;
            default:
                retainAll$lambda$5 = SnapshotStateList.retainAll$lambda$10(collection, (List) obj);
                break;
        }
        return Boolean.valueOf(retainAll$lambda$5);
    }
}
