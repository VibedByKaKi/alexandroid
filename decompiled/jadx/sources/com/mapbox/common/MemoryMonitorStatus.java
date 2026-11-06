package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class MemoryMonitorStatus implements Serializable {

    @NonNull
    private final MemoryMonitorState state;
    private final long totalMemory;
    private final long usedMemory;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MemoryMonitorStatus(@NonNull MemoryMonitorState memoryMonitorState, long j, long j2) {
        this.state = memoryMonitorState;
        this.totalMemory = j;
        this.usedMemory = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorStatus.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorStatus memoryMonitorStatus = (MemoryMonitorStatus) obj;
        return Objects.equals(this.state, memoryMonitorStatus.state) && this.totalMemory == memoryMonitorStatus.totalMemory && this.usedMemory == memoryMonitorStatus.usedMemory;
    }

    @NonNull
    public MemoryMonitorState getState() {
        return this.state;
    }

    public long getTotalMemory() {
        return this.totalMemory;
    }

    public long getUsedMemory() {
        return this.usedMemory;
    }

    public int hashCode() {
        return Objects.hash(this.state, Long.valueOf(this.totalMemory), Long.valueOf(this.usedMemory));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[state: ");
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", totalMemory: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.totalMemory, ", usedMemory: ", sb);
        sb.append(RecordUtils.fieldToString(Long.valueOf(this.usedMemory)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
