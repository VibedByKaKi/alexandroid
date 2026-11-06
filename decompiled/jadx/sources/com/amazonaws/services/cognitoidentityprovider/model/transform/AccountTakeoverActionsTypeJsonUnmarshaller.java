package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AccountTakeoverActionsType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AccountTakeoverActionsTypeJsonUnmarshaller implements Unmarshaller<AccountTakeoverActionsType, JsonUnmarshallerContext> {
    private static AccountTakeoverActionsTypeJsonUnmarshaller instance;

    public static AccountTakeoverActionsTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AccountTakeoverActionsTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AccountTakeoverActionsType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AccountTakeoverActionsType accountTakeoverActionsType = new AccountTakeoverActionsType();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("LowAction")) {
                accountTakeoverActionsType.setLowAction(AccountTakeoverActionTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("MediumAction")) {
                accountTakeoverActionsType.setMediumAction(AccountTakeoverActionTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("HighAction")) {
                accountTakeoverActionsType.setHighAction(AccountTakeoverActionTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return accountTakeoverActionsType;
    }
}
