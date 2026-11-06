package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DetectMitigationActionsTaskTarget;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DetectMitigationActionsTaskTargetJsonMarshaller {
    private static DetectMitigationActionsTaskTargetJsonMarshaller instance;

    public static DetectMitigationActionsTaskTargetJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectMitigationActionsTaskTargetJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectMitigationActionsTaskTarget detectMitigationActionsTaskTarget, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (detectMitigationActionsTaskTarget.getViolationIds() != null) {
            List<String> violationIds = detectMitigationActionsTaskTarget.getViolationIds();
            awsJsonWriter.name("violationIds");
            awsJsonWriter.beginArray();
            for (String str : violationIds) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (detectMitigationActionsTaskTarget.getSecurityProfileName() != null) {
            String securityProfileName = detectMitigationActionsTaskTarget.getSecurityProfileName();
            awsJsonWriter.name("securityProfileName");
            awsJsonWriter.value(securityProfileName);
        }
        if (detectMitigationActionsTaskTarget.getBehaviorName() != null) {
            String behaviorName = detectMitigationActionsTaskTarget.getBehaviorName();
            awsJsonWriter.name("behaviorName");
            awsJsonWriter.value(behaviorName);
        }
        awsJsonWriter.endObject();
    }
}
