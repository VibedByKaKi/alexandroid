package androidx.camera.core.processing.util;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class GraphicDeviceInfo {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract GraphicDeviceInfo build();

        @NonNull
        public abstract Builder setEglExtensions(@NonNull String str);

        @NonNull
        public abstract Builder setEglVersion(@NonNull String str);

        @NonNull
        public abstract Builder setGlExtensions(@NonNull String str);

        @NonNull
        public abstract Builder setGlVersion(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_GraphicDeviceInfo.Builder().setGlVersion(GLUtils.VERSION_UNKNOWN).setEglVersion(GLUtils.VERSION_UNKNOWN).setGlExtensions("").setEglExtensions("");
    }

    @NonNull
    public abstract String getEglExtensions();

    @NonNull
    public abstract String getEglVersion();

    @NonNull
    public abstract String getGlExtensions();

    @NonNull
    public abstract String getGlVersion();
}
