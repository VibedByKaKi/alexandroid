package dagger.internal.codegen.writing;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.ParameterSpec;
import dagger.internal.codegen.base.UniqueNameSet;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class FactoryGenerator$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UniqueNameSet f$0;

    public /* synthetic */ FactoryGenerator$$ExternalSyntheticLambda0(UniqueNameSet uniqueNameSet, int i) {
        this.$r8$classId = i;
        this.f$0 = uniqueNameSet;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        UniqueNameSet uniqueNameSet = this.f$0;
        switch (i) {
            case 0:
                FactoryGenerator.lambda$getMethod$5(uniqueNameSet, (FieldSpec) obj);
                break;
            default:
                FactoryGenerator.lambda$frameworkFields$2(uniqueNameSet, (ParameterSpec) obj);
                break;
        }
    }
}
