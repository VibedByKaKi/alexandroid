package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.FilteredLogEvent;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FilteredLogEventJsonMarshaller {
    private static FilteredLogEventJsonMarshaller instance;

    public static FilteredLogEventJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FilteredLogEventJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FilteredLogEvent filteredLogEvent, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (filteredLogEvent.getLogStreamName() != null) {
            String logStreamName = filteredLogEvent.getLogStreamName();
            awsJsonWriter.name("logStreamName");
            awsJsonWriter.value(logStreamName);
        }
        if (filteredLogEvent.getTimestamp() != null) {
            Long timestamp = filteredLogEvent.getTimestamp();
            awsJsonWriter.name("timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (filteredLogEvent.getMessage() != null) {
            String message = filteredLogEvent.getMessage();
            awsJsonWriter.name("message");
            awsJsonWriter.value(message);
        }
        if (filteredLogEvent.getIngestionTime() != null) {
            Long ingestionTime = filteredLogEvent.getIngestionTime();
            awsJsonWriter.name("ingestionTime");
            awsJsonWriter.value(ingestionTime);
        }
        if (filteredLogEvent.getEventId() != null) {
            String eventId = filteredLogEvent.getEventId();
            awsJsonWriter.name("eventId");
            awsJsonWriter.value(eventId);
        }
        awsJsonWriter.endObject();
    }
}
