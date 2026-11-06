package com.amazon.alexa.client.alexaservice.features.launcher.payload;

import com.amazon.alexa.client.alexaservice.features.launcher.payload.AutoValue_Target;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.C$AutoValue_Target;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Target {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Target build();

        public abstract Builder setCatalogId(String str);

        public abstract Builder setCatalogType(CatalogType catalogType);

        public abstract Builder setIdentifier(TargetIdentifier targetIdentifier);

        public abstract Builder setIdentifierType(IdentifierType identifierType);

        public abstract Builder setLaunchConfig(LaunchConfig launchConfig);

        public abstract Builder setName(String str);

        public abstract Builder setToken(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Target.Builder();
    }

    public static TypeAdapter<Target> typeAdapter(Gson gson) {
        return new AutoValue_Target.GsonTypeAdapter(gson);
    }

    @Nullable
    public abstract String getCatalogId();

    public abstract CatalogType getCatalogType();

    public abstract TargetIdentifier getIdentifier();

    public abstract IdentifierType getIdentifierType();

    @Nullable
    public abstract LaunchConfig getLaunchConfig();

    public abstract String getName();

    public abstract String getToken();
}
