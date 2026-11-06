package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SecurityProfileTarget;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SecurityProfileTargetJsonMarshaller {
    private static SecurityProfileTargetJsonMarshaller instance;

    public static SecurityProfileTargetJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SecurityProfileTargetJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SecurityProfileTarget securityProfileTarget, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (securityProfileTarget.getArn() != null) {
            String arn = securityProfileTarget.getArn();
            awsJsonWriter.name("arn");
            awsJsonWriter.value(arn);
        }
        awsJsonWriter.endObject();
    }
}
