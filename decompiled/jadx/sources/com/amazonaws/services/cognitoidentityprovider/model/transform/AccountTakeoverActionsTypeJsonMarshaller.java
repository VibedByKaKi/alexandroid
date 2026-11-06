package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AccountTakeoverActionType;
import com.amazonaws.services.cognitoidentityprovider.model.AccountTakeoverActionsType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AccountTakeoverActionsTypeJsonMarshaller {
    private static AccountTakeoverActionsTypeJsonMarshaller instance;

    public static AccountTakeoverActionsTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AccountTakeoverActionsTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AccountTakeoverActionsType accountTakeoverActionsType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (accountTakeoverActionsType.getLowAction() != null) {
            AccountTakeoverActionType lowAction = accountTakeoverActionsType.getLowAction();
            awsJsonWriter.name("LowAction");
            AccountTakeoverActionTypeJsonMarshaller.getInstance().marshall(lowAction, awsJsonWriter);
        }
        if (accountTakeoverActionsType.getMediumAction() != null) {
            AccountTakeoverActionType mediumAction = accountTakeoverActionsType.getMediumAction();
            awsJsonWriter.name("MediumAction");
            AccountTakeoverActionTypeJsonMarshaller.getInstance().marshall(mediumAction, awsJsonWriter);
        }
        if (accountTakeoverActionsType.getHighAction() != null) {
            AccountTakeoverActionType highAction = accountTakeoverActionsType.getHighAction();
            awsJsonWriter.name("HighAction");
            AccountTakeoverActionTypeJsonMarshaller.getInstance().marshall(highAction, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
