package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazon.coral.model.PaginationModelIndex;
import com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListIdentityPoolsResultJsonUnmarshaller implements Unmarshaller<ListIdentityPoolsResult, JsonUnmarshallerContext> {
    private static ListIdentityPoolsResultJsonUnmarshaller instance;

    public static ListIdentityPoolsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListIdentityPoolsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListIdentityPoolsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListIdentityPoolsResult listIdentityPoolsResult = new ListIdentityPoolsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("IdentityPools")) {
                listIdentityPoolsResult.setIdentityPools(new ListUnmarshaller(IdentityPoolShortDescriptionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(PaginationModelIndex.DEFAULT_TOKEN_NAME)) {
                listIdentityPoolsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listIdentityPoolsResult;
    }
}
