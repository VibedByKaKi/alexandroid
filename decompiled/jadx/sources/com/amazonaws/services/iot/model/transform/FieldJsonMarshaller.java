package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Field;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FieldJsonMarshaller {
    private static FieldJsonMarshaller instance;

    public static FieldJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FieldJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Field field, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (field.getName() != null) {
            String name = field.getName();
            awsJsonWriter.name("name");
            awsJsonWriter.value(name);
        }
        if (field.getType() != null) {
            String type = field.getType();
            awsJsonWriter.name("type");
            awsJsonWriter.value(type);
        }
        awsJsonWriter.endObject();
    }
}
