package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ResolutionInfo {
    private final ResolutionInfoInternal mResolutionInfoInternal;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ResolutionInfoInternal {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            public abstract ResolutionInfoInternal build();

            @NonNull
            public abstract Builder setCropRect(@NonNull Rect rect);

            @NonNull
            public abstract Builder setResolution(@NonNull Size size);

            @NonNull
            public abstract Builder setRotationDegrees(int i);
        }

        @NonNull
        public abstract Rect getCropRect();

        @NonNull
        public abstract Size getResolution();

        public abstract int getRotationDegrees();
    }

    public ResolutionInfo(@NonNull Size size, @NonNull Rect rect, int i) {
        this.mResolutionInfoInternal = new AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder().setResolution(size).setCropRect(rect).setRotationDegrees(i).build();
    }

    public boolean equals(@Nullable Object obj) {
        return this.mResolutionInfoInternal.equals(obj);
    }

    @NonNull
    public Rect getCropRect() {
        return this.mResolutionInfoInternal.getCropRect();
    }

    @NonNull
    public Size getResolution() {
        return this.mResolutionInfoInternal.getResolution();
    }

    public int getRotationDegrees() {
        return this.mResolutionInfoInternal.getRotationDegrees();
    }

    public int hashCode() {
        return this.mResolutionInfoInternal.hashCode();
    }

    @NonNull
    public String toString() {
        return this.mResolutionInfoInternal.toString();
    }
}
