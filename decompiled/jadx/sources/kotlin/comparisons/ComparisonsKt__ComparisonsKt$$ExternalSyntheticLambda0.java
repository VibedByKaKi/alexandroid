package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int nullsLast$lambda$0$ComparisonsKt__ComparisonsKt;
        int nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt;
        int compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                nullsLast$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsLast$lambda$0$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
                return nullsLast$lambda$0$ComparisonsKt__ComparisonsKt;
            case 1:
                nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
                return nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt;
            default:
                compareBy$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((Function1[]) obj3, obj, obj2);
                return compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        }
    }
}
