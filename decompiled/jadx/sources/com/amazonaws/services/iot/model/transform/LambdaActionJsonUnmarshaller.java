package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.LambdaAction;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class LambdaActionJsonUnmarshaller implements Unmarshaller<LambdaAction, JsonUnmarshallerContext> {
    private static LambdaActionJsonUnmarshaller instance;

    public static LambdaActionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new LambdaActionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public LambdaAction unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LambdaAction lambdaAction = new LambdaAction();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("functionArn")) {
                lambdaAction.setFunctionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return lambdaAction;
    }
}
