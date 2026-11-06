package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreateJobTemplateResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateJobTemplateResultJsonUnmarshaller implements Unmarshaller<CreateJobTemplateResult, JsonUnmarshallerContext> {
    private static CreateJobTemplateResultJsonUnmarshaller instance;

    public static CreateJobTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateJobTemplateResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateJobTemplateResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateJobTemplateResult createJobTemplateResult = new CreateJobTemplateResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("jobTemplateArn")) {
                createJobTemplateResult.setJobTemplateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("jobTemplateId")) {
                createJobTemplateResult.setJobTemplateId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createJobTemplateResult;
    }
}
