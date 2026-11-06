package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.PutItemInput;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PutItemInputJsonUnmarshaller implements Unmarshaller<PutItemInput, JsonUnmarshallerContext> {
    private static PutItemInputJsonUnmarshaller instance;

    public static PutItemInputJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutItemInputJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PutItemInput unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PutItemInput putItemInput = new PutItemInput();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("tableName")) {
                putItemInput.setTableName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putItemInput;
    }
}
