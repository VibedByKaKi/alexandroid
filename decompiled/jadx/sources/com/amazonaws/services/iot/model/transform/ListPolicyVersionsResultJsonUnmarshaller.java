package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ListPolicyVersionsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListPolicyVersionsResultJsonUnmarshaller implements Unmarshaller<ListPolicyVersionsResult, JsonUnmarshallerContext> {
    private static ListPolicyVersionsResultJsonUnmarshaller instance;

    public static ListPolicyVersionsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListPolicyVersionsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListPolicyVersionsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListPolicyVersionsResult listPolicyVersionsResult = new ListPolicyVersionsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("policyVersions")) {
                listPolicyVersionsResult.setPolicyVersions(new ListUnmarshaller(PolicyVersionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listPolicyVersionsResult;
    }
}
