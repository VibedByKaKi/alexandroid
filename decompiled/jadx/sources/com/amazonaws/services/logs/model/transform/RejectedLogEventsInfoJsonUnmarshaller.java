package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.RejectedLogEventsInfo;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RejectedLogEventsInfoJsonUnmarshaller implements Unmarshaller<RejectedLogEventsInfo, JsonUnmarshallerContext> {
    private static RejectedLogEventsInfoJsonUnmarshaller instance;

    public static RejectedLogEventsInfoJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RejectedLogEventsInfoJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RejectedLogEventsInfo unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RejectedLogEventsInfo rejectedLogEventsInfo = new RejectedLogEventsInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("tooNewLogEventStartIndex")) {
                rejectedLogEventsInfo.setTooNewLogEventStartIndex(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("tooOldLogEventEndIndex")) {
                rejectedLogEventsInfo.setTooOldLogEventEndIndex(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("expiredLogEventEndIndex")) {
                rejectedLogEventsInfo.setExpiredLogEventEndIndex(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return rejectedLogEventsInfo;
    }
}
