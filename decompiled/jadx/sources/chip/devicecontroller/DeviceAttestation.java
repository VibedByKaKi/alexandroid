package chip.devicecontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DeviceAttestation {
    public static native byte[] extractAkidFromPaiCert(byte[] bArr);

    public static native byte[] extractSkidFromPaaCert(byte[] bArr);

    public static native void validateAttestationInfo(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws ChipDeviceControllerException;
}
