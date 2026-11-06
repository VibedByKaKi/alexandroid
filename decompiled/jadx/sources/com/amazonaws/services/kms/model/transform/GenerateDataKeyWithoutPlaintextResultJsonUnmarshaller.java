package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller implements Unmarshaller<GenerateDataKeyWithoutPlaintextResult, JsonUnmarshallerContext> {
    private static GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller instance;

    public static GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GenerateDataKeyWithoutPlaintextResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintextResult = new GenerateDataKeyWithoutPlaintextResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("CiphertextBlob")) {
                generateDataKeyWithoutPlaintextResult.setCiphertextBlob(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("KeyId")) {
                generateDataKeyWithoutPlaintextResult.setKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return generateDataKeyWithoutPlaintextResult;
    }
}
