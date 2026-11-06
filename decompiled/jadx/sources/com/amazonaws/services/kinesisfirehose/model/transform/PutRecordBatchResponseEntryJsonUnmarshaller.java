package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazon.comms.ringservice.MetricsSession;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResponseEntry;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PutRecordBatchResponseEntryJsonUnmarshaller implements Unmarshaller<PutRecordBatchResponseEntry, JsonUnmarshallerContext> {
    private static PutRecordBatchResponseEntryJsonUnmarshaller instance;

    public static PutRecordBatchResponseEntryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordBatchResponseEntryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PutRecordBatchResponseEntry unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PutRecordBatchResponseEntry putRecordBatchResponseEntry = new PutRecordBatchResponseEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("RecordId")) {
                putRecordBatchResponseEntry.setRecordId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(MetricsSession.ERROR_CODE_PIVOT)) {
                putRecordBatchResponseEntry.setErrorCode(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("ErrorMessage")) {
                putRecordBatchResponseEntry.setErrorMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putRecordBatchResponseEntry;
    }
}
