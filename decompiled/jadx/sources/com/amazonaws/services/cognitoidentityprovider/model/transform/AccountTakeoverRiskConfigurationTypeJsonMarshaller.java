package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AccountTakeoverActionsType;
import com.amazonaws.services.cognitoidentityprovider.model.AccountTakeoverRiskConfigurationType;
import com.amazonaws.services.cognitoidentityprovider.model.NotifyConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AccountTakeoverRiskConfigurationTypeJsonMarshaller {
    private static AccountTakeoverRiskConfigurationTypeJsonMarshaller instance;

    public static AccountTakeoverRiskConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AccountTakeoverRiskConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AccountTakeoverRiskConfigurationType accountTakeoverRiskConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (accountTakeoverRiskConfigurationType.getNotifyConfiguration() != null) {
            NotifyConfigurationType notifyConfiguration = accountTakeoverRiskConfigurationType.getNotifyConfiguration();
            awsJsonWriter.name("NotifyConfiguration");
            NotifyConfigurationTypeJsonMarshaller.getInstance().marshall(notifyConfiguration, awsJsonWriter);
        }
        if (accountTakeoverRiskConfigurationType.getActions() != null) {
            AccountTakeoverActionsType actions = accountTakeoverRiskConfigurationType.getActions();
            awsJsonWriter.name("Actions");
            AccountTakeoverActionsTypeJsonMarshaller.getInstance().marshall(actions, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
