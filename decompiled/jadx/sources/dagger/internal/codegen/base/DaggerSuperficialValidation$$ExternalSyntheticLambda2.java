package dagger.internal.codegen.base;

import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotation;
import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotationValue;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class DaggerSuperficialValidation$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DaggerSuperficialValidation f$0;

    public /* synthetic */ DaggerSuperficialValidation$$ExternalSyntheticLambda2(DaggerSuperficialValidation daggerSuperficialValidation, int i) {
        this.$r8$classId = i;
        this.f$0 = daggerSuperficialValidation;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DaggerSuperficialValidation daggerSuperficialValidation = this.f$0;
        switch (i) {
            case 0:
                daggerSuperficialValidation.validateElement((XElement) obj);
                break;
            case 1:
                daggerSuperficialValidation.lambda$validateTypeHierarchy$1((XType) obj);
                break;
            case 2:
                daggerSuperficialValidation.validateAnnotation((XAnnotation) obj);
                break;
            case 3:
                daggerSuperficialValidation.lambda$validateType$3((XType) obj);
                break;
            default:
                daggerSuperficialValidation.validateAnnotationValue((XAnnotationValue) obj);
                break;
        }
    }
}
