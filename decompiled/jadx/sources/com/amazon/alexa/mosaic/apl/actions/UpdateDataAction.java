package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.mosaic.apl.actions.AutoValue_UpdateDataAction;
import com.amazon.alexa.mosaic.apl.enums.DataType;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class UpdateDataAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract UpdateDataAction build();

        public abstract Builder data(String str);

        public Builder type(DataType dataType) {
            return type(dataType.type());
        }

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new AutoValue_UpdateDataAction.Builder();
    }

    public abstract String data();

    public abstract String type();
}
