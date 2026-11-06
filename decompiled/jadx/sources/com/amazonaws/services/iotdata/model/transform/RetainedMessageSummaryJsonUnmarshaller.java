package com.amazonaws.services.iotdata.model.transform;

import com.amazonaws.services.iotdata.model.RetainedMessageSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RetainedMessageSummaryJsonUnmarshaller implements Unmarshaller<RetainedMessageSummary, JsonUnmarshallerContext> {
    private static RetainedMessageSummaryJsonUnmarshaller instance;

    public static RetainedMessageSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RetainedMessageSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RetainedMessageSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RetainedMessageSummary retainedMessageSummary = new RetainedMessageSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("topic")) {
                retainedMessageSummary.setTopic(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("payloadSize")) {
                retainedMessageSummary.setPayloadSize(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("qos")) {
                retainedMessageSummary.setQos(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("lastModifiedTime")) {
                retainedMessageSummary.setLastModifiedTime(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return retainedMessageSummary;
    }
}
