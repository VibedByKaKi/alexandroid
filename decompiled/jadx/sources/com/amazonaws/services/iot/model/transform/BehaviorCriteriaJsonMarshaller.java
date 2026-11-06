package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.BehaviorCriteria;
import com.amazonaws.services.iot.model.MachineLearningDetectionConfig;
import com.amazonaws.services.iot.model.MetricValue;
import com.amazonaws.services.iot.model.StatisticalThreshold;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BehaviorCriteriaJsonMarshaller {
    private static BehaviorCriteriaJsonMarshaller instance;

    public static BehaviorCriteriaJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BehaviorCriteriaJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BehaviorCriteria behaviorCriteria, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (behaviorCriteria.getComparisonOperator() != null) {
            String comparisonOperator = behaviorCriteria.getComparisonOperator();
            awsJsonWriter.name("comparisonOperator");
            awsJsonWriter.value(comparisonOperator);
        }
        if (behaviorCriteria.getValue() != null) {
            MetricValue value = behaviorCriteria.getValue();
            awsJsonWriter.name("value");
            MetricValueJsonMarshaller.getInstance().marshall(value, awsJsonWriter);
        }
        if (behaviorCriteria.getDurationSeconds() != null) {
            Integer durationSeconds = behaviorCriteria.getDurationSeconds();
            awsJsonWriter.name("durationSeconds");
            awsJsonWriter.value(durationSeconds);
        }
        if (behaviorCriteria.getConsecutiveDatapointsToAlarm() != null) {
            Integer consecutiveDatapointsToAlarm = behaviorCriteria.getConsecutiveDatapointsToAlarm();
            awsJsonWriter.name("consecutiveDatapointsToAlarm");
            awsJsonWriter.value(consecutiveDatapointsToAlarm);
        }
        if (behaviorCriteria.getConsecutiveDatapointsToClear() != null) {
            Integer consecutiveDatapointsToClear = behaviorCriteria.getConsecutiveDatapointsToClear();
            awsJsonWriter.name("consecutiveDatapointsToClear");
            awsJsonWriter.value(consecutiveDatapointsToClear);
        }
        if (behaviorCriteria.getStatisticalThreshold() != null) {
            StatisticalThreshold statisticalThreshold = behaviorCriteria.getStatisticalThreshold();
            awsJsonWriter.name("statisticalThreshold");
            StatisticalThresholdJsonMarshaller.getInstance().marshall(statisticalThreshold, awsJsonWriter);
        }
        if (behaviorCriteria.getMlDetectionConfig() != null) {
            MachineLearningDetectionConfig mlDetectionConfig = behaviorCriteria.getMlDetectionConfig();
            awsJsonWriter.name("mlDetectionConfig");
            MachineLearningDetectionConfigJsonMarshaller.getInstance().marshall(mlDetectionConfig, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
