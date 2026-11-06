package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallFailureBundleKeys;
import com.amazonaws.services.iot.model.AwsJobAbortCriteria;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobAbortCriteriaJsonUnmarshaller implements Unmarshaller<AwsJobAbortCriteria, JsonUnmarshallerContext> {
    private static AwsJobAbortCriteriaJsonUnmarshaller instance;

    public static AwsJobAbortCriteriaJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobAbortCriteriaJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AwsJobAbortCriteria unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsJobAbortCriteria awsJobAbortCriteria = new AwsJobAbortCriteria();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(ApiCallFailureBundleKeys.FAILURE_TYPE)) {
                awsJobAbortCriteria.setFailureType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("action")) {
                awsJobAbortCriteria.setAction(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("thresholdPercentage")) {
                awsJobAbortCriteria.setThresholdPercentage(SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("minNumberOfExecutedThings")) {
                awsJobAbortCriteria.setMinNumberOfExecutedThings(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsJobAbortCriteria;
    }
}
