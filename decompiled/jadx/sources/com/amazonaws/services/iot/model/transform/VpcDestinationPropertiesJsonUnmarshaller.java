package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.VpcDestinationProperties;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class VpcDestinationPropertiesJsonUnmarshaller implements Unmarshaller<VpcDestinationProperties, JsonUnmarshallerContext> {
    private static VpcDestinationPropertiesJsonUnmarshaller instance;

    public static VpcDestinationPropertiesJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new VpcDestinationPropertiesJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public VpcDestinationProperties unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VpcDestinationProperties vpcDestinationProperties = new VpcDestinationProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("subnetIds")) {
                vpcDestinationProperties.setSubnetIds(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("securityGroups")) {
                vpcDestinationProperties.setSecurityGroups(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("vpcId")) {
                vpcDestinationProperties.setVpcId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("roleArn")) {
                vpcDestinationProperties.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vpcDestinationProperties;
    }
}
