package dagger.internal.codegen.base;

import com.google.common.base.Preconditions;
import com.squareup.javapoet.ClassName;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XMessager;
import java.util.Optional;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class SourceFileGenerationException extends Exception {
    private final XElement associatedElement;

    public SourceFileGenerationException(Optional<ClassName> optional, Throwable th, XElement xElement) {
        super(createMessage(optional, th.getMessage()), th);
        this.associatedElement = (XElement) Preconditions.checkNotNull(xElement);
    }

    private static String createMessage(Optional<ClassName> optional, String str) {
        return String.format("Could not generate %s: %s.", optional.isPresent() ? optional.get() : "unknown file", str);
    }

    public void printMessageTo(XMessager xMessager) {
        xMessager.printMessage(Diagnostic.Kind.ERROR, getMessage(), this.associatedElement);
    }
}
