package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazonaws.services.iot.model.DescribeIndexResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeIndexResultJsonUnmarshaller implements Unmarshaller<DescribeIndexResult, JsonUnmarshallerContext> {
    private static DescribeIndexResultJsonUnmarshaller instance;

    public static DescribeIndexResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeIndexResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeIndexResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeIndexResult describeIndexResult = new DescribeIndexResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("indexName")) {
                describeIndexResult.setIndexName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("indexStatus")) {
                describeIndexResult.setIndexStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(Content.SCHEMA)) {
                describeIndexResult.setSchema(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeIndexResult;
    }
}
