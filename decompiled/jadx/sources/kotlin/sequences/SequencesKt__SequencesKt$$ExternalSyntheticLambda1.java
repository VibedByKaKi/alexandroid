package kotlin.sequences;

import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class SequencesKt__SequencesKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SequencesKt__SequencesKt$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object generateSequence$lambda$0$SequencesKt__SequencesKt;
        boolean isInstance;
        Object requireNoNulls$lambda$0$SequencesKt___SequencesKt;
        boolean filterIndexed$lambda$0$SequencesKt___SequencesKt;
        Object onEach$lambda$0$SequencesKt___SequencesKt;
        boolean contains;
        boolean contains2;
        boolean contains3;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                generateSequence$lambda$0$SequencesKt__SequencesKt = SequencesKt__SequencesKt.generateSequence$lambda$0$SequencesKt__SequencesKt((Function0) obj2, obj);
                return generateSequence$lambda$0$SequencesKt__SequencesKt;
            case 1:
                isInstance = ((Class) obj2).isInstance(obj);
                return Boolean.valueOf(isInstance);
            case 2:
                requireNoNulls$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.requireNoNulls$lambda$0$SequencesKt___SequencesKt((Sequence) obj2, obj);
                return requireNoNulls$lambda$0$SequencesKt___SequencesKt;
            case 3:
                filterIndexed$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterIndexed$lambda$0$SequencesKt___SequencesKt((Function2) obj2, (IndexedValue) obj);
                return Boolean.valueOf(filterIndexed$lambda$0$SequencesKt___SequencesKt);
            case 4:
                onEach$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.onEach$lambda$0$SequencesKt___SequencesKt((Function1) obj2, obj);
                return onEach$lambda$0$SequencesKt___SequencesKt;
            case 5:
                contains = ArraysKt.contains((Object[]) obj2, obj);
                return Boolean.valueOf(contains);
            case 6:
                contains2 = ((Collection) obj2).contains(obj);
                return Boolean.valueOf(contains2);
            default:
                contains3 = ((List) obj2).contains(obj);
                return Boolean.valueOf(contains3);
        }
    }
}
