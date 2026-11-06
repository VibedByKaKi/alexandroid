package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.S3Action;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class S3ActionJsonMarshaller {
    private static S3ActionJsonMarshaller instance;

    public static S3ActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new S3ActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(S3Action s3Action, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (s3Action.getRoleArn() != null) {
            String roleArn = s3Action.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (s3Action.getBucketName() != null) {
            String bucketName = s3Action.getBucketName();
            awsJsonWriter.name("bucketName");
            awsJsonWriter.value(bucketName);
        }
        if (s3Action.getKey() != null) {
            String key = s3Action.getKey();
            awsJsonWriter.name("key");
            awsJsonWriter.value(key);
        }
        if (s3Action.getCannedAcl() != null) {
            String cannedAcl = s3Action.getCannedAcl();
            awsJsonWriter.name("cannedAcl");
            awsJsonWriter.value(cannedAcl);
        }
        awsJsonWriter.endObject();
    }
}
