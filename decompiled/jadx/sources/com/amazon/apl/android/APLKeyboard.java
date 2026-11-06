package com.amazon.apl.android;

import androidx.annotation.NonNull;
import com.amazon.apl.android.AutoValue_APLKeyboard;
import com.amazon.apl.enums.KeyHandlerType;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class APLKeyboard {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder alt(boolean z);

        public abstract APLKeyboard build();

        public abstract Builder code(String str);

        public abstract Builder ctrl(boolean z);

        public abstract Builder key(String str);

        public abstract Builder meta(boolean z);

        public abstract Builder repeat(boolean z);

        public abstract Builder shift(boolean z);

        public abstract Builder type(KeyHandlerType keyHandlerType);
    }

    public static Builder builder() {
        return new AutoValue_APLKeyboard.Builder().repeat(false).shift(false).alt(false).ctrl(false).meta(false);
    }

    public abstract boolean alt();

    @NonNull
    public abstract String code();

    public abstract boolean ctrl();

    @NonNull
    public abstract String key();

    public abstract boolean meta();

    public abstract boolean repeat();

    public abstract boolean shift();

    @NonNull
    public abstract KeyHandlerType type();
}
