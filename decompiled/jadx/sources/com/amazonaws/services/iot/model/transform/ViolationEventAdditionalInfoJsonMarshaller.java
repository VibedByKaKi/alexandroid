package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ViolationEventAdditionalInfo;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ViolationEventAdditionalInfoJsonMarshaller {
    private static ViolationEventAdditionalInfoJsonMarshaller instance;

    public static ViolationEventAdditionalInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ViolationEventAdditionalInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ViolationEventAdditionalInfo violationEventAdditionalInfo, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (violationEventAdditionalInfo.getConfidenceLevel() != null) {
            String confidenceLevel = violationEventAdditionalInfo.getConfidenceLevel();
            awsJsonWriter.name("confidenceLevel");
            awsJsonWriter.value(confidenceLevel);
        }
        awsJsonWriter.endObject();
    }
}
