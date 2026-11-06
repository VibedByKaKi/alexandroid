package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import java.util.Arrays;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CustomCommandRequest {
    private final String commandUuid;
    private final byte[] payload;

    public CustomCommandRequest(String str, byte[] bArr) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("commandUuid can't be null or empty");
            throw null;
        }
        this.commandUuid = str;
        this.payload = bArr == null ? null : (byte[]) bArr.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomCommandRequest)) {
            return false;
        }
        CustomCommandRequest customCommandRequest = (CustomCommandRequest) obj;
        return Objects.equals(this.commandUuid, customCommandRequest.commandUuid) && Arrays.equals(this.payload, customCommandRequest.payload);
    }

    public String getCommandUuid() {
        return this.commandUuid;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public int hashCode() {
        return Arrays.hashCode(this.payload) + (Objects.hashCode(this.commandUuid) * 31);
    }
}
