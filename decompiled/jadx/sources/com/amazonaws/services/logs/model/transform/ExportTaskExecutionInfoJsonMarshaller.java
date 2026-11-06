package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.ExportTaskExecutionInfo;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ExportTaskExecutionInfoJsonMarshaller {
    private static ExportTaskExecutionInfoJsonMarshaller instance;

    public static ExportTaskExecutionInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ExportTaskExecutionInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ExportTaskExecutionInfo exportTaskExecutionInfo, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (exportTaskExecutionInfo.getCreationTime() != null) {
            Long creationTime = exportTaskExecutionInfo.getCreationTime();
            awsJsonWriter.name("creationTime");
            awsJsonWriter.value(creationTime);
        }
        if (exportTaskExecutionInfo.getCompletionTime() != null) {
            Long completionTime = exportTaskExecutionInfo.getCompletionTime();
            awsJsonWriter.name("completionTime");
            awsJsonWriter.value(completionTime);
        }
        awsJsonWriter.endObject();
    }
}
