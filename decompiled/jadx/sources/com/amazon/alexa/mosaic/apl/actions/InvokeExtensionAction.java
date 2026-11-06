package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.mosaic.apl.actions.AutoValue_InvokeExtensionAction;
import com.google.auto.value.AutoValue;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class InvokeExtensionAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract InvokeExtensionAction build();

        public abstract Builder data(Map<String, Object> map);

        public abstract Builder fastMode(boolean z);

        public abstract Builder name(String str);

        public abstract Builder uri(String str);
    }

    public static Builder builder() {
        return new AutoValue_InvokeExtensionAction.Builder().fastMode(true);
    }

    @Nullable
    public abstract Map<String, Object> data();

    public abstract boolean fastMode();

    public abstract String name();

    public abstract String uri();
}
