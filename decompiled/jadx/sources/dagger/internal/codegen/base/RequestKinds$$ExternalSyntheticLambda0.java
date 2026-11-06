package dagger.internal.codegen.base;

import com.squareup.javapoet.ClassName;
import dagger.internal.codegen.xprocessing.XTypes;
import dagger.spi.model.RequestKind;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class RequestKinds$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ XType f$0;

    public /* synthetic */ RequestKinds$$ExternalSyntheticLambda0(XType xType, int i) {
        this.$r8$classId = i;
        this.f$0 = xType;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getRequestKind$0;
        boolean isTypeOf;
        int i = this.$r8$classId;
        XType xType = this.f$0;
        switch (i) {
            case 0:
                lambda$getRequestKind$0 = RequestKinds.lambda$getRequestKind$0(xType, (RequestKind) obj);
                return lambda$getRequestKind$0;
            default:
                isTypeOf = XTypes.isTypeOf(xType, (ClassName) obj);
                return isTypeOf;
        }
    }
}
