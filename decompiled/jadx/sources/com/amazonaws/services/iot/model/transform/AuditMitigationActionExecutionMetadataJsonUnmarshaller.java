package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.app.notification.actions.NotificationActionConstants;
import com.amazonaws.services.iot.model.AuditMitigationActionExecutionMetadata;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditMitigationActionExecutionMetadataJsonUnmarshaller implements Unmarshaller<AuditMitigationActionExecutionMetadata, JsonUnmarshallerContext> {
    private static AuditMitigationActionExecutionMetadataJsonUnmarshaller instance;

    public static AuditMitigationActionExecutionMetadataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AuditMitigationActionExecutionMetadataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AuditMitigationActionExecutionMetadata unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuditMitigationActionExecutionMetadata auditMitigationActionExecutionMetadata = new AuditMitigationActionExecutionMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("taskId")) {
                auditMitigationActionExecutionMetadata.setTaskId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("findingId")) {
                auditMitigationActionExecutionMetadata.setFindingId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("actionName")) {
                auditMitigationActionExecutionMetadata.setActionName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(NotificationActionConstants.ACTION_ID_KEY)) {
                auditMitigationActionExecutionMetadata.setActionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("status")) {
                auditMitigationActionExecutionMetadata.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("startTime")) {
                auditMitigationActionExecutionMetadata.setStartTime(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("endTime")) {
                auditMitigationActionExecutionMetadata.setEndTime(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("errorCode")) {
                auditMitigationActionExecutionMetadata.setErrorCode(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("message")) {
                auditMitigationActionExecutionMetadata.setMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return auditMitigationActionExecutionMetadata;
    }
}
