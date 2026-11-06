package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.VpcDestinationConfiguration;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class VpcDestinationConfigurationJsonUnmarshaller implements Unmarshaller<VpcDestinationConfiguration, JsonUnmarshallerContext> {
    private static VpcDestinationConfigurationJsonUnmarshaller instance;

    public static VpcDestinationConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new VpcDestinationConfigurationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public VpcDestinationConfiguration unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VpcDestinationConfiguration vpcDestinationConfiguration = new VpcDestinationConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("subnetIds")) {
                vpcDestinationConfiguration.setSubnetIds(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("securityGroups")) {
                vpcDestinationConfiguration.setSecurityGroups(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("vpcId")) {
                vpcDestinationConfiguration.setVpcId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("roleArn")) {
                vpcDestinationConfiguration.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vpcDestinationConfiguration;
    }
}
