package kotlin.comparisons;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1 implements Comparator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Comparator f$0;
    public final /* synthetic */ Comparator f$1;

    public /* synthetic */ ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1(Comparator comparator, Comparator comparator2, int i) {
        this.$r8$classId = i;
        this.f$0 = comparator;
        this.f$1 = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int thenDescending$lambda$0$ComparisonsKt__ComparisonsKt;
        int then$lambda$0$ComparisonsKt__ComparisonsKt;
        switch (this.$r8$classId) {
            case 0:
                thenDescending$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.thenDescending$lambda$0$ComparisonsKt__ComparisonsKt(this.f$0, this.f$1, obj, obj2);
                return thenDescending$lambda$0$ComparisonsKt__ComparisonsKt;
            default:
                then$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.then$lambda$0$ComparisonsKt__ComparisonsKt(this.f$0, this.f$1, obj, obj2);
                return then$lambda$0$ComparisonsKt__ComparisonsKt;
        }
    }
}
