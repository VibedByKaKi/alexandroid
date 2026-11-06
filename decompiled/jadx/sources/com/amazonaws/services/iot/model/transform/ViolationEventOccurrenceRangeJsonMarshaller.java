package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ViolationEventOccurrenceRange;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ViolationEventOccurrenceRangeJsonMarshaller {
    private static ViolationEventOccurrenceRangeJsonMarshaller instance;

    public static ViolationEventOccurrenceRangeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ViolationEventOccurrenceRangeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ViolationEventOccurrenceRange violationEventOccurrenceRange, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (violationEventOccurrenceRange.getStartTime() != null) {
            Date startTime = violationEventOccurrenceRange.getStartTime();
            awsJsonWriter.name("startTime");
            awsJsonWriter.value(startTime);
        }
        if (violationEventOccurrenceRange.getEndTime() != null) {
            Date endTime = violationEventOccurrenceRange.getEndTime();
            awsJsonWriter.name("endTime");
            awsJsonWriter.value(endTime);
        }
        awsJsonWriter.endObject();
    }
}
