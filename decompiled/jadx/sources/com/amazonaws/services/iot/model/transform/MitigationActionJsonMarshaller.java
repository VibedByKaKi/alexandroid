package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.MitigationAction;
import com.amazonaws.services.iot.model.MitigationActionParams;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MitigationActionJsonMarshaller {
    private static MitigationActionJsonMarshaller instance;

    public static MitigationActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MitigationActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MitigationAction mitigationAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (mitigationAction.getName() != null) {
            String name = mitigationAction.getName();
            awsJsonWriter.name("name");
            awsJsonWriter.value(name);
        }
        if (mitigationAction.getId() != null) {
            String id = mitigationAction.getId();
            awsJsonWriter.name("id");
            awsJsonWriter.value(id);
        }
        if (mitigationAction.getRoleArn() != null) {
            String roleArn = mitigationAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (mitigationAction.getActionParams() != null) {
            MitigationActionParams actionParams = mitigationAction.getActionParams();
            awsJsonWriter.name("actionParams");
            MitigationActionParamsJsonMarshaller.getInstance().marshall(actionParams, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
