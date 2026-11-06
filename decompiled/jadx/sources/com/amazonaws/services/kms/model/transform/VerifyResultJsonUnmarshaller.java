package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.VerifyResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class VerifyResultJsonUnmarshaller implements Unmarshaller<VerifyResult, JsonUnmarshallerContext> {
    private static VerifyResultJsonUnmarshaller instance;

    public static VerifyResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new VerifyResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public VerifyResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        VerifyResult verifyResult = new VerifyResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("KeyId")) {
                verifyResult.setKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("SignatureValid")) {
                verifyResult.setSignatureValid(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("SigningAlgorithm")) {
                verifyResult.setSigningAlgorithm(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return verifyResult;
    }
}
