package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazonaws.services.iot.model.GetBehaviorModelTrainingSummariesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetBehaviorModelTrainingSummariesResultJsonUnmarshaller implements Unmarshaller<GetBehaviorModelTrainingSummariesResult, JsonUnmarshallerContext> {
    private static GetBehaviorModelTrainingSummariesResultJsonUnmarshaller instance;

    public static GetBehaviorModelTrainingSummariesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetBehaviorModelTrainingSummariesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetBehaviorModelTrainingSummariesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetBehaviorModelTrainingSummariesResult getBehaviorModelTrainingSummariesResult = new GetBehaviorModelTrainingSummariesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("summaries")) {
                getBehaviorModelTrainingSummariesResult.setSummaries(new ListUnmarshaller(BehaviorModelTrainingSummaryJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)) {
                getBehaviorModelTrainingSummariesResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getBehaviorModelTrainingSummariesResult;
    }
}
