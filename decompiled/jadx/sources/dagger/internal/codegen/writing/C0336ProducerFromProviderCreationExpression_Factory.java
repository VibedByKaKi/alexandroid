package dagger.internal.codegen.writing;

import com.squareup.javapoet.ClassName;
import dagger.internal.DaggerGenerated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* renamed from: dagger.internal.codegen.writing.ProducerFromProviderCreationExpression_Factory, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0336ProducerFromProviderCreationExpression_Factory {
    public static C0336ProducerFromProviderCreationExpression_Factory create() {
        return new C0336ProducerFromProviderCreationExpression_Factory();
    }

    public static ProducerFromProviderCreationExpression newInstance(Object obj, ClassName className) {
        return new ProducerFromProviderCreationExpression((RequestRepresentation) obj, className);
    }

    public ProducerFromProviderCreationExpression get(RequestRepresentation requestRepresentation, ClassName className) {
        return newInstance(requestRepresentation, className);
    }
}
