package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazonaws.services.iot.model.CodeSigningCertificateChain;
import com.amazonaws.services.iot.model.CodeSigningSignature;
import com.amazonaws.services.iot.model.CustomCodeSigning;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CustomCodeSigningJsonMarshaller {
    private static CustomCodeSigningJsonMarshaller instance;

    public static CustomCodeSigningJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CustomCodeSigningJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CustomCodeSigning customCodeSigning, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (customCodeSigning.getSignature() != null) {
            CodeSigningSignature signature = customCodeSigning.getSignature();
            awsJsonWriter.name(PayloadUtils.PayloadKeys.SIGNATURE);
            CodeSigningSignatureJsonMarshaller.getInstance().marshall(signature, awsJsonWriter);
        }
        if (customCodeSigning.getCertificateChain() != null) {
            CodeSigningCertificateChain certificateChain = customCodeSigning.getCertificateChain();
            awsJsonWriter.name("certificateChain");
            CodeSigningCertificateChainJsonMarshaller.getInstance().marshall(certificateChain, awsJsonWriter);
        }
        if (customCodeSigning.getHashAlgorithm() != null) {
            String hashAlgorithm = customCodeSigning.getHashAlgorithm();
            awsJsonWriter.name("hashAlgorithm");
            awsJsonWriter.value(hashAlgorithm);
        }
        if (customCodeSigning.getSignatureAlgorithm() != null) {
            String signatureAlgorithm = customCodeSigning.getSignatureAlgorithm();
            awsJsonWriter.name("signatureAlgorithm");
            awsJsonWriter.value(signatureAlgorithm);
        }
        awsJsonWriter.endObject();
    }
}
