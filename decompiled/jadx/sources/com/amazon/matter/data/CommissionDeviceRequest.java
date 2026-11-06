package com.amazon.matter.data;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommissionDeviceRequest {
    private long fabricId;
    private String identityProtectionKey;
    private long nodeId;
    private String sessionId;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CommissionDeviceRequest(long j, long j2, String str, String str2) {
        this.fabricId = j;
        this.nodeId = j2;
        this.sessionId = str;
        this.identityProtectionKey = str2;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getFabricId() {
        return this.fabricId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getIdentityProtectionKey() {
        return this.identityProtectionKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getNodeId() {
        return this.nodeId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }
}
