package dagger.internal.codegen.writing;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.internal.codegen.binding.FrameworkType;
import dagger.internal.codegen.javapoet.TypeNames;
import dagger.internal.codegen.writing.FrameworkFieldInitializer;
import dagger.spi.model.RequestKind;
import java.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ProducerFromProviderCreationExpression implements FrameworkFieldInitializer.FrameworkInstanceCreationExpression {
    private final RequestRepresentation providerRequestRepresentation;
    private final ClassName requestingClass;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AssistedFactory
    public interface Factory {
        ProducerFromProviderCreationExpression create(RequestRepresentation requestRepresentation, ClassName className);
    }

    @AssistedInject
    public ProducerFromProviderCreationExpression(@Assisted RequestRepresentation requestRepresentation, @Assisted ClassName className) {
        this.providerRequestRepresentation = requestRepresentation;
        this.requestingClass = className;
    }

    @Override // dagger.internal.codegen.writing.FrameworkFieldInitializer.FrameworkInstanceCreationExpression
    public Optional<ClassName> alternativeFrameworkClass() {
        return Optional.of(TypeNames.PRODUCER);
    }

    @Override // dagger.internal.codegen.writing.FrameworkFieldInitializer.FrameworkInstanceCreationExpression
    public CodeBlock creationExpression() {
        return FrameworkType.PROVIDER.to(RequestKind.PRODUCER, this.providerRequestRepresentation.getDependencyExpression(this.requestingClass).codeBlock());
    }
}
