package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobRateIncreaseCriteria;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobRateIncreaseCriteriaJsonMarshaller {
    private static AwsJobRateIncreaseCriteriaJsonMarshaller instance;

    public static AwsJobRateIncreaseCriteriaJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobRateIncreaseCriteriaJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AwsJobRateIncreaseCriteria awsJobRateIncreaseCriteria, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (awsJobRateIncreaseCriteria.getNumberOfNotifiedThings() != null) {
            Integer numberOfNotifiedThings = awsJobRateIncreaseCriteria.getNumberOfNotifiedThings();
            awsJsonWriter.name("numberOfNotifiedThings");
            awsJsonWriter.value(numberOfNotifiedThings);
        }
        if (awsJobRateIncreaseCriteria.getNumberOfSucceededThings() != null) {
            Integer numberOfSucceededThings = awsJobRateIncreaseCriteria.getNumberOfSucceededThings();
            awsJsonWriter.name("numberOfSucceededThings");
            awsJsonWriter.value(numberOfSucceededThings);
        }
        awsJsonWriter.endObject();
    }
}
