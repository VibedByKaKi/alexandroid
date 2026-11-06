package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.SmsConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SmsConfigurationTypeJsonMarshaller {
    private static SmsConfigurationTypeJsonMarshaller instance;

    public static SmsConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SmsConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SmsConfigurationType smsConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (smsConfigurationType.getSnsCallerArn() != null) {
            String snsCallerArn = smsConfigurationType.getSnsCallerArn();
            awsJsonWriter.name("SnsCallerArn");
            awsJsonWriter.value(snsCallerArn);
        }
        if (smsConfigurationType.getExternalId() != null) {
            String externalId = smsConfigurationType.getExternalId();
            awsJsonWriter.name("ExternalId");
            awsJsonWriter.value(externalId);
        }
        if (smsConfigurationType.getSnsRegion() != null) {
            String snsRegion = smsConfigurationType.getSnsRegion();
            awsJsonWriter.name("SnsRegion");
            awsJsonWriter.value(snsRegion);
        }
        awsJsonWriter.endObject();
    }
}
