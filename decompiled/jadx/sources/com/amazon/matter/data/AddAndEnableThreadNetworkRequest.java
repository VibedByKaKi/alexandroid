package com.amazon.matter.data;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AddAndEnableThreadNetworkRequest {
    private int channel;
    private String extendedPanId;
    private long fabricId;
    private String identityProtectionKey;
    private String networkKey;
    private String networkName;
    private String panId;
    private String sessionId;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AddAndEnableThreadNetworkRequest(long j, String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.fabricId = j;
        this.networkName = str;
        this.extendedPanId = str2;
        this.networkKey = str3;
        this.panId = str4;
        this.channel = i;
        this.identityProtectionKey = str5;
        this.sessionId = str6;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getChannel() {
        return this.channel;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanId() {
        return this.extendedPanId;
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
    public String getNetworkKey() {
        return this.networkKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkName() {
        return this.networkName;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPanId() {
        return this.panId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }
}
