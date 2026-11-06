package com.mapbox.common;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@MapboxExperimental
/* loaded from: classes8.dex */
public class TileStoreImportProgress implements Serializable {
    private final long erroredResourceCount;
    private final long importedResourceCount;
    private final long importedResourceSize;

    @NonNull
    private final HashMap<TileVariant, Double> maximumCoveredDistanceMeters;
    private final long requiredResourceBytes;
    private final long requiredResourceCount;
    private final long skippedResourceCount;
    private final long startTime;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStoreImportProgress(long j, long j2, long j3, long j4, long j5, long j6, long j7, @NonNull HashMap<TileVariant, Double> hashMap) {
        this.startTime = j;
        this.erroredResourceCount = j2;
        this.skippedResourceCount = j3;
        this.importedResourceCount = j4;
        this.importedResourceSize = j5;
        this.requiredResourceCount = j6;
        this.requiredResourceBytes = j7;
        this.maximumCoveredDistanceMeters = hashMap;
    }

    private static native void nativeSelfRegister();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileStoreImportProgress tileStoreImportProgress = (TileStoreImportProgress) obj;
        return this.startTime == tileStoreImportProgress.startTime && this.erroredResourceCount == tileStoreImportProgress.erroredResourceCount && this.skippedResourceCount == tileStoreImportProgress.skippedResourceCount && this.importedResourceCount == tileStoreImportProgress.importedResourceCount && this.importedResourceSize == tileStoreImportProgress.importedResourceSize && this.requiredResourceCount == tileStoreImportProgress.requiredResourceCount && this.requiredResourceBytes == tileStoreImportProgress.requiredResourceBytes && Objects.equals(this.maximumCoveredDistanceMeters, tileStoreImportProgress.maximumCoveredDistanceMeters);
    }

    @MapboxExperimental
    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    @MapboxExperimental
    public long getImportedResourceCount() {
        return this.importedResourceCount;
    }

    @MapboxExperimental
    public long getImportedResourceSize() {
        return this.importedResourceSize;
    }

    @NonNull
    @MapboxExperimental
    public HashMap<TileVariant, Double> getMaximumCoveredDistanceMeters() {
        return this.maximumCoveredDistanceMeters;
    }

    @MapboxExperimental
    public native double getProgressRate();

    @MapboxExperimental
    public long getRequiredResourceBytes() {
        return this.requiredResourceBytes;
    }

    @MapboxExperimental
    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    @MapboxExperimental
    public long getSkippedResourceCount() {
        return this.skippedResourceCount;
    }

    @MapboxExperimental
    public long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.startTime), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.skippedResourceCount), Long.valueOf(this.importedResourceCount), Long.valueOf(this.importedResourceSize), Long.valueOf(this.requiredResourceCount), Long.valueOf(this.requiredResourceBytes), this.maximumCoveredDistanceMeters);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[startTime: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.startTime, ", erroredResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.erroredResourceCount, ", skippedResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.skippedResourceCount, ", importedResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.importedResourceCount, ", importedResourceSize: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.importedResourceSize, ", requiredResourceCount: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.requiredResourceCount, ", requiredResourceBytes: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.requiredResourceBytes, ", maximumCoveredDistanceMeters: ", sb);
        sb.append(RecordUtils.fieldToString(this.maximumCoveredDistanceMeters));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
