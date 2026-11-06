package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SecurityProfileIdentifier;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SecurityProfileIdentifierJsonMarshaller {
    private static SecurityProfileIdentifierJsonMarshaller instance;

    public static SecurityProfileIdentifierJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SecurityProfileIdentifierJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SecurityProfileIdentifier securityProfileIdentifier, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (securityProfileIdentifier.getName() != null) {
            String name = securityProfileIdentifier.getName();
            awsJsonWriter.name("name");
            awsJsonWriter.value(name);
        }
        if (securityProfileIdentifier.getArn() != null) {
            String arn = securityProfileIdentifier.getArn();
            awsJsonWriter.name("arn");
            awsJsonWriter.value(arn);
        }
        awsJsonWriter.endObject();
    }
}
