package dagger.internal.codegen.writing;

import com.squareup.javapoet.CodeBlock;
import dagger.internal.codegen.binding.Binding;
import dagger.internal.codegen.javapoet.TypeNames;
import dagger.internal.codegen.writing.FrameworkFieldInitializer;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class BindingRepresentations {
    @Inject
    public BindingRepresentations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CodeBlock lambda$scope$0(Binding binding, FrameworkFieldInitializer.FrameworkInstanceCreationExpression frameworkInstanceCreationExpression) {
        return CodeBlock.of("$T.provider($L)", binding.scope().get().isReusable() ? TypeNames.SINGLE_CHECK : TypeNames.DOUBLE_CHECK, frameworkInstanceCreationExpression.creationExpression());
    }

    public FrameworkFieldInitializer.FrameworkInstanceCreationExpression scope(Binding binding, FrameworkFieldInitializer.FrameworkInstanceCreationExpression frameworkInstanceCreationExpression) {
        return new BindingRepresentations$$ExternalSyntheticLambda0(binding, frameworkInstanceCreationExpression, 0);
    }
}
