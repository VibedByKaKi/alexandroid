package org.bouncycastle.asn1.ocsp;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.commons.lang3.function.FailableToIntFunction;
import org.apache.commons.lang3.function.FailableToLongBiFunction;
import org.apache.commons.lang3.function.FailableToLongFunction;
import org.apache.http.ParseException;
import org.apache.http.cookie.MalformedCookieException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.apihelpers.RedirectHandler;
import org.chromium.net.apihelpers.RedirectHandlers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class CrlID$$ExternalSyntheticBUOutline0 implements FailableToIntFunction, FailableToLongBiFunction, FailableToLongFunction, RedirectHandler {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CrlID$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        throw new SSLPeerUnverifiedException("Certificate for <" + obj + ((Object) "> doesn't match any of the subject alternative names: ") + obj2);
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new MalformedCookieException(str + ((Object) obj.toString()) + ((Object) "'"));
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new ParseException(str + obj);
    }

    public static /* synthetic */ void m$3(Object obj, String str) {
        throw new RuntimeException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void m$4(Object obj, String str) {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    public static /* synthetic */ void m$5(Object obj, String str) {
        throw new SecurityException(str + obj);
    }

    public static /* synthetic */ void m$6(String str) {
        throw new InvalidKeyException(str);
    }

    public static /* synthetic */ void m$7(String str) {
        throw new AnnotatedException(str);
    }

    public static /* synthetic */ void m$8(String str) {
        throw new InvalidParameterException(str);
    }

    @Override // org.apache.commons.lang3.function.FailableToIntFunction
    public int applyAsInt(Object obj) {
        int lambda$static$0;
        lambda$static$0 = FailableToIntFunction.lambda$static$0(obj);
        return lambda$static$0;
    }

    @Override // org.apache.commons.lang3.function.FailableToLongFunction
    public long applyAsLong(Object obj) {
        long lambda$static$0;
        lambda$static$0 = FailableToLongFunction.lambda$static$0(obj);
        return lambda$static$0;
    }

    @Override // org.chromium.net.apihelpers.RedirectHandler
    public boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
        boolean lambda$neverFollow$0;
        boolean lambda$alwaysFollow$1;
        switch (this.$r8$classId) {
            case 28:
                lambda$neverFollow$0 = RedirectHandlers.lambda$neverFollow$0(urlResponseInfo, str);
                return lambda$neverFollow$0;
            default:
                lambda$alwaysFollow$1 = RedirectHandlers.lambda$alwaysFollow$1(urlResponseInfo, str);
                return lambda$alwaysFollow$1;
        }
    }

    @Override // org.apache.commons.lang3.function.FailableToLongBiFunction
    public long applyAsLong(Object obj, Object obj2) {
        long lambda$static$0;
        lambda$static$0 = FailableToLongBiFunction.lambda$static$0(obj, obj2);
        return lambda$static$0;
    }

    public static /* synthetic */ void m$2(Object obj) {
        throw new InvalidKeySpecException(obj.toString());
    }

    public static /* synthetic */ void m$5(String str) {
        throw new InvalidAlgorithmParameterException(str);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new OutputLengthException(str);
    }

    public static /* synthetic */ void m$3(String str) {
        throw new DataLengthException(str);
    }

    public static /* synthetic */ void m$4(String str) {
        throw new InvalidParameterSpecException(str);
    }

    public static /* synthetic */ void m$1(Object obj) {
        throw new IOException("Error encoding certificate: " + ((Object) obj.toString()));
    }

    public static /* synthetic */ void m(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m$1(String str) {
        throw new InvalidCipherTextException(str);
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void m(Object obj) {
        throw new SignatureException(obj.toString());
    }

    public static /* synthetic */ void m(int i) {
        throw new StringIndexOutOfBoundsException(i);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new StringIndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new AnnotatedException(str, th);
    }

    public static /* synthetic */ void m(String str, Throwable th, CertPath certPath, int i) {
        throw new ExtCertPathValidatorException(str, th, certPath, i);
    }

    public static /* synthetic */ void m(AlgorithmParameters algorithmParameters) {
        throw new InvalidAlgorithmParameterException("can't handle parameter " + ((Object) algorithmParameters.toString()));
    }
}
