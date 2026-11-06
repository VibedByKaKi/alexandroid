package com.amazon.minerva.transport.direct;

import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Batch {
    private static final String LWA_TOKEN_PREFIX = "Atza|";
    private static final String MAP_TOKEN_PREFIX = "Atna|";
    private final ContentType contentType;
    private final String deviceTypeId;
    private final String oAuthToken;
    private final byte[] payload;

    public Batch(byte[] bArr, ContentType contentType, String str, String str2) {
        if (bArr == null || bArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("payload must not be null or empty");
            throw null;
        }
        if (contentType == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("contentType must not be null");
            throw null;
        }
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("deviceTypeId must not be null or empty");
            throw null;
        }
        if (str2 != null && !str2.startsWith(LWA_TOKEN_PREFIX) && !str2.startsWith(MAP_TOKEN_PREFIX)) {
            Single$$ExternalSyntheticBUOutline0.m$3("oAuthToken must be null, or start with \"Atza|\" (LWA) or \"Atna|\" (MAP)");
            throw null;
        }
        this.payload = Arrays.copyOf(bArr, bArr.length);
        this.contentType = contentType;
        this.deviceTypeId = str;
        this.oAuthToken = str2;
    }

    public ContentType getContentType() {
        return this.contentType;
    }

    public String getDeviceTypeId() {
        return this.deviceTypeId;
    }

    public String getOAuthToken() {
        return this.oAuthToken;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
