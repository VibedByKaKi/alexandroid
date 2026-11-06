package dagger.internal.codegen.validation;

import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class InjectValidator$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InjectValidator f$0;

    public /* synthetic */ InjectValidator$$ExternalSyntheticLambda0(InjectValidator injectValidator, int i) {
        this.$r8$classId = i;
        this.f$0 = injectValidator;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ValidationReport validateUncached;
        ValidationReport validateForMembersInjectionInternalUncached;
        int i = this.$r8$classId;
        InjectValidator injectValidator = this.f$0;
        XTypeElement xTypeElement = (XTypeElement) obj;
        switch (i) {
            case 0:
                validateUncached = injectValidator.validateUncached(xTypeElement);
                return validateUncached;
            default:
                validateForMembersInjectionInternalUncached = injectValidator.validateForMembersInjectionInternalUncached(xTypeElement);
                return validateForMembersInjectionInternalUncached;
        }
    }
}
