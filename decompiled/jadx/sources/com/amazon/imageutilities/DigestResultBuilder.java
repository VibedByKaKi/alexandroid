package com.amazon.imageutilities;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class DigestResultBuilder {
    private final String algorithm;
    private final SafeMessageDigest fileDigest;
    private final SafeMessageDigest visualDigest;
    private final StringDigestUtility stringDigestUtility = new StringDigestUtility();
    private SafeMessageDigest eoiDigest = null;

    public DigestResultBuilder(SafeMessageDigestFactory safeMessageDigestFactory) {
        this.algorithm = safeMessageDigestFactory.getAlgorithm();
        this.fileDigest = safeMessageDigestFactory.newInstance();
        this.visualDigest = safeMessageDigestFactory.newInstance();
    }

    private String getEncodedFileDigest() {
        return this.stringDigestUtility.getHexEncodedDigest(this.fileDigest.digest());
    }

    private String getEncodedVisualDigest() {
        StringDigestUtility stringDigestUtility = this.stringDigestUtility;
        SafeMessageDigest safeMessageDigest = this.eoiDigest;
        return stringDigestUtility.getHexEncodedDigest(safeMessageDigest == null ? this.visualDigest.digest() : safeMessageDigest.digest());
    }

    public DigestResult build() {
        return new DigestResult(this.algorithm, getEncodedFileDigest(), getEncodedVisualDigest());
    }

    public DigestResultBuilder update(byte[] bArr, int i) {
        this.fileDigest.update(bArr, 0, i);
        this.visualDigest.update(bArr, 0, i);
        return this;
    }

    public DigestResultBuilder updateFileOnly(byte[] bArr) {
        this.fileDigest.update(bArr);
        return this;
    }

    public DigestResultBuilder updateWithEOI(byte[] bArr, int i, int i2) {
        SafeMessageDigest safeClone = this.visualDigest.safeClone();
        this.eoiDigest = safeClone;
        safeClone.update(bArr, 0, i2);
        update(bArr, i);
        return this;
    }
}
