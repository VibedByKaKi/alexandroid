package dagger.internal.codegen.binding;

import dagger.spi.model.Key;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.util.Optional;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* renamed from: dagger.internal.codegen.binding.$AutoValue_OptionalBindingDeclaration, reason: invalid class name */
/* loaded from: classes9.dex */
abstract class C$AutoValue_OptionalBindingDeclaration extends OptionalBindingDeclaration {
    private final Optional<XElement> bindingElement;
    private final Optional<XTypeElement> contributingModule;
    private final Key key;

    public C$AutoValue_OptionalBindingDeclaration(Optional<XElement> optional, Optional<XTypeElement> optional2, Key key) {
        if (optional == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null bindingElement");
            throw null;
        }
        this.bindingElement = optional;
        if (optional2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null contributingModule");
            throw null;
        }
        this.contributingModule = optional2;
        if (key != null) {
            this.key = key;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null key");
            throw null;
        }
    }

    @Override // dagger.internal.codegen.binding.BindingDeclaration
    public Optional<XElement> bindingElement() {
        return this.bindingElement;
    }

    @Override // dagger.internal.codegen.binding.BindingDeclaration
    public Optional<XTypeElement> contributingModule() {
        return this.contributingModule;
    }

    @Override // dagger.internal.codegen.binding.OptionalBindingDeclaration
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OptionalBindingDeclaration) {
            OptionalBindingDeclaration optionalBindingDeclaration = (OptionalBindingDeclaration) obj;
            if (this.bindingElement.equals(optionalBindingDeclaration.bindingElement()) && this.contributingModule.equals(optionalBindingDeclaration.contributingModule()) && this.key.equals(optionalBindingDeclaration.key())) {
                return true;
            }
        }
        return false;
    }

    @Override // dagger.internal.codegen.binding.OptionalBindingDeclaration
    public int hashCode() {
        return this.key.hashCode() ^ ((((this.bindingElement.hashCode() ^ 1000003) * 1000003) ^ this.contributingModule.hashCode()) * 1000003);
    }

    @Override // dagger.internal.codegen.binding.OptionalBindingDeclaration, dagger.internal.codegen.binding.BindingDeclaration
    public Key key() {
        return this.key;
    }

    public String toString() {
        return "OptionalBindingDeclaration{bindingElement=" + this.bindingElement + ", contributingModule=" + this.contributingModule + ", key=" + this.key + StringSubstitutor.DEFAULT_VAR_END;
    }
}
