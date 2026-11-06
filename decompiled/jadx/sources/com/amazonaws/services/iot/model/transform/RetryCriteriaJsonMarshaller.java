package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallFailureBundleKeys;
import com.amazonaws.services.iot.model.RetryCriteria;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RetryCriteriaJsonMarshaller {
    private static RetryCriteriaJsonMarshaller instance;

    public static RetryCriteriaJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RetryCriteriaJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RetryCriteria retryCriteria, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (retryCriteria.getFailureType() != null) {
            String failureType = retryCriteria.getFailureType();
            awsJsonWriter.name(ApiCallFailureBundleKeys.FAILURE_TYPE);
            awsJsonWriter.value(failureType);
        }
        if (retryCriteria.getNumberOfRetries() != null) {
            Integer numberOfRetries = retryCriteria.getNumberOfRetries();
            awsJsonWriter.name("numberOfRetries");
            awsJsonWriter.value(numberOfRetries);
        }
        awsJsonWriter.endObject();
    }
}
