package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CodeSigningSignature;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CodeSigningSignatureJsonUnmarshaller implements Unmarshaller<CodeSigningSignature, JsonUnmarshallerContext> {
    private static CodeSigningSignatureJsonUnmarshaller instance;

    public static CodeSigningSignatureJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CodeSigningSignatureJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CodeSigningSignature unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CodeSigningSignature codeSigningSignature = new CodeSigningSignature();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("inlineDocument")) {
                codeSigningSignature.setInlineDocument(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return codeSigningSignature;
    }
}
