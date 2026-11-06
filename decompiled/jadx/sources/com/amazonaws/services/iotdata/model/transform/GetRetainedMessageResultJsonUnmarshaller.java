package com.amazonaws.services.iotdata.model.transform;

import com.amazonaws.services.iotdata.model.GetRetainedMessageResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetRetainedMessageResultJsonUnmarshaller implements Unmarshaller<GetRetainedMessageResult, JsonUnmarshallerContext> {
    private static GetRetainedMessageResultJsonUnmarshaller instance;

    public static GetRetainedMessageResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetRetainedMessageResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetRetainedMessageResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetRetainedMessageResult getRetainedMessageResult = new GetRetainedMessageResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("topic")) {
                getRetainedMessageResult.setTopic(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("payload")) {
                getRetainedMessageResult.setPayload(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("qos")) {
                getRetainedMessageResult.setQos(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("lastModifiedTime")) {
                getRetainedMessageResult.setLastModifiedTime(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getRetainedMessageResult;
    }
}
