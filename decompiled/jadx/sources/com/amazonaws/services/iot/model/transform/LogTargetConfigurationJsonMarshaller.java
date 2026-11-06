package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.LogTarget;
import com.amazonaws.services.iot.model.LogTargetConfiguration;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class LogTargetConfigurationJsonMarshaller {
    private static LogTargetConfigurationJsonMarshaller instance;

    public static LogTargetConfigurationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LogTargetConfigurationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LogTargetConfiguration logTargetConfiguration, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (logTargetConfiguration.getLogTarget() != null) {
            LogTarget logTarget = logTargetConfiguration.getLogTarget();
            awsJsonWriter.name("logTarget");
            LogTargetJsonMarshaller.getInstance().marshall(logTarget, awsJsonWriter);
        }
        if (logTargetConfiguration.getLogLevel() != null) {
            String logLevel = logTargetConfiguration.getLogLevel();
            awsJsonWriter.name("logLevel");
            awsJsonWriter.value(logLevel);
        }
        awsJsonWriter.endObject();
    }
}
