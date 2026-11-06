package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreateThingGroupResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingGroupResultJsonUnmarshaller implements Unmarshaller<CreateThingGroupResult, JsonUnmarshallerContext> {
    private static CreateThingGroupResultJsonUnmarshaller instance;

    public static CreateThingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateThingGroupResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateThingGroupResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateThingGroupResult createThingGroupResult = new CreateThingGroupResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("thingGroupName")) {
                createThingGroupResult.setThingGroupName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("thingGroupArn")) {
                createThingGroupResult.setThingGroupArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("thingGroupId")) {
                createThingGroupResult.setThingGroupId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createThingGroupResult;
    }
}
