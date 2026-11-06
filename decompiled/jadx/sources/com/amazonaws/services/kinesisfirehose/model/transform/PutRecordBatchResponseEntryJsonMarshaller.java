package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazon.comms.ringservice.MetricsSession;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResponseEntry;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PutRecordBatchResponseEntryJsonMarshaller {
    private static PutRecordBatchResponseEntryJsonMarshaller instance;

    public static PutRecordBatchResponseEntryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordBatchResponseEntryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PutRecordBatchResponseEntry putRecordBatchResponseEntry, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (putRecordBatchResponseEntry.getRecordId() != null) {
            String recordId = putRecordBatchResponseEntry.getRecordId();
            awsJsonWriter.name("RecordId");
            awsJsonWriter.value(recordId);
        }
        if (putRecordBatchResponseEntry.getErrorCode() != null) {
            String errorCode = putRecordBatchResponseEntry.getErrorCode();
            awsJsonWriter.name(MetricsSession.ERROR_CODE_PIVOT);
            awsJsonWriter.value(errorCode);
        }
        if (putRecordBatchResponseEntry.getErrorMessage() != null) {
            String errorMessage = putRecordBatchResponseEntry.getErrorMessage();
            awsJsonWriter.name("ErrorMessage");
            awsJsonWriter.value(errorMessage);
        }
        awsJsonWriter.endObject();
    }
}
