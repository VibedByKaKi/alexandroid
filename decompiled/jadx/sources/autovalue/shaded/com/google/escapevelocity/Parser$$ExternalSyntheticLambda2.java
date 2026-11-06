package autovalue.shaded.com.google.escapevelocity;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Parser$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ Parser$$ExternalSyntheticLambda2(String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String lambda$parseMacroCall$6;
        String lambda$parseIfOrElseIf$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$parseMacroCall$6 = Parser.lambda$parseMacroCall$6(this.f$0, this.f$1);
                return lambda$parseMacroCall$6;
            default:
                lambda$parseIfOrElseIf$1 = Parser.lambda$parseIfOrElseIf$1(this.f$0, this.f$1);
                return lambda$parseIfOrElseIf$1;
        }
    }
}
