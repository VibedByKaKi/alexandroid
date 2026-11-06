package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.PutRecordResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordResultJsonUnmarshaller implements Unmarshaller<PutRecordResult, JsonUnmarshallerContext> {
    private static PutRecordResultJsonUnmarshaller instance;

    public static PutRecordResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PutRecordResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        PutRecordResult putRecordResult = new PutRecordResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("ShardId")) {
                putRecordResult.setShardId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("SequenceNumber")) {
                putRecordResult.setSequenceNumber(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EncryptionType")) {
                putRecordResult.setEncryptionType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putRecordResult;
    }
}
