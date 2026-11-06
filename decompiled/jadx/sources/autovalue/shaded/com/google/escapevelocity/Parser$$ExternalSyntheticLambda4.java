package autovalue.shaded.com.google.escapevelocity;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Parser$$ExternalSyntheticLambda4 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Parser$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String lambda$parseStringLiteral$7;
        String lambda$parse$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$parseStringLiteral$7 = Parser.lambda$parseStringLiteral$7();
                return lambda$parseStringLiteral$7;
            default:
                lambda$parse$0 = Parser.lambda$parse$0();
                return lambda$parse$0;
        }
    }
}
