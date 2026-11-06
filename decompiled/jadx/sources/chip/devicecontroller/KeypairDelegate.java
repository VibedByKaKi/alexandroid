package chip.devicecontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface KeypairDelegate {
    byte[] createCertificateSigningRequest() throws KeypairException;

    byte[] ecdsaSignMessage(byte[] bArr) throws KeypairException;

    void generatePrivateKey() throws KeypairException;

    byte[] getPublicKey() throws KeypairException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class KeypairException extends Exception {
        private static final long serialVersionUID = 2646523289554350914L;

        public KeypairException(String str) {
            super(str);
        }

        public KeypairException(String str, Throwable th) {
            super(str, th);
        }
    }
}
