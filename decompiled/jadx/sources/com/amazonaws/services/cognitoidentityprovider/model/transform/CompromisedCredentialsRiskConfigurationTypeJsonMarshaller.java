package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CompromisedCredentialsActionsType;
import com.amazonaws.services.cognitoidentityprovider.model.CompromisedCredentialsRiskConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CompromisedCredentialsRiskConfigurationTypeJsonMarshaller {
    private static CompromisedCredentialsRiskConfigurationTypeJsonMarshaller instance;

    public static CompromisedCredentialsRiskConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CompromisedCredentialsRiskConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (compromisedCredentialsRiskConfigurationType.getEventFilter() != null) {
            List<String> eventFilter = compromisedCredentialsRiskConfigurationType.getEventFilter();
            awsJsonWriter.name("EventFilter");
            awsJsonWriter.beginArray();
            for (String str : eventFilter) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (compromisedCredentialsRiskConfigurationType.getActions() != null) {
            CompromisedCredentialsActionsType actions = compromisedCredentialsRiskConfigurationType.getActions();
            awsJsonWriter.name("Actions");
            CompromisedCredentialsActionsTypeJsonMarshaller.getInstance().marshall(actions, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
