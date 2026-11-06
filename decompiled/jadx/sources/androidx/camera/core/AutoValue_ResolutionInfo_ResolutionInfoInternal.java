package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ResolutionInfo;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_ResolutionInfo_ResolutionInfoInternal extends ResolutionInfo.ResolutionInfoInternal {
    private final Rect cropRect;
    private final Size resolution;
    private final int rotationDegrees;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ResolutionInfo.ResolutionInfoInternal.Builder {
        private Rect cropRect;
        private Size resolution;
        private Integer rotationDegrees;

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public ResolutionInfo.ResolutionInfoInternal build() {
            String str = this.resolution == null ? " resolution" : "";
            if (this.cropRect == null) {
                str = str.concat(" cropRect");
            }
            if (this.rotationDegrees == null) {
                str = str.concat(" rotationDegrees");
            }
            if (str.isEmpty()) {
                return new AutoValue_ResolutionInfo_ResolutionInfoInternal(this.resolution, this.cropRect, this.rotationDegrees.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public ResolutionInfo.ResolutionInfoInternal.Builder setCropRect(Rect rect) {
            if (rect != null) {
                this.cropRect = rect;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null cropRect");
            return null;
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public ResolutionInfo.ResolutionInfoInternal.Builder setResolution(Size size) {
            if (size != null) {
                this.resolution = size;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null resolution");
            return null;
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public ResolutionInfo.ResolutionInfoInternal.Builder setRotationDegrees(int i) {
            this.rotationDegrees = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_ResolutionInfo_ResolutionInfoInternal(Size size, Rect rect, int i) {
        this.resolution = size;
        this.cropRect = rect;
        this.rotationDegrees = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResolutionInfo.ResolutionInfoInternal) {
            ResolutionInfo.ResolutionInfoInternal resolutionInfoInternal = (ResolutionInfo.ResolutionInfoInternal) obj;
            if (this.resolution.equals(resolutionInfoInternal.getResolution()) && this.cropRect.equals(resolutionInfoInternal.getCropRect()) && this.rotationDegrees == resolutionInfoInternal.getRotationDegrees()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    @NonNull
    public Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    @NonNull
    public Size getResolution() {
        return this.resolution;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return this.rotationDegrees ^ ((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.cropRect.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResolutionInfoInternal{resolution=");
        sb.append(this.resolution);
        sb.append(", cropRect=");
        sb.append(this.cropRect);
        sb.append(", rotationDegrees=");
        return a$$ExternalSyntheticOutline0.m(sb, this.rotationDegrees, StringSubstitutor.DEFAULT_VAR_END);
    }
}
