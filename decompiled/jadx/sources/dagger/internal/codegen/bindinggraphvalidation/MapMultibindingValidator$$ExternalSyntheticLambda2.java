package dagger.internal.codegen.bindinggraphvalidation;

import com.google.common.base.Predicate;
import dagger.internal.codegen.binding.BindingDeclaration;
import dagger.spi.model.Key;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MapMultibindingValidator$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MapMultibindingValidator$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean lambda$mapMultibindings$3;
        boolean lambda$incompatibleBindingsMessage$13;
        switch (this.$r8$classId) {
            case 0:
                lambda$mapMultibindings$3 = MapMultibindingValidator.lambda$mapMultibindings$3((Key) obj);
                return lambda$mapMultibindings$3;
            default:
                lambda$incompatibleBindingsMessage$13 = DuplicateBindingsValidator.lambda$incompatibleBindingsMessage$13((BindingDeclaration) obj);
                return lambda$incompatibleBindingsMessage$13;
        }
    }
}
