package com.google.auto.value.processor;

import com.google.auto.value.processor.Nullables;
import java.util.Optional;
import java.util.function.Supplier;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Nullables$NullableFinder$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Nullables.NullableFinder f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Nullables$NullableFinder$$ExternalSyntheticLambda2(Nullables.NullableFinder nullableFinder, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = nullableFinder;
        this.f$1 = obj;
    }

    private final Object get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda2() {
        Optional lambda$visitTypeVariable$1;
        lambda$visitTypeVariable$1 = this.f$0.lambda$visitTypeVariable$1((TypeVariable) this.f$1);
        return lambda$visitTypeVariable$1;
    }

    private final Object get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda3() {
        Optional lambda$visitIntersection$4;
        lambda$visitIntersection$4 = this.f$0.lambda$visitIntersection$4((IntersectionType) this.f$1);
        return lambda$visitIntersection$4;
    }

    private final Object get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda4() {
        Optional lambda$visitWildcard$3;
        lambda$visitWildcard$3 = this.f$0.lambda$visitWildcard$3((WildcardType) this.f$1);
        return lambda$visitWildcard$3;
    }

    private final Object get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda5() {
        Optional lambda$visitArray$2;
        lambda$visitArray$2 = this.f$0.lambda$visitArray$2((ArrayType) this.f$1);
        return lambda$visitArray$2;
    }

    private final Object get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda6() {
        Optional lambda$visitDeclared$0;
        lambda$visitDeclared$0 = this.f$0.lambda$visitDeclared$0((DeclaredType) this.f$1);
        return lambda$visitDeclared$0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda2();
            case 1:
                return get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda3();
            case 2:
                return get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda4();
            case 3:
                return get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda5();
            default:
                return get$com$google$auto$value$processor$Nullables$NullableFinder$$ExternalSyntheticLambda6();
        }
    }
}
