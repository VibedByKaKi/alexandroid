package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreateThingTypeResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingTypeResultJsonUnmarshaller implements Unmarshaller<CreateThingTypeResult, JsonUnmarshallerContext> {
    private static CreateThingTypeResultJsonUnmarshaller instance;

    public static CreateThingTypeResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateThingTypeResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateThingTypeResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateThingTypeResult createThingTypeResult = new CreateThingTypeResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("thingTypeName")) {
                createThingTypeResult.setThingTypeName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("thingTypeArn")) {
                createThingTypeResult.setThingTypeArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("thingTypeId")) {
                createThingTypeResult.setThingTypeId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createThingTypeResult;
    }
}
