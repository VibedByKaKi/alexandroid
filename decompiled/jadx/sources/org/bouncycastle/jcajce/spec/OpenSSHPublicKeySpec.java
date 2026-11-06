package org.bouncycastle.jcajce.spec;

import java.security.spec.EncodedKeySpec;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class OpenSSHPublicKeySpec extends EncodedKeySpec {
    private static final String[] allowedTypes = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};
    private final String type;

    public OpenSSHPublicKeySpec(byte[] bArr) {
        super(bArr);
        int i = 0;
        int i2 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i2 >= bArr.length) {
            Single$$ExternalSyntheticBUOutline0.m$3("invalid public key blob: type field longer than blob");
            throw null;
        }
        String fromByteArray = Strings.fromByteArray(Arrays.copyOfRange(bArr, 4, i2));
        this.type = fromByteArray;
        if (fromByteArray.startsWith("ecdsa")) {
            return;
        }
        while (true) {
            String[] strArr = allowedTypes;
            if (i >= strArr.length) {
                Buffer$$ExternalSyntheticBUOutline0.m$3(this.type, "unrecognised public key type ");
                throw null;
            }
            if (strArr[i].equals(this.type)) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }

    public String getType() {
        return this.type;
    }
}
