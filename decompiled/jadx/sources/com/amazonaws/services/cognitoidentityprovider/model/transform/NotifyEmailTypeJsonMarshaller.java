package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.NotifyEmailType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class NotifyEmailTypeJsonMarshaller {
    private static NotifyEmailTypeJsonMarshaller instance;

    public static NotifyEmailTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new NotifyEmailTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(NotifyEmailType notifyEmailType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (notifyEmailType.getSubject() != null) {
            String subject = notifyEmailType.getSubject();
            awsJsonWriter.name("Subject");
            awsJsonWriter.value(subject);
        }
        if (notifyEmailType.getHtmlBody() != null) {
            String htmlBody = notifyEmailType.getHtmlBody();
            awsJsonWriter.name("HtmlBody");
            awsJsonWriter.value(htmlBody);
        }
        if (notifyEmailType.getTextBody() != null) {
            String textBody = notifyEmailType.getTextBody();
            awsJsonWriter.name("TextBody");
            awsJsonWriter.value(textBody);
        }
        awsJsonWriter.endObject();
    }
}
