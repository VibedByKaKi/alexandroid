package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.MitigationActionIdentifier;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MitigationActionIdentifierJsonMarshaller {
    private static MitigationActionIdentifierJsonMarshaller instance;

    public static MitigationActionIdentifierJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MitigationActionIdentifierJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MitigationActionIdentifier mitigationActionIdentifier, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (mitigationActionIdentifier.getActionName() != null) {
            String actionName = mitigationActionIdentifier.getActionName();
            awsJsonWriter.name("actionName");
            awsJsonWriter.value(actionName);
        }
        if (mitigationActionIdentifier.getActionArn() != null) {
            String actionArn = mitigationActionIdentifier.getActionArn();
            awsJsonWriter.name("actionArn");
            awsJsonWriter.value(actionArn);
        }
        if (mitigationActionIdentifier.getCreationDate() != null) {
            Date creationDate = mitigationActionIdentifier.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
