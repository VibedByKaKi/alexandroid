package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.StepFunctionsAction;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StepFunctionsActionJsonUnmarshaller implements Unmarshaller<StepFunctionsAction, JsonUnmarshallerContext> {
    private static StepFunctionsActionJsonUnmarshaller instance;

    public static StepFunctionsActionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StepFunctionsActionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StepFunctionsAction unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StepFunctionsAction stepFunctionsAction = new StepFunctionsAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("executionNamePrefix")) {
                stepFunctionsAction.setExecutionNamePrefix(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("stateMachineName")) {
                stepFunctionsAction.setStateMachineName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("roleArn")) {
                stepFunctionsAction.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return stepFunctionsAction;
    }
}
