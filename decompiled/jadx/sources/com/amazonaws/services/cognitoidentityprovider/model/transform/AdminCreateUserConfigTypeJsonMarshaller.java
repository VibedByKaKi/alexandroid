package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AdminCreateUserConfigType;
import com.amazonaws.services.cognitoidentityprovider.model.MessageTemplateType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AdminCreateUserConfigTypeJsonMarshaller {
    private static AdminCreateUserConfigTypeJsonMarshaller instance;

    public static AdminCreateUserConfigTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AdminCreateUserConfigTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AdminCreateUserConfigType adminCreateUserConfigType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (adminCreateUserConfigType.getAllowAdminCreateUserOnly() != null) {
            Boolean allowAdminCreateUserOnly = adminCreateUserConfigType.getAllowAdminCreateUserOnly();
            awsJsonWriter.name("AllowAdminCreateUserOnly");
            awsJsonWriter.value(allowAdminCreateUserOnly.booleanValue());
        }
        if (adminCreateUserConfigType.getUnusedAccountValidityDays() != null) {
            Integer unusedAccountValidityDays = adminCreateUserConfigType.getUnusedAccountValidityDays();
            awsJsonWriter.name("UnusedAccountValidityDays");
            awsJsonWriter.value(unusedAccountValidityDays);
        }
        if (adminCreateUserConfigType.getInviteMessageTemplate() != null) {
            MessageTemplateType inviteMessageTemplate = adminCreateUserConfigType.getInviteMessageTemplate();
            awsJsonWriter.name("InviteMessageTemplate");
            MessageTemplateTypeJsonMarshaller.getInstance().marshall(inviteMessageTemplate, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
