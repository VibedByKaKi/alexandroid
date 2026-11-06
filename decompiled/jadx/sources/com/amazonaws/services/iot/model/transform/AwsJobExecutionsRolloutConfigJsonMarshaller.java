package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobExecutionsRolloutConfig;
import com.amazonaws.services.iot.model.AwsJobExponentialRolloutRate;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobExecutionsRolloutConfigJsonMarshaller {
    private static AwsJobExecutionsRolloutConfigJsonMarshaller instance;

    public static AwsJobExecutionsRolloutConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobExecutionsRolloutConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (awsJobExecutionsRolloutConfig.getMaximumPerMinute() != null) {
            Integer maximumPerMinute = awsJobExecutionsRolloutConfig.getMaximumPerMinute();
            awsJsonWriter.name("maximumPerMinute");
            awsJsonWriter.value(maximumPerMinute);
        }
        if (awsJobExecutionsRolloutConfig.getExponentialRate() != null) {
            AwsJobExponentialRolloutRate exponentialRate = awsJobExecutionsRolloutConfig.getExponentialRate();
            awsJsonWriter.name("exponentialRate");
            AwsJobExponentialRolloutRateJsonMarshaller.getInstance().marshall(exponentialRate, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
