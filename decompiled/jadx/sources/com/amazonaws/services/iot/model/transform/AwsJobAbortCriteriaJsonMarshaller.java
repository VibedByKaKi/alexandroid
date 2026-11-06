package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallFailureBundleKeys;
import com.amazonaws.services.iot.model.AwsJobAbortCriteria;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobAbortCriteriaJsonMarshaller {
    private static AwsJobAbortCriteriaJsonMarshaller instance;

    public static AwsJobAbortCriteriaJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobAbortCriteriaJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AwsJobAbortCriteria awsJobAbortCriteria, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (awsJobAbortCriteria.getFailureType() != null) {
            String failureType = awsJobAbortCriteria.getFailureType();
            awsJsonWriter.name(ApiCallFailureBundleKeys.FAILURE_TYPE);
            awsJsonWriter.value(failureType);
        }
        if (awsJobAbortCriteria.getAction() != null) {
            String action = awsJobAbortCriteria.getAction();
            awsJsonWriter.name("action");
            awsJsonWriter.value(action);
        }
        if (awsJobAbortCriteria.getThresholdPercentage() != null) {
            Double thresholdPercentage = awsJobAbortCriteria.getThresholdPercentage();
            awsJsonWriter.name("thresholdPercentage");
            awsJsonWriter.value(thresholdPercentage);
        }
        if (awsJobAbortCriteria.getMinNumberOfExecutedThings() != null) {
            Integer minNumberOfExecutedThings = awsJobAbortCriteria.getMinNumberOfExecutedThings();
            awsJsonWriter.name("minNumberOfExecutedThings");
            awsJsonWriter.value(minNumberOfExecutedThings);
        }
        awsJsonWriter.endObject();
    }
}
