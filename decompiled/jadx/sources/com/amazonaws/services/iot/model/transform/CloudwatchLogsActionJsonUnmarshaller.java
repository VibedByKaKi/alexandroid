package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CloudwatchLogsAction;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CloudwatchLogsActionJsonUnmarshaller implements Unmarshaller<CloudwatchLogsAction, JsonUnmarshallerContext> {
    private static CloudwatchLogsActionJsonUnmarshaller instance;

    public static CloudwatchLogsActionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CloudwatchLogsActionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CloudwatchLogsAction unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CloudwatchLogsAction cloudwatchLogsAction = new CloudwatchLogsAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("roleArn")) {
                cloudwatchLogsAction.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("logGroupName")) {
                cloudwatchLogsAction.setLogGroupName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cloudwatchLogsAction;
    }
}
