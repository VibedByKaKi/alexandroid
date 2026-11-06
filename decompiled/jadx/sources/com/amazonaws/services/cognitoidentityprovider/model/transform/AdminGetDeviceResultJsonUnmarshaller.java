package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AdminGetDeviceResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminGetDeviceResultJsonUnmarshaller implements Unmarshaller<AdminGetDeviceResult, JsonUnmarshallerContext> {
    private static AdminGetDeviceResultJsonUnmarshaller instance;

    public static AdminGetDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AdminGetDeviceResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AdminGetDeviceResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AdminGetDeviceResult adminGetDeviceResult = new AdminGetDeviceResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Device")) {
                adminGetDeviceResult.setDevice(DeviceTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return adminGetDeviceResult;
    }
}
