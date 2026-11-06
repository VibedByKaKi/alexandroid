package com.mapbox.common.crypto;

import com.amazon.whispercloak.KeyUtils;
import com.mapbox.bindgen.DataRef;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"asByteArray", "", "dataRef", "Lcom/mapbox/bindgen/DataRef;", "keyName", "", "Lcom/mapbox/common/crypto/SignatureAlgorithm;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class KeyReaderImplKt {

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
    public static final String keyName(SignatureAlgorithm signatureAlgorithm) {
        if (WhenMappings.$EnumSwitchMapping$0[signatureAlgorithm.ordinal()] == 1) {
            return KeyUtils.ALGORITHM_EC;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
