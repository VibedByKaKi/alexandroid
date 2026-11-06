package org.apache.commons.codec.digest;

import org.apache.commons.codec.Charsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class Crypt {
    public static String crypt(byte[] bArr, String str) {
        return str == null ? Sha2Crypt.sha512Crypt(bArr) : str.startsWith("$6$") ? Sha2Crypt.sha512Crypt(bArr, str) : str.startsWith("$5$") ? Sha2Crypt.sha256Crypt(bArr, str) : str.startsWith("$1$") ? Md5Crypt.md5Crypt(bArr, str) : UnixCrypt.crypt(bArr, str);
    }

    public static String crypt(byte[] bArr) {
        return crypt(bArr, (String) null);
    }

    public static String crypt(String str) {
        return crypt(str, (String) null);
    }

    public static String crypt(String str, String str2) {
        return crypt(str.getBytes(Charsets.UTF_8), str2);
    }
}
