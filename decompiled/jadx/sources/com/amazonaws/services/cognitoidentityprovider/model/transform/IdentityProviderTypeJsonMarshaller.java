package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.IdentityProviderType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IdentityProviderTypeJsonMarshaller {
    private static IdentityProviderTypeJsonMarshaller instance;

    public static IdentityProviderTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new IdentityProviderTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(IdentityProviderType identityProviderType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (identityProviderType.getUserPoolId() != null) {
            String userPoolId = identityProviderType.getUserPoolId();
            awsJsonWriter.name("UserPoolId");
            awsJsonWriter.value(userPoolId);
        }
        if (identityProviderType.getProviderName() != null) {
            String providerName = identityProviderType.getProviderName();
            awsJsonWriter.name("ProviderName");
            awsJsonWriter.value(providerName);
        }
        if (identityProviderType.getProviderType() != null) {
            String providerType = identityProviderType.getProviderType();
            awsJsonWriter.name("ProviderType");
            awsJsonWriter.value(providerType);
        }
        if (identityProviderType.getProviderDetails() != null) {
            Map<String, String> providerDetails = identityProviderType.getProviderDetails();
            awsJsonWriter.name("ProviderDetails");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry : providerDetails.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    awsJsonWriter.value(value);
                }
            }
            awsJsonWriter.endObject();
        }
        if (identityProviderType.getAttributeMapping() != null) {
            Map<String, String> attributeMapping = identityProviderType.getAttributeMapping();
            awsJsonWriter.name("AttributeMapping");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry2 : attributeMapping.entrySet()) {
                String value2 = entry2.getValue();
                if (value2 != null) {
                    awsJsonWriter.name(entry2.getKey());
                    awsJsonWriter.value(value2);
                }
            }
            awsJsonWriter.endObject();
        }
        if (identityProviderType.getIdpIdentifiers() != null) {
            List<String> idpIdentifiers = identityProviderType.getIdpIdentifiers();
            awsJsonWriter.name("IdpIdentifiers");
            awsJsonWriter.beginArray();
            for (String str : idpIdentifiers) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (identityProviderType.getLastModifiedDate() != null) {
            Date lastModifiedDate = identityProviderType.getLastModifiedDate();
            awsJsonWriter.name("LastModifiedDate");
            awsJsonWriter.value(lastModifiedDate);
        }
        if (identityProviderType.getCreationDate() != null) {
            Date creationDate = identityProviderType.getCreationDate();
            awsJsonWriter.name("CreationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
