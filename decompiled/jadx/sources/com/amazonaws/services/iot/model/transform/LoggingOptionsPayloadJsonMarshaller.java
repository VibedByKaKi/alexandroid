package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.LoggingOptionsPayload;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class LoggingOptionsPayloadJsonMarshaller {
    private static LoggingOptionsPayloadJsonMarshaller instance;

    public static LoggingOptionsPayloadJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LoggingOptionsPayloadJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LoggingOptionsPayload loggingOptionsPayload, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (loggingOptionsPayload.getRoleArn() != null) {
            String roleArn = loggingOptionsPayload.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (loggingOptionsPayload.getLogLevel() != null) {
            String logLevel = loggingOptionsPayload.getLogLevel();
            awsJsonWriter.name("logLevel");
            awsJsonWriter.value(logLevel);
        }
        awsJsonWriter.endObject();
    }
}
