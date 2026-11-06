package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.IotAnalyticsAction;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IotAnalyticsActionJsonUnmarshaller implements Unmarshaller<IotAnalyticsAction, JsonUnmarshallerContext> {
    private static IotAnalyticsActionJsonUnmarshaller instance;

    public static IotAnalyticsActionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new IotAnalyticsActionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public IotAnalyticsAction unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IotAnalyticsAction iotAnalyticsAction = new IotAnalyticsAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("channelArn")) {
                iotAnalyticsAction.setChannelArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("channelName")) {
                iotAnalyticsAction.setChannelName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("batchMode")) {
                iotAnalyticsAction.setBatchMode(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("roleArn")) {
                iotAnalyticsAction.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return iotAnalyticsAction;
    }
}
