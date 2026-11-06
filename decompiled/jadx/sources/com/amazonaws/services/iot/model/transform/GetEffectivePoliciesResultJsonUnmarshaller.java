package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.GetEffectivePoliciesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetEffectivePoliciesResultJsonUnmarshaller implements Unmarshaller<GetEffectivePoliciesResult, JsonUnmarshallerContext> {
    private static GetEffectivePoliciesResultJsonUnmarshaller instance;

    public static GetEffectivePoliciesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetEffectivePoliciesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetEffectivePoliciesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetEffectivePoliciesResult getEffectivePoliciesResult = new GetEffectivePoliciesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("effectivePolicies")) {
                getEffectivePoliciesResult.setEffectivePolicies(new ListUnmarshaller(EffectivePolicyJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getEffectivePoliciesResult;
    }
}
