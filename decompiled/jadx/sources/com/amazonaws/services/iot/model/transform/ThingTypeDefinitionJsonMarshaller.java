package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ThingTypeDefinition;
import com.amazonaws.services.iot.model.ThingTypeMetadata;
import com.amazonaws.services.iot.model.ThingTypeProperties;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingTypeDefinitionJsonMarshaller {
    private static ThingTypeDefinitionJsonMarshaller instance;

    public static ThingTypeDefinitionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingTypeDefinitionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingTypeDefinition thingTypeDefinition, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingTypeDefinition.getThingTypeName() != null) {
            String thingTypeName = thingTypeDefinition.getThingTypeName();
            awsJsonWriter.name("thingTypeName");
            awsJsonWriter.value(thingTypeName);
        }
        if (thingTypeDefinition.getThingTypeArn() != null) {
            String thingTypeArn = thingTypeDefinition.getThingTypeArn();
            awsJsonWriter.name("thingTypeArn");
            awsJsonWriter.value(thingTypeArn);
        }
        if (thingTypeDefinition.getThingTypeProperties() != null) {
            ThingTypeProperties thingTypeProperties = thingTypeDefinition.getThingTypeProperties();
            awsJsonWriter.name("thingTypeProperties");
            ThingTypePropertiesJsonMarshaller.getInstance().marshall(thingTypeProperties, awsJsonWriter);
        }
        if (thingTypeDefinition.getThingTypeMetadata() != null) {
            ThingTypeMetadata thingTypeMetadata = thingTypeDefinition.getThingTypeMetadata();
            awsJsonWriter.name("thingTypeMetadata");
            ThingTypeMetadataJsonMarshaller.getInstance().marshall(thingTypeMetadata, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
