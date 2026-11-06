package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CreatePolicyVersionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreatePolicyVersionResultJsonUnmarshaller implements Unmarshaller<CreatePolicyVersionResult, JsonUnmarshallerContext> {
    private static CreatePolicyVersionResultJsonUnmarshaller instance;

    public static CreatePolicyVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreatePolicyVersionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreatePolicyVersionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreatePolicyVersionResult createPolicyVersionResult = new CreatePolicyVersionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("policyArn")) {
                createPolicyVersionResult.setPolicyArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("policyDocument")) {
                createPolicyVersionResult.setPolicyDocument(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("policyVersionId")) {
                createPolicyVersionResult.setPolicyVersionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("isDefaultVersion")) {
                createPolicyVersionResult.setIsDefaultVersion(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createPolicyVersionResult;
    }
}
