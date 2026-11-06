package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class EnableEnhancedMonitoringResultJsonUnmarshaller implements Unmarshaller<EnableEnhancedMonitoringResult, JsonUnmarshallerContext> {
    private static EnableEnhancedMonitoringResultJsonUnmarshaller instance;

    public static EnableEnhancedMonitoringResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new EnableEnhancedMonitoringResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public EnableEnhancedMonitoringResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        EnableEnhancedMonitoringResult enableEnhancedMonitoringResult = new EnableEnhancedMonitoringResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("StreamName")) {
                enableEnhancedMonitoringResult.setStreamName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("CurrentShardLevelMetrics")) {
                enableEnhancedMonitoringResult.setCurrentShardLevelMetrics(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("DesiredShardLevelMetrics")) {
                enableEnhancedMonitoringResult.setDesiredShardLevelMetrics(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return enableEnhancedMonitoringResult;
    }
}
