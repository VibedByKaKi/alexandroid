package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.GetCSVHeaderResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetCSVHeaderResultJsonUnmarshaller implements Unmarshaller<GetCSVHeaderResult, JsonUnmarshallerContext> {
    private static GetCSVHeaderResultJsonUnmarshaller instance;

    public static GetCSVHeaderResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetCSVHeaderResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetCSVHeaderResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetCSVHeaderResult getCSVHeaderResult = new GetCSVHeaderResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("UserPoolId")) {
                getCSVHeaderResult.setUserPoolId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("CSVHeader")) {
                getCSVHeaderResult.setCSVHeader(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getCSVHeaderResult;
    }
}
