package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SigV4Authorization;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SigV4AuthorizationJsonMarshaller {
    private static SigV4AuthorizationJsonMarshaller instance;

    public static SigV4AuthorizationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SigV4AuthorizationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SigV4Authorization sigV4Authorization, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (sigV4Authorization.getSigningRegion() != null) {
            String signingRegion = sigV4Authorization.getSigningRegion();
            awsJsonWriter.name("signingRegion");
            awsJsonWriter.value(signingRegion);
        }
        if (sigV4Authorization.getServiceName() != null) {
            String serviceName = sigV4Authorization.getServiceName();
            awsJsonWriter.name("serviceName");
            awsJsonWriter.value(serviceName);
        }
        if (sigV4Authorization.getRoleArn() != null) {
            String roleArn = sigV4Authorization.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
