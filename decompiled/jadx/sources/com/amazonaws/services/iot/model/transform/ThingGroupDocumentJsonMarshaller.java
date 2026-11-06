package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ThingGroupDocument;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingGroupDocumentJsonMarshaller {
    private static ThingGroupDocumentJsonMarshaller instance;

    public static ThingGroupDocumentJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingGroupDocumentJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingGroupDocument thingGroupDocument, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingGroupDocument.getThingGroupName() != null) {
            String thingGroupName = thingGroupDocument.getThingGroupName();
            awsJsonWriter.name("thingGroupName");
            awsJsonWriter.value(thingGroupName);
        }
        if (thingGroupDocument.getThingGroupId() != null) {
            String thingGroupId = thingGroupDocument.getThingGroupId();
            awsJsonWriter.name("thingGroupId");
            awsJsonWriter.value(thingGroupId);
        }
        if (thingGroupDocument.getThingGroupDescription() != null) {
            String thingGroupDescription = thingGroupDocument.getThingGroupDescription();
            awsJsonWriter.name("thingGroupDescription");
            awsJsonWriter.value(thingGroupDescription);
        }
        if (thingGroupDocument.getAttributes() != null) {
            Map<String, String> attributes = thingGroupDocument.getAttributes();
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
        if (thingGroupDocument.getParentGroupNames() != null) {
            List<String> parentGroupNames = thingGroupDocument.getParentGroupNames();
            awsJsonWriter.name("parentGroupNames");
            awsJsonWriter.beginArray();
            for (String str : parentGroupNames) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
