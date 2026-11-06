package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.ConnectCustomKeyStoreResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ConnectCustomKeyStoreResultJsonUnmarshaller implements Unmarshaller<ConnectCustomKeyStoreResult, JsonUnmarshallerContext> {
    private static ConnectCustomKeyStoreResultJsonUnmarshaller instance;

    public static ConnectCustomKeyStoreResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ConnectCustomKeyStoreResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ConnectCustomKeyStoreResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new ConnectCustomKeyStoreResult();
    }
}
