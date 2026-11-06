package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.ProviderDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProviderDescriptionJsonMarshaller {
    private static ProviderDescriptionJsonMarshaller instance;

    public static ProviderDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProviderDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProviderDescription providerDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (providerDescription.getProviderName() != null) {
            String providerName = providerDescription.getProviderName();
            awsJsonWriter.name("ProviderName");
            awsJsonWriter.value(providerName);
        }
        if (providerDescription.getProviderType() != null) {
            String providerType = providerDescription.getProviderType();
            awsJsonWriter.name("ProviderType");
            awsJsonWriter.value(providerType);
        }
        if (providerDescription.getLastModifiedDate() != null) {
            Date lastModifiedDate = providerDescription.getLastModifiedDate();
            awsJsonWriter.name("LastModifiedDate");
            awsJsonWriter.value(lastModifiedDate);
        }
        if (providerDescription.getCreationDate() != null) {
            Date creationDate = providerDescription.getCreationDate();
            awsJsonWriter.name("CreationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
