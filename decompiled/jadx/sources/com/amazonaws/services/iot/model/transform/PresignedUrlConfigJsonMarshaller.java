package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.PresignedUrlConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PresignedUrlConfigJsonMarshaller {
    private static PresignedUrlConfigJsonMarshaller instance;

    public static PresignedUrlConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PresignedUrlConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PresignedUrlConfig presignedUrlConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (presignedUrlConfig.getRoleArn() != null) {
            String roleArn = presignedUrlConfig.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (presignedUrlConfig.getExpiresInSec() != null) {
            Long expiresInSec = presignedUrlConfig.getExpiresInSec();
            awsJsonWriter.name("expiresInSec");
            awsJsonWriter.value(expiresInSec);
        }
        awsJsonWriter.endObject();
    }
}
