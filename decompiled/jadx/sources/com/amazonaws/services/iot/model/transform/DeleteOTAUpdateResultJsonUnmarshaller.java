package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DeleteOTAUpdateResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteOTAUpdateResultJsonUnmarshaller implements Unmarshaller<DeleteOTAUpdateResult, JsonUnmarshallerContext> {
    private static DeleteOTAUpdateResultJsonUnmarshaller instance;

    public static DeleteOTAUpdateResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteOTAUpdateResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteOTAUpdateResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new DeleteOTAUpdateResult();
    }
}
