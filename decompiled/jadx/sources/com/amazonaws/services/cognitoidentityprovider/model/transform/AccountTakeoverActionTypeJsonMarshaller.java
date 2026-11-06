package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazon.alexa.entertainment.capabilityServiceAgent.AlexaMobilePushCapabilityServiceAgent;
import com.amazonaws.services.cognitoidentityprovider.model.AccountTakeoverActionType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AccountTakeoverActionTypeJsonMarshaller {
    private static AccountTakeoverActionTypeJsonMarshaller instance;

    public static AccountTakeoverActionTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AccountTakeoverActionTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AccountTakeoverActionType accountTakeoverActionType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (accountTakeoverActionType.getNotify() != null) {
            Boolean notify = accountTakeoverActionType.getNotify();
            awsJsonWriter.name(AlexaMobilePushCapabilityServiceAgent.RING_SCENE_UPDATE_DIRECTIVE_NAME);
            awsJsonWriter.value(notify.booleanValue());
        }
        if (accountTakeoverActionType.getEventAction() != null) {
            String eventAction = accountTakeoverActionType.getEventAction();
            awsJsonWriter.name("EventAction");
            awsJsonWriter.value(eventAction);
        }
        awsJsonWriter.endObject();
    }
}
