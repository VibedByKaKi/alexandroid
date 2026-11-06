package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazonaws.services.iot.model.ListDetectMitigationActionsExecutionsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListDetectMitigationActionsExecutionsResultJsonUnmarshaller implements Unmarshaller<ListDetectMitigationActionsExecutionsResult, JsonUnmarshallerContext> {
    private static ListDetectMitigationActionsExecutionsResultJsonUnmarshaller instance;

    public static ListDetectMitigationActionsExecutionsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListDetectMitigationActionsExecutionsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListDetectMitigationActionsExecutionsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListDetectMitigationActionsExecutionsResult listDetectMitigationActionsExecutionsResult = new ListDetectMitigationActionsExecutionsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("actionsExecutions")) {
                listDetectMitigationActionsExecutionsResult.setActionsExecutions(new ListUnmarshaller(DetectMitigationActionExecutionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)) {
                listDetectMitigationActionsExecutionsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listDetectMitigationActionsExecutionsResult;
    }
}
