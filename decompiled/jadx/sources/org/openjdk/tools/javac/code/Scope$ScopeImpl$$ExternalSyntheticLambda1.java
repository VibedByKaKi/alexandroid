package org.openjdk.tools.javac.code;

import java.util.Iterator;
import org.openjdk.tools.javac.code.Scope;
import org.openjdk.tools.javac.util.Filter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Scope$ScopeImpl$$ExternalSyntheticLambda1 implements Iterable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Scope f$0;
    public final /* synthetic */ Scope.LookupKind f$1;
    public final /* synthetic */ Filter f$2;

    public /* synthetic */ Scope$ScopeImpl$$ExternalSyntheticLambda1(Scope.CompoundScope compoundScope, Filter filter, Scope.LookupKind lookupKind) {
        this.f$0 = compoundScope;
        this.f$2 = filter;
        this.f$1 = lookupKind;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator lambda$getSymbols$1;
        Iterator lambda$getSymbols$12;
        switch (this.$r8$classId) {
            case 0:
                lambda$getSymbols$1 = ((Scope.ScopeImpl) this.f$0).lambda$getSymbols$1(this.f$1, this.f$2);
                return lambda$getSymbols$1;
            default:
                lambda$getSymbols$12 = ((Scope.CompoundScope) this.f$0).lambda$getSymbols$1(this.f$2, this.f$1);
                return lambda$getSymbols$12;
        }
    }

    public /* synthetic */ Scope$ScopeImpl$$ExternalSyntheticLambda1(Scope.ScopeImpl scopeImpl, Scope.LookupKind lookupKind, Filter filter) {
        this.f$0 = scopeImpl;
        this.f$1 = lookupKind;
        this.f$2 = filter;
    }
}
