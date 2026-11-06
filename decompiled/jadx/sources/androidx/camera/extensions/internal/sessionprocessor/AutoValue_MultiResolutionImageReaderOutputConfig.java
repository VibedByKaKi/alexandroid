package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_MultiResolutionImageReaderOutputConfig extends MultiResolutionImageReaderOutputConfig {
    private final int id;
    private final int imageFormat;
    private final int maxImages;
    private final String physicalCameraId;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_MultiResolutionImageReaderOutputConfig(int i, int i2, @Nullable String str, List<Camera2OutputConfig> list, int i3, int i4) {
        this.id = i;
        this.surfaceGroupId = i2;
        this.physicalCameraId = str;
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null surfaceSharingOutputConfigs");
            throw null;
        }
        this.surfaceSharingOutputConfigs = list;
        this.imageFormat = i3;
        this.maxImages = i4;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiResolutionImageReaderOutputConfig) {
            MultiResolutionImageReaderOutputConfig multiResolutionImageReaderOutputConfig = (MultiResolutionImageReaderOutputConfig) obj;
            if (this.id == multiResolutionImageReaderOutputConfig.getId() && this.surfaceGroupId == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.imageFormat == multiResolutionImageReaderOutputConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderOutputConfig.getMaxImages()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @Nullable
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @NonNull
    public List<Camera2OutputConfig> getSurfaceSharingOutputConfigs() {
        return this.surfaceSharingOutputConfigs;
    }

    public int hashCode() {
        int i = (((this.id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        String str = this.physicalCameraId;
        return this.maxImages ^ ((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.imageFormat) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MultiResolutionImageReaderOutputConfig{id=");
        sb.append(this.id);
        sb.append(", surfaceGroupId=");
        sb.append(this.surfaceGroupId);
        sb.append(", physicalCameraId=");
        sb.append(this.physicalCameraId);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append(this.surfaceSharingOutputConfigs);
        sb.append(", imageFormat=");
        sb.append(this.imageFormat);
        sb.append(", maxImages=");
        return a$$ExternalSyntheticOutline0.m(sb, this.maxImages, StringSubstitutor.DEFAULT_VAR_END);
    }
}
