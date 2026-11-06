package dagger.internal.codegen.validation;

import dagger.internal.codegen.validation.BindingElementValidator;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class BindingElementValidator$ElementValidator$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BindingElementValidator.ElementValidator f$0;

    public /* synthetic */ BindingElementValidator$ElementValidator$$ExternalSyntheticLambda0(BindingElementValidator.ElementValidator elementValidator, int i) {
        this.$r8$classId = i;
        this.f$0 = elementValidator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        BindingElementValidator.ElementValidator elementValidator = this.f$0;
        XType xType = (XType) obj;
        switch (i) {
            case 0:
                elementValidator.checkSetValuesType(xType);
                break;
            default:
                elementValidator.checkKeyType(xType);
                break;
        }
    }
}
