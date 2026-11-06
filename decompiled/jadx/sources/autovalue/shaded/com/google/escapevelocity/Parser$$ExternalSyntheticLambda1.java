package autovalue.shaded.com.google.escapevelocity;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Parser$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ Parser$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String lambda$parseDefine$4;
        String lambda$parseMacroDefinition$5;
        String lambda$parseForEach$3;
        String lambda$parseIfOrElseIf$2;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                lambda$parseDefine$4 = Parser.lambda$parseDefine$4(i2);
                return lambda$parseDefine$4;
            case 1:
                lambda$parseMacroDefinition$5 = Parser.lambda$parseMacroDefinition$5(i2);
                return lambda$parseMacroDefinition$5;
            case 2:
                lambda$parseForEach$3 = Parser.lambda$parseForEach$3(i2);
                return lambda$parseForEach$3;
            default:
                lambda$parseIfOrElseIf$2 = Parser.lambda$parseIfOrElseIf$2(i2);
                return lambda$parseIfOrElseIf$2;
        }
    }
}
