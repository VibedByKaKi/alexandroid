package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.DeviceConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DeviceConfigurationTypeJsonMarshaller {
    private static DeviceConfigurationTypeJsonMarshaller instance;

    public static DeviceConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DeviceConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DeviceConfigurationType deviceConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (deviceConfigurationType.getChallengeRequiredOnNewDevice() != null) {
            Boolean challengeRequiredOnNewDevice = deviceConfigurationType.getChallengeRequiredOnNewDevice();
            awsJsonWriter.name("ChallengeRequiredOnNewDevice");
            awsJsonWriter.value(challengeRequiredOnNewDevice.booleanValue());
        }
        if (deviceConfigurationType.getDeviceOnlyRememberedOnUserPrompt() != null) {
            Boolean deviceOnlyRememberedOnUserPrompt = deviceConfigurationType.getDeviceOnlyRememberedOnUserPrompt();
            awsJsonWriter.name("DeviceOnlyRememberedOnUserPrompt");
            awsJsonWriter.value(deviceOnlyRememberedOnUserPrompt.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
