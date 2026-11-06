package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DescribeJobExecutionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeJobExecutionResultJsonUnmarshaller implements Unmarshaller<DescribeJobExecutionResult, JsonUnmarshallerContext> {
    private static DescribeJobExecutionResultJsonUnmarshaller instance;

    public static DescribeJobExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeJobExecutionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeJobExecutionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeJobExecutionResult describeJobExecutionResult = new DescribeJobExecutionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("execution")) {
                describeJobExecutionResult.setExecution(JobExecutionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeJobExecutionResult;
    }
}
