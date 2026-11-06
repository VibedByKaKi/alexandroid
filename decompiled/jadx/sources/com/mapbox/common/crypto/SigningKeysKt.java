package com.mapbox.common.crypto;

import com.amazon.whispercloak.KeyUtils;
import com.mapbox.bindgen.DataRef;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.interfaces.ECKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"asByteArray", "", "dataRef", "Lcom/mapbox/bindgen/DataRef;", "getSignatureAlgorithm", "Lcom/mapbox/common/crypto/SignatureAlgorithm;", "algo", "", "getSignatureName", "algorithm", "javaKey", "Ljava/security/Key;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class SigningKeysKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            try {
                iArr[SignatureAlgorithm.ECDSA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] asByteArray(DataRef dataRef) {
        ByteBuffer buffer = dataRef.getBuffer();
        buffer.getClass();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignatureAlgorithm getSignatureAlgorithm(String str) {
        if (Intrinsics.areEqual(str, KeyUtils.ALGORITHM_EC)) {
            return SignatureAlgorithm.ECDSA;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unsupported algorithm: ", str));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSignatureName(SignatureAlgorithm signatureAlgorithm, Key key) {
        if (WhenMappings.$EnumSwitchMapping$0[signatureAlgorithm.ordinal()] != 1) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        key.getClass();
        int fieldSize = ((ECKey) key).getParams().getCurve().getField().getFieldSize();
        if (fieldSize == 256) {
            return "SHA256withECDSA";
        }
        if (fieldSize == 384) {
            return "SHA384withECDSA";
        }
        if (fieldSize == 521) {
            return "SHA512withECDSA";
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(fieldSize, "Unsupported ECDSA key size: "));
        return null;
    }
}
