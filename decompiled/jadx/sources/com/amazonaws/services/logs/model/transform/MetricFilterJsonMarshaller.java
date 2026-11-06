package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.MetricFilter;
import com.amazonaws.services.logs.model.MetricTransformation;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MetricFilterJsonMarshaller {
    private static MetricFilterJsonMarshaller instance;

    public static MetricFilterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MetricFilterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MetricFilter metricFilter, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (metricFilter.getFilterName() != null) {
            String filterName = metricFilter.getFilterName();
            awsJsonWriter.name("filterName");
            awsJsonWriter.value(filterName);
        }
        if (metricFilter.getFilterPattern() != null) {
            String filterPattern = metricFilter.getFilterPattern();
            awsJsonWriter.name("filterPattern");
            awsJsonWriter.value(filterPattern);
        }
        if (metricFilter.getMetricTransformations() != null) {
            List<MetricTransformation> metricTransformations = metricFilter.getMetricTransformations();
            awsJsonWriter.name("metricTransformations");
            awsJsonWriter.beginArray();
            for (MetricTransformation metricTransformation : metricTransformations) {
                if (metricTransformation != null) {
                    MetricTransformationJsonMarshaller.getInstance().marshall(metricTransformation, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (metricFilter.getCreationTime() != null) {
            Long creationTime = metricFilter.getCreationTime();
            awsJsonWriter.name("creationTime");
            awsJsonWriter.value(creationTime);
        }
        if (metricFilter.getLogGroupName() != null) {
            String logGroupName = metricFilter.getLogGroupName();
            awsJsonWriter.name("logGroupName");
            awsJsonWriter.value(logGroupName);
        }
        awsJsonWriter.endObject();
    }
}
