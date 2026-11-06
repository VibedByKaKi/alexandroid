package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Destination;
import com.amazonaws.services.iot.model.S3Destination;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DestinationJsonMarshaller {
    private static DestinationJsonMarshaller instance;

    public static DestinationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DestinationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Destination destination, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (destination.getS3Destination() != null) {
            S3Destination s3Destination = destination.getS3Destination();
            awsJsonWriter.name("s3Destination");
            S3DestinationJsonMarshaller.getInstance().marshall(s3Destination, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
