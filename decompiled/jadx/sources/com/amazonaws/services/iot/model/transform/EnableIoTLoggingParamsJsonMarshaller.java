package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.EnableIoTLoggingParams;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class EnableIoTLoggingParamsJsonMarshaller {
    private static EnableIoTLoggingParamsJsonMarshaller instance;

    public static EnableIoTLoggingParamsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EnableIoTLoggingParamsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EnableIoTLoggingParams enableIoTLoggingParams, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (enableIoTLoggingParams.getRoleArnForLogging() != null) {
            String roleArnForLogging = enableIoTLoggingParams.getRoleArnForLogging();
            awsJsonWriter.name("roleArnForLogging");
            awsJsonWriter.value(roleArnForLogging);
        }
        if (enableIoTLoggingParams.getLogLevel() != null) {
            String logLevel = enableIoTLoggingParams.getLogLevel();
            awsJsonWriter.name("logLevel");
            awsJsonWriter.value(logLevel);
        }
        awsJsonWriter.endObject();
    }
}
