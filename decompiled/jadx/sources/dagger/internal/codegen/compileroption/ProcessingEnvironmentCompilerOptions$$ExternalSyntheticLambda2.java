package dagger.internal.codegen.compileroption;

import com.google.common.collect.ImmutableMap;
import dagger.internal.codegen.compileroption.ProcessingEnvironmentCompilerOptions;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ProcessingEnvironmentCompilerOptions$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProcessingEnvironmentCompilerOptions f$0;

    public /* synthetic */ ProcessingEnvironmentCompilerOptions$$ExternalSyntheticLambda2(ProcessingEnvironmentCompilerOptions processingEnvironmentCompilerOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = processingEnvironmentCompilerOptions;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ImmutableMap parseOptionWithAllNamesUncached;
        Enum parseOptionUncached;
        int i = this.$r8$classId;
        ProcessingEnvironmentCompilerOptions processingEnvironmentCompilerOptions = this.f$0;
        ProcessingEnvironmentCompilerOptions.EnumOption enumOption = (ProcessingEnvironmentCompilerOptions.EnumOption) obj;
        switch (i) {
            case 0:
                parseOptionWithAllNamesUncached = processingEnvironmentCompilerOptions.parseOptionWithAllNamesUncached(enumOption);
                return parseOptionWithAllNamesUncached;
            default:
                parseOptionUncached = processingEnvironmentCompilerOptions.parseOptionUncached(enumOption);
                return parseOptionUncached;
        }
    }
}
