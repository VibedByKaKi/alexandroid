package dagger.spi.model;

import com.google.auto.value.AutoValue;
import dagger.spi.model.AutoValue_DependencyRequest;
import java.util.Optional;

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

        public abstract Builder requestElement(DaggerElement daggerElement);
    }

    public static Builder builder() {
        return new AutoValue_DependencyRequest.Builder().isNullable(false);
    }

    public abstract boolean isNullable();

    public abstract Key key();

    public abstract RequestKind kind();

    public abstract Optional<DaggerElement> requestElement();
}
