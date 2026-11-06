package com.amazon.alexa.utils.security;

import java.util.Properties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TrustedFingerPrintSignature {
    private static final String MEDIATEK_PACKAGE_NAME = "com.magiear.handsfree.assistant";
    private static final String MOTOROLA_PACKAGE_NAME = "com.motorola.motoalexa";
    private static final String QUALCOMM_PACKAGE_NAME = "com.quicinc.voice.activation";
    static final Properties TRUSTED_FINGERPRINTS = new Properties() { // from class: com.amazon.alexa.utils.security.TrustedFingerPrintSignature.1
        {
            put("com.quicinc.voice.activation", "f6782bf3f66a5e8381ec470fe045894e4b72a982bf88ac594b78bc6c077afd8e");
            put("com.motorola.motoalexa", "c463fa2a0351086dd6328d9daf6218146ee1651521c1cb6b4c538f85eeec7a3c");
            put(TrustedFingerPrintSignature.MEDIATEK_PACKAGE_NAME, "6e6e503630e3b4b645ea2ea6d9a3b0e2841902cac840e508e44488c3ad807fb3");
        }
    };
    static final Properties DEBUG_TRUSTED_FINGERPRINTS = new Properties() { // from class: com.amazon.alexa.utils.security.TrustedFingerPrintSignature.2
        {
            put("com.quicinc.voice.activation", "a40da80a59d170caa950cf15c18c454d47a39b26989d8b640ecd745ba71bf5dc");
            put("com.motorola.motoalexa", "9d6eae941e0746dbba295d3b5551718dc6b5adbb553b3268acfc2df6191ac3b6");
            put(TrustedFingerPrintSignature.MEDIATEK_PACKAGE_NAME, "3b8cfba7a9a22a1fe8ee8fb57f57120020106b9176c14ea2b6498aa16853a10f");
        }
    };
    static final Properties QUEBEC_ADDITIONAL_TRUSTED_FINGERPRINT = new Properties() { // from class: com.amazon.alexa.utils.security.TrustedFingerPrintSignature.3
        {
            put("com.quicinc.voice.activation", "23a6cc7508e93287eed7464a8c07b1dcd0a68b0ae05ee61f9d6262e611537bf1");
        }
    };
}
