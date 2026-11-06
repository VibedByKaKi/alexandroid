package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.MachineLearningDetectionConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MachineLearningDetectionConfigJsonMarshaller {
    private static MachineLearningDetectionConfigJsonMarshaller instance;

    public static MachineLearningDetectionConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MachineLearningDetectionConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MachineLearningDetectionConfig machineLearningDetectionConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (machineLearningDetectionConfig.getConfidenceLevel() != null) {
            String confidenceLevel = machineLearningDetectionConfig.getConfidenceLevel();
            awsJsonWriter.name("confidenceLevel");
            awsJsonWriter.value(confidenceLevel);
        }
        awsJsonWriter.endObject();
    }
}
