package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CloudwatchLogsAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CloudwatchLogsActionJsonMarshaller {
    private static CloudwatchLogsActionJsonMarshaller instance;

    public static CloudwatchLogsActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CloudwatchLogsActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CloudwatchLogsAction cloudwatchLogsAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (cloudwatchLogsAction.getRoleArn() != null) {
            String roleArn = cloudwatchLogsAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (cloudwatchLogsAction.getLogGroupName() != null) {
            String logGroupName = cloudwatchLogsAction.getLogGroupName();
            awsJsonWriter.name("logGroupName");
            awsJsonWriter.value(logGroupName);
        }
        awsJsonWriter.endObject();
    }
}
