package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.services.kinesisfirehose.model.Record;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RecordJsonMarshaller {
    private static RecordJsonMarshaller instance;

    public static RecordJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RecordJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Record record, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (record.getData() != null) {
            ByteBuffer data = record.getData();
            awsJsonWriter.name("Data");
            awsJsonWriter.value(data);
        }
        awsJsonWriter.endObject();
    }
}
