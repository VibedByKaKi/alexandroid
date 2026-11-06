package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.VerifyUserAttributeResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class VerifyUserAttributeResultJsonUnmarshaller implements Unmarshaller<VerifyUserAttributeResult, JsonUnmarshallerContext> {
    private static VerifyUserAttributeResultJsonUnmarshaller instance;

    public static VerifyUserAttributeResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new VerifyUserAttributeResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public VerifyUserAttributeResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new VerifyUserAttributeResult();
    }
}
