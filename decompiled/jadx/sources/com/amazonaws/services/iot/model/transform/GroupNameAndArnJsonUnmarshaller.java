package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.GroupNameAndArn;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class GroupNameAndArnJsonUnmarshaller implements Unmarshaller<GroupNameAndArn, JsonUnmarshallerContext> {
    private static GroupNameAndArnJsonUnmarshaller instance;

    public static GroupNameAndArnJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GroupNameAndArnJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GroupNameAndArn unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GroupNameAndArn groupNameAndArn = new GroupNameAndArn();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("groupName")) {
                groupNameAndArn.setGroupName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("groupArn")) {
                groupNameAndArn.setGroupArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return groupNameAndArn;
    }
}
