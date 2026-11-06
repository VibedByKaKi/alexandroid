package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DetectMitigationActionsTaskStatistics;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DetectMitigationActionsTaskStatisticsJsonMarshaller {
    private static DetectMitigationActionsTaskStatisticsJsonMarshaller instance;

    public static DetectMitigationActionsTaskStatisticsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectMitigationActionsTaskStatisticsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectMitigationActionsTaskStatistics detectMitigationActionsTaskStatistics, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (detectMitigationActionsTaskStatistics.getActionsExecuted() != null) {
            Long actionsExecuted = detectMitigationActionsTaskStatistics.getActionsExecuted();
            awsJsonWriter.name("actionsExecuted");
            awsJsonWriter.value(actionsExecuted);
        }
        if (detectMitigationActionsTaskStatistics.getActionsSkipped() != null) {
            Long actionsSkipped = detectMitigationActionsTaskStatistics.getActionsSkipped();
            awsJsonWriter.name("actionsSkipped");
            awsJsonWriter.value(actionsSkipped);
        }
        if (detectMitigationActionsTaskStatistics.getActionsFailed() != null) {
            Long actionsFailed = detectMitigationActionsTaskStatistics.getActionsFailed();
            awsJsonWriter.name("actionsFailed");
            awsJsonWriter.value(actionsFailed);
        }
        awsJsonWriter.endObject();
    }
}
