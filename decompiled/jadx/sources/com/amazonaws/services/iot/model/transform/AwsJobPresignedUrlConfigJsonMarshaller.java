package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobPresignedUrlConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobPresignedUrlConfigJsonMarshaller {
    private static AwsJobPresignedUrlConfigJsonMarshaller instance;

    public static AwsJobPresignedUrlConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobPresignedUrlConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AwsJobPresignedUrlConfig awsJobPresignedUrlConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (awsJobPresignedUrlConfig.getExpiresInSec() != null) {
            Long expiresInSec = awsJobPresignedUrlConfig.getExpiresInSec();
            awsJsonWriter.name("expiresInSec");
            awsJsonWriter.value(expiresInSec);
        }
        awsJsonWriter.endObject();
    }
}
