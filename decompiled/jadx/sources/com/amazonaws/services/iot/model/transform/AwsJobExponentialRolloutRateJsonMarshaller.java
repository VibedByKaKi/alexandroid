package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobExponentialRolloutRate;
import com.amazonaws.services.iot.model.AwsJobRateIncreaseCriteria;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobExponentialRolloutRateJsonMarshaller {
    private static AwsJobExponentialRolloutRateJsonMarshaller instance;

    public static AwsJobExponentialRolloutRateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobExponentialRolloutRateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AwsJobExponentialRolloutRate awsJobExponentialRolloutRate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (awsJobExponentialRolloutRate.getBaseRatePerMinute() != null) {
            Integer baseRatePerMinute = awsJobExponentialRolloutRate.getBaseRatePerMinute();
            awsJsonWriter.name("baseRatePerMinute");
            awsJsonWriter.value(baseRatePerMinute);
        }
        if (awsJobExponentialRolloutRate.getIncrementFactor() != null) {
            Double incrementFactor = awsJobExponentialRolloutRate.getIncrementFactor();
            awsJsonWriter.name("incrementFactor");
            awsJsonWriter.value(incrementFactor);
        }
        if (awsJobExponentialRolloutRate.getRateIncreaseCriteria() != null) {
            AwsJobRateIncreaseCriteria rateIncreaseCriteria = awsJobExponentialRolloutRate.getRateIncreaseCriteria();
            awsJsonWriter.name("rateIncreaseCriteria");
            AwsJobRateIncreaseCriteriaJsonMarshaller.getInstance().marshall(rateIncreaseCriteria, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
