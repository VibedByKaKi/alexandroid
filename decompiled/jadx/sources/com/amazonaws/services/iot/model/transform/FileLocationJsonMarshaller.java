package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.FileLocation;
import com.amazonaws.services.iot.model.S3Location;
import com.amazonaws.services.iot.model.Stream;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FileLocationJsonMarshaller {
    private static FileLocationJsonMarshaller instance;

    public static FileLocationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FileLocationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FileLocation fileLocation, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (fileLocation.getStream() != null) {
            Stream stream = fileLocation.getStream();
            awsJsonWriter.name("stream");
            StreamJsonMarshaller.getInstance().marshall(stream, awsJsonWriter);
        }
        if (fileLocation.getS3Location() != null) {
            S3Location s3Location = fileLocation.getS3Location();
            awsJsonWriter.name("s3Location");
            S3LocationJsonMarshaller.getInstance().marshall(s3Location, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
