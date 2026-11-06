package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.S3Destination;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class S3DestinationJsonMarshaller {
    private static S3DestinationJsonMarshaller instance;

    public static S3DestinationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new S3DestinationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(S3Destination s3Destination, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (s3Destination.getBucket() != null) {
            String bucket = s3Destination.getBucket();
            awsJsonWriter.name("bucket");
            awsJsonWriter.value(bucket);
        }
        if (s3Destination.getPrefix() != null) {
            String prefix = s3Destination.getPrefix();
            awsJsonWriter.name("prefix");
            awsJsonWriter.value(prefix);
        }
        awsJsonWriter.endObject();
    }
}
