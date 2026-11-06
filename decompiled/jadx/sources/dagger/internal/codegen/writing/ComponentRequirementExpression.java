package dagger.internal.codegen.writing;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
interface ComponentRequirementExpression {
    CodeBlock getExpression(ClassName className);

    default CodeBlock getExpressionDuringInitialization(ClassName className) {
        return getExpression(className);
    }

    default CodeBlock getModifiableModuleMethodExpression(ClassName className) {
        return CodeBlock.of("return $L", getExpression(className));
    }
}
