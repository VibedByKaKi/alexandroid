package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.LambdaAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class LambdaActionJsonMarshaller {
    private static LambdaActionJsonMarshaller instance;

    public static LambdaActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LambdaActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LambdaAction lambdaAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (lambdaAction.getFunctionArn() != null) {
            String functionArn = lambdaAction.getFunctionArn();
            awsJsonWriter.name("functionArn");
            awsJsonWriter.value(functionArn);
        }
        awsJsonWriter.endObject();
    }
}
