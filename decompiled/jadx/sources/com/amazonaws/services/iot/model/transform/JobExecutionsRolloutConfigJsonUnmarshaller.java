package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.JobExecutionsRolloutConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionsRolloutConfigJsonUnmarshaller implements Unmarshaller<JobExecutionsRolloutConfig, JsonUnmarshallerContext> {
    private static JobExecutionsRolloutConfigJsonUnmarshaller instance;

    public static JobExecutionsRolloutConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionsRolloutConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public JobExecutionsRolloutConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobExecutionsRolloutConfig jobExecutionsRolloutConfig = new JobExecutionsRolloutConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("maximumPerMinute")) {
                jobExecutionsRolloutConfig.setMaximumPerMinute(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("exponentialRate")) {
                jobExecutionsRolloutConfig.setExponentialRate(ExponentialRolloutRateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobExecutionsRolloutConfig;
    }
}
