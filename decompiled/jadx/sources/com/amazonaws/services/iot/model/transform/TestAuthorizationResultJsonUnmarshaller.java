package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TestAuthorizationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TestAuthorizationResultJsonUnmarshaller implements Unmarshaller<TestAuthorizationResult, JsonUnmarshallerContext> {
    private static TestAuthorizationResultJsonUnmarshaller instance;

    public static TestAuthorizationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TestAuthorizationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TestAuthorizationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        TestAuthorizationResult testAuthorizationResult = new TestAuthorizationResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("authResults")) {
                testAuthorizationResult.setAuthResults(new ListUnmarshaller(AuthResultJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return testAuthorizationResult;
    }
}
