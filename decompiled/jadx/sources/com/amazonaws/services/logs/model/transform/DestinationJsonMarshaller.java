package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.Destination;
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
        if (destination.getDestinationName() != null) {
            String destinationName = destination.getDestinationName();
            awsJsonWriter.name("destinationName");
            awsJsonWriter.value(destinationName);
        }
        if (destination.getTargetArn() != null) {
            String targetArn = destination.getTargetArn();
            awsJsonWriter.name("targetArn");
            awsJsonWriter.value(targetArn);
        }
        if (destination.getRoleArn() != null) {
            String roleArn = destination.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (destination.getAccessPolicy() != null) {
            String accessPolicy = destination.getAccessPolicy();
            awsJsonWriter.name("accessPolicy");
            awsJsonWriter.value(accessPolicy);
        }
        if (destination.getArn() != null) {
            String arn = destination.getArn();
            awsJsonWriter.name("arn");
            awsJsonWriter.value(arn);
        }
        if (destination.getCreationTime() != null) {
            Long creationTime = destination.getCreationTime();
            awsJsonWriter.name("creationTime");
            awsJsonWriter.value(creationTime);
        }
        awsJsonWriter.endObject();
    }
}
