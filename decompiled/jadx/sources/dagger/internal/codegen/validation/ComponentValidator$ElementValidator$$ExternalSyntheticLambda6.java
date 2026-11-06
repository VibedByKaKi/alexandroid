package dagger.internal.codegen.validation;

import dagger.internal.codegen.validation.ComponentValidator;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ComponentValidator$ElementValidator$$ExternalSyntheticLambda6 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComponentValidator.ElementValidator f$0;

    public /* synthetic */ ComponentValidator$ElementValidator$$ExternalSyntheticLambda6(ComponentValidator.ElementValidator elementValidator, int i) {
        this.$r8$classId = i;
        this.f$0 = elementValidator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$validateSubcomponents$9((XTypeElement) obj);
                break;
            case 1:
                this.f$0.reportConflictingEntryPoints((Set) obj);
                break;
            default:
                this.f$0.lambda$validateCreators$0((XTypeElement) obj);
                break;
        }
    }
}
