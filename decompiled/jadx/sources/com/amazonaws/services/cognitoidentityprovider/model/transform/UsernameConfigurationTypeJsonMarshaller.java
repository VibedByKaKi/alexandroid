package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.UsernameConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UsernameConfigurationTypeJsonMarshaller {
    private static UsernameConfigurationTypeJsonMarshaller instance;

    public static UsernameConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UsernameConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UsernameConfigurationType usernameConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (usernameConfigurationType.getCaseSensitive() != null) {
            Boolean caseSensitive = usernameConfigurationType.getCaseSensitive();
            awsJsonWriter.name("CaseSensitive");
            awsJsonWriter.value(caseSensitive.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
