package chip.platform;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface NfcCommissioningManager {
    NfcCallback getCallback();

    int init();

    void sendToNfcTag(byte[] bArr);

    void setAndroidChipPlatform(AndroidChipPlatform androidChipPlatform);

    void setNfcCallback(NfcCallback nfcCallback);

    void shutdown();
}
