package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller implements Unmarshaller<GetOpenIdTokenForDeveloperIdentityResult, JsonUnmarshallerContext> {
    private static GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller instance;

    public static GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetOpenIdTokenForDeveloperIdentityResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentityResult = new GetOpenIdTokenForDeveloperIdentityResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("IdentityId")) {
                getOpenIdTokenForDeveloperIdentityResult.setIdentityId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Token")) {
                getOpenIdTokenForDeveloperIdentityResult.setToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getOpenIdTokenForDeveloperIdentityResult;
    }
}
