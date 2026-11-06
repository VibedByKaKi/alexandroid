package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeStreamSummaryResultJsonUnmarshaller implements Unmarshaller<DescribeStreamSummaryResult, JsonUnmarshallerContext> {
    private static DescribeStreamSummaryResultJsonUnmarshaller instance;

    public static DescribeStreamSummaryResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeStreamSummaryResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeStreamSummaryResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeStreamSummaryResult describeStreamSummaryResult = new DescribeStreamSummaryResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("StreamDescriptionSummary")) {
                describeStreamSummaryResult.setStreamDescriptionSummary(StreamDescriptionSummaryJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeStreamSummaryResult;
    }
}
