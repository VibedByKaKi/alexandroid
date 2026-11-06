package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TimeoutConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TimeoutConfigJsonMarshaller {
    private static TimeoutConfigJsonMarshaller instance;

    public static TimeoutConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TimeoutConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TimeoutConfig timeoutConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (timeoutConfig.getInProgressTimeoutInMinutes() != null) {
            Long inProgressTimeoutInMinutes = timeoutConfig.getInProgressTimeoutInMinutes();
            awsJsonWriter.name("inProgressTimeoutInMinutes");
            awsJsonWriter.value(inProgressTimeoutInMinutes);
        }
        awsJsonWriter.endObject();
    }
}
