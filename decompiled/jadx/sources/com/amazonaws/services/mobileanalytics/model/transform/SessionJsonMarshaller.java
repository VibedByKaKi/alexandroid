package com.amazonaws.services.mobileanalytics.model.transform;

import com.amazonaws.services.mobileanalytics.model.Session;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
class SessionJsonMarshaller {
    private static SessionJsonMarshaller instance;

    public static SessionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SessionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Session session, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (session.getId() != null) {
            String id = session.getId();
            awsJsonWriter.name("id");
            awsJsonWriter.value(id);
        }
        if (session.getDuration() != null) {
            Long duration = session.getDuration();
            awsJsonWriter.name("duration");
            awsJsonWriter.value(duration);
        }
        if (session.getStartTimestamp() != null) {
            String startTimestamp = session.getStartTimestamp();
            awsJsonWriter.name("startTimestamp");
            awsJsonWriter.value(startTimestamp);
        }
        if (session.getStopTimestamp() != null) {
            String stopTimestamp = session.getStopTimestamp();
            awsJsonWriter.name("stopTimestamp");
            awsJsonWriter.value(stopTimestamp);
        }
        awsJsonWriter.endObject();
    }
}
