package dagger.internal.codegen.compileroption;

import dagger.internal.codegen.compileroption.ProcessingEnvironmentCompilerOptions;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ProcessingEnvironmentCompilerOptions$$ExternalSyntheticLambda6 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ProcessingEnvironmentCompilerOptions$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$reportUseOfDifferentNamesForOption$0;
        switch (this.$r8$classId) {
            case 0:
                return Arrays.stream((ProcessingEnvironmentCompilerOptions.CommandLineOption[]) obj);
            case 1:
                return ((ProcessingEnvironmentCompilerOptions.CommandLineOption) obj).allNames();
            default:
                lambda$reportUseOfDifferentNamesForOption$0 = ProcessingEnvironmentCompilerOptions.lambda$reportUseOfDifferentNamesForOption$0((String) obj);
                return lambda$reportUseOfDifferentNamesForOption$0;
        }
    }
}
