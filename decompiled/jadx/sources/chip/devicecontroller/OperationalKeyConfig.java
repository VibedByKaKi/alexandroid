package chip.devicecontroller;

import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class OperationalKeyConfig {

    @Nullable
    private final byte[] intermediateCertificate;
    private final byte[] ipkEpochKey;
    private final KeypairDelegate keypairDelegate;
    private final byte[] nodeOperationalCertificate;
    private final byte[] trustedRootCertificate;

    public OperationalKeyConfig(KeypairDelegate keypairDelegate, byte[] bArr, @Nullable byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.keypairDelegate = keypairDelegate;
        this.trustedRootCertificate = (byte[]) bArr.clone();
        this.intermediateCertificate = bArr2 == null ? null : (byte[]) bArr2.clone();
        this.nodeOperationalCertificate = (byte[]) bArr3.clone();
        this.ipkEpochKey = (byte[]) bArr4.clone();
    }

    @Nullable
    public final byte[] getIntermediateCertificate() {
        byte[] bArr = this.intermediateCertificate;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] getIpkEpochKey() {
        return (byte[]) this.ipkEpochKey.clone();
    }

    public final KeypairDelegate getKeypairDelegate() {
        return this.keypairDelegate;
    }

    public final byte[] getNodeOperationalCertificate() {
        return (byte[]) this.nodeOperationalCertificate.clone();
    }

    public final byte[] getTrustedRootCertificate() {
        return (byte[]) this.trustedRootCertificate.clone();
    }
}
