package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DetectMitigationActionsTaskStatistics;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DetectMitigationActionsTaskStatisticsJsonUnmarshaller implements Unmarshaller<DetectMitigationActionsTaskStatistics, JsonUnmarshallerContext> {
    private static DetectMitigationActionsTaskStatisticsJsonUnmarshaller instance;

    public static DetectMitigationActionsTaskStatisticsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectMitigationActionsTaskStatisticsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectMitigationActionsTaskStatistics unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectMitigationActionsTaskStatistics detectMitigationActionsTaskStatistics = new DetectMitigationActionsTaskStatistics();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("actionsExecuted")) {
                detectMitigationActionsTaskStatistics.setActionsExecuted(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("actionsSkipped")) {
                detectMitigationActionsTaskStatistics.setActionsSkipped(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("actionsFailed")) {
                detectMitigationActionsTaskStatistics.setActionsFailed(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectMitigationActionsTaskStatistics;
    }
}
