package chip.devicecontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class CSRInfo {
    private byte[] csr;
    private byte[] elements;
    private byte[] elementsSignature;
    private byte[] nonce;

    public CSRInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.nonce = bArr;
        this.elements = bArr2;
        this.elementsSignature = bArr3;
        this.csr = bArr4;
    }

    public final byte[] getCSR() {
        return this.csr;
    }

    public final byte[] getElements() {
        return this.elements;
    }

    public final byte[] getElementsSignature() {
        return this.elementsSignature;
    }

    public final byte[] getNonce() {
        return this.nonce;
    }
}
