package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CompromisedCredentialsActionsType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CompromisedCredentialsActionsTypeJsonMarshaller {
    private static CompromisedCredentialsActionsTypeJsonMarshaller instance;

    public static CompromisedCredentialsActionsTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CompromisedCredentialsActionsTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CompromisedCredentialsActionsType compromisedCredentialsActionsType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (compromisedCredentialsActionsType.getEventAction() != null) {
            String eventAction = compromisedCredentialsActionsType.getEventAction();
            awsJsonWriter.name("EventAction");
            awsJsonWriter.value(eventAction);
        }
        awsJsonWriter.endObject();
    }
}
