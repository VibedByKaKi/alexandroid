package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.RateIncreaseCriteria;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RateIncreaseCriteriaJsonMarshaller {
    private static RateIncreaseCriteriaJsonMarshaller instance;

    public static RateIncreaseCriteriaJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RateIncreaseCriteriaJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RateIncreaseCriteria rateIncreaseCriteria, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (rateIncreaseCriteria.getNumberOfNotifiedThings() != null) {
            Integer numberOfNotifiedThings = rateIncreaseCriteria.getNumberOfNotifiedThings();
            awsJsonWriter.name("numberOfNotifiedThings");
            awsJsonWriter.value(numberOfNotifiedThings);
        }
        if (rateIncreaseCriteria.getNumberOfSucceededThings() != null) {
            Integer numberOfSucceededThings = rateIncreaseCriteria.getNumberOfSucceededThings();
            awsJsonWriter.name("numberOfSucceededThings");
            awsJsonWriter.value(numberOfSucceededThings);
        }
        awsJsonWriter.endObject();
    }
}
