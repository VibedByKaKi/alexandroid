package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.DeviceSecretVerifierConfigType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DeviceSecretVerifierConfigTypeJsonMarshaller {
    private static DeviceSecretVerifierConfigTypeJsonMarshaller instance;

    public static DeviceSecretVerifierConfigTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DeviceSecretVerifierConfigTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DeviceSecretVerifierConfigType deviceSecretVerifierConfigType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (deviceSecretVerifierConfigType.getPasswordVerifier() != null) {
            String passwordVerifier = deviceSecretVerifierConfigType.getPasswordVerifier();
            awsJsonWriter.name("PasswordVerifier");
            awsJsonWriter.value(passwordVerifier);
        }
        if (deviceSecretVerifierConfigType.getSalt() != null) {
            String salt = deviceSecretVerifierConfigType.getSalt();
            awsJsonWriter.name("Salt");
            awsJsonWriter.value(salt);
        }
        awsJsonWriter.endObject();
    }
}
