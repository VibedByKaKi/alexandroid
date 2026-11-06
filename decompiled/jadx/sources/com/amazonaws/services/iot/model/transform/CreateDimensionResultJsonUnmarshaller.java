package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreateDimensionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateDimensionResultJsonUnmarshaller implements Unmarshaller<CreateDimensionResult, JsonUnmarshallerContext> {
    private static CreateDimensionResultJsonUnmarshaller instance;

    public static CreateDimensionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateDimensionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateDimensionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateDimensionResult createDimensionResult = new CreateDimensionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("name")) {
                createDimensionResult.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("arn")) {
                createDimensionResult.setArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createDimensionResult;
    }
}
