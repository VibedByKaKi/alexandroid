package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.CreateKeyResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateKeyResultJsonUnmarshaller implements Unmarshaller<CreateKeyResult, JsonUnmarshallerContext> {
    private static CreateKeyResultJsonUnmarshaller instance;

    public static CreateKeyResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateKeyResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateKeyResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateKeyResult createKeyResult = new CreateKeyResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("KeyMetadata")) {
                createKeyResult.setKeyMetadata(KeyMetadataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createKeyResult;
    }
}
