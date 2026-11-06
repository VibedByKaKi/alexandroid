package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.PutItemInput;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PutItemInputJsonMarshaller {
    private static PutItemInputJsonMarshaller instance;

    public static PutItemInputJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PutItemInputJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PutItemInput putItemInput, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (putItemInput.getTableName() != null) {
            String tableName = putItemInput.getTableName();
            awsJsonWriter.name("tableName");
            awsJsonWriter.value(tableName);
        }
        awsJsonWriter.endObject();
    }
}
