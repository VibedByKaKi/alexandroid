package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ListAuthorizersResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuthorizersResultJsonUnmarshaller implements Unmarshaller<ListAuthorizersResult, JsonUnmarshallerContext> {
    private static ListAuthorizersResultJsonUnmarshaller instance;

    public static ListAuthorizersResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListAuthorizersResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListAuthorizersResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListAuthorizersResult listAuthorizersResult = new ListAuthorizersResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("authorizers")) {
                listAuthorizersResult.setAuthorizers(new ListUnmarshaller(AuthorizerSummaryJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("nextMarker")) {
                listAuthorizersResult.setNextMarker(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listAuthorizersResult;
    }
}
