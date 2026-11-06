package com.amazon.imageutilities;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class SafeMessageDigestFactory {
    private final SafeMessageDigest cloneMe;

    public SafeMessageDigestFactory(String str) throws UnsupportedAlgorithmException {
        this.cloneMe = new SafeMessageDigest(str);
    }

    public String getAlgorithm() {
        return this.cloneMe.getAlgorithm();
    }

    public SafeMessageDigest newInstance() {
        return this.cloneMe.safeClone();
    }
}
