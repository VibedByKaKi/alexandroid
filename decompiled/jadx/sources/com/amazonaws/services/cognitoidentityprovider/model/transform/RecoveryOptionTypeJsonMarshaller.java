package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.RecoveryOptionType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RecoveryOptionTypeJsonMarshaller {
    private static RecoveryOptionTypeJsonMarshaller instance;

    public static RecoveryOptionTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RecoveryOptionTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RecoveryOptionType recoveryOptionType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (recoveryOptionType.getPriority() != null) {
            Integer priority = recoveryOptionType.getPriority();
            awsJsonWriter.name("Priority");
            awsJsonWriter.value(priority);
        }
        if (recoveryOptionType.getName() != null) {
            String name = recoveryOptionType.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        awsJsonWriter.endObject();
    }
}
