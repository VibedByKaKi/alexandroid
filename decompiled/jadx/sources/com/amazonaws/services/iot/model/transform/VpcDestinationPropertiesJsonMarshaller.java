package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.VpcDestinationProperties;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class VpcDestinationPropertiesJsonMarshaller {
    private static VpcDestinationPropertiesJsonMarshaller instance;

    public static VpcDestinationPropertiesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new VpcDestinationPropertiesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(VpcDestinationProperties vpcDestinationProperties, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (vpcDestinationProperties.getSubnetIds() != null) {
            List<String> subnetIds = vpcDestinationProperties.getSubnetIds();
            awsJsonWriter.name("subnetIds");
            awsJsonWriter.beginArray();
            for (String str : subnetIds) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (vpcDestinationProperties.getSecurityGroups() != null) {
            List<String> securityGroups = vpcDestinationProperties.getSecurityGroups();
            awsJsonWriter.name("securityGroups");
            awsJsonWriter.beginArray();
            for (String str2 : securityGroups) {
                if (str2 != null) {
                    awsJsonWriter.value(str2);
                }
            }
            awsJsonWriter.endArray();
        }
        if (vpcDestinationProperties.getVpcId() != null) {
            String vpcId = vpcDestinationProperties.getVpcId();
            awsJsonWriter.name("vpcId");
            awsJsonWriter.value(vpcId);
        }
        if (vpcDestinationProperties.getRoleArn() != null) {
            String roleArn = vpcDestinationProperties.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
