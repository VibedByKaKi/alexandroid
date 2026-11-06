package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobAbortConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobAbortConfigJsonUnmarshaller implements Unmarshaller<AwsJobAbortConfig, JsonUnmarshallerContext> {
    private static AwsJobAbortConfigJsonUnmarshaller instance;

    public static AwsJobAbortConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobAbortConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AwsJobAbortConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsJobAbortConfig awsJobAbortConfig = new AwsJobAbortConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("abortCriteriaList")) {
                awsJobAbortConfig.setAbortCriteriaList(new ListUnmarshaller(AwsJobAbortCriteriaJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsJobAbortConfig;
    }
}
