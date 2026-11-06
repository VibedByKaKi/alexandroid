package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.services.kinesisfirehose.model.Record;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RecordJsonUnmarshaller implements Unmarshaller<Record, JsonUnmarshallerContext> {
    private static RecordJsonUnmarshaller instance;

    public static RecordJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RecordJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Record unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Record record = new Record();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Data")) {
                record.setData(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return record;
    }
}
