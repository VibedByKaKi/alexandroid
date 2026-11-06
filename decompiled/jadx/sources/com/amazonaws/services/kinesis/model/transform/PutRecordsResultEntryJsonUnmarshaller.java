package com.amazonaws.services.kinesis.model.transform;

import com.amazon.comms.ringservice.MetricsSession;
import com.amazonaws.services.kinesis.model.PutRecordsResultEntry;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PutRecordsResultEntryJsonUnmarshaller implements Unmarshaller<PutRecordsResultEntry, JsonUnmarshallerContext> {
    private static PutRecordsResultEntryJsonUnmarshaller instance;

    public static PutRecordsResultEntryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordsResultEntryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PutRecordsResultEntry unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PutRecordsResultEntry putRecordsResultEntry = new PutRecordsResultEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("SequenceNumber")) {
                putRecordsResultEntry.setSequenceNumber(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("ShardId")) {
                putRecordsResultEntry.setShardId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(MetricsSession.ERROR_CODE_PIVOT)) {
                putRecordsResultEntry.setErrorCode(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("ErrorMessage")) {
                putRecordsResultEntry.setErrorMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putRecordsResultEntry;
    }
}
