package com.amazon.alexa.accessorykit.wificonfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class WifiConfigApConnectionInfo {
    private static final int DEFAULT_PORT = 8080;
    private final String ipAddress;
    private final int port;

    @Nullable
    private final byte[] tlsFingerprintSha256;

    public WifiConfigApConnectionInfo(@NonNull String str, int i, @Nullable byte[] bArr) {
        Preconditions.notNull(str, "ipAddress");
        this.ipAddress = str;
        this.port = i;
        this.tlsFingerprintSha256 = bArr;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public int getPort() {
        return this.port;
    }

    @Nullable
    public byte[] getTlsFingerprintSha256() {
        return this.tlsFingerprintSha256;
    }

    public WifiConfigApConnectionInfo(@NonNull String str, @Nullable byte[] bArr) {
        this(str, DEFAULT_PORT, bArr);
    }
}
