package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.NewDeviceMetadataType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class NewDeviceMetadataTypeJsonMarshaller {
    private static NewDeviceMetadataTypeJsonMarshaller instance;

    public static NewDeviceMetadataTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new NewDeviceMetadataTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(NewDeviceMetadataType newDeviceMetadataType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (newDeviceMetadataType.getDeviceKey() != null) {
            String deviceKey = newDeviceMetadataType.getDeviceKey();
            awsJsonWriter.name("DeviceKey");
            awsJsonWriter.value(deviceKey);
        }
        if (newDeviceMetadataType.getDeviceGroupKey() != null) {
            String deviceGroupKey = newDeviceMetadataType.getDeviceGroupKey();
            awsJsonWriter.name("DeviceGroupKey");
            awsJsonWriter.value(deviceGroupKey);
        }
        awsJsonWriter.endObject();
    }
}
