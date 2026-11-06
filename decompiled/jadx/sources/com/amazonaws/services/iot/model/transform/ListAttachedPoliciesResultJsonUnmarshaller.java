package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ListAttachedPoliciesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAttachedPoliciesResultJsonUnmarshaller implements Unmarshaller<ListAttachedPoliciesResult, JsonUnmarshallerContext> {
    private static ListAttachedPoliciesResultJsonUnmarshaller instance;

    public static ListAttachedPoliciesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListAttachedPoliciesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListAttachedPoliciesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListAttachedPoliciesResult listAttachedPoliciesResult = new ListAttachedPoliciesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("policies")) {
                listAttachedPoliciesResult.setPolicies(new ListUnmarshaller(PolicyJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("nextMarker")) {
                listAttachedPoliciesResult.setNextMarker(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listAttachedPoliciesResult;
    }
}
