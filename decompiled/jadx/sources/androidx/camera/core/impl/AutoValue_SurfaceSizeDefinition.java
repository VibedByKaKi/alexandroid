package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_SurfaceSizeDefinition extends SurfaceSizeDefinition {
    private final Size analysisSize;
    private final Map<Integer, Size> maximumSizeMap;
    private final Size previewSize;
    private final Size recordSize;
    private final Map<Integer, Size> s1440pSizeMap;
    private final Map<Integer, Size> s720pSizeMap;
    private final Map<Integer, Size> ultraMaximumSizeMap;

    public AutoValue_SurfaceSizeDefinition(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null analysisSize");
            throw null;
        }
        this.analysisSize = size;
        if (map == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null s720pSizeMap");
            throw null;
        }
        this.s720pSizeMap = map;
        if (size2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null previewSize");
            throw null;
        }
        this.previewSize = size2;
        if (map2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null s1440pSizeMap");
            throw null;
        }
        this.s1440pSizeMap = map2;
        if (size3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null recordSize");
            throw null;
        }
        this.recordSize = size3;
        if (map3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null maximumSizeMap");
            throw null;
        }
        this.maximumSizeMap = map3;
        if (map4 != null) {
            this.ultraMaximumSizeMap = map4;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null ultraMaximumSizeMap");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceSizeDefinition) {
            SurfaceSizeDefinition surfaceSizeDefinition = (SurfaceSizeDefinition) obj;
            if (this.analysisSize.equals(surfaceSizeDefinition.getAnalysisSize()) && this.s720pSizeMap.equals(surfaceSizeDefinition.getS720pSizeMap()) && this.previewSize.equals(surfaceSizeDefinition.getPreviewSize()) && this.s1440pSizeMap.equals(surfaceSizeDefinition.getS1440pSizeMap()) && this.recordSize.equals(surfaceSizeDefinition.getRecordSize()) && this.maximumSizeMap.equals(surfaceSizeDefinition.getMaximumSizeMap()) && this.ultraMaximumSizeMap.equals(surfaceSizeDefinition.getUltraMaximumSizeMap())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @NonNull
    public Size getAnalysisSize() {
        return this.analysisSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @NonNull
    public Map<Integer, Size> getMaximumSizeMap() {
        return this.maximumSizeMap;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @NonNull
    public Size getPreviewSize() {
        return this.previewSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @NonNull
    public Size getRecordSize() {
        return this.recordSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @NonNull
    public Map<Integer, Size> getS1440pSizeMap() {
        return this.s1440pSizeMap;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @NonNull
    public Map<Integer, Size> getS720pSizeMap() {
        return this.s720pSizeMap;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @NonNull
    public Map<Integer, Size> getUltraMaximumSizeMap() {
        return this.ultraMaximumSizeMap;
    }

    public int hashCode() {
        return this.ultraMaximumSizeMap.hashCode() ^ ((((((((((((this.analysisSize.hashCode() ^ 1000003) * 1000003) ^ this.s720pSizeMap.hashCode()) * 1000003) ^ this.previewSize.hashCode()) * 1000003) ^ this.s1440pSizeMap.hashCode()) * 1000003) ^ this.recordSize.hashCode()) * 1000003) ^ this.maximumSizeMap.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SurfaceSizeDefinition{analysisSize=");
        sb.append(this.analysisSize);
        sb.append(", s720pSizeMap=");
        sb.append(this.s720pSizeMap);
        sb.append(", previewSize=");
        sb.append(this.previewSize);
        sb.append(", s1440pSizeMap=");
        sb.append(this.s1440pSizeMap);
        sb.append(", recordSize=");
        sb.append(this.recordSize);
        sb.append(", maximumSizeMap=");
        sb.append(this.maximumSizeMap);
        sb.append(", ultraMaximumSizeMap=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.ultraMaximumSizeMap, StringSubstitutor.DEFAULT_VAR_END);
    }
}
