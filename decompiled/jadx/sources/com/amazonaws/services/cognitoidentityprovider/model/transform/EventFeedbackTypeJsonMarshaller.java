package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.EventFeedbackType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class EventFeedbackTypeJsonMarshaller {
    private static EventFeedbackTypeJsonMarshaller instance;

    public static EventFeedbackTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EventFeedbackTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EventFeedbackType eventFeedbackType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (eventFeedbackType.getFeedbackValue() != null) {
            String feedbackValue = eventFeedbackType.getFeedbackValue();
            awsJsonWriter.name("FeedbackValue");
            awsJsonWriter.value(feedbackValue);
        }
        if (eventFeedbackType.getProvider() != null) {
            String provider = eventFeedbackType.getProvider();
            awsJsonWriter.name("Provider");
            awsJsonWriter.value(provider);
        }
        if (eventFeedbackType.getFeedbackDate() != null) {
            Date feedbackDate = eventFeedbackType.getFeedbackDate();
            awsJsonWriter.name("FeedbackDate");
            awsJsonWriter.value(feedbackDate);
        }
        awsJsonWriter.endObject();
    }
}
