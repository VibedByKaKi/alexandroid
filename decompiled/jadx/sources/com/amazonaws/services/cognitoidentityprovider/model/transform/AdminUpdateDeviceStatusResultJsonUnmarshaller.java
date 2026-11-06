package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AdminUpdateDeviceStatusResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminUpdateDeviceStatusResultJsonUnmarshaller implements Unmarshaller<AdminUpdateDeviceStatusResult, JsonUnmarshallerContext> {
    private static AdminUpdateDeviceStatusResultJsonUnmarshaller instance;

    public static AdminUpdateDeviceStatusResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AdminUpdateDeviceStatusResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AdminUpdateDeviceStatusResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new AdminUpdateDeviceStatusResult();
    }
}
