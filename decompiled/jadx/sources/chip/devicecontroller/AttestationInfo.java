package chip.devicecontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AttestationInfo {
    private byte[] certificationDeclaration;
    private byte[] challenge;
    private byte[] dac;
    private byte[] elements;
    private byte[] elementsSignature;
    private byte[] firmwareInfo;
    private byte[] nonce;
    private byte[] pai;
    private int productId;
    private int vendorId;

    public AttestationInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i, int i2) {
        this.challenge = bArr;
        this.nonce = bArr2;
        this.elements = bArr3;
        this.elementsSignature = bArr4;
        this.dac = bArr5;
        this.pai = bArr6;
        this.certificationDeclaration = bArr7;
        this.firmwareInfo = bArr8;
        this.vendorId = i;
        this.productId = i2;
    }

    public final byte[] getCertificationDeclaration() {
        return this.certificationDeclaration;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final byte[] getDAC() {
        return this.dac;
    }

    public final byte[] getElements() {
        return this.elements;
    }

    public final byte[] getElementsSignature() {
        return this.elementsSignature;
    }

    public final byte[] getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public final byte[] getNonce() {
        return this.nonce;
    }

    public final byte[] getPAI() {
        return this.pai;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final int getVendorId() {
        return this.vendorId;
    }

    public AttestationInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        this.dac = bArr;
        this.pai = bArr2;
        this.certificationDeclaration = bArr3;
        this.vendorId = i;
        this.productId = i2;
    }

    public AttestationInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        this.challenge = bArr;
        this.nonce = bArr2;
        this.elements = bArr3;
        this.elementsSignature = bArr4;
        this.dac = bArr5;
        this.pai = bArr6;
        this.certificationDeclaration = bArr7;
        this.firmwareInfo = bArr8;
    }

    public AttestationInfo(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.dac = bArr;
        this.pai = bArr2;
        this.certificationDeclaration = bArr3;
    }
}
