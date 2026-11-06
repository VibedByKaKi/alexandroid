package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.CognitoIdentityProvider;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CognitoIdentityProviderJsonMarshaller {
    private static CognitoIdentityProviderJsonMarshaller instance;

    public static CognitoIdentityProviderJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CognitoIdentityProviderJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CognitoIdentityProvider cognitoIdentityProvider, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (cognitoIdentityProvider.getProviderName() != null) {
            String providerName = cognitoIdentityProvider.getProviderName();
            awsJsonWriter.name("ProviderName");
            awsJsonWriter.value(providerName);
        }
        if (cognitoIdentityProvider.getClientId() != null) {
            String clientId = cognitoIdentityProvider.getClientId();
            awsJsonWriter.name("ClientId");
            awsJsonWriter.value(clientId);
        }
        if (cognitoIdentityProvider.getServerSideTokenCheck() != null) {
            Boolean serverSideTokenCheck = cognitoIdentityProvider.getServerSideTokenCheck();
            awsJsonWriter.name("ServerSideTokenCheck");
            awsJsonWriter.value(serverSideTokenCheck.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
