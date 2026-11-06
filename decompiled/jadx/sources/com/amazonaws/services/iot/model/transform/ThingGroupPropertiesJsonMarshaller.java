package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AttributePayload;
import com.amazonaws.services.iot.model.ThingGroupProperties;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingGroupPropertiesJsonMarshaller {
    private static ThingGroupPropertiesJsonMarshaller instance;

    public static ThingGroupPropertiesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingGroupPropertiesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingGroupProperties thingGroupProperties, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingGroupProperties.getThingGroupDescription() != null) {
            String thingGroupDescription = thingGroupProperties.getThingGroupDescription();
            awsJsonWriter.name("thingGroupDescription");
            awsJsonWriter.value(thingGroupDescription);
        }
        if (thingGroupProperties.getAttributePayload() != null) {
            AttributePayload attributePayload = thingGroupProperties.getAttributePayload();
            awsJsonWriter.name("attributePayload");
            AttributePayloadJsonMarshaller.getInstance().marshall(attributePayload, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
