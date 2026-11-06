package com.amazon.matter.data;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ScanNetworkRequest {
    private long fabricId;
    private long nodeId;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ScanNetworkRequest(long j, long j2) {
        this.fabricId = j;
        this.nodeId = j2;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getFabricId() {
        return this.fabricId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getNodeId() {
        return this.nodeId;
    }
}
