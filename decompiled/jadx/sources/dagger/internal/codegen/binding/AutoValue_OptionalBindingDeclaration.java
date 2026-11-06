package dagger.internal.codegen.binding;

import com.google.errorprone.annotations.concurrent.LazyInit;
import dagger.spi.model.Key;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_OptionalBindingDeclaration extends C$AutoValue_OptionalBindingDeclaration {

    @LazyInit
    private volatile transient int hashCode;

    @LazyInit
    private volatile transient boolean hashCode$Memoized;

    public AutoValue_OptionalBindingDeclaration(Optional<XElement> optional, Optional<XTypeElement> optional2, Key key) {
        super(optional, optional2, key);
    }

    @Override // dagger.internal.codegen.binding.C$AutoValue_OptionalBindingDeclaration, dagger.internal.codegen.binding.OptionalBindingDeclaration
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoValue_OptionalBindingDeclaration) && hashCode() == obj.hashCode() && super.equals(obj);
    }

    @Override // dagger.internal.codegen.binding.C$AutoValue_OptionalBindingDeclaration, dagger.internal.codegen.binding.OptionalBindingDeclaration
    public int hashCode() {
        if (!this.hashCode$Memoized) {
            synchronized (this) {
                try {
                    if (!this.hashCode$Memoized) {
                        this.hashCode = super.hashCode();
                        this.hashCode$Memoized = true;
                    }
                } finally {
                }
            }
        }
        return this.hashCode;
    }
}
