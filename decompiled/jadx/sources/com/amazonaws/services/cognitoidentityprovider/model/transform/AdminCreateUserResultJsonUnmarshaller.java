package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AdminCreateUserResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminCreateUserResultJsonUnmarshaller implements Unmarshaller<AdminCreateUserResult, JsonUnmarshallerContext> {
    private static AdminCreateUserResultJsonUnmarshaller instance;

    public static AdminCreateUserResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AdminCreateUserResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AdminCreateUserResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AdminCreateUserResult adminCreateUserResult = new AdminCreateUserResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("User")) {
                adminCreateUserResult.setUser(UserTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return adminCreateUserResult;
    }
}
