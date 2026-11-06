package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CloudwatchAlarmAction;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CloudwatchAlarmActionJsonUnmarshaller implements Unmarshaller<CloudwatchAlarmAction, JsonUnmarshallerContext> {
    private static CloudwatchAlarmActionJsonUnmarshaller instance;

    public static CloudwatchAlarmActionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CloudwatchAlarmActionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CloudwatchAlarmAction unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CloudwatchAlarmAction cloudwatchAlarmAction = new CloudwatchAlarmAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("roleArn")) {
                cloudwatchAlarmAction.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("alarmName")) {
                cloudwatchAlarmAction.setAlarmName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("stateReason")) {
                cloudwatchAlarmAction.setStateReason(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("stateValue")) {
                cloudwatchAlarmAction.setStateValue(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cloudwatchAlarmAction;
    }
}
