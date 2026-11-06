package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobTimeoutConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobTimeoutConfigJsonUnmarshaller implements Unmarshaller<AwsJobTimeoutConfig, JsonUnmarshallerContext> {
    private static AwsJobTimeoutConfigJsonUnmarshaller instance;

    public static AwsJobTimeoutConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobTimeoutConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AwsJobTimeoutConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsJobTimeoutConfig awsJobTimeoutConfig = new AwsJobTimeoutConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("inProgressTimeoutInMinutes")) {
                awsJobTimeoutConfig.setInProgressTimeoutInMinutes(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsJobTimeoutConfig;
    }
}
