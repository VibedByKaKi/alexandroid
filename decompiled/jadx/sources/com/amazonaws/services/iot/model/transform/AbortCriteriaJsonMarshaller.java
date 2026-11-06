package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallFailureBundleKeys;
import com.amazonaws.services.iot.model.AbortCriteria;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AbortCriteriaJsonMarshaller {
    private static AbortCriteriaJsonMarshaller instance;

    public static AbortCriteriaJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AbortCriteriaJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AbortCriteria abortCriteria, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (abortCriteria.getFailureType() != null) {
            String failureType = abortCriteria.getFailureType();
            awsJsonWriter.name(ApiCallFailureBundleKeys.FAILURE_TYPE);
            awsJsonWriter.value(failureType);
        }
        if (abortCriteria.getAction() != null) {
            String action = abortCriteria.getAction();
            awsJsonWriter.name("action");
            awsJsonWriter.value(action);
        }
        if (abortCriteria.getThresholdPercentage() != null) {
            Double thresholdPercentage = abortCriteria.getThresholdPercentage();
            awsJsonWriter.name("thresholdPercentage");
            awsJsonWriter.value(thresholdPercentage);
        }
        if (abortCriteria.getMinNumberOfExecutedThings() != null) {
            Integer minNumberOfExecutedThings = abortCriteria.getMinNumberOfExecutedThings();
            awsJsonWriter.name("minNumberOfExecutedThings");
            awsJsonWriter.value(minNumberOfExecutedThings);
        }
        awsJsonWriter.endObject();
    }
}
