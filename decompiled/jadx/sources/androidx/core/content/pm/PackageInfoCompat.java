package androidx.core.content.pm;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class PackageInfoCompat {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static Signature[] getApkContentsSigners(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        public static long getLongVersionCode(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        public static Signature[] getSigningCertificateHistory(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        public static boolean hasMultipleSigners(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        public static boolean hasSigningCertificate(PackageManager packageManager, String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    private PackageInfoCompat() {
    }

    private static boolean byteArrayContains(byte[][] bArr, byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] computeSHA256Digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Device doesn't support SHA256 cert checking", e);
            return null;
        }
    }

    public static long getLongVersionCode(PackageInfo packageInfo) {
        return Api28Impl.getLongVersionCode(packageInfo);
    }

    public static List<Signature> getSignatures(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
        Signature[] apkContentsSigners = Api28Impl.hasMultipleSigners(signingInfo) ? Api28Impl.getApkContentsSigners(signingInfo) : Api28Impl.getSigningCertificateHistory(signingInfo);
        return apkContentsSigners == null ? Collections.EMPTY_LIST : Arrays.asList(apkContentsSigners);
    }

    public static boolean hasSignatures(PackageManager packageManager, String str, @Size(min = 1) Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Cert byte array cannot be null when verifying ", str));
                return false;
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Type must be specified for cert when verifying ", str));
                return false;
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                Single$$ExternalSyntheticBUOutline0.m("Unsupported certificate type ", num, " when verifying ", str);
                return false;
            }
        }
        List<Signature> signatures = getSignatures(packageManager, str);
        if (!z) {
            for (byte[] bArr3 : keySet) {
                if (!Api28Impl.hasSigningCertificate(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (signatures.size() != 0 && map.size() <= signatures.size() && (!z || map.size() == signatures.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[signatures.size()][];
                for (int i = 0; i < signatures.size(); i++) {
                    bArr[i] = computeSHA256Digest(signatures.get(i).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it2 = keySet.iterator();
            if (it2.hasNext()) {
                byte[] next = it2.next();
                Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        Gson$$ExternalSyntheticBUOutline0.m((Object) num2, "Unsupported certificate type ");
                        return false;
                    }
                    if (!byteArrayContains(bArr, next)) {
                        return false;
                    }
                } else if (!signatures.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
