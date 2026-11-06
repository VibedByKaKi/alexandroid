package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuditSuppression;
import com.amazonaws.services.iot.model.ResourceIdentifier;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditSuppressionJsonMarshaller {
    private static AuditSuppressionJsonMarshaller instance;

    public static AuditSuppressionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuditSuppressionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuditSuppression auditSuppression, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (auditSuppression.getCheckName() != null) {
            String checkName = auditSuppression.getCheckName();
            awsJsonWriter.name("checkName");
            awsJsonWriter.value(checkName);
        }
        if (auditSuppression.getResourceIdentifier() != null) {
            ResourceIdentifier resourceIdentifier = auditSuppression.getResourceIdentifier();
            awsJsonWriter.name("resourceIdentifier");
            ResourceIdentifierJsonMarshaller.getInstance().marshall(resourceIdentifier, awsJsonWriter);
        }
        if (auditSuppression.getExpirationDate() != null) {
            Date expirationDate = auditSuppression.getExpirationDate();
            awsJsonWriter.name("expirationDate");
            awsJsonWriter.value(expirationDate);
        }
        if (auditSuppression.getSuppressIndefinitely() != null) {
            Boolean suppressIndefinitely = auditSuppression.getSuppressIndefinitely();
            awsJsonWriter.name("suppressIndefinitely");
            awsJsonWriter.value(suppressIndefinitely.booleanValue());
        }
        if (auditSuppression.getDescription() != null) {
            String description = auditSuppression.getDescription();
            awsJsonWriter.name("description");
            awsJsonWriter.value(description);
        }
        awsJsonWriter.endObject();
    }
}
