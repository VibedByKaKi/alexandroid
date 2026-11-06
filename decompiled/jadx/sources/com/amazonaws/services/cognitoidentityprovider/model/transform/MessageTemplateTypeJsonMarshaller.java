package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.MessageTemplateType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MessageTemplateTypeJsonMarshaller {
    private static MessageTemplateTypeJsonMarshaller instance;

    public static MessageTemplateTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MessageTemplateTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MessageTemplateType messageTemplateType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (messageTemplateType.getSMSMessage() != null) {
            String sMSMessage = messageTemplateType.getSMSMessage();
            awsJsonWriter.name("SMSMessage");
            awsJsonWriter.value(sMSMessage);
        }
        if (messageTemplateType.getEmailMessage() != null) {
            String emailMessage = messageTemplateType.getEmailMessage();
            awsJsonWriter.name("EmailMessage");
            awsJsonWriter.value(emailMessage);
        }
        if (messageTemplateType.getEmailSubject() != null) {
            String emailSubject = messageTemplateType.getEmailSubject();
            awsJsonWriter.name("EmailSubject");
            awsJsonWriter.value(emailSubject);
        }
        awsJsonWriter.endObject();
    }
}
