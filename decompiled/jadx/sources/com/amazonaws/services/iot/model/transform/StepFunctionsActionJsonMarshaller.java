package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.StepFunctionsAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StepFunctionsActionJsonMarshaller {
    private static StepFunctionsActionJsonMarshaller instance;

    public static StepFunctionsActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StepFunctionsActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StepFunctionsAction stepFunctionsAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (stepFunctionsAction.getExecutionNamePrefix() != null) {
            String executionNamePrefix = stepFunctionsAction.getExecutionNamePrefix();
            awsJsonWriter.name("executionNamePrefix");
            awsJsonWriter.value(executionNamePrefix);
        }
        if (stepFunctionsAction.getStateMachineName() != null) {
            String stateMachineName = stepFunctionsAction.getStateMachineName();
            awsJsonWriter.name("stateMachineName");
            awsJsonWriter.value(stateMachineName);
        }
        if (stepFunctionsAction.getRoleArn() != null) {
            String roleArn = stepFunctionsAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
