package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class SequencesKt__SequencesKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SequencesKt__SequencesKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterator flatten$lambda$0$SequencesKt__SequencesKt;
        Iterator flatten$lambda$1$SequencesKt__SequencesKt;
        Object flatten$lambda$2$SequencesKt__SequencesKt;
        Object filterIndexed$lambda$1$SequencesKt___SequencesKt;
        boolean filterNotNull$lambda$0$SequencesKt___SequencesKt;
        Object distinct$lambda$0$SequencesKt___SequencesKt;
        switch (this.$r8$classId) {
            case 0:
                flatten$lambda$0$SequencesKt__SequencesKt = SequencesKt__SequencesKt.flatten$lambda$0$SequencesKt__SequencesKt((Sequence) obj);
                return flatten$lambda$0$SequencesKt__SequencesKt;
            case 1:
                flatten$lambda$1$SequencesKt__SequencesKt = SequencesKt__SequencesKt.flatten$lambda$1$SequencesKt__SequencesKt((Iterable) obj);
                return flatten$lambda$1$SequencesKt__SequencesKt;
            case 2:
                flatten$lambda$2$SequencesKt__SequencesKt = SequencesKt__SequencesKt.flatten$lambda$2$SequencesKt__SequencesKt(obj);
                return flatten$lambda$2$SequencesKt__SequencesKt;
            case 3:
                filterIndexed$lambda$1$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterIndexed$lambda$1$SequencesKt___SequencesKt((IndexedValue) obj);
                return filterIndexed$lambda$1$SequencesKt___SequencesKt;
            case 4:
                filterNotNull$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterNotNull$lambda$0$SequencesKt___SequencesKt(obj);
                return Boolean.valueOf(filterNotNull$lambda$0$SequencesKt___SequencesKt);
            default:
                distinct$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.distinct$lambda$0$SequencesKt___SequencesKt(obj);
                return distinct$lambda$0$SequencesKt___SequencesKt;
        }
    }
}
