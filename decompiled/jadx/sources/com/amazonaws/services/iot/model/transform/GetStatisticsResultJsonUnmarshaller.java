package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.GetStatisticsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetStatisticsResultJsonUnmarshaller implements Unmarshaller<GetStatisticsResult, JsonUnmarshallerContext> {
    private static GetStatisticsResultJsonUnmarshaller instance;

    public static GetStatisticsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetStatisticsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetStatisticsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetStatisticsResult getStatisticsResult = new GetStatisticsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("statistics")) {
                getStatisticsResult.setStatistics(StatisticsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getStatisticsResult;
    }
}
