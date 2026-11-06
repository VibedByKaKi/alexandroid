package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ExponentialRolloutRate;
import com.amazonaws.services.iot.model.RateIncreaseCriteria;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ExponentialRolloutRateJsonMarshaller {
    private static ExponentialRolloutRateJsonMarshaller instance;

    public static ExponentialRolloutRateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ExponentialRolloutRateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ExponentialRolloutRate exponentialRolloutRate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (exponentialRolloutRate.getBaseRatePerMinute() != null) {
            Integer baseRatePerMinute = exponentialRolloutRate.getBaseRatePerMinute();
            awsJsonWriter.name("baseRatePerMinute");
            awsJsonWriter.value(baseRatePerMinute);
        }
        if (exponentialRolloutRate.getIncrementFactor() != null) {
            Double incrementFactor = exponentialRolloutRate.getIncrementFactor();
            awsJsonWriter.name("incrementFactor");
            awsJsonWriter.value(incrementFactor);
        }
        if (exponentialRolloutRate.getRateIncreaseCriteria() != null) {
            RateIncreaseCriteria rateIncreaseCriteria = exponentialRolloutRate.getRateIncreaseCriteria();
            awsJsonWriter.name("rateIncreaseCriteria");
            RateIncreaseCriteriaJsonMarshaller.getInstance().marshall(rateIncreaseCriteria, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
