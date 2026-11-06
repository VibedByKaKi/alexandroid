package com.amazonaws.services.iotdata.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazonaws.services.iotdata.model.ListRetainedMessagesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListRetainedMessagesResultJsonUnmarshaller implements Unmarshaller<ListRetainedMessagesResult, JsonUnmarshallerContext> {
    private static ListRetainedMessagesResultJsonUnmarshaller instance;

    public static ListRetainedMessagesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListRetainedMessagesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListRetainedMessagesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListRetainedMessagesResult listRetainedMessagesResult = new ListRetainedMessagesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("retainedTopics")) {
                listRetainedMessagesResult.setRetainedTopics(new ListUnmarshaller(RetainedMessageSummaryJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)) {
                listRetainedMessagesResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listRetainedMessagesResult;
    }
}
