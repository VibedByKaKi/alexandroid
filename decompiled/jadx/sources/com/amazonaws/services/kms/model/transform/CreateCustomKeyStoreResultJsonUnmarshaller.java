package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.CreateCustomKeyStoreResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateCustomKeyStoreResultJsonUnmarshaller implements Unmarshaller<CreateCustomKeyStoreResult, JsonUnmarshallerContext> {
    private static CreateCustomKeyStoreResultJsonUnmarshaller instance;

    public static CreateCustomKeyStoreResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateCustomKeyStoreResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateCustomKeyStoreResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateCustomKeyStoreResult createCustomKeyStoreResult = new CreateCustomKeyStoreResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("CustomKeyStoreId")) {
                createCustomKeyStoreResult.setCustomKeyStoreId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createCustomKeyStoreResult;
    }
}
