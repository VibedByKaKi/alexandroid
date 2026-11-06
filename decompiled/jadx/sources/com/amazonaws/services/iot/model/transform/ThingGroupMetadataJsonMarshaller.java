package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.GroupNameAndArn;
import com.amazonaws.services.iot.model.ThingGroupMetadata;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingGroupMetadataJsonMarshaller {
    private static ThingGroupMetadataJsonMarshaller instance;

    public static ThingGroupMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingGroupMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingGroupMetadata thingGroupMetadata, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingGroupMetadata.getParentGroupName() != null) {
            String parentGroupName = thingGroupMetadata.getParentGroupName();
            awsJsonWriter.name("parentGroupName");
            awsJsonWriter.value(parentGroupName);
        }
        if (thingGroupMetadata.getRootToParentThingGroups() != null) {
            List<GroupNameAndArn> rootToParentThingGroups = thingGroupMetadata.getRootToParentThingGroups();
            awsJsonWriter.name("rootToParentThingGroups");
            awsJsonWriter.beginArray();
            for (GroupNameAndArn groupNameAndArn : rootToParentThingGroups) {
                if (groupNameAndArn != null) {
                    GroupNameAndArnJsonMarshaller.getInstance().marshall(groupNameAndArn, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (thingGroupMetadata.getCreationDate() != null) {
            Date creationDate = thingGroupMetadata.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
