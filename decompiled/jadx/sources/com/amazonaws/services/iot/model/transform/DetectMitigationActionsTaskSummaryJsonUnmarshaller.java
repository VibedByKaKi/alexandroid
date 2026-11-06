package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DetectMitigationActionsTaskSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DetectMitigationActionsTaskSummaryJsonUnmarshaller implements Unmarshaller<DetectMitigationActionsTaskSummary, JsonUnmarshallerContext> {
    private static DetectMitigationActionsTaskSummaryJsonUnmarshaller instance;

    public static DetectMitigationActionsTaskSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectMitigationActionsTaskSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectMitigationActionsTaskSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary = new DetectMitigationActionsTaskSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("taskId")) {
                detectMitigationActionsTaskSummary.setTaskId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("taskStatus")) {
                detectMitigationActionsTaskSummary.setTaskStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("taskStartTime")) {
                detectMitigationActionsTaskSummary.setTaskStartTime(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("taskEndTime")) {
                detectMitigationActionsTaskSummary.setTaskEndTime(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("target")) {
                detectMitigationActionsTaskSummary.setTarget(DetectMitigationActionsTaskTargetJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("violationEventOccurrenceRange")) {
                detectMitigationActionsTaskSummary.setViolationEventOccurrenceRange(ViolationEventOccurrenceRangeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("onlyActiveViolationsIncluded")) {
                detectMitigationActionsTaskSummary.setOnlyActiveViolationsIncluded(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("suppressedAlertsIncluded")) {
                detectMitigationActionsTaskSummary.setSuppressedAlertsIncluded(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("actionsDefinition")) {
                detectMitigationActionsTaskSummary.setActionsDefinition(new ListUnmarshaller(MitigationActionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("taskStatistics")) {
                detectMitigationActionsTaskSummary.setTaskStatistics(DetectMitigationActionsTaskStatisticsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectMitigationActionsTaskSummary;
    }
}
