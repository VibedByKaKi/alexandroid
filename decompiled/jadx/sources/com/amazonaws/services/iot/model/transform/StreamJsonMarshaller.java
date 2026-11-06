package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Stream;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StreamJsonMarshaller {
    private static StreamJsonMarshaller instance;

    public static StreamJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Stream stream, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (stream.getStreamId() != null) {
            String streamId = stream.getStreamId();
            awsJsonWriter.name("streamId");
            awsJsonWriter.value(streamId);
        }
        if (stream.getFileId() != null) {
            Integer fileId = stream.getFileId();
            awsJsonWriter.name("fileId");
            awsJsonWriter.value(fileId);
        }
        awsJsonWriter.endObject();
    }
}
