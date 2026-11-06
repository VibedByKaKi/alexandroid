package com.amazon.crypto.asymmetric;

import com.amazonaws.services.s3.internal.crypto.S3KeyWrapScheme;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum AsymmetricCryptoParameters {
    SHA1(Constants.SHA1_PARAMETER_SPEC, S3KeyWrapScheme.RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING),
    SHA256(Constants.SHA256_PARAMETER_SPEC, S3KeyWrapScheme.RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING);

    private final AlgorithmParameterSpec parameterSpec;
    private final String transformation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Constants {
        private static final String DEFAULT_TRANSFORMATION = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
        private static final AlgorithmParameterSpec SHA1_PARAMETER_SPEC;
        private static final AlgorithmParameterSpec SHA256_PARAMETER_SPEC;

        static {
            MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA1;
            PSource.PSpecified pSpecified = PSource.PSpecified.DEFAULT;
            SHA1_PARAMETER_SPEC = new OAEPParameterSpec("SHA-1", "MGF1", mGF1ParameterSpec, pSpecified);
            SHA256_PARAMETER_SPEC = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, pSpecified);
        }

        private Constants() {
        }
    }

    AsymmetricCryptoParameters(AlgorithmParameterSpec algorithmParameterSpec, String str) {
        this.parameterSpec = algorithmParameterSpec;
        this.transformation = str;
    }

    public AlgorithmParameterSpec getParameterSpec() {
        return this.parameterSpec;
    }

    public String getTransformation() {
        return this.transformation;
    }
}
