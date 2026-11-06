package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuthInfo;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuthInfoJsonMarshaller {
    private static AuthInfoJsonMarshaller instance;

    public static AuthInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuthInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuthInfo authInfo, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (authInfo.getActionType() != null) {
            String actionType = authInfo.getActionType();
            awsJsonWriter.name("actionType");
            awsJsonWriter.value(actionType);
        }
        if (authInfo.getResources() != null) {
            List<String> resources = authInfo.getResources();
            awsJsonWriter.name("resources");
            awsJsonWriter.beginArray();
            for (String str : resources) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
