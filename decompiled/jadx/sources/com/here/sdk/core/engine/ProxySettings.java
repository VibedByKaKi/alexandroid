package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.net.InetAddress;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ProxySettings {

    @NonNull
    public InetAddress ipAddress;
    public int port;

    @NonNull
    public ProxyType type;

    @Nullable
    public String networkInterface = "wlan0";

    @Nullable
    public Credentials credentials = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Credentials {

        @NonNull
        public String password;

        @NonNull
        public String userName;

        public Credentials(@NonNull String str, @NonNull String str2) {
            this.userName = str;
            this.password = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Credentials)) {
                return false;
            }
            Credentials credentials = (Credentials) obj;
            return Objects.equals(this.userName, credentials.userName) && Objects.equals(this.password, credentials.password);
        }

        public int hashCode() {
            String str = this.userName;
            int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.password;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ProxyType {
        HTTP(0),
        HTTPS(1),
        SOCKS5(2);

        public final int value;

        ProxyType(int i) {
            this.value = i;
        }
    }

    public ProxySettings(@NonNull ProxyType proxyType, @NonNull InetAddress inetAddress, int i) {
        this.type = proxyType;
        this.ipAddress = inetAddress;
        this.port = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProxySettings)) {
            return false;
        }
        ProxySettings proxySettings = (ProxySettings) obj;
        return Objects.equals(this.type, proxySettings.type) && Objects.equals(this.ipAddress, proxySettings.ipAddress) && Objects.equals(this.networkInterface, proxySettings.networkInterface) && this.port == proxySettings.port && Objects.equals(this.credentials, proxySettings.credentials);
    }

    public int hashCode() {
        ProxyType proxyType = this.type;
        int hashCode = (JfifUtil.MARKER_EOI + (proxyType != null ? proxyType.hashCode() : 0)) * 31;
        InetAddress inetAddress = this.ipAddress;
        int hashCode2 = (hashCode + (inetAddress != null ? inetAddress.hashCode() : 0)) * 31;
        String str = this.networkInterface;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.port) * 31;
        Credentials credentials = this.credentials;
        return hashCode3 + (credentials != null ? credentials.hashCode() : 0);
    }
}
