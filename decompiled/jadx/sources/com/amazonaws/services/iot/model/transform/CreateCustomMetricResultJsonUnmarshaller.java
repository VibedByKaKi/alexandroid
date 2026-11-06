package com.amazonaws.services.iot.model.transform;

import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazonaws.services.iot.model.CreateCustomMetricResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateCustomMetricResultJsonUnmarshaller implements Unmarshaller<CreateCustomMetricResult, JsonUnmarshallerContext> {
    private static CreateCustomMetricResultJsonUnmarshaller instance;

    public static CreateCustomMetricResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateCustomMetricResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateCustomMetricResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateCustomMetricResult createCustomMetricResult = new CreateCustomMetricResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(ShortcutConstants.METRIC_NAME_KEY)) {
                createCustomMetricResult.setMetricName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("metricArn")) {
                createCustomMetricResult.setMetricArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createCustomMetricResult;
    }
}
