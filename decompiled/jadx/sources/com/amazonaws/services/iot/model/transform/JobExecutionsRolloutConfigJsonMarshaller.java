package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ExponentialRolloutRate;
import com.amazonaws.services.iot.model.JobExecutionsRolloutConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionsRolloutConfigJsonMarshaller {
    private static JobExecutionsRolloutConfigJsonMarshaller instance;

    public static JobExecutionsRolloutConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionsRolloutConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobExecutionsRolloutConfig jobExecutionsRolloutConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobExecutionsRolloutConfig.getMaximumPerMinute() != null) {
            Integer maximumPerMinute = jobExecutionsRolloutConfig.getMaximumPerMinute();
            awsJsonWriter.name("maximumPerMinute");
            awsJsonWriter.value(maximumPerMinute);
        }
        if (jobExecutionsRolloutConfig.getExponentialRate() != null) {
            ExponentialRolloutRate exponentialRate = jobExecutionsRolloutConfig.getExponentialRate();
            awsJsonWriter.name("exponentialRate");
            ExponentialRolloutRateJsonMarshaller.getInstance().marshall(exponentialRate, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
