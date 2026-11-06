package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.SMSMfaSettingsType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SMSMfaSettingsTypeJsonMarshaller {
    private static SMSMfaSettingsTypeJsonMarshaller instance;

    public static SMSMfaSettingsTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SMSMfaSettingsTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SMSMfaSettingsType sMSMfaSettingsType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (sMSMfaSettingsType.getEnabled() != null) {
            Boolean enabled = sMSMfaSettingsType.getEnabled();
            awsJsonWriter.name("Enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        if (sMSMfaSettingsType.getPreferredMfa() != null) {
            Boolean preferredMfa = sMSMfaSettingsType.getPreferredMfa();
            awsJsonWriter.name("PreferredMfa");
            awsJsonWriter.value(preferredMfa.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
