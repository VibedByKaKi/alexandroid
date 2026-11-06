package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class QuirkSettings {
    private final boolean mEnabledWhenDeviceHasQuirk;
    private final Set<Class<? extends Quirk>> mForceDisabledQuirks;
    private final Set<Class<? extends Quirk>> mForceEnabledQuirks;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean mEnabledWhenDeviceHasQuirk = true;
        private Set<Class<? extends Quirk>> mForceDisabledQuirks;
        private Set<Class<? extends Quirk>> mForceEnabledQuirks;

        @NonNull
        public QuirkSettings build() {
            return new QuirkSettings(this.mEnabledWhenDeviceHasQuirk, this.mForceEnabledQuirks, this.mForceDisabledQuirks);
        }

        @NonNull
        public Builder forceDisableQuirks(@NonNull Set<Class<? extends Quirk>> set) {
            this.mForceDisabledQuirks = new HashSet(set);
            return this;
        }

        @NonNull
        public Builder forceEnableQuirks(@NonNull Set<Class<? extends Quirk>> set) {
            this.mForceEnabledQuirks = new HashSet(set);
            return this;
        }

        @NonNull
        public Builder setEnabledWhenDeviceHasQuirk(boolean z) {
            this.mEnabledWhenDeviceHasQuirk = z;
            return this;
        }
    }

    private QuirkSettings(boolean z, @Nullable Set<Class<? extends Quirk>> set, @Nullable Set<Class<? extends Quirk>> set2) {
        this.mEnabledWhenDeviceHasQuirk = z;
        this.mForceEnabledQuirks = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.mForceDisabledQuirks = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }

    @NonNull
    public static QuirkSettings withAllQuirksDisabled() {
        return new Builder().setEnabledWhenDeviceHasQuirk(false).build();
    }

    @NonNull
    public static QuirkSettings withDefaultBehavior() {
        return new Builder().setEnabledWhenDeviceHasQuirk(true).build();
    }

    @NonNull
    public static QuirkSettings withQuirksForceDisabled(@NonNull Set<Class<? extends Quirk>> set) {
        return new Builder().forceDisableQuirks(set).build();
    }

    @NonNull
    public static QuirkSettings withQuirksForceEnabled(@NonNull Set<Class<? extends Quirk>> set) {
        return new Builder().forceEnableQuirks(set).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof QuirkSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        QuirkSettings quirkSettings = (QuirkSettings) obj;
        return this.mEnabledWhenDeviceHasQuirk == quirkSettings.mEnabledWhenDeviceHasQuirk && Objects.equals(this.mForceEnabledQuirks, quirkSettings.mForceEnabledQuirks) && Objects.equals(this.mForceDisabledQuirks, quirkSettings.mForceDisabledQuirks);
    }

    @NonNull
    public Set<Class<? extends Quirk>> getForceDisabledQuirks() {
        return Collections.unmodifiableSet(this.mForceDisabledQuirks);
    }

    @NonNull
    public Set<Class<? extends Quirk>> getForceEnabledQuirks() {
        return Collections.unmodifiableSet(this.mForceEnabledQuirks);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mEnabledWhenDeviceHasQuirk), this.mForceEnabledQuirks, this.mForceDisabledQuirks);
    }

    public boolean isEnabledWhenDeviceHasQuirk() {
        return this.mEnabledWhenDeviceHasQuirk;
    }

    public boolean shouldEnableQuirk(@NonNull Class<? extends Quirk> cls, boolean z) {
        if (this.mForceEnabledQuirks.contains(cls)) {
            return true;
        }
        return !this.mForceDisabledQuirks.contains(cls) && this.mEnabledWhenDeviceHasQuirk && z;
    }

    @NonNull
    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.mEnabledWhenDeviceHasQuirk + ", forceEnabledQuirks=" + this.mForceEnabledQuirks + ", forceDisabledQuirks=" + this.mForceDisabledQuirks + AbstractJsonLexerKt.END_OBJ;
    }
}
