package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_SessionConfig_OutputConfig extends SessionConfig.OutputConfig {
    private final DynamicRange dynamicRange;
    private final int mirrorMode;
    private final String physicalCameraId;
    private final List<DeferrableSurface> sharedSurfaces;
    private final DeferrableSurface surface;
    private final int surfaceGroupId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends SessionConfig.OutputConfig.Builder {
        private DynamicRange dynamicRange;
        private Integer mirrorMode;
        private String physicalCameraId;
        private List<DeferrableSurface> sharedSurfaces;
        private DeferrableSurface surface;
        private Integer surfaceGroupId;

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig build() {
            String str = this.surface == null ? " surface" : "";
            if (this.sharedSurfaces == null) {
                str = str.concat(" sharedSurfaces");
            }
            if (this.mirrorMode == null) {
                str = str.concat(" mirrorMode");
            }
            if (this.surfaceGroupId == null) {
                str = str.concat(" surfaceGroupId");
            }
            if (this.dynamicRange == null) {
                str = str.concat(" dynamicRange");
            }
            if (str.isEmpty()) {
                return new AutoValue_SessionConfig_OutputConfig(this.surface, this.sharedSurfaces, this.physicalCameraId, this.mirrorMode.intValue(), this.surfaceGroupId.intValue(), this.dynamicRange);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange != null) {
                this.dynamicRange = dynamicRange;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null dynamicRange");
            return null;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setMirrorMode(int i) {
            this.mirrorMode = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setPhysicalCameraId(@Nullable String str) {
            this.physicalCameraId = str;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSharedSurfaces(List<DeferrableSurface> list) {
            if (list != null) {
                this.sharedSurfaces = list;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null sharedSurfaces");
            return null;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurface(DeferrableSurface deferrableSurface) {
            if (deferrableSurface != null) {
                this.surface = deferrableSurface;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null surface");
            return null;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i) {
            this.surfaceGroupId = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_SessionConfig_OutputConfig(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, @Nullable String str, int i, int i2, DynamicRange dynamicRange) {
        this.surface = deferrableSurface;
        this.sharedSurfaces = list;
        this.physicalCameraId = str;
        this.mirrorMode = i;
        this.surfaceGroupId = i2;
        this.dynamicRange = dynamicRange;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionConfig.OutputConfig) {
            SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) obj;
            if (this.surface.equals(outputConfig.getSurface()) && this.sharedSurfaces.equals(outputConfig.getSharedSurfaces()) && ((str = this.physicalCameraId) != null ? str.equals(outputConfig.getPhysicalCameraId()) : outputConfig.getPhysicalCameraId() == null) && this.mirrorMode == outputConfig.getMirrorMode() && this.surfaceGroupId == outputConfig.getSurfaceGroupId() && this.dynamicRange.equals(outputConfig.getDynamicRange())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @NonNull
    public DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getMirrorMode() {
        return this.mirrorMode;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @Nullable
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @NonNull
    public List<DeferrableSurface> getSharedSurfaces() {
        return this.sharedSurfaces;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @NonNull
    public DeferrableSurface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    public int hashCode() {
        int hashCode = (((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.sharedSurfaces.hashCode()) * 1000003;
        String str = this.physicalCameraId;
        return this.dynamicRange.hashCode() ^ ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mirrorMode) * 1000003) ^ this.surfaceGroupId) * 1000003);
    }

    public String toString() {
        return "OutputConfig{surface=" + this.surface + ", sharedSurfaces=" + this.sharedSurfaces + ", physicalCameraId=" + this.physicalCameraId + ", mirrorMode=" + this.mirrorMode + ", surfaceGroupId=" + this.surfaceGroupId + ", dynamicRange=" + this.dynamicRange + StringSubstitutor.DEFAULT_VAR_END;
    }
}
