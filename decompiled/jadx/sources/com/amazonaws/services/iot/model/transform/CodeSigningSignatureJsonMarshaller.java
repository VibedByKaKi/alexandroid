package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CodeSigningSignature;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CodeSigningSignatureJsonMarshaller {
    private static CodeSigningSignatureJsonMarshaller instance;

    public static CodeSigningSignatureJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CodeSigningSignatureJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CodeSigningSignature codeSigningSignature, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (codeSigningSignature.getInlineDocument() != null) {
            ByteBuffer inlineDocument = codeSigningSignature.getInlineDocument();
            awsJsonWriter.name("inlineDocument");
            awsJsonWriter.value(inlineDocument);
        }
        awsJsonWriter.endObject();
    }
}
