package org.openjdk.tools.javac.code;

import org.openjdk.tools.javac.code.Symbol;
import org.openjdk.tools.javac.util.Filter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Symbol$MethodSymbol$$ExternalSyntheticLambda0 implements Filter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Symbol$MethodSymbol$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // org.openjdk.tools.javac.util.Filter
    public final boolean accepts(Object obj) {
        boolean lambda$static$0;
        boolean lambda$getEnclosedElements$0;
        Symbol symbol = (Symbol) obj;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = Symbol.MethodSymbol.lambda$static$0(symbol);
                return lambda$static$0;
            default:
                lambda$getEnclosedElements$0 = Symbol.ModuleSymbol.lambda$getEnclosedElements$0(symbol);
                return lambda$getEnclosedElements$0;
        }
    }
}
