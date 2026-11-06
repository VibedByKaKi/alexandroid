package dagger.internal.codegen.validation;

import dagger.internal.codegen.validation.ComponentCreatorValidator;
import dagger.internal.codegen.validation.ComponentValidator;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.util.Collection;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ComponentValidator$ElementValidator$$ExternalSyntheticLambda5 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ComponentValidator$ElementValidator$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((ComponentValidator.ElementValidator) obj3).lambda$validateSubcomponentReferences$8((XTypeElement) obj, (Collection) obj2);
                break;
            case 1:
                ((ComponentValidator.ElementValidator) obj3).lambda$validateClassMethodName$2((String) obj, (String) obj2);
                break;
            default:
                ((ComponentCreatorValidator.ElementValidator) obj3).lambda$validateClassMethodName$0((String) obj, (String) obj2);
                break;
        }
    }
}
