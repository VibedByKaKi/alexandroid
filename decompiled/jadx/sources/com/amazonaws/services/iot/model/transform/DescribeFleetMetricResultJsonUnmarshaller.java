package com.amazonaws.services.iot.model.transform;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazonaws.services.iot.model.DescribeFleetMetricResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeFleetMetricResultJsonUnmarshaller implements Unmarshaller<DescribeFleetMetricResult, JsonUnmarshallerContext> {
    private static DescribeFleetMetricResultJsonUnmarshaller instance;

    public static DescribeFleetMetricResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeFleetMetricResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeFleetMetricResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeFleetMetricResult describeFleetMetricResult = new DescribeFleetMetricResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(ShortcutConstants.METRIC_NAME_KEY)) {
                describeFleetMetricResult.setMetricName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("queryString")) {
                describeFleetMetricResult.setQueryString(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("aggregationType")) {
                describeFleetMetricResult.setAggregationType(AggregationTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(TypedValues.CycleType.S_WAVE_PERIOD)) {
                describeFleetMetricResult.setPeriod(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("aggregationField")) {
                describeFleetMetricResult.setAggregationField(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("description")) {
                describeFleetMetricResult.setDescription(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("queryVersion")) {
                describeFleetMetricResult.setQueryVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("indexName")) {
                describeFleetMetricResult.setIndexName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("creationDate")) {
                describeFleetMetricResult.setCreationDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("lastModifiedDate")) {
                describeFleetMetricResult.setLastModifiedDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("unit")) {
                describeFleetMetricResult.setUnit(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("version")) {
                describeFleetMetricResult.setVersion(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("metricArn")) {
                describeFleetMetricResult.setMetricArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeFleetMetricResult;
    }
}
