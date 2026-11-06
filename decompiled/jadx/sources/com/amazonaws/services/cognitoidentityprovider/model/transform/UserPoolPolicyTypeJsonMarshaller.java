package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.PasswordPolicyType;
import com.amazonaws.services.cognitoidentityprovider.model.UserPoolPolicyType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UserPoolPolicyTypeJsonMarshaller {
    private static UserPoolPolicyTypeJsonMarshaller instance;

    public static UserPoolPolicyTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UserPoolPolicyTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UserPoolPolicyType userPoolPolicyType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (userPoolPolicyType.getPasswordPolicy() != null) {
            PasswordPolicyType passwordPolicy = userPoolPolicyType.getPasswordPolicy();
            awsJsonWriter.name("PasswordPolicy");
            PasswordPolicyTypeJsonMarshaller.getInstance().marshall(passwordPolicy, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
