package com.amazon.matter.data;

import com.amazon.alexa.matter.eventbus.schema.SetupPayload;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PairDeviceRequest {
    private String activeAdministratorCaseAuthenticatedTag;
    private long fabricId;
    private long nodeId;
    private SetupPayload setupPayload;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairDeviceRequest(long j, long j2, String str, SetupPayload setupPayload) {
        this.fabricId = j;
        this.nodeId = j2;
        this.activeAdministratorCaseAuthenticatedTag = str;
        this.setupPayload = setupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getActiveAdministratorCaseAuthenticatedTag() {
        return this.activeAdministratorCaseAuthenticatedTag;
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

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupPayload getSetupPayload() {
        return this.setupPayload;
    }
}
