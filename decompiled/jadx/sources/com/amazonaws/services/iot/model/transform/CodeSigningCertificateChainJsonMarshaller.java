package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CodeSigningCertificateChain;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CodeSigningCertificateChainJsonMarshaller {
    private static CodeSigningCertificateChainJsonMarshaller instance;

    public static CodeSigningCertificateChainJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CodeSigningCertificateChainJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CodeSigningCertificateChain codeSigningCertificateChain, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (codeSigningCertificateChain.getCertificateName() != null) {
            String certificateName = codeSigningCertificateChain.getCertificateName();
            awsJsonWriter.name("certificateName");
            awsJsonWriter.value(certificateName);
        }
        if (codeSigningCertificateChain.getInlineDocument() != null) {
            String inlineDocument = codeSigningCertificateChain.getInlineDocument();
            awsJsonWriter.name("inlineDocument");
            awsJsonWriter.value(inlineDocument);
        }
        awsJsonWriter.endObject();
    }
}
