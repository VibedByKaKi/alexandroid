package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.DescribeStreamResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeStreamResultJsonUnmarshaller implements Unmarshaller<DescribeStreamResult, JsonUnmarshallerContext> {
    private static DescribeStreamResultJsonUnmarshaller instance;

    public static DescribeStreamResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeStreamResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeStreamResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeStreamResult describeStreamResult = new DescribeStreamResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("StreamDescription")) {
                describeStreamResult.setStreamDescription(StreamDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeStreamResult;
    }
}
