package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TaskStatisticsForAuditCheck;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TaskStatisticsForAuditCheckJsonUnmarshaller implements Unmarshaller<TaskStatisticsForAuditCheck, JsonUnmarshallerContext> {
    private static TaskStatisticsForAuditCheckJsonUnmarshaller instance;

    public static TaskStatisticsForAuditCheckJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TaskStatisticsForAuditCheckJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TaskStatisticsForAuditCheck unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TaskStatisticsForAuditCheck taskStatisticsForAuditCheck = new TaskStatisticsForAuditCheck();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("totalFindingsCount")) {
                taskStatisticsForAuditCheck.setTotalFindingsCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("failedFindingsCount")) {
                taskStatisticsForAuditCheck.setFailedFindingsCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("succeededFindingsCount")) {
                taskStatisticsForAuditCheck.setSucceededFindingsCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("skippedFindingsCount")) {
                taskStatisticsForAuditCheck.setSkippedFindingsCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("canceledFindingsCount")) {
                taskStatisticsForAuditCheck.setCanceledFindingsCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return taskStatisticsForAuditCheck;
    }
}
