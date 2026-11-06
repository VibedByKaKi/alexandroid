package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.UserContextDataType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UserContextDataTypeJsonMarshaller {
    private static UserContextDataTypeJsonMarshaller instance;

    public static UserContextDataTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UserContextDataTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UserContextDataType userContextDataType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (userContextDataType.getIpAddress() != null) {
            String ipAddress = userContextDataType.getIpAddress();
            awsJsonWriter.name("IpAddress");
            awsJsonWriter.value(ipAddress);
        }
        if (userContextDataType.getEncodedData() != null) {
            String encodedData = userContextDataType.getEncodedData();
            awsJsonWriter.name("EncodedData");
            awsJsonWriter.value(encodedData);
        }
        awsJsonWriter.endObject();
    }
}
