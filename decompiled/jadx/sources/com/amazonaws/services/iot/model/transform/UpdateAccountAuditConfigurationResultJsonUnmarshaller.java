package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateAccountAuditConfigurationResultJsonUnmarshaller implements Unmarshaller<UpdateAccountAuditConfigurationResult, JsonUnmarshallerContext> {
    private static UpdateAccountAuditConfigurationResultJsonUnmarshaller instance;

    public static UpdateAccountAuditConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateAccountAuditConfigurationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateAccountAuditConfigurationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new UpdateAccountAuditConfigurationResult();
    }
}
