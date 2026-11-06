package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SecurityProfileIdentifier;
import com.amazonaws.services.iot.model.SecurityProfileTarget;
import com.amazonaws.services.iot.model.SecurityProfileTargetMapping;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SecurityProfileTargetMappingJsonMarshaller {
    private static SecurityProfileTargetMappingJsonMarshaller instance;

    public static SecurityProfileTargetMappingJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SecurityProfileTargetMappingJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SecurityProfileTargetMapping securityProfileTargetMapping, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (securityProfileTargetMapping.getSecurityProfileIdentifier() != null) {
            SecurityProfileIdentifier securityProfileIdentifier = securityProfileTargetMapping.getSecurityProfileIdentifier();
            awsJsonWriter.name("securityProfileIdentifier");
            SecurityProfileIdentifierJsonMarshaller.getInstance().marshall(securityProfileIdentifier, awsJsonWriter);
        }
        if (securityProfileTargetMapping.getTarget() != null) {
            SecurityProfileTarget target = securityProfileTargetMapping.getTarget();
            awsJsonWriter.name("target");
            SecurityProfileTargetJsonMarshaller.getInstance().marshall(target, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
