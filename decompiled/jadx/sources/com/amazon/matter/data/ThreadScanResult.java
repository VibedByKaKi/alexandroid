package com.amazon.matter.data;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressFBWarnings
/* loaded from: classes5.dex */
public class ThreadScanResult {
    private Integer channel;
    private byte[] extendedAddress;
    private String extendedPanId;
    private Integer lqi;
    private String networkName;
    private String panId;
    private Integer rssi;
    private Integer version;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadScanResult(String str, String str2, String str3, Integer num, Integer num2, byte[] bArr, Integer num3, Integer num4) {
        this.panId = str;
        this.extendedPanId = str2;
        this.networkName = str3;
        this.channel = num;
        this.version = num2;
        this.extendedAddress = bArr;
        this.rssi = num3;
        this.lqi = num4;
    }
}
