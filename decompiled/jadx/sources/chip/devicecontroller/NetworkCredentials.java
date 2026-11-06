package chip.devicecontroller;

import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NetworkCredentials {

    @Nullable
    private ThreadCredentials threadCredentials;

    @Nullable
    private WiFiCredentials wifiCredentials;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThreadCredentials {
        private byte[] operationalDataset;

        public ThreadCredentials(byte[] bArr) {
            set(bArr);
        }

        public byte[] getOperationalDataset() {
            return this.operationalDataset;
        }

        public void set(byte[] bArr) {
            this.operationalDataset = bArr;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WiFiCredentials {
        private String password;
        private String ssid;

        public WiFiCredentials(String str, String str2) {
            set(str, str2);
        }

        public String getPassword() {
            return this.password;
        }

        public String getSsid() {
            return this.ssid;
        }

        public void set(String str, String str2) {
            this.ssid = str;
            this.password = str2;
        }
    }

    private NetworkCredentials(@Nullable WiFiCredentials wiFiCredentials, @Nullable ThreadCredentials threadCredentials) {
        this.wifiCredentials = wiFiCredentials;
        this.threadCredentials = threadCredentials;
    }

    public static NetworkCredentials forThread(ThreadCredentials threadCredentials) {
        return new NetworkCredentials(null, threadCredentials);
    }

    public static NetworkCredentials forWiFi(WiFiCredentials wiFiCredentials) {
        return new NetworkCredentials(wiFiCredentials, null);
    }

    public ThreadCredentials getThreadCredentials() {
        return this.threadCredentials;
    }

    public WiFiCredentials getWiFiCredentials() {
        return this.wifiCredentials;
    }

    public void setThreadCredentials(byte[] bArr) {
        this.threadCredentials.set(bArr);
    }

    public void setWiFiCredentials(String str, String str2) {
        this.wifiCredentials.set(str, str2);
    }

    public NetworkCredentials() {
    }
}
