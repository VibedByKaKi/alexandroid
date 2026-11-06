package dagger.internal.codegen.writing;

import com.squareup.javapoet.ClassName;
import dagger.internal.codegen.binding.ComponentDescriptor;
import dagger.internal.codegen.javapoet.Expression;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class RequestRepresentation {
    public abstract Expression getDependencyExpression(ClassName className);

    public Expression getDependencyExpressionForComponentMethod(ComponentDescriptor.ComponentMethodDescriptor componentMethodDescriptor, ComponentImplementation componentImplementation) {
        return getDependencyExpression(componentImplementation.name());
    }
}
