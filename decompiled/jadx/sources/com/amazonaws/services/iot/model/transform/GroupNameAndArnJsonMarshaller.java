package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.GroupNameAndArn;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class GroupNameAndArnJsonMarshaller {
    private static GroupNameAndArnJsonMarshaller instance;

    public static GroupNameAndArnJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GroupNameAndArnJsonMarshaller();
        }
        return instance;
    }

    public void marshall(GroupNameAndArn groupNameAndArn, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (groupNameAndArn.getGroupName() != null) {
            String groupName = groupNameAndArn.getGroupName();
            awsJsonWriter.name("groupName");
            awsJsonWriter.value(groupName);
        }
        if (groupNameAndArn.getGroupArn() != null) {
            String groupArn = groupNameAndArn.getGroupArn();
            awsJsonWriter.name("groupArn");
            awsJsonWriter.value(groupArn);
        }
        awsJsonWriter.endObject();
    }
}
