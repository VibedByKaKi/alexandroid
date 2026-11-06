package com.amazon.matter.data;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AddAndEnableNetworkRequest {
    private long fabricId;
    private String password;
    private String ssid;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AddAndEnableNetworkRequest(long j, String str, String str2) {
        this.fabricId = j;
        this.ssid = str;
        this.password = str2;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getFabricId() {
        return this.fabricId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPassword() {
        return this.password;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSsid() {
        return this.ssid;
    }
}
