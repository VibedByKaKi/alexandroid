package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.SmsConfigurationType;
import com.amazonaws.services.cognitoidentityprovider.model.SmsMfaConfigType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SmsMfaConfigTypeJsonMarshaller {
    private static SmsMfaConfigTypeJsonMarshaller instance;

    public static SmsMfaConfigTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SmsMfaConfigTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SmsMfaConfigType smsMfaConfigType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (smsMfaConfigType.getSmsAuthenticationMessage() != null) {
            String smsAuthenticationMessage = smsMfaConfigType.getSmsAuthenticationMessage();
            awsJsonWriter.name("SmsAuthenticationMessage");
            awsJsonWriter.value(smsAuthenticationMessage);
        }
        if (smsMfaConfigType.getSmsConfiguration() != null) {
            SmsConfigurationType smsConfiguration = smsMfaConfigType.getSmsConfiguration();
            awsJsonWriter.name("SmsConfiguration");
            SmsConfigurationTypeJsonMarshaller.getInstance().marshall(smsConfiguration, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
