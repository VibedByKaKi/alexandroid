package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.UserPoolPolicyType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UserPoolPolicyTypeJsonUnmarshaller implements Unmarshaller<UserPoolPolicyType, JsonUnmarshallerContext> {
    private static UserPoolPolicyTypeJsonUnmarshaller instance;

    public static UserPoolPolicyTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UserPoolPolicyTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UserPoolPolicyType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserPoolPolicyType userPoolPolicyType = new UserPoolPolicyType();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("PasswordPolicy")) {
                userPoolPolicyType.setPasswordPolicy(PasswordPolicyTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userPoolPolicyType;
    }
}
