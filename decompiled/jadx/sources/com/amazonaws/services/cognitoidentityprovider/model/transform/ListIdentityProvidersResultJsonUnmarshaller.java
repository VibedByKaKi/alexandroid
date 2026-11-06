package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazon.coral.model.PaginationModelIndex;
import com.amazonaws.services.cognitoidentityprovider.model.ListIdentityProvidersResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListIdentityProvidersResultJsonUnmarshaller implements Unmarshaller<ListIdentityProvidersResult, JsonUnmarshallerContext> {
    private static ListIdentityProvidersResultJsonUnmarshaller instance;

    public static ListIdentityProvidersResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListIdentityProvidersResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListIdentityProvidersResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListIdentityProvidersResult listIdentityProvidersResult = new ListIdentityProvidersResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("Providers")) {
                listIdentityProvidersResult.setProviders(new ListUnmarshaller(ProviderDescriptionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(PaginationModelIndex.DEFAULT_TOKEN_NAME)) {
                listIdentityProvidersResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listIdentityProvidersResult;
    }
}
