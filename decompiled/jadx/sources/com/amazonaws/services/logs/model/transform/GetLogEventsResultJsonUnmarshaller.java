package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.GetLogEventsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetLogEventsResultJsonUnmarshaller implements Unmarshaller<GetLogEventsResult, JsonUnmarshallerContext> {
    private static GetLogEventsResultJsonUnmarshaller instance;

    public static GetLogEventsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetLogEventsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetLogEventsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetLogEventsResult getLogEventsResult = new GetLogEventsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("events")) {
                getLogEventsResult.setEvents(new ListUnmarshaller(OutputLogEventJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("nextForwardToken")) {
                getLogEventsResult.setNextForwardToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("nextBackwardToken")) {
                getLogEventsResult.setNextBackwardToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getLogEventsResult;
    }
}
