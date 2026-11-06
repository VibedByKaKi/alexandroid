package com.amazon.alexa.voice.tta.permissions;

import com.amazon.alexa.voice.tta.permissions.AutoValue_Permission;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class Permission {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Permission build();

        public abstract Builder message(String str);

        public abstract Builder type(PermissionType permissionType);
    }

    public static Builder builder() {
        return new AutoValue_Permission.Builder();
    }

    public abstract String getMessage();

    public abstract PermissionType getType();
}
