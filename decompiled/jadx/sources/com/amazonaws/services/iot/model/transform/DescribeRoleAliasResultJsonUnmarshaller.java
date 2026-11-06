package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DescribeRoleAliasResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeRoleAliasResultJsonUnmarshaller implements Unmarshaller<DescribeRoleAliasResult, JsonUnmarshallerContext> {
    private static DescribeRoleAliasResultJsonUnmarshaller instance;

    public static DescribeRoleAliasResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeRoleAliasResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeRoleAliasResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeRoleAliasResult describeRoleAliasResult = new DescribeRoleAliasResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("roleAliasDescription")) {
                describeRoleAliasResult.setRoleAliasDescription(RoleAliasDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeRoleAliasResult;
    }
}
