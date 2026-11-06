package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.ConfirmDeviceResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ConfirmDeviceResultJsonUnmarshaller implements Unmarshaller<ConfirmDeviceResult, JsonUnmarshallerContext> {
    private static ConfirmDeviceResultJsonUnmarshaller instance;

    public static ConfirmDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ConfirmDeviceResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ConfirmDeviceResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ConfirmDeviceResult confirmDeviceResult = new ConfirmDeviceResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("UserConfirmationNecessary")) {
                confirmDeviceResult.setUserConfirmationNecessary(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return confirmDeviceResult;
    }
}
