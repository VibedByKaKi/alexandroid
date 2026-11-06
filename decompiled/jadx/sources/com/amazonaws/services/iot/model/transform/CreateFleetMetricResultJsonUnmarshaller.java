package com.amazonaws.services.iot.model.transform;

import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazonaws.services.iot.model.CreateFleetMetricResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateFleetMetricResultJsonUnmarshaller implements Unmarshaller<CreateFleetMetricResult, JsonUnmarshallerContext> {
    private static CreateFleetMetricResultJsonUnmarshaller instance;

    public static CreateFleetMetricResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateFleetMetricResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateFleetMetricResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateFleetMetricResult createFleetMetricResult = new CreateFleetMetricResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(ShortcutConstants.METRIC_NAME_KEY)) {
                createFleetMetricResult.setMetricName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("metricArn")) {
                createFleetMetricResult.setMetricArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createFleetMetricResult;
    }
}
