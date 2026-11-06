package dagger.internal.codegen.binding;

import dagger.internal.codegen.extension.Optionals;
import dagger.spi.model.Key;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import java.util.Comparator;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class BindingDeclaration {
    public static final Comparator<BindingDeclaration> COMPARATOR = Comparator.comparing(new BindingGraph$$ExternalSyntheticLambda1(5), Optionals.emptiesLast(Comparator.comparing(new BindingGraph$$ExternalSyntheticLambda1(6)))).thenComparing(new BindingGraph$$ExternalSyntheticLambda1(7), Optionals.emptiesLast(Comparator.comparing(new BindingGraph$$ExternalSyntheticLambda1(8)).thenComparing(new BindingGraph$$ExternalSyntheticLambda1(9))));

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Optional lambda$static$0(BindingDeclaration bindingDeclaration) {
        return bindingDeclaration.contributingModule().isPresent() ? bindingDeclaration.contributingModule() : bindingDeclaration.bindingTypeElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$3(XElement xElement) {
        return XConverters.toJavac(xElement).asType().toString();
    }

    public abstract Optional<XElement> bindingElement();

    public final Optional<XTypeElement> bindingTypeElement() {
        return bindingElement().map(new BindingGraph$$ExternalSyntheticLambda1(4));
    }

    public abstract Optional<XTypeElement> contributingModule();

    public abstract Key key();
}
