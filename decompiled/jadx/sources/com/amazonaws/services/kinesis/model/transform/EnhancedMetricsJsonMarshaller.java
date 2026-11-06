package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.EnhancedMetrics;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class EnhancedMetricsJsonMarshaller {
    private static EnhancedMetricsJsonMarshaller instance;

    public static EnhancedMetricsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EnhancedMetricsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EnhancedMetrics enhancedMetrics, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (enhancedMetrics.getShardLevelMetrics() != null) {
            List<String> shardLevelMetrics = enhancedMetrics.getShardLevelMetrics();
            awsJsonWriter.name("ShardLevelMetrics");
            awsJsonWriter.beginArray();
            for (String str : shardLevelMetrics) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
