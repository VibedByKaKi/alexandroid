package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.DecryptResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DecryptResultJsonUnmarshaller implements Unmarshaller<DecryptResult, JsonUnmarshallerContext> {
    private static DecryptResultJsonUnmarshaller instance;

    public static DecryptResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DecryptResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DecryptResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DecryptResult decryptResult = new DecryptResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("KeyId")) {
                decryptResult.setKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Plaintext")) {
                decryptResult.setPlaintext(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EncryptionAlgorithm")) {
                decryptResult.setEncryptionAlgorithm(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return decryptResult;
    }
}
