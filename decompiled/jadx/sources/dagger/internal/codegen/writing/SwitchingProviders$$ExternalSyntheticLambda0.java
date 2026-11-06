package dagger.internal.codegen.writing;

import com.google.common.base.Supplier;
import com.squareup.javapoet.TypeSpec;
import dagger.internal.codegen.writing.ComponentRequirementExpressions;
import dagger.internal.codegen.writing.ExperimentalSwitchingProviders;
import dagger.internal.codegen.writing.SwitchingProviders;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class SwitchingProviders$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SwitchingProviders$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        TypeSpec access$600;
        MemberSelect createField;
        TypeSpec access$6002;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                access$600 = SwitchingProviders.SwitchingProviderBuilder.access$600((SwitchingProviders.SwitchingProviderBuilder) obj);
                return access$600;
            case 1:
                createField = ((ComponentRequirementExpressions.AbstractField) obj).createField();
                return createField;
            default:
                access$6002 = ExperimentalSwitchingProviders.SwitchingProviderBuilder.access$600((ExperimentalSwitchingProviders.SwitchingProviderBuilder) obj);
                return access$6002;
        }
    }
}
