package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AdminLinkProviderForUserResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminLinkProviderForUserResultJsonUnmarshaller implements Unmarshaller<AdminLinkProviderForUserResult, JsonUnmarshallerContext> {
    private static AdminLinkProviderForUserResultJsonUnmarshaller instance;

    public static AdminLinkProviderForUserResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AdminLinkProviderForUserResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AdminLinkProviderForUserResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new AdminLinkProviderForUserResult();
    }
}
