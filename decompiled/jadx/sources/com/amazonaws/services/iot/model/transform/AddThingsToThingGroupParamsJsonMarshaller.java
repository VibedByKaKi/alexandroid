package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AddThingsToThingGroupParams;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AddThingsToThingGroupParamsJsonMarshaller {
    private static AddThingsToThingGroupParamsJsonMarshaller instance;

    public static AddThingsToThingGroupParamsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AddThingsToThingGroupParamsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AddThingsToThingGroupParams addThingsToThingGroupParams, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (addThingsToThingGroupParams.getThingGroupNames() != null) {
            List<String> thingGroupNames = addThingsToThingGroupParams.getThingGroupNames();
            awsJsonWriter.name("thingGroupNames");
            awsJsonWriter.beginArray();
            for (String str : thingGroupNames) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (addThingsToThingGroupParams.getOverrideDynamicGroups() != null) {
            Boolean overrideDynamicGroups = addThingsToThingGroupParams.getOverrideDynamicGroups();
            awsJsonWriter.name("overrideDynamicGroups");
            awsJsonWriter.value(overrideDynamicGroups.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
