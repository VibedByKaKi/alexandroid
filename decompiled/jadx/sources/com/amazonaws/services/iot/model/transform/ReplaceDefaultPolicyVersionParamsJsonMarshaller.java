package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ReplaceDefaultPolicyVersionParams;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ReplaceDefaultPolicyVersionParamsJsonMarshaller {
    private static ReplaceDefaultPolicyVersionParamsJsonMarshaller instance;

    public static ReplaceDefaultPolicyVersionParamsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ReplaceDefaultPolicyVersionParamsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (replaceDefaultPolicyVersionParams.getTemplateName() != null) {
            String templateName = replaceDefaultPolicyVersionParams.getTemplateName();
            awsJsonWriter.name("templateName");
            awsJsonWriter.value(templateName);
        }
        awsJsonWriter.endObject();
    }
}
