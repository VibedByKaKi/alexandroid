package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobTimeoutConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobTimeoutConfigJsonMarshaller {
    private static AwsJobTimeoutConfigJsonMarshaller instance;

    public static AwsJobTimeoutConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobTimeoutConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AwsJobTimeoutConfig awsJobTimeoutConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (awsJobTimeoutConfig.getInProgressTimeoutInMinutes() != null) {
            Long inProgressTimeoutInMinutes = awsJobTimeoutConfig.getInProgressTimeoutInMinutes();
            awsJsonWriter.name("inProgressTimeoutInMinutes");
            awsJsonWriter.value(inProgressTimeoutInMinutes);
        }
        awsJsonWriter.endObject();
    }
}
