package dagger.internal.codegen.xprocessing;

import dagger.internal.codegen.xprocessing.XTypeElements;
import dagger.spi.shaded.androidx.room.compiler.processing.XMethodElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class XTypes$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ XTypes$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$nonObjectSuperclass$0;
        boolean lambda$isEffectivelyPublic$2;
        boolean lambda$getAllNonPrivateInstanceMethods$0;
        boolean lambda$nonObjectSuperclass$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$nonObjectSuperclass$0 = XTypes.lambda$nonObjectSuperclass$0((XType) obj);
                return lambda$nonObjectSuperclass$0;
            case 1:
                lambda$isEffectivelyPublic$2 = XTypeElements.lambda$isEffectivelyPublic$2((XTypeElements.Visibility) obj);
                return lambda$isEffectivelyPublic$2;
            case 2:
                return XTypes.isDeclared((XType) obj);
            case 3:
                lambda$getAllNonPrivateInstanceMethods$0 = XTypeElements.lambda$getAllNonPrivateInstanceMethods$0((XMethodElement) obj);
                return lambda$getAllNonPrivateInstanceMethods$0;
            default:
                lambda$nonObjectSuperclass$1 = XTypes.lambda$nonObjectSuperclass$1((XType) obj);
                return lambda$nonObjectSuperclass$1;
        }
    }
}
