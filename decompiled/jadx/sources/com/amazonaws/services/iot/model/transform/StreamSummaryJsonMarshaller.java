package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.StreamSummary;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StreamSummaryJsonMarshaller {
    private static StreamSummaryJsonMarshaller instance;

    public static StreamSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamSummary streamSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (streamSummary.getStreamId() != null) {
            String streamId = streamSummary.getStreamId();
            awsJsonWriter.name("streamId");
            awsJsonWriter.value(streamId);
        }
        if (streamSummary.getStreamArn() != null) {
            String streamArn = streamSummary.getStreamArn();
            awsJsonWriter.name("streamArn");
            awsJsonWriter.value(streamArn);
        }
        if (streamSummary.getStreamVersion() != null) {
            Integer streamVersion = streamSummary.getStreamVersion();
            awsJsonWriter.name("streamVersion");
            awsJsonWriter.value(streamVersion);
        }
        if (streamSummary.getDescription() != null) {
            String description = streamSummary.getDescription();
            awsJsonWriter.name("description");
            awsJsonWriter.value(description);
        }
        awsJsonWriter.endObject();
    }
}
