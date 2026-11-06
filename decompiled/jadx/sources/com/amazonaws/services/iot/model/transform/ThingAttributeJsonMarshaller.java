package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ThingAttribute;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingAttributeJsonMarshaller {
    private static ThingAttributeJsonMarshaller instance;

    public static ThingAttributeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingAttributeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingAttribute thingAttribute, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingAttribute.getThingName() != null) {
            String thingName = thingAttribute.getThingName();
            awsJsonWriter.name("thingName");
            awsJsonWriter.value(thingName);
        }
        if (thingAttribute.getThingTypeName() != null) {
            String thingTypeName = thingAttribute.getThingTypeName();
            awsJsonWriter.name("thingTypeName");
            awsJsonWriter.value(thingTypeName);
        }
        if (thingAttribute.getThingArn() != null) {
            String thingArn = thingAttribute.getThingArn();
            awsJsonWriter.name("thingArn");
            awsJsonWriter.value(thingArn);
        }
        if (thingAttribute.getAttributes() != null) {
            Map<String, String> attributes = thingAttribute.getAttributes();
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
        if (thingAttribute.getVersion() != null) {
            Long version = thingAttribute.getVersion();
            awsJsonWriter.name("version");
            awsJsonWriter.value(version);
        }
        awsJsonWriter.endObject();
    }
}
