package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordBatchResultJsonUnmarshaller implements Unmarshaller<PutRecordBatchResult, JsonUnmarshallerContext> {
    private static PutRecordBatchResultJsonUnmarshaller instance;

    public static PutRecordBatchResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordBatchResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PutRecordBatchResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        PutRecordBatchResult putRecordBatchResult = new PutRecordBatchResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("FailedPutCount")) {
                putRecordBatchResult.setFailedPutCount(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Encrypted")) {
                putRecordBatchResult.setEncrypted(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("RequestResponses")) {
                putRecordBatchResult.setRequestResponses(new ListUnmarshaller(PutRecordBatchResponseEntryJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putRecordBatchResult;
    }
}
