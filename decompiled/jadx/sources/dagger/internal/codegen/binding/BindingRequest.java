package dagger.internal.codegen.binding;

import com.google.auto.value.AutoValue;
import dagger.internal.codegen.base.RequestKinds;
import dagger.spi.model.DependencyRequest;
import dagger.spi.model.Key;
import dagger.spi.model.RequestKind;
import dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnv;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class BindingRequest {
    public static BindingRequest bindingRequest(Key key, FrameworkType frameworkType) {
        return new AutoValue_BindingRequest(key, frameworkType.requestKind(), Optional.of(frameworkType));
    }

    public abstract Optional<FrameworkType> frameworkType();

    public final boolean isRequestKind(RequestKind requestKind) {
        return requestKind.equals(requestKind());
    }

    public abstract Key key();

    public final String kindName() {
        return requestKind().toString();
    }

    public abstract RequestKind requestKind();

    public final XType requestedType(XType xType, XProcessingEnv xProcessingEnv) {
        return RequestKinds.requestType(requestKind(), xType, xProcessingEnv);
    }

    public static BindingRequest bindingRequest(Key key, RequestKind requestKind) {
        return new AutoValue_BindingRequest(key, requestKind, FrameworkType.forRequestKind(requestKind));
    }

    public static BindingRequest bindingRequest(DependencyRequest dependencyRequest) {
        return bindingRequest(dependencyRequest.key(), dependencyRequest.kind());
    }
}
