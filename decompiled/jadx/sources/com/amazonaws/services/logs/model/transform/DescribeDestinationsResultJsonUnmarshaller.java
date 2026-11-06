package com.amazonaws.services.logs.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazonaws.services.logs.model.DescribeDestinationsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeDestinationsResultJsonUnmarshaller implements Unmarshaller<DescribeDestinationsResult, JsonUnmarshallerContext> {
    private static DescribeDestinationsResultJsonUnmarshaller instance;

    public static DescribeDestinationsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeDestinationsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeDestinationsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeDestinationsResult describeDestinationsResult = new DescribeDestinationsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("destinations")) {
                describeDestinationsResult.setDestinations(new ListUnmarshaller(DestinationJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)) {
                describeDestinationsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeDestinationsResult;
    }
}
