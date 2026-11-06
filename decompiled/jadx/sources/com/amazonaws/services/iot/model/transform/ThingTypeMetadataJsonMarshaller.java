package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ThingTypeMetadata;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingTypeMetadataJsonMarshaller {
    private static ThingTypeMetadataJsonMarshaller instance;

    public static ThingTypeMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingTypeMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingTypeMetadata thingTypeMetadata, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingTypeMetadata.getDeprecated() != null) {
            Boolean deprecated = thingTypeMetadata.getDeprecated();
            awsJsonWriter.name("deprecated");
            awsJsonWriter.value(deprecated.booleanValue());
        }
        if (thingTypeMetadata.getDeprecationDate() != null) {
            Date deprecationDate = thingTypeMetadata.getDeprecationDate();
            awsJsonWriter.name("deprecationDate");
            awsJsonWriter.value(deprecationDate);
        }
        if (thingTypeMetadata.getCreationDate() != null) {
            Date creationDate = thingTypeMetadata.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
