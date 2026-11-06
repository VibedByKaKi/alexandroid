package com.amazon.alexa.mosaic.apl.actions;

import androidx.annotation.NonNull;
import com.amazon.alexa.mosaic.apl.actions.AutoValue_RenderDocumentViewport;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class RenderDocumentViewport {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract RenderDocumentViewport build();

        public Builder height(@NonNull Integer num, @NonNull Integer num2) {
            minHeight(num);
            maxHeight(num2);
            return this;
        }

        public abstract Builder maxHeight(@NonNull Integer num);

        public abstract Builder maxWidth(@NonNull Integer num);

        public abstract Builder minHeight(@NonNull Integer num);

        public abstract Builder minWidth(@NonNull Integer num);

        public abstract Builder nominalHeight(@NonNull Integer num);

        public abstract Builder nominalWidth(@NonNull Integer num);

        public Builder width(@NonNull Integer num, @NonNull Integer num2) {
            minWidth(num);
            maxWidth(num2);
            return this;
        }
    }

    public static Builder builder() {
        return new AutoValue_RenderDocumentViewport.Builder();
    }

    @Nullable
    public abstract Integer maxHeight();

    @Nullable
    public abstract Integer maxWidth();

    @Nullable
    public abstract Integer minHeight();

    @Nullable
    public abstract Integer minWidth();

    @Nullable
    public abstract Integer nominalHeight();

    @Nullable
    public abstract Integer nominalWidth();
}
