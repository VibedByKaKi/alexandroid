package dagger.model;

import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.model.AutoValue_DependencyRequest;
import java.util.Optional;
import javax.lang.model.element.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class DependencyRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DependencyRequest build();

        public abstract Builder isNullable(boolean z);

        public abstract Builder key(Key key);

        public abstract Builder kind(RequestKind requestKind);

        @CanIgnoreReturnValue
        public abstract Builder requestElement(Element element);
    }

    public static Builder builder() {
        return new AutoValue_DependencyRequest.Builder().isNullable(false);
    }

    public abstract boolean isNullable();

    public abstract Key key();

    public abstract RequestKind kind();

    public abstract Optional<Element> requestElement();
}
