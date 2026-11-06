package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AttributeTypeJsonMarshaller {
    private static AttributeTypeJsonMarshaller instance;

    public static AttributeTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AttributeTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AttributeType attributeType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (attributeType.getName() != null) {
            String name = attributeType.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (attributeType.getValue() != null) {
            String value = attributeType.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value);
        }
        awsJsonWriter.endObject();
    }
}
