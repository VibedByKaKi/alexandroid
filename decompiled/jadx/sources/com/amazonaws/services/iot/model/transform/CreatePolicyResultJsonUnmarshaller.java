package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreatePolicyResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreatePolicyResultJsonUnmarshaller implements Unmarshaller<CreatePolicyResult, JsonUnmarshallerContext> {
    private static CreatePolicyResultJsonUnmarshaller instance;

    public static CreatePolicyResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreatePolicyResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreatePolicyResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreatePolicyResult createPolicyResult = new CreatePolicyResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("policyName")) {
                createPolicyResult.setPolicyName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("policyArn")) {
                createPolicyResult.setPolicyArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("policyDocument")) {
                createPolicyResult.setPolicyDocument(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("policyVersionId")) {
                createPolicyResult.setPolicyVersionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createPolicyResult;
    }
}
