package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazon.alexa.entertainment.capabilityServiceAgent.AlexaMobilePushCapabilityServiceAgent;
import com.amazonaws.services.cognitoidentityprovider.model.AccountTakeoverActionType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AccountTakeoverActionTypeJsonUnmarshaller implements Unmarshaller<AccountTakeoverActionType, JsonUnmarshallerContext> {
    private static AccountTakeoverActionTypeJsonUnmarshaller instance;

    public static AccountTakeoverActionTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AccountTakeoverActionTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AccountTakeoverActionType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AccountTakeoverActionType accountTakeoverActionType = new AccountTakeoverActionType();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(AlexaMobilePushCapabilityServiceAgent.RING_SCENE_UPDATE_DIRECTIVE_NAME)) {
                accountTakeoverActionType.setNotify(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EventAction")) {
                accountTakeoverActionType.setEventAction(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return accountTakeoverActionType;
    }
}
