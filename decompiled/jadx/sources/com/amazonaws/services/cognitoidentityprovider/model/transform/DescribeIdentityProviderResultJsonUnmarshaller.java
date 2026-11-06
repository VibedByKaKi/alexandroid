package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.DescribeIdentityProviderResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeIdentityProviderResultJsonUnmarshaller implements Unmarshaller<DescribeIdentityProviderResult, JsonUnmarshallerContext> {
    private static DescribeIdentityProviderResultJsonUnmarshaller instance;

    public static DescribeIdentityProviderResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeIdentityProviderResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeIdentityProviderResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeIdentityProviderResult describeIdentityProviderResult = new DescribeIdentityProviderResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("IdentityProvider")) {
                describeIdentityProviderResult.setIdentityProvider(IdentityProviderTypeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeIdentityProviderResult;
    }
}
