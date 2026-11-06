package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.IotAnalyticsAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IotAnalyticsActionJsonMarshaller {
    private static IotAnalyticsActionJsonMarshaller instance;

    public static IotAnalyticsActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new IotAnalyticsActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(IotAnalyticsAction iotAnalyticsAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (iotAnalyticsAction.getChannelArn() != null) {
            String channelArn = iotAnalyticsAction.getChannelArn();
            awsJsonWriter.name("channelArn");
            awsJsonWriter.value(channelArn);
        }
        if (iotAnalyticsAction.getChannelName() != null) {
            String channelName = iotAnalyticsAction.getChannelName();
            awsJsonWriter.name("channelName");
            awsJsonWriter.value(channelName);
        }
        if (iotAnalyticsAction.getBatchMode() != null) {
            Boolean batchMode = iotAnalyticsAction.getBatchMode();
            awsJsonWriter.name("batchMode");
            awsJsonWriter.value(batchMode.booleanValue());
        }
        if (iotAnalyticsAction.getRoleArn() != null) {
            String roleArn = iotAnalyticsAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
