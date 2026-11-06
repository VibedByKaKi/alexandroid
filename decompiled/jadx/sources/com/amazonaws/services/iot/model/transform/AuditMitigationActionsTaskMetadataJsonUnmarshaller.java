package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuditMitigationActionsTaskMetadata;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditMitigationActionsTaskMetadataJsonUnmarshaller implements Unmarshaller<AuditMitigationActionsTaskMetadata, JsonUnmarshallerContext> {
    private static AuditMitigationActionsTaskMetadataJsonUnmarshaller instance;

    public static AuditMitigationActionsTaskMetadataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AuditMitigationActionsTaskMetadataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AuditMitigationActionsTaskMetadata unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuditMitigationActionsTaskMetadata auditMitigationActionsTaskMetadata = new AuditMitigationActionsTaskMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("taskId")) {
                auditMitigationActionsTaskMetadata.setTaskId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("startTime")) {
                auditMitigationActionsTaskMetadata.setStartTime(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("taskStatus")) {
                auditMitigationActionsTaskMetadata.setTaskStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return auditMitigationActionsTaskMetadata;
    }
}
