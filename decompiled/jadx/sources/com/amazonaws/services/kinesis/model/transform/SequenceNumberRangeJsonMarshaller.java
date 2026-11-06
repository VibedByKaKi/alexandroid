package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.SequenceNumberRange;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SequenceNumberRangeJsonMarshaller {
    private static SequenceNumberRangeJsonMarshaller instance;

    public static SequenceNumberRangeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SequenceNumberRangeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SequenceNumberRange sequenceNumberRange, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (sequenceNumberRange.getStartingSequenceNumber() != null) {
            String startingSequenceNumber = sequenceNumberRange.getStartingSequenceNumber();
            awsJsonWriter.name("StartingSequenceNumber");
            awsJsonWriter.value(startingSequenceNumber);
        }
        if (sequenceNumberRange.getEndingSequenceNumber() != null) {
            String endingSequenceNumber = sequenceNumberRange.getEndingSequenceNumber();
            awsJsonWriter.name("EndingSequenceNumber");
            awsJsonWriter.value(endingSequenceNumber);
        }
        awsJsonWriter.endObject();
    }
}
