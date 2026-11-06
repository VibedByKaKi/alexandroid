package kotlin.text;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class StringsKt__StringsKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ StringsKt__StringsKt$$ExternalSyntheticLambda3(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair rangesDelimitedBy$lambda$0$StringsKt__StringsKt;
        Pair rangesDelimitedBy$lambda$1$StringsKt__StringsKt;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                rangesDelimitedBy$lambda$0$StringsKt__StringsKt = StringsKt__StringsKt.rangesDelimitedBy$lambda$0$StringsKt__StringsKt((char[]) this.f$0, this.f$1, (CharSequence) obj, intValue);
                return rangesDelimitedBy$lambda$0$StringsKt__StringsKt;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                rangesDelimitedBy$lambda$1$StringsKt__StringsKt = StringsKt__StringsKt.rangesDelimitedBy$lambda$1$StringsKt__StringsKt((List) this.f$0, this.f$1, (CharSequence) obj, intValue2);
                return rangesDelimitedBy$lambda$1$StringsKt__StringsKt;
        }
    }
}
