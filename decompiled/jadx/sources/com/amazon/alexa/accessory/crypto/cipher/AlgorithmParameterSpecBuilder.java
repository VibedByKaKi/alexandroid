package com.amazon.alexa.accessory.crypto.cipher;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.google.protobuf.ByteString;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AlgorithmParameterSpecBuilder {
    public static final int AES_GCM_TAG_LENGTH_BITS = 128;
    public static final AlgorithmParameterSpecBuilder GCM_PARAMETER_BUILDER;
    public static final AlgorithmParameterSpecBuilder IV_PARAMETER_BUILDER;

    static {
        final int i = 0;
        GCM_PARAMETER_BUILDER = new AlgorithmParameterSpecBuilder() { // from class: com.amazon.alexa.accessory.crypto.cipher.AlgorithmParameterSpecBuilder$$ExternalSyntheticLambda0
            @Override // com.amazon.alexa.accessory.crypto.cipher.AlgorithmParameterSpecBuilder
            public final AlgorithmParameterSpec build(byte[] bArr, int i2, int i3) {
                AlgorithmParameterSpec lambda$static$0;
                switch (i) {
                    case 0:
                        lambda$static$0 = AlgorithmParameterSpecBuilder.lambda$static$0(bArr, i2, i3);
                        return lambda$static$0;
                    default:
                        return new IvParameterSpec(bArr, i2, i3);
                }
            }
        };
        final int i2 = 1;
        IV_PARAMETER_BUILDER = new AlgorithmParameterSpecBuilder() { // from class: com.amazon.alexa.accessory.crypto.cipher.AlgorithmParameterSpecBuilder$$ExternalSyntheticLambda0
            @Override // com.amazon.alexa.accessory.crypto.cipher.AlgorithmParameterSpecBuilder
            public final AlgorithmParameterSpec build(byte[] bArr, int i22, int i3) {
                AlgorithmParameterSpec lambda$static$0;
                switch (i2) {
                    case 0:
                        lambda$static$0 = AlgorithmParameterSpecBuilder.lambda$static$0(bArr, i22, i3);
                        return lambda$static$0;
                    default:
                        return new IvParameterSpec(bArr, i22, i3);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ AlgorithmParameterSpec lambda$static$0(byte[] bArr, int i, int i2) {
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    default AlgorithmParameterSpec build(ByteString byteString) {
        Preconditions.notNull(byteString, "iv");
        return build(byteString.toByteArray(), 0, byteString.size());
    }

    AlgorithmParameterSpec build(byte[] bArr, int i, int i2);

    default AlgorithmParameterSpec build(byte[] bArr) {
        Preconditions.notNull(bArr, "iv");
        return build(bArr, 0, bArr.length);
    }
}
