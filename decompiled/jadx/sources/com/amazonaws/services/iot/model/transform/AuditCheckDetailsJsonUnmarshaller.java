package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuditCheckDetails;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditCheckDetailsJsonUnmarshaller implements Unmarshaller<AuditCheckDetails, JsonUnmarshallerContext> {
    private static AuditCheckDetailsJsonUnmarshaller instance;

    public static AuditCheckDetailsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AuditCheckDetailsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AuditCheckDetails unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuditCheckDetails auditCheckDetails = new AuditCheckDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("checkRunStatus")) {
                auditCheckDetails.setCheckRunStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("checkCompliant")) {
                auditCheckDetails.setCheckCompliant(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("totalResourcesCount")) {
                auditCheckDetails.setTotalResourcesCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("nonCompliantResourcesCount")) {
                auditCheckDetails.setNonCompliantResourcesCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("suppressedNonCompliantResourcesCount")) {
                auditCheckDetails.setSuppressedNonCompliantResourcesCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("errorCode")) {
                auditCheckDetails.setErrorCode(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("message")) {
                auditCheckDetails.setMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return auditCheckDetails;
    }
}
