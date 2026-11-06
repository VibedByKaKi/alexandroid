package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_AttachedSurfaceInfo extends AttachedSurfaceInfo {
    private final List<UseCaseConfigFactory.CaptureType> captureTypes;
    private final DynamicRange dynamicRange;
    private final int imageFormat;
    private final Config implementationOptions;
    private final Size size;
    private final SurfaceConfig surfaceConfig;
    private final Range<Integer> targetFrameRate;

    public AutoValue_AttachedSurfaceInfo(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, List<UseCaseConfigFactory.CaptureType> list, @Nullable Config config, @Nullable Range<Integer> range) {
        if (surfaceConfig == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null surfaceConfig");
            throw null;
        }
        this.surfaceConfig = surfaceConfig;
        this.imageFormat = i;
        if (size == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null size");
            throw null;
        }
        this.size = size;
        if (dynamicRange == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dynamicRange");
            throw null;
        }
        this.dynamicRange = dynamicRange;
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null captureTypes");
            throw null;
        }
        this.captureTypes = list;
        this.implementationOptions = config;
        this.targetFrameRate = range;
    }

    public boolean equals(Object obj) {
        Config config;
        Range<Integer> range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttachedSurfaceInfo) {
            AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) obj;
            if (this.surfaceConfig.equals(attachedSurfaceInfo.getSurfaceConfig()) && this.imageFormat == attachedSurfaceInfo.getImageFormat() && this.size.equals(attachedSurfaceInfo.getSize()) && this.dynamicRange.equals(attachedSurfaceInfo.getDynamicRange()) && this.captureTypes.equals(attachedSurfaceInfo.getCaptureTypes()) && ((config = this.implementationOptions) != null ? config.equals(attachedSurfaceInfo.getImplementationOptions()) : attachedSurfaceInfo.getImplementationOptions() == null) && ((range = this.targetFrameRate) != null ? range.equals(attachedSurfaceInfo.getTargetFrameRate()) : attachedSurfaceInfo.getTargetFrameRate() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @NonNull
    public List<UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return this.captureTypes;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @NonNull
    public DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @Nullable
    public Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @NonNull
    public Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @NonNull
    public SurfaceConfig getSurfaceConfig() {
        return this.surfaceConfig;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @Nullable
    public Range<Integer> getTargetFrameRate() {
        return this.targetFrameRate;
    }

    public int hashCode() {
        int hashCode = (((((((((this.surfaceConfig.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.captureTypes.hashCode()) * 1000003;
        Config config = this.implementationOptions;
        int hashCode2 = (hashCode ^ (config == null ? 0 : config.hashCode())) * 1000003;
        Range<Integer> range = this.targetFrameRate;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.surfaceConfig + ", imageFormat=" + this.imageFormat + ", size=" + this.size + ", dynamicRange=" + this.dynamicRange + ", captureTypes=" + this.captureTypes + ", implementationOptions=" + this.implementationOptions + ", targetFrameRate=" + this.targetFrameRate + StringSubstitutor.DEFAULT_VAR_END;
    }
}
