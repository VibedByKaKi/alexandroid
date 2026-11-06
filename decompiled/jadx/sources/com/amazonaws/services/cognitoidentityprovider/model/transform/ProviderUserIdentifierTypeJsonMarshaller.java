package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.ProviderUserIdentifierType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProviderUserIdentifierTypeJsonMarshaller {
    private static ProviderUserIdentifierTypeJsonMarshaller instance;

    public static ProviderUserIdentifierTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProviderUserIdentifierTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProviderUserIdentifierType providerUserIdentifierType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (providerUserIdentifierType.getProviderName() != null) {
            String providerName = providerUserIdentifierType.getProviderName();
            awsJsonWriter.name("ProviderName");
            awsJsonWriter.value(providerName);
        }
        if (providerUserIdentifierType.getProviderAttributeName() != null) {
            String providerAttributeName = providerUserIdentifierType.getProviderAttributeName();
            awsJsonWriter.name("ProviderAttributeName");
            awsJsonWriter.value(providerAttributeName);
        }
        if (providerUserIdentifierType.getProviderAttributeValue() != null) {
            String providerAttributeValue = providerUserIdentifierType.getProviderAttributeValue();
            awsJsonWriter.name("ProviderAttributeValue");
            awsJsonWriter.value(providerAttributeValue);
        }
        awsJsonWriter.endObject();
    }
}
