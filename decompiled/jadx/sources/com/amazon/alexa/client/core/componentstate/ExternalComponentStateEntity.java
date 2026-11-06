package com.amazon.alexa.client.core.componentstate;

import com.amazon.alexa.client.core.componentstate.AutoValue_ExternalComponentStateEntity;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.core.messages.PackageName;
import com.google.auto.value.AutoValue;
import java.util.Date;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalComponentStateEntity {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ExternalComponentStateEntity build();

        public abstract Builder setDateUpdated(Date date);

        public abstract Builder setName(Name name);

        public abstract Builder setNamespace(Namespace namespace);

        public abstract Builder setPackageName(PackageName packageName);

        public abstract Builder setPackageVersionCode(int i);

        public abstract Builder setPayload(String str);
    }

    public static Builder builder() {
        return new AutoValue_ExternalComponentStateEntity.Builder();
    }

    @Nullable
    public abstract Date getDateUpdated();

    public abstract Name getName();

    public abstract Namespace getNamespace();

    public abstract PackageName getPackageName();

    public abstract int getPackageVersionCode();

    public abstract String getPayload();
}
