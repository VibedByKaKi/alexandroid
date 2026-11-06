package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AdminDisableProviderForUserResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminDisableProviderForUserResultJsonUnmarshaller implements Unmarshaller<AdminDisableProviderForUserResult, JsonUnmarshallerContext> {
    private static AdminDisableProviderForUserResultJsonUnmarshaller instance;

    public static AdminDisableProviderForUserResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AdminDisableProviderForUserResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AdminDisableProviderForUserResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new AdminDisableProviderForUserResult();
    }
}
