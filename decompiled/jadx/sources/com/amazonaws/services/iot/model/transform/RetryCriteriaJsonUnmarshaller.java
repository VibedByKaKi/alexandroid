package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallFailureBundleKeys;
import com.amazonaws.services.iot.model.RetryCriteria;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RetryCriteriaJsonUnmarshaller implements Unmarshaller<RetryCriteria, JsonUnmarshallerContext> {
    private static RetryCriteriaJsonUnmarshaller instance;

    public static RetryCriteriaJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RetryCriteriaJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RetryCriteria unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RetryCriteria retryCriteria = new RetryCriteria();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(ApiCallFailureBundleKeys.FAILURE_TYPE)) {
                retryCriteria.setFailureType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("numberOfRetries")) {
                retryCriteria.setNumberOfRetries(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return retryCriteria;
    }
}
