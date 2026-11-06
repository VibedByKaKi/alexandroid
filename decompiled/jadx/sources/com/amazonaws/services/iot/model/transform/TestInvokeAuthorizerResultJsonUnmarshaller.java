package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.identity.bootstrapInvitation.BootstrapInvitationConstants;
import com.amazonaws.services.iot.model.TestInvokeAuthorizerResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TestInvokeAuthorizerResultJsonUnmarshaller implements Unmarshaller<TestInvokeAuthorizerResult, JsonUnmarshallerContext> {
    private static TestInvokeAuthorizerResultJsonUnmarshaller instance;

    public static TestInvokeAuthorizerResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TestInvokeAuthorizerResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TestInvokeAuthorizerResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        TestInvokeAuthorizerResult testInvokeAuthorizerResult = new TestInvokeAuthorizerResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(BootstrapInvitationConstants.AUTHENTICATION_STATUS)) {
                testInvokeAuthorizerResult.setIsAuthenticated(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(CamServiceClient.QUERY_PRINCIPAL_ID)) {
                testInvokeAuthorizerResult.setPrincipalId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("policyDocuments")) {
                testInvokeAuthorizerResult.setPolicyDocuments(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("refreshAfterInSeconds")) {
                testInvokeAuthorizerResult.setRefreshAfterInSeconds(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("disconnectAfterInSeconds")) {
                testInvokeAuthorizerResult.setDisconnectAfterInSeconds(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return testInvokeAuthorizerResult;
    }
}
