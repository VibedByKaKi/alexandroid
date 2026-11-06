package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.SoftwareTokenMfaSettingsType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SoftwareTokenMfaSettingsTypeJsonMarshaller {
    private static SoftwareTokenMfaSettingsTypeJsonMarshaller instance;

    public static SoftwareTokenMfaSettingsTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SoftwareTokenMfaSettingsTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SoftwareTokenMfaSettingsType softwareTokenMfaSettingsType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (softwareTokenMfaSettingsType.getEnabled() != null) {
            Boolean enabled = softwareTokenMfaSettingsType.getEnabled();
            awsJsonWriter.name("Enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        if (softwareTokenMfaSettingsType.getPreferredMfa() != null) {
            Boolean preferredMfa = softwareTokenMfaSettingsType.getPreferredMfa();
            awsJsonWriter.name("PreferredMfa");
            awsJsonWriter.value(preferredMfa.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
