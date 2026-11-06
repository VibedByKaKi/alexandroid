package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ThingTypeProperties;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingTypePropertiesJsonMarshaller {
    private static ThingTypePropertiesJsonMarshaller instance;

    public static ThingTypePropertiesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingTypePropertiesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingTypeProperties thingTypeProperties, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingTypeProperties.getThingTypeDescription() != null) {
            String thingTypeDescription = thingTypeProperties.getThingTypeDescription();
            awsJsonWriter.name("thingTypeDescription");
            awsJsonWriter.value(thingTypeDescription);
        }
        if (thingTypeProperties.getSearchableAttributes() != null) {
            List<String> searchableAttributes = thingTypeProperties.getSearchableAttributes();
            awsJsonWriter.name("searchableAttributes");
            awsJsonWriter.beginArray();
            for (String str : searchableAttributes) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
