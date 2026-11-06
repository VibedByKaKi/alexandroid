package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.ListKeyPoliciesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListKeyPoliciesResultJsonUnmarshaller implements Unmarshaller<ListKeyPoliciesResult, JsonUnmarshallerContext> {
    private static ListKeyPoliciesResultJsonUnmarshaller instance;

    public static ListKeyPoliciesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListKeyPoliciesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListKeyPoliciesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListKeyPoliciesResult listKeyPoliciesResult = new ListKeyPoliciesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("PolicyNames")) {
                listKeyPoliciesResult.setPolicyNames(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("NextMarker")) {
                listKeyPoliciesResult.setNextMarker(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Truncated")) {
                listKeyPoliciesResult.setTruncated(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listKeyPoliciesResult;
    }
}
