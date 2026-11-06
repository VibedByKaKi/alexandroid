package com.amazonaws.services.kinesis.model.transform;

import com.amazon.comms.ringservice.MetricsSession;
import com.amazonaws.services.kinesis.model.PutRecordsResultEntry;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PutRecordsResultEntryJsonMarshaller {
    private static PutRecordsResultEntryJsonMarshaller instance;

    public static PutRecordsResultEntryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordsResultEntryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PutRecordsResultEntry putRecordsResultEntry, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (putRecordsResultEntry.getSequenceNumber() != null) {
            String sequenceNumber = putRecordsResultEntry.getSequenceNumber();
            awsJsonWriter.name("SequenceNumber");
            awsJsonWriter.value(sequenceNumber);
        }
        if (putRecordsResultEntry.getShardId() != null) {
            String shardId = putRecordsResultEntry.getShardId();
            awsJsonWriter.name("ShardId");
            awsJsonWriter.value(shardId);
        }
        if (putRecordsResultEntry.getErrorCode() != null) {
            String errorCode = putRecordsResultEntry.getErrorCode();
            awsJsonWriter.name(MetricsSession.ERROR_CODE_PIVOT);
            awsJsonWriter.value(errorCode);
        }
        if (putRecordsResultEntry.getErrorMessage() != null) {
            String errorMessage = putRecordsResultEntry.getErrorMessage();
            awsJsonWriter.name("ErrorMessage");
            awsJsonWriter.value(errorMessage);
        }
        awsJsonWriter.endObject();
    }
}
