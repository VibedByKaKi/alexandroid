package com.amazon.alexa.sendtoapp.activitycard.model.v1;

import androidx.annotation.Nullable;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.AutoValue_LaunchConfig;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.C$AutoValue_LaunchConfig;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class LaunchConfig {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract LaunchConfig build();

        public abstract Builder isStoreLink(Boolean bool);

        public abstract Builder mustLaunchTargetInGivenApp(Boolean bool);
    }

    public static Builder builder() {
        return new C$AutoValue_LaunchConfig.Builder();
    }

    public static TypeAdapter<LaunchConfig> typeAdapter(Gson gson) {
        return new AutoValue_LaunchConfig.GsonTypeAdapter(gson);
    }

    @Nullable
    public abstract Boolean isStoreLink();

    @Nullable
    public abstract Boolean mustLaunchTargetInGivenApp();
}
