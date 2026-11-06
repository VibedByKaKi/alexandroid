package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.RejectedLogEventsInfo;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RejectedLogEventsInfoJsonMarshaller {
    private static RejectedLogEventsInfoJsonMarshaller instance;

    public static RejectedLogEventsInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RejectedLogEventsInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RejectedLogEventsInfo rejectedLogEventsInfo, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (rejectedLogEventsInfo.getTooNewLogEventStartIndex() != null) {
            Integer tooNewLogEventStartIndex = rejectedLogEventsInfo.getTooNewLogEventStartIndex();
            awsJsonWriter.name("tooNewLogEventStartIndex");
            awsJsonWriter.value(tooNewLogEventStartIndex);
        }
        if (rejectedLogEventsInfo.getTooOldLogEventEndIndex() != null) {
            Integer tooOldLogEventEndIndex = rejectedLogEventsInfo.getTooOldLogEventEndIndex();
            awsJsonWriter.name("tooOldLogEventEndIndex");
            awsJsonWriter.value(tooOldLogEventEndIndex);
        }
        if (rejectedLogEventsInfo.getExpiredLogEventEndIndex() != null) {
            Integer expiredLogEventEndIndex = rejectedLogEventsInfo.getExpiredLogEventEndIndex();
            awsJsonWriter.name("expiredLogEventEndIndex");
            awsJsonWriter.value(expiredLogEventEndIndex);
        }
        awsJsonWriter.endObject();
    }
}
