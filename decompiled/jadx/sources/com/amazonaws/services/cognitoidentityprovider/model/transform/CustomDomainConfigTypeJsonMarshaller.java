package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CustomDomainConfigType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CustomDomainConfigTypeJsonMarshaller {
    private static CustomDomainConfigTypeJsonMarshaller instance;

    public static CustomDomainConfigTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CustomDomainConfigTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CustomDomainConfigType customDomainConfigType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (customDomainConfigType.getCertificateArn() != null) {
            String certificateArn = customDomainConfigType.getCertificateArn();
            awsJsonWriter.name("CertificateArn");
            awsJsonWriter.value(certificateArn);
        }
        awsJsonWriter.endObject();
    }
}
