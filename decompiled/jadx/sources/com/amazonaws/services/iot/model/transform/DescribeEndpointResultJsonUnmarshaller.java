package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DescribeEndpointResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeEndpointResultJsonUnmarshaller implements Unmarshaller<DescribeEndpointResult, JsonUnmarshallerContext> {
    private static DescribeEndpointResultJsonUnmarshaller instance;

    public static DescribeEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeEndpointResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeEndpointResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeEndpointResult describeEndpointResult = new DescribeEndpointResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("endpointAddress")) {
                describeEndpointResult.setEndpointAddress(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeEndpointResult;
    }
}
