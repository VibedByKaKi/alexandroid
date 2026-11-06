package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AttributePayload;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AttributePayloadJsonMarshaller {
    private static AttributePayloadJsonMarshaller instance;

    public static AttributePayloadJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AttributePayloadJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AttributePayload attributePayload, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (attributePayload.getAttributes() != null) {
            Map<String, String> attributes = attributePayload.getAttributes();
            awsJsonWriter.name("attributes");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry : attributes.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    awsJsonWriter.value(value);
                }
            }
            awsJsonWriter.endObject();
        }
        if (attributePayload.getMerge() != null) {
            Boolean merge = attributePayload.getMerge();
            awsJsonWriter.name("merge");
            awsJsonWriter.value(merge.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
