package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.ExportTaskStatus;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ExportTaskStatusJsonMarshaller {
    private static ExportTaskStatusJsonMarshaller instance;

    public static ExportTaskStatusJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ExportTaskStatusJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ExportTaskStatus exportTaskStatus, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (exportTaskStatus.getCode() != null) {
            String code = exportTaskStatus.getCode();
            awsJsonWriter.name("code");
            awsJsonWriter.value(code);
        }
        if (exportTaskStatus.getMessage() != null) {
            String message = exportTaskStatus.getMessage();
            awsJsonWriter.name("message");
            awsJsonWriter.value(message);
        }
        awsJsonWriter.endObject();
    }
}
